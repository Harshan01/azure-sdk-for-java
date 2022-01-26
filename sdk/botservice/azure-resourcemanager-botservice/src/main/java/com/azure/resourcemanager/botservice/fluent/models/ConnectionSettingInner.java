// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.botservice.models.ConnectionSettingProperties;
import com.azure.resourcemanager.botservice.models.Kind;
import com.azure.resourcemanager.botservice.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Bot channel resource definition. */
@Fluent
public final class ConnectionSettingInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionSettingInner.class);

    /*
     * The set of properties specific to bot channel resource
     */
    @JsonProperty(value = "properties")
    private ConnectionSettingProperties properties;

    /*
     * Gets or sets the SKU of the resource.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Required. Gets or sets the Kind of the resource.
     */
    @JsonProperty(value = "kind")
    private Kind kind;

    /*
     * Entity Tag
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Entity zones
     */
    @JsonProperty(value = "zones", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> zones;

    /**
     * Get the properties property: The set of properties specific to bot channel resource.
     *
     * @return the properties value.
     */
    public ConnectionSettingProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The set of properties specific to bot channel resource.
     *
     * @param properties the properties value to set.
     * @return the ConnectionSettingInner object itself.
     */
    public ConnectionSettingInner withProperties(ConnectionSettingProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the sku property: Gets or sets the SKU of the resource.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Gets or sets the SKU of the resource.
     *
     * @param sku the sku value to set.
     * @return the ConnectionSettingInner object itself.
     */
    public ConnectionSettingInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the kind property: Required. Gets or sets the Kind of the resource.
     *
     * @return the kind value.
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Required. Gets or sets the Kind of the resource.
     *
     * @param kind the kind value to set.
     * @return the ConnectionSettingInner object itself.
     */
    public ConnectionSettingInner withKind(Kind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the etag property: Entity Tag.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Entity Tag.
     *
     * @param etag the etag value to set.
     * @return the ConnectionSettingInner object itself.
     */
    public ConnectionSettingInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the zones property: Entity zones.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /** {@inheritDoc} */
    @Override
    public ConnectionSettingInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ConnectionSettingInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
