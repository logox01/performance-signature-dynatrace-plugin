/*
 * Copyright (c) 2014-2018 T-Systems Multimedia Solutions GmbH
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
import de.tsystems.mms.apm.performancesignature.dynatracesaas.model.TagInfo;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import static de.tsystems.mms.apm.performancesignature.ui.util.PerfSigUIUtils.toIndentedString;

/**
 * ProcessGroupInstance
 */

public class ProcessGroupInstance {
    @SerializedName("entityId")
    private String entityId;

    @SerializedName("displayName")
    private String displayName;

    @SerializedName("customizedName")
    private String customizedName;

    @SerializedName("discoveredName")
    private String discoveredName;

    @SerializedName("firstSeenTimestamp")
    private Long firstSeenTimestamp;

    @SerializedName("lastSeenTimestamp")
    private Long lastSeenTimestamp;

    @SerializedName("tags")
    private List<TagInfo> tags;

    @SerializedName("fromRelationships")
    private ProcessGroupInstanceFromRelationships fromRelationships;

    @SerializedName("toRelationships")
    private ProcessGroupInstanceToRelationships toRelationships;

    @SerializedName("azureSiteName")
    private List<String> azureSiteName;

    @SerializedName("versionedModules")
    private List<ProcessGroupInstanceModule> versionedModules;

    @SerializedName("metadata")
    private ProcessGroupMetadata metadata;
    @SerializedName("bitness")
    private BitnessEnum bitness;
    @SerializedName("softwareTechnologies")
    private List<TechnologyInfo> softwareTechnologies;
    @SerializedName("agentVersions")
    private List<AgentVersion> agentVersions;
    @SerializedName("monitoringState")
    private MonitoringState monitoringState;
    @SerializedName("modules")
    private List<String> modules;
    @SerializedName("azureHostName")
    private List<String> azureHostName;
    @SerializedName("listenPorts")
    private List<Integer> listenPorts;

    public ProcessGroupInstance entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Dynatrace entity ID of the required entity.   You can find them in the URL of the corresponding Dynatrace page, for example, &#x60;HOST-007&#x60;.
     *
     * @return entityId
     **/
    @ApiModelProperty(value = "Dynatrace entity ID of the required entity.   You can find them in the URL of the corresponding Dynatrace page, for example, `HOST-007`.")
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public ProcessGroupInstance displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * The name of the Dynatrace entity, displayed in the UI.
     *
     * @return displayName
     **/
    @ApiModelProperty(value = "The name of the Dynatrace entity, displayed in the UI.")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ProcessGroupInstance customizedName(String customizedName) {
        this.customizedName = customizedName;
        return this;
    }

    /**
     * Customized name of the entity
     *
     * @return customizedName
     **/
    @ApiModelProperty(value = "Customized name of the entity")
    public String getCustomizedName() {
        return customizedName;
    }

    public void setCustomizedName(String customizedName) {
        this.customizedName = customizedName;
    }

    public ProcessGroupInstance discoveredName(String discoveredName) {
        this.discoveredName = discoveredName;
        return this;
    }

    /**
     * Discovered name of the entity
     *
     * @return discoveredName
     **/
    @ApiModelProperty(value = "Discovered name of the entity")
    public String getDiscoveredName() {
        return discoveredName;
    }

    public void setDiscoveredName(String discoveredName) {
        this.discoveredName = discoveredName;
    }

    public ProcessGroupInstance firstSeenTimestamp(Long firstSeenTimestamp) {
        this.firstSeenTimestamp = firstSeenTimestamp;
        return this;
    }

    /**
     * Timestamp in UTC milliseconds when the entity was detected for the first time.
     *
     * @return firstSeenTimestamp
     **/
    @ApiModelProperty(value = "Timestamp in UTC milliseconds when the entity was detected for the first time.")
    public Long getFirstSeenTimestamp() {
        return firstSeenTimestamp;
    }

    public void setFirstSeenTimestamp(Long firstSeenTimestamp) {
        this.firstSeenTimestamp = firstSeenTimestamp;
    }

    public ProcessGroupInstance lastSeenTimestamp(Long lastSeenTimestamp) {
        this.lastSeenTimestamp = lastSeenTimestamp;
        return this;
    }

    /**
     * Timestamp in UTC milliseconds when the entity was detected for the last time.
     *
     * @return lastSeenTimestamp
     **/
    @ApiModelProperty(value = "Timestamp in UTC milliseconds when the entity was detected for the last time.")
    public Long getLastSeenTimestamp() {
        return lastSeenTimestamp;
    }

    public void setLastSeenTimestamp(Long lastSeenTimestamp) {
        this.lastSeenTimestamp = lastSeenTimestamp;
    }

    public ProcessGroupInstance tags(List<TagInfo> tags) {
        this.tags = tags;
        return this;
    }

    public ProcessGroupInstance addTagsItem(TagInfo tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * The list of entity tags.
     *
     * @return tags
     **/
    @ApiModelProperty(value = "The list of entity tags.")
    public List<TagInfo> getTags() {
        return tags;
    }

    public void setTags(List<TagInfo> tags) {
        this.tags = tags;
    }

    public ProcessGroupInstance fromRelationships(ProcessGroupInstanceFromRelationships fromRelationships) {
        this.fromRelationships = fromRelationships;
        return this;
    }

    /**
     * Get fromRelationships
     *
     * @return fromRelationships
     **/
    public ProcessGroupInstanceFromRelationships getFromRelationships() {
        return fromRelationships;
    }

    public void setFromRelationships(ProcessGroupInstanceFromRelationships fromRelationships) {
        this.fromRelationships = fromRelationships;
    }

    public ProcessGroupInstance toRelationships(ProcessGroupInstanceToRelationships toRelationships) {
        this.toRelationships = toRelationships;
        return this;
    }

    /**
     * Get toRelationships
     *
     * @return toRelationships
     **/
    public ProcessGroupInstanceToRelationships getToRelationships() {
        return toRelationships;
    }

    public void setToRelationships(ProcessGroupInstanceToRelationships toRelationships) {
        this.toRelationships = toRelationships;
    }

    public ProcessGroupInstance azureSiteName(List<String> azureSiteName) {
        this.azureSiteName = azureSiteName;
        return this;
    }

    public ProcessGroupInstance addAzureSiteNameItem(String azureSiteNameItem) {
        if (this.azureSiteName == null) {
            this.azureSiteName = new ArrayList<>();
        }
        this.azureSiteName.add(azureSiteNameItem);
        return this;
    }

    /**
     * @return azureSiteName
     **/
    public List<String> getAzureSiteName() {
        return azureSiteName;
    }

    public void setAzureSiteName(List<String> azureSiteName) {
        this.azureSiteName = azureSiteName;
    }

    public ProcessGroupInstance versionedModules(List<ProcessGroupInstanceModule> versionedModules) {
        this.versionedModules = versionedModules;
        return this;
    }

    public ProcessGroupInstance addVersionedModulesItem(ProcessGroupInstanceModule versionedModulesItem) {
        if (this.versionedModules == null) {
            this.versionedModules = new ArrayList<>();
        }
        this.versionedModules.add(versionedModulesItem);
        return this;
    }

    /**
     * @return versionedModules
     **/
    public List<ProcessGroupInstanceModule> getVersionedModules() {
        return versionedModules;
    }

    public void setVersionedModules(List<ProcessGroupInstanceModule> versionedModules) {
        this.versionedModules = versionedModules;
    }

    public ProcessGroupInstance metadata(ProcessGroupMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get metadata
     *
     * @return metadata
     **/
    public ProcessGroupMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ProcessGroupMetadata metadata) {
        this.metadata = metadata;
    }

    public ProcessGroupInstance bitness(BitnessEnum bitness) {
        this.bitness = bitness;
        return this;
    }

    /**
     * @return bitness
     **/
    public BitnessEnum getBitness() {
        return bitness;
    }

    public void setBitness(BitnessEnum bitness) {
        this.bitness = bitness;
    }

    public ProcessGroupInstance softwareTechnologies(List<TechnologyInfo> softwareTechnologies) {
        this.softwareTechnologies = softwareTechnologies;
        return this;
    }

    public ProcessGroupInstance addSoftwareTechnologiesItem(TechnologyInfo softwareTechnologiesItem) {
        if (this.softwareTechnologies == null) {
            this.softwareTechnologies = new ArrayList<>();
        }
        this.softwareTechnologies.add(softwareTechnologiesItem);
        return this;
    }

    /**
     * @return softwareTechnologies
     **/
    public List<TechnologyInfo> getSoftwareTechnologies() {
        return softwareTechnologies;
    }

    public void setSoftwareTechnologies(List<TechnologyInfo> softwareTechnologies) {
        this.softwareTechnologies = softwareTechnologies;
    }

    public ProcessGroupInstance agentVersions(List<AgentVersion> agentVersions) {
        this.agentVersions = agentVersions;
        return this;
    }

    public ProcessGroupInstance addAgentVersionsItem(AgentVersion agentVersionsItem) {
        if (this.agentVersions == null) {
            this.agentVersions = new ArrayList<>();
        }
        this.agentVersions.add(agentVersionsItem);
        return this;
    }

    /**
     * Defines the versions of the agents currently running on the entity.
     *
     * @return agentVersions
     **/
    @ApiModelProperty(value = "Defines the versions of the agents currently running on the entity.")
    public List<AgentVersion> getAgentVersions() {
        return agentVersions;
    }

    public void setAgentVersions(List<AgentVersion> agentVersions) {
        this.agentVersions = agentVersions;
    }

    public ProcessGroupInstance monitoringState(MonitoringState monitoringState) {
        this.monitoringState = monitoringState;
        return this;
    }

    /**
     * Defines the current monitoring state of an entity.
     *
     * @return monitoringState
     **/
    @ApiModelProperty(value = "Defines the current monitoring state of an entity.")
    public MonitoringState getMonitoringState() {
        return monitoringState;
    }

    public void setMonitoringState(MonitoringState monitoringState) {
        this.monitoringState = monitoringState;
    }

    public ProcessGroupInstance modules(List<String> modules) {
        this.modules = modules;
        return this;
    }

    public ProcessGroupInstance addModulesItem(String modulesItem) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        this.modules.add(modulesItem);
        return this;
    }

    /**
     * @return modules
     **/
    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }

    public ProcessGroupInstance azureHostName(List<String> azureHostName) {
        this.azureHostName = azureHostName;
        return this;
    }

    public ProcessGroupInstance addAzureHostNameItem(String azureHostNameItem) {
        if (this.azureHostName == null) {
            this.azureHostName = new ArrayList<>();
        }
        this.azureHostName.add(azureHostNameItem);
        return this;
    }

    /**
     * @return azureHostName
     **/
    public List<String> getAzureHostName() {
        return azureHostName;
    }

    public void setAzureHostName(List<String> azureHostName) {
        this.azureHostName = azureHostName;
    }

    public ProcessGroupInstance listenPorts(List<Integer> listenPorts) {
        this.listenPorts = listenPorts;
        return this;
    }

    public ProcessGroupInstance addListenPortsItem(Integer listenPortsItem) {
        if (this.listenPorts == null) {
            this.listenPorts = new ArrayList<>();
        }
        this.listenPorts.add(listenPortsItem);
        return this;
    }

    /**
     * @return listenPorts
     **/
    public List<Integer> getListenPorts() {
        return listenPorts;
    }

    public void setListenPorts(List<Integer> listenPorts) {
        this.listenPorts = listenPorts;
    }

    @Override
    public String toString() {
        return "class ProcessGroupInstance {\n"
                + "    entityId: " + toIndentedString(entityId) + "\n"
                + "    displayName: " + toIndentedString(displayName) + "\n"
                + "    customizedName: " + toIndentedString(customizedName) + "\n"
                + "    discoveredName: " + toIndentedString(discoveredName) + "\n"
                + "    firstSeenTimestamp: " + toIndentedString(firstSeenTimestamp) + "\n"
                + "    lastSeenTimestamp: " + toIndentedString(lastSeenTimestamp) + "\n"
                + "    tags: " + toIndentedString(tags) + "\n"
                + "    fromRelationships: " + toIndentedString(fromRelationships) + "\n"
                + "    toRelationships: " + toIndentedString(toRelationships) + "\n"
                + "    azureSiteName: " + toIndentedString(azureSiteName) + "\n"
                + "    versionedModules: " + toIndentedString(versionedModules) + "\n"
                + "    metadata: " + toIndentedString(metadata) + "\n"
                + "    bitness: " + toIndentedString(bitness) + "\n"
                + "    softwareTechnologies: " + toIndentedString(softwareTechnologies) + "\n"
                + "    agentVersions: " + toIndentedString(agentVersions) + "\n"
                + "    monitoringState: " + toIndentedString(monitoringState) + "\n"
                + "    modules: " + toIndentedString(modules) + "\n"
                + "    azureHostName: " + toIndentedString(azureHostName) + "\n"
                + "    listenPorts: " + toIndentedString(listenPorts) + "\n"
                + "}";
    }
}

