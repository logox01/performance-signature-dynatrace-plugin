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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TestRunFilter
 */

public class TestRunFilter {
    @SerializedName("startTime")
    private final String startTime = null;

    @SerializedName("endTime")
    private final String endTime = null;
    @SerializedName("extend")
    private final ExtendEnum extend = null;
    @SerializedName("lastNTestruns")
    private final Integer lastNTestruns = null;
    @SerializedName("lastNBuilds")
    private final Integer lastNBuilds = null;
    @SerializedName("finished")
    private final Boolean finished = false;
    @SerializedName("status")
    private List<String> status = null;
    @SerializedName("versionMajor")
    private List<String> versionMajor = null;
    @SerializedName("versionMinor")
    private List<String> versionMinor = null;
    @SerializedName("versionRevision")
    private List<String> versionRevision = null;
    @SerializedName("versionMilestone")
    private List<String> versionMilestone = null;
    @SerializedName("versionBuild")
    private List<String> versionBuild = null;
    @SerializedName("category")
    private List<String> category = null;
    @SerializedName("marker")
    private List<String> marker = null;
    @SerializedName("platform")
    private List<String> platform = null;

    /**
     * Start time of timeframe filter in ISO 8601 compatible date/time of format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX
     *
     * @return startTime
     **/
    @ApiModelProperty(example = "2016-05-11T11:35:31.170+02:00", value = "Start time of timeframe filter in ISO 8601 compatible date/time of format: yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    public String getStartTime() {
        return startTime;
    }

    /**
     * End time of timeframe filter in ISO 8601 compatible date/time of format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX
     *
     * @return endTime
     **/
    @ApiModelProperty(example = "2016-06-11T11:35:31.000+02:00", value = "End time of timeframe filter in ISO 8601 compatible date/time of format: yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    public String getEndTime() {
        return endTime;
    }

    /**
     * Level of detail returned in the response: - &#39;runs&#39;: only meta data, - &#39;results&#39;: meta data and individual test results, - &#39;measures&#39;: meta data, test results and measure values
     *
     * @return extend
     **/
    @ApiModelProperty(example = "runs", value = "Level of detail returned in the response: - 'runs': only meta data, - 'results': meta data and individual test results, - 'measures': meta data, test results and measure values")
    public ExtendEnum getExtend() {
        return extend;
    }

    public TestRunFilter status(List<String> status) {
        this.status = status;
        return this;
    }

    public TestRunFilter addStatusItem(String statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    /**
     * Filter test results by status. Only relevant if response includes individual test results (&#39;extend&#39; set to &#39;results&#39; or &#39;measures&#39;). Possible values: &#39;invalidated&#39;, &#39;volatile&#39;, &#39;degraded&#39;, &#39;improved&#39;, &#39;missing&#39;, &#39;passed&#39;
     *
     * @return status
     **/
    @ApiModelProperty(value = "Filter test results by status. Only relevant if response includes individual test results ('extend' set to 'results' or 'measures'). Possible values: 'invalidated', 'volatile', 'degraded', 'improved', 'missing', 'passed'")
    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    /**
     * Max number of the most recent test runs to include
     *
     * @return lastNTestruns
     **/
    @ApiModelProperty(value = "Max number of the most recent test runs to include")
    public Integer getLastNTestruns() {
        return lastNTestruns;
    }

    /**
     * Max number of the most recent builds (versionbuild) values to include
     *
     * @return lastNBuilds
     **/
    @ApiModelProperty(value = "Max number of the most recent builds (versionbuild) values to include")
    public Integer getLastNBuilds() {
        return lastNBuilds;
    }

    public TestRunFilter versionMajor(List<String> versionMajor) {
        this.versionMajor = versionMajor;
        return this;
    }

    public TestRunFilter addVersionMajorItem(String versionMajorItem) {
        if (this.versionMajor == null) {
            this.versionMajor = new ArrayList<>();
        }
        this.versionMajor.add(versionMajorItem);
        return this;
    }

    /**
     * Get versionMajor
     *
     * @return versionMajor
     **/
    @ApiModelProperty()
    public List<String> getVersionMajor() {
        return versionMajor;
    }

    public void setVersionMajor(List<String> versionMajor) {
        this.versionMajor = versionMajor;
    }

    public TestRunFilter versionMinor(List<String> versionMinor) {
        this.versionMinor = versionMinor;
        return this;
    }

    public TestRunFilter addVersionMinorItem(String versionMinorItem) {
        if (this.versionMinor == null) {
            this.versionMinor = new ArrayList<>();
        }
        this.versionMinor.add(versionMinorItem);
        return this;
    }

    /**
     * Get versionMinor
     *
     * @return versionMinor
     **/
    @ApiModelProperty()
    public List<String> getVersionMinor() {
        return versionMinor;
    }

    public void setVersionMinor(List<String> versionMinor) {
        this.versionMinor = versionMinor;
    }

    public TestRunFilter versionRevision(List<String> versionRevision) {
        this.versionRevision = versionRevision;
        return this;
    }

    public TestRunFilter addVersionRevisionItem(String versionRevisionItem) {
        if (this.versionRevision == null) {
            this.versionRevision = new ArrayList<>();
        }
        this.versionRevision.add(versionRevisionItem);
        return this;
    }

    /**
     * Get versionRevision
     *
     * @return versionRevision
     **/
    @ApiModelProperty()
    public List<String> getVersionRevision() {
        return versionRevision;
    }

    public void setVersionRevision(List<String> versionRevision) {
        this.versionRevision = versionRevision;
    }

    public TestRunFilter versionMilestone(List<String> versionMilestone) {
        this.versionMilestone = versionMilestone;
        return this;
    }

    public TestRunFilter addVersionMilestoneItem(String versionMilestoneItem) {
        if (this.versionMilestone == null) {
            this.versionMilestone = new ArrayList<>();
        }
        this.versionMilestone.add(versionMilestoneItem);
        return this;
    }

    /**
     * Get versionMilestone
     *
     * @return versionMilestone
     **/
    @ApiModelProperty()
    public List<String> getVersionMilestone() {
        return versionMilestone;
    }

    public void setVersionMilestone(List<String> versionMilestone) {
        this.versionMilestone = versionMilestone;
    }

    public TestRunFilter versionBuild(List<String> versionBuild) {
        this.versionBuild = versionBuild;
        return this;
    }

    public TestRunFilter addVersionBuildItem(String versionBuildItem) {
        if (this.versionBuild == null) {
            this.versionBuild = new ArrayList<>();
        }
        this.versionBuild.add(versionBuildItem);
        return this;
    }

    /**
     * Get versionBuild
     *
     * @return versionBuild
     **/
    @ApiModelProperty()
    public List<String> getVersionBuild() {
        return versionBuild;
    }

    public void setVersionBuild(List<String> versionBuild) {
        this.versionBuild = versionBuild;
    }

    public TestRunFilter category(List<String> category) {
        this.category = category;
        return this;
    }

    public TestRunFilter addCategoryItem(String categoryItem) {
        if (this.category == null) {
            this.category = new ArrayList<>();
        }
        this.category.add(categoryItem);
        return this;
    }

    /**
     * Filter by test category. Possible values: &#39;unit&#39;, &#39;uidriven&#39;, &#39;performance&#39;, &#39;webapi&#39;, &#39;external&#39;
     *
     * @return category
     **/
    @ApiModelProperty(value = "Filter by test category. Possible values: 'unit', 'uidriven', 'performance', 'webapi', 'external'")
    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    /**
     * Get finished
     *
     * @return finished
     **/
    @ApiModelProperty()
    public Boolean getFinished() {
        return finished;
    }

    public TestRunFilter marker(List<String> marker) {
        this.marker = marker;
        return this;
    }

    public TestRunFilter addMarkerItem(String markerItem) {
        if (this.marker == null) {
            this.marker = new ArrayList<>();
        }
        this.marker.add(markerItem);
        return this;
    }

    /**
     * Get marker
     *
     * @return marker
     **/
    @ApiModelProperty()
    public List<String> getMarker() {
        return marker;
    }

    public void setMarker(List<String> marker) {
        this.marker = marker;
    }

    public TestRunFilter platform(List<String> platform) {
        this.platform = platform;
        return this;
    }

    public TestRunFilter addPlatformItem(String platformItem) {
        if (this.platform == null) {
            this.platform = new ArrayList<>();
        }
        this.platform.add(platformItem);
        return this;
    }

    /**
     * Get platform
     *
     * @return platform
     **/
    @ApiModelProperty()
    public List<String> getPlatform() {
        return platform;
    }

    public void setPlatform(List<String> platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestRunFilter {\n");

        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    lastNTestruns: ").append(toIndentedString(lastNTestruns)).append("\n");
        sb.append("    lastNBuilds: ").append(toIndentedString(lastNBuilds)).append("\n");
        sb.append("    versionMajor: ").append(toIndentedString(versionMajor)).append("\n");
        sb.append("    versionMinor: ").append(toIndentedString(versionMinor)).append("\n");
        sb.append("    versionRevision: ").append(toIndentedString(versionRevision)).append("\n");
        sb.append("    versionMilestone: ").append(toIndentedString(versionMilestone)).append("\n");
        sb.append("    versionBuild: ").append(toIndentedString(versionBuild)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Level of detail returned in the response: - &#39;runs&#39;: only meta data, - &#39;results&#39;: meta data and individual test results, - &#39;measures&#39;: meta data, test results and measure values
     */
    @JsonAdapter(ExtendEnum.Adapter.class)
    public enum ExtendEnum {
        RUNS("runs"),

        RESULTS("results"),

        MEASURES("measures");

        private final String value;

        ExtendEnum(String value) {
            this.value = value;
        }

        public static ExtendEnum fromValue(String text) {
            for (ExtendEnum b : ExtendEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<ExtendEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ExtendEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ExtendEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ExtendEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
