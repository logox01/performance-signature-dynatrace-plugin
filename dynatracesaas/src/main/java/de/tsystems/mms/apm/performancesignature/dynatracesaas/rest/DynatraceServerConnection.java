/*
 * Copyright (c) 2014 T-Systems Multimedia Solutions GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.tsystems.mms.apm.performancesignature.dynatracesaas.rest;

import de.tsystems.mms.apm.performancesignature.dynatracesaas.model.DynatraceServerConfiguration;
import de.tsystems.mms.apm.performancesignature.dynatracesaas.rest.api.ClusterVersionApi;
import de.tsystems.mms.apm.performancesignature.dynatracesaas.rest.api.TimeseriesApi;
import de.tsystems.mms.apm.performancesignature.dynatracesaas.rest.model.*;
import de.tsystems.mms.apm.performancesignature.dynatracesaas.util.DynatraceUtils;
import de.tsystems.mms.apm.performancesignature.ui.util.PerfSigUIUtils;
import hudson.ProxyConfiguration;
import jenkins.model.Jenkins;
import org.apache.commons.lang.exception.ExceptionUtils;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.List;
import java.util.logging.Logger;

public class DynatraceServerConnection {
    private static final Logger LOGGER = Logger.getLogger(DynatraceServerConnection.class.getName());
    private final ApiClient apiClient;

    public DynatraceServerConnection(final String serverUrl, final String apiTokenId, final boolean verifyCertificate,
                                     final boolean useProxy) {
        this.apiClient = new ApiClient();
        apiClient.setVerifyingSsl(verifyCertificate);
        apiClient.setBasePath(serverUrl);
        apiClient.setApiKey(DynatraceUtils.getApiToken(apiTokenId));
        apiClient.setDebugging(true);

        Proxy proxy = Proxy.NO_PROXY;
        ProxyConfiguration proxyConfig = Jenkins.getInstance().proxy;
        if (proxyConfig != null && useProxy) {
            proxy = proxyConfig.createProxy(PerfSigUIUtils.getHostFromUrl(serverUrl));
            if (proxyConfig.getUserName() != null) {
                // Add an authenticator which provides the credentials for proxy authentication
                Authenticator.setDefault(new Authenticator() {
                    @Override
                    public PasswordAuthentication getPasswordAuthentication() {
                        if (getRequestorType() != RequestorType.PROXY) return null;
                        return new PasswordAuthentication(proxyConfig.getUserName(),
                                proxyConfig.getPassword().toCharArray());
                    }
                });
            }
        }
        apiClient.setProxy(proxy);
    }

    public DynatraceServerConnection(final DynatraceServerConfiguration config) {
        this(config.getServerUrl(), config.getApiTokenId(), config.isVerifyCertificate(), config.isUseProxy());
    }

    public boolean validateConnection() {
        try {
            getServerVersion();
            return true;
        } catch (CommandExecutionException e) {
            LOGGER.severe(ExceptionUtils.getFullStackTrace(e));
            return false;
        }
    }

    public String getServerVersion() {
        ClusterVersionApi api = apiClient.createService(ClusterVersionApi.class);
        Call<ClusterVersion> call = api.getVersion();
        try {
            ApiResponse<ClusterVersion> version = execute(call);
            return version.getData().getVersion();
        } catch (ApiException ex) {
            throw new CommandExecutionException("error getting version of server: " + ex.getResponseBody(), ex);
        }
    }

    public List<TimeseriesDefinition> getTimeseries() {
        TimeseriesApi api = apiClient.createService(TimeseriesApi.class);
        Call<List<TimeseriesDefinition>> call = api.getAllTimeseriesDefinitions(null, null);
        try {
            ApiResponse<List<TimeseriesDefinition>> reponse = execute(call);
            return reponse.getData();
        } catch (ApiException ex) {
            throw new CommandExecutionException("error while querying timeseries: " + ex.getResponseBody(), ex);
        }
    }

    public TimeseriesDataPointQueryResult getTotalTimeseriesData(String timeseriesId, Long startTimestamp, Long endTimestamp,
                                                                 AggregationTypeEnum aggregationType) {
        TimeseriesApi api = apiClient.createService(TimeseriesApi.class);
        TimeseriesQueryMessage body = new TimeseriesQueryMessage()
                .timeseriesId(timeseriesId)
                .startTimestamp(startTimestamp)
                .endTimestamp(endTimestamp)
                .aggregationType(aggregationType)
                .queryMode(QueryModeEnum.TOTAL);

        Call<TimeseriesDataPointQueryResult.Container> call = api.readTimeseriesComplex(timeseriesId, body);
        try {
            ApiResponse<TimeseriesDataPointQueryResult.Container> response = execute(call);
            return response.getData().result;
        } catch (ApiException ex) {
            throw new CommandExecutionException("error while querying timeseries data: " + ex.getResponseBody(), ex);
        }
    }

    public TimeseriesDataPointQueryResult getTimeseriesData(String timeseriesId, Long startTimestamp, Long endTimestamp,
                                                            AggregationTypeEnum aggregationType) {
        TimeseriesApi api = apiClient.createService(TimeseriesApi.class);
        TimeseriesQueryMessage body = new TimeseriesQueryMessage()
                .timeseriesId(timeseriesId)
                .startTimestamp(startTimestamp)
                .endTimestamp(endTimestamp)
                .aggregationType(aggregationType)
                .queryMode(QueryModeEnum.SERIES);

        Call<TimeseriesDataPointQueryResult.Container> call = api.readTimeseriesComplex(timeseriesId, body);
        try {
            ApiResponse<TimeseriesDataPointQueryResult.Container> response = execute(call);
            return response.getData().result;
        } catch (ApiException ex) {
            throw new CommandExecutionException("error while querying timeseries data: " + ex.getResponseBody(), ex);
        }
    }

    /**
     * Execute HTTP call and deserialize the HTTP response body into the given return type.
     *
     * @param <T>  The return type corresponding to (same with) returnType
     * @param call Call
     * @return ApiResponse object containing response status, headers and
     * data, which is a Java object deserialized from response body and would be null
     * when returnType is null.
     * @throws ApiException If fail to execute the call
     */

    private <T> ApiResponse<T> execute(final Call<T> call) throws ApiException {
        try {
            Response<T> response = call.execute();
            T data = handleResponse(response);
            return new ApiResponse<>(response.code(), response.headers().toMultimap(), data);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    /**
     * Handle the given response, return the deserialized object when the response is successful.
     *
     * @param <T>      Type
     * @param response Response
     * @return Type
     * @throws ApiException If the response has a unsuccessful status code or
     *                      fail to deserialize the response body
     */
    private <T> T handleResponse(final Response<T> response) throws ApiException {
        if (response.isSuccessful()) {
            return response.body();
        } else {
            String respBody = null;
            if (response.body() != null) {
                try {
                    respBody = response.errorBody() != null ? response.errorBody().string() : "empty response body";
                } catch (IOException e) {
                    throw new ApiException(response.message(), e, response.code(), response.headers().toMultimap());
                }
            }
            throw new ApiException(response.message(), response.code(), response.headers().toMultimap(), respBody);
        }
    }
}
