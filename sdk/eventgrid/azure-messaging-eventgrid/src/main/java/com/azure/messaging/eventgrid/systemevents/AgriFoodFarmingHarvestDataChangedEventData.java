// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Schema of the Data property of an EventGridEvent for a Microsoft.AgFoodPlatform.HarvestDataChanged event. */
@Fluent
public final class AgriFoodFarmingHarvestDataChangedEventData {
    /*
     * Action occurred on a resource.
     */
    @JsonProperty(value = "actionType")
    private AgriFoodFarmingResourceActionType actionType;

    /*
     * Id of the farmer it belongs to.
     */
    @JsonProperty(value = "farmerId")
    private String farmerId;

    /*
     * Status of the resource.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * Source of the farm operation data.
     */
    @JsonProperty(value = "source")
    private String source;

    /*
     * Date-time when resource was last modified, sample format:
     * yyyy-MM-ddTHH:mm:ssZ.
     */
    @JsonProperty(value = "modifiedDateTime")
    private OffsetDateTime modifiedDateTime;

    /*
     * The ETag value to implement optimistic concurrency.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /*
     * Unique id of resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Name to identify resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Textual description of resource.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Date-time when resource was created, sample format:
     * yyyy-MM-ddTHH:mm:ssZ.
     */
    @JsonProperty(value = "createdDateTime")
    private OffsetDateTime createdDateTime;

    /*
     * A list of key value pairs that describe the resource.
     * Only string and numeral values are supported.
     */
    @JsonProperty(value = "properties")
    private Map<String, Object> properties;

    /**
     * Get the actionType property: Action occurred on a resource.
     *
     * @return the actionType value.
     */
    public AgriFoodFarmingResourceActionType getActionType() {
        return this.actionType;
    }

    /**
     * Set the actionType property: Action occurred on a resource.
     *
     * @param actionType the actionType value to set.
     * @return the AgriFoodFarmingHarvestDataChangedEventData object itself.
     */
    public AgriFoodFarmingHarvestDataChangedEventData setActionType(AgriFoodFarmingResourceActionType actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * Get the farmerId property: Id of the farmer it belongs to.
     *
     * @return the farmerId value.
     */
    public String getFarmerId() {
        return this.farmerId;
    }

    /**
     * Set the farmerId property: Id of the farmer it belongs to.
     *
     * @param farmerId the farmerId value to set.
     * @return the AgriFoodFarmingHarvestDataChangedEventData object itself.
     */
    public AgriFoodFarmingHarvestDataChangedEventData setFarmerId(String farmerId) {
        this.farmerId = farmerId;
        return this;
    }

    /**
     * Get the status property: Status of the resource.
     *
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Status of the resource.
     *
     * @param status the status value to set.
     * @return the AgriFoodFarmingHarvestDataChangedEventData object itself.
     */
    public AgriFoodFarmingHarvestDataChangedEventData setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the source property: Source of the farm operation data.
     *
     * @return the source value.
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Set the source property: Source of the farm operation data.
     *
     * @param source the source value to set.
     * @return the AgriFoodFarmingHarvestDataChangedEventData object itself.
     */
    public AgriFoodFarmingHarvestDataChangedEventData setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the modifiedDateTime property: Date-time when resource was last modified, sample format:
     * yyyy-MM-ddTHH:mm:ssZ.
     *
     * @return the modifiedDateTime value.
     */
    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }

    /**
     * Set the modifiedDateTime property: Date-time when resource was last modified, sample format:
     * yyyy-MM-ddTHH:mm:ssZ.
     *
     * @param modifiedDateTime the modifiedDateTime value to set.
     * @return the AgriFoodFarmingHarvestDataChangedEventData object itself.
     */
    public AgriFoodFarmingHarvestDataChangedEventData setModifiedDateTime(OffsetDateTime modifiedDateTime) {
        this.modifiedDateTime = modifiedDateTime;
        return this;
    }

    /**
     * Get the eTag property: The ETag value to implement optimistic concurrency.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag value to implement optimistic concurrency.
     *
     * @param eTag the eTag value to set.
     * @return the AgriFoodFarmingHarvestDataChangedEventData object itself.
     */
    public AgriFoodFarmingHarvestDataChangedEventData setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the id property: Unique id of resource.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Unique id of resource.
     *
     * @param id the id value to set.
     * @return the AgriFoodFarmingHarvestDataChangedEventData object itself.
     */
    public AgriFoodFarmingHarvestDataChangedEventData setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Name to identify resource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name to identify resource.
     *
     * @param name the name value to set.
     * @return the AgriFoodFarmingHarvestDataChangedEventData object itself.
     */
    public AgriFoodFarmingHarvestDataChangedEventData setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: Textual description of resource.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Textual description of resource.
     *
     * @param description the description value to set.
     * @return the AgriFoodFarmingHarvestDataChangedEventData object itself.
     */
    public AgriFoodFarmingHarvestDataChangedEventData setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the createdDateTime property: Date-time when resource was created, sample format: yyyy-MM-ddTHH:mm:ssZ.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: Date-time when resource was created, sample format: yyyy-MM-ddTHH:mm:ssZ.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the AgriFoodFarmingHarvestDataChangedEventData object itself.
     */
    public AgriFoodFarmingHarvestDataChangedEventData setCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the properties property: A list of key value pairs that describe the resource. Only string and numeral values
     * are supported.
     *
     * @return the properties value.
     */
    public Map<String, Object> getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: A list of key value pairs that describe the resource. Only string and numeral values
     * are supported.
     *
     * @param properties the properties value to set.
     * @return the AgriFoodFarmingHarvestDataChangedEventData object itself.
     */
    public AgriFoodFarmingHarvestDataChangedEventData setProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }
}
