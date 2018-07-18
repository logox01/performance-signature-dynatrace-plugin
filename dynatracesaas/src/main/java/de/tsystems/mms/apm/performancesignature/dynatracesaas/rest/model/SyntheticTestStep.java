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
 * SyntheticTestStep
 */

public class SyntheticTestStep {
    @SerializedName("id")
    private Long id = null;

    @SerializedName("title")
    private String title = null;

    public SyntheticTestStep id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique step id.
     *
     * @return id
     **/
    @ApiModelProperty(value = "Unique step id.")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SyntheticTestStep title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Step display name.
     *
     * @return title
     **/
    @ApiModelProperty(value = "Step display name.")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "class SyntheticTestStep {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    title: " + toIndentedString(title) + "\n" +
                "}";
    }
}

