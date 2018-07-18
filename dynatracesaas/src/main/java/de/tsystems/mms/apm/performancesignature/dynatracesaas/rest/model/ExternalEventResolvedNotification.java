/*
 * Dynatrace Environment API
 * Documentation of the Dynatrace REST API. Refer to the [help page](https://www.dynatrace.com/support/help/shortlink/section-api) to read about use-cases and examples.
 *
 * OpenAPI spec version: 1.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package de.tsystems.mms.apm.performancesignature.dynatracesaas.rest.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import static de.tsystems.mms.apm.performancesignature.ui.util.PerfSigUIUtils.toIndentedString;

/**
 * ExternalEventResolvedNotification
 */

public class ExternalEventResolvedNotification {
    @SerializedName("testId")
    private String testId = null;

    @SerializedName("eventId")
    private String eventId = null;

    public ExternalEventResolvedNotification testId(String testId) {
        this.testId = testId;
        return this;
    }

    /**
     * Test id.
     *
     * @return testId
     **/
    @ApiModelProperty(value = "Test id.")
    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public ExternalEventResolvedNotification eventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * Unique id which identifies the event.
     *
     * @return eventId
     **/
    @ApiModelProperty(value = "Unique id which identifies the event.")
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @Override
    public String toString() {
        return "class ExternalEventResolvedNotification {\n" +
                "    testId: " + toIndentedString(testId) + "\n" +
                "    eventId: " + toIndentedString(eventId) + "\n" +
                "}";
    }
}

