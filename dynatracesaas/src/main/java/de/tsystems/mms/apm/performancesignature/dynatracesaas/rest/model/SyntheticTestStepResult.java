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
 * SyntheticTestStepResult
 */

public class SyntheticTestStepResult {
    @SerializedName("id")
    private Long id = null;

    @SerializedName("startTimestamp")
    private Long startTimestamp = null;

    @SerializedName("responseTimeMillis")
    private Long responseTimeMillis = null;

    @SerializedName("error")
    private SyntheticStepError error = null;

    public SyntheticTestStepResult id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * A step id that is unique for this test definition.
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "A step id that is unique for this test definition.")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SyntheticTestStepResult startTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    /**
     * The timestamp in millis UTC Dynatrace cluster time when the step was executed on this location.
     *
     * @return startTimestamp
     **/
    @ApiModelProperty(required = true, value = "The timestamp in millis UTC Dynatrace cluster time when the step was executed on this location.")
    public Long getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public SyntheticTestStepResult responseTimeMillis(Long responseTimeMillis) {
        this.responseTimeMillis = responseTimeMillis;
        return this;
    }

    /**
     * The response time of this step in milliseconds. Absent when no meaningful response time available as may be the case for certain error conditions such as a misconfigured step script.
     *
     * @return responseTimeMillis
     **/
    @ApiModelProperty(value = "The response time of this step in milliseconds. Absent when no meaningful response time available as may be the case for certain error conditions such as a misconfigured step script.")
    public Long getResponseTimeMillis() {
        return responseTimeMillis;
    }

    public void setResponseTimeMillis(Long responseTimeMillis) {
        this.responseTimeMillis = responseTimeMillis;
    }

    public SyntheticTestStepResult error(SyntheticStepError error) {
        this.error = error;
        return this;
    }

    /**
     * Get error
     *
     * @return error
     **/
    @ApiModelProperty()
    public SyntheticStepError getError() {
        return error;
    }

    public void setError(SyntheticStepError error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "class SyntheticTestStepResult {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    startTimestamp: " + toIndentedString(startTimestamp) + "\n" +
                "    responseTimeMillis: " + toIndentedString(responseTimeMillis) + "\n" +
                "    error: " + toIndentedString(error) + "\n" +
                "}";
    }
}

