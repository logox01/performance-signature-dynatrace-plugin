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

/*
 * AppMon Server REST API
 * The AppMon Server exposes management and integration functionality via REST endpoints. This interactive documentation also acts as a REST client you can use to interact with the AppMon Server.  The HTTP status code of the response shows the result of your request. The expected response code for a successful request is documented individually per REST endpoint. Additionally the following error response codes can typically occur in our REST interface:  * **400** - Bad Request: Some request parameters are not correct. * **401** - Unauthorized: A valid authorization header (Basic Authentication) is required but is not available. * **403** - Forbidden: Execution of request is not allowed, e.g. the user has no privileges. * **404** - Not Found: Endpoint does not exist or some entities could not be found, e.g. System Profile. * **500** - Internal Server Error: See response body for details.  Additional [usage examples](https://www.dynatrace.com/support/doc/appmon70/shortlink/id_server_rest_examples) can be found in the AppMon documentation. 
 *
 * OpenAPI spec version: 2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package de.tsystems.mms.apm.performancesignature.dynatrace.rest.json.model;

import com.google.gson.annotations.SerializedName;
import de.tsystems.mms.apm.performancesignature.util.PerfSigUIUtils;
import io.swagger.annotations.ApiModelProperty;

/**
 * SystemProfileReference
 */

public class SystemProfileReference {
    @SerializedName("id")
    private final String id = null;

    @SerializedName("isrecording")
    private final Boolean isrecording = false;

    @SerializedName("href")
    private final String href = null;

    /**
     * System Profile id
     *
     * @return id
     **/
    @ApiModelProperty(value = "System Profile id")
    public String getId() {
        return id;
    }

    /**
     * Session recording state
     *
     * @return isrecording
     **/
    @ApiModelProperty(value = "Session recording state")
    public Boolean getIsrecording() {
        return isrecording;
    }

    /**
     * Base URL of the REST resource. Further information can be retrieved from this URL or its subresources
     *
     * @return href
     **/
    @ApiModelProperty(value = "Base URL of the REST resource. Further information can be retrieved from this URL or its subresources")
    public String getHref() {
        return href;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemProfileReference {\n");

        sb.append("    id: ").append(PerfSigUIUtils.toIndentedString(id)).append("\n");
        sb.append("    isrecording: ").append(PerfSigUIUtils.toIndentedString(isrecording)).append("\n");
        sb.append("    href: ").append(PerfSigUIUtils.toIndentedString(href)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
