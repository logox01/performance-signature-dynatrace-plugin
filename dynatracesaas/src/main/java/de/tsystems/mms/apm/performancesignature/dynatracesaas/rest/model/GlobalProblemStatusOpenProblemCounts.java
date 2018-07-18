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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import static de.tsystems.mms.apm.performancesignature.ui.util.PerfSigUIUtils.toIndentedString;

/**
 * Number of open problems per impact level.
 */
@ApiModel(description = "Number of open problems per impact level.")

public class GlobalProblemStatusOpenProblemCounts {
    @SerializedName("APPLICATION")
    private Integer APPLICATION = null;

    @SerializedName("ENVIRONMENT")
    private Integer ENVIRONMENT = null;

    @SerializedName("INFRASTRUCTURE")
    private Integer INFRASTRUCTURE = null;

    @SerializedName("SERVICE")
    private Integer SERVICE = null;

    public GlobalProblemStatusOpenProblemCounts APPLICATION(Integer APPLICATION) {
        this.APPLICATION = APPLICATION;
        return this;
    }

    /**
     * Holds the count of impacted entities for entities belonging to the impact level APPLICATION
     *
     * @return APPLICATION
     **/
    @ApiModelProperty(value = "Holds the count of impacted entities for entities belonging to the impact level APPLICATION")
    public Integer getAPPLICATION() {
        return APPLICATION;
    }

    public void setAPPLICATION(Integer APPLICATION) {
        this.APPLICATION = APPLICATION;
    }

    public GlobalProblemStatusOpenProblemCounts ENVIRONMENT(Integer ENVIRONMENT) {
        this.ENVIRONMENT = ENVIRONMENT;
        return this;
    }

    /**
     * Holds the count of impacted entities for entities belonging to the impact level ENVIRONMENT
     *
     * @return ENVIRONMENT
     **/
    @ApiModelProperty(value = "Holds the count of impacted entities for entities belonging to the impact level ENVIRONMENT")
    public Integer getENVIRONMENT() {
        return ENVIRONMENT;
    }

    public void setENVIRONMENT(Integer ENVIRONMENT) {
        this.ENVIRONMENT = ENVIRONMENT;
    }

    public GlobalProblemStatusOpenProblemCounts INFRASTRUCTURE(Integer INFRASTRUCTURE) {
        this.INFRASTRUCTURE = INFRASTRUCTURE;
        return this;
    }

    /**
     * Holds the count of impacted entities for entities belonging to the impact level INFRASTRUCTURE
     *
     * @return INFRASTRUCTURE
     **/
    @ApiModelProperty(value = "Holds the count of impacted entities for entities belonging to the impact level INFRASTRUCTURE")
    public Integer getINFRASTRUCTURE() {
        return INFRASTRUCTURE;
    }

    public void setINFRASTRUCTURE(Integer INFRASTRUCTURE) {
        this.INFRASTRUCTURE = INFRASTRUCTURE;
    }

    public GlobalProblemStatusOpenProblemCounts SERVICE(Integer SERVICE) {
        this.SERVICE = SERVICE;
        return this;
    }

    /**
     * Holds the count of impacted entities for entities belonging to the impact level SERVICE
     *
     * @return SERVICE
     **/
    @ApiModelProperty(value = "Holds the count of impacted entities for entities belonging to the impact level SERVICE")
    public Integer getSERVICE() {
        return SERVICE;
    }

    public void setSERVICE(Integer SERVICE) {
        this.SERVICE = SERVICE;
    }

    @Override
    public String toString() {
        return "class GlobalProblemStatusOpenProblemCounts {\n" +
                "    APPLICATION: " + toIndentedString(APPLICATION) + "\n" +
                "    ENVIRONMENT: " + toIndentedString(ENVIRONMENT) + "\n" +
                "    INFRASTRUCTURE: " + toIndentedString(INFRASTRUCTURE) + "\n" +
                "    SERVICE: " + toIndentedString(SERVICE) + "\n" +
                "}";
    }
}

