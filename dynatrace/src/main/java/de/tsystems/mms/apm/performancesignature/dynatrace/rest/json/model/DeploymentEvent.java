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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * Deployment event record description
 */
@ApiModel(description = "Deployment event record description")

public class DeploymentEvent {
    @SerializedName("severity")
    private final SeverityEnum severity = null;
    @SerializedName("state")
    private final StateEnum state = null;
    @SerializedName("message")
    private final String message = null;
    @SerializedName("description")
    private final String description = null;
    @SerializedName("start")
    private final String start = null;
    @SerializedName("end")
    private final String end = null;
    @SerializedName("systemprofile")
    private final String systemprofile = null;
    @SerializedName("application")
    private final String application = null;

    /**
     * The severity of the event
     *
     * @return severity
     **/
    @ApiModelProperty(value = "The severity of the event")
    public SeverityEnum getSeverity() {
        return severity;
    }

    /**
     * The state of the event
     *
     * @return state
     **/
    @ApiModelProperty(value = "The state of the event")
    public StateEnum getState() {
        return state;
    }

    /**
     * Get message
     *
     * @return message
     **/
    @ApiModelProperty(required = true)
    public String getMessage() {
        return message;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @ApiModelProperty()
    public String getDescription() {
        return description;
    }

    /**
     * Start time in ISO 8601 compatible date/time of format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX
     *
     * @return start
     **/
    @ApiModelProperty(example = "2016-05-11T11:35:31.170+02:00", value = "Start time in ISO 8601 compatible date/time of format: yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    public String getStart() {
        return start;
    }

    /**
     * End time in ISO 8601 compatible date/time of format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX
     *
     * @return end
     **/
    @ApiModelProperty(example = "2016-05-11T11:35:31.170+02:00", value = "End time in ISO 8601 compatible date/time of format: yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    public String getEnd() {
        return end;
    }

    /**
     * System Profile name
     *
     * @return systemprofile
     **/
    @ApiModelProperty(required = true, value = "System Profile name")
    public String getSystemprofile() {
        return systemprofile;
    }

    /**
     * Application name
     *
     * @return application
     **/
    @ApiModelProperty(value = "Application name")
    public String getApplication() {
        return application;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentEvent {\n");

        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    systemprofile: ").append(toIndentedString(systemprofile)).append("\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
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
     * The severity of the event
     */
    @JsonAdapter(SeverityEnum.Adapter.class)
    public enum SeverityEnum {
        INFORMATIONAL("informational"),

        WARNING("warning"),

        SEVERE("severe");

        private final String value;

        SeverityEnum(String value) {
            this.value = value;
        }

        public static SeverityEnum fromValue(String text) {
            for (SeverityEnum b : SeverityEnum.values()) {
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

        public static class Adapter extends TypeAdapter<SeverityEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final SeverityEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public SeverityEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return SeverityEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * The state of the event
     */
    @JsonAdapter(StateEnum.Adapter.class)
    public enum StateEnum {
        CREATED("Created"),

        INPROGRESS("InProgress"),

        CONFIRMED("Confirmed");

        private final String value;

        StateEnum(String value) {
            this.value = value;
        }

        public static StateEnum fromValue(String text) {
            for (StateEnum b : StateEnum.values()) {
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

        public static class Adapter extends TypeAdapter<StateEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StateEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StateEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

