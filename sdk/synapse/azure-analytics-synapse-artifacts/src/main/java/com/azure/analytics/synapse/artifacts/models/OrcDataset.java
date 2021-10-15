// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** ORC dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Orc")
@JsonFlatten
@Fluent
public class OrcDataset extends Dataset {
    /*
     * The location of the ORC data storage.
     */
    @JsonProperty(value = "typeProperties.location")
    private DatasetLocation location;

    /*
     * The data orcCompressionCodec. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.orcCompressionCodec")
    private Object orcCompressionCodec;

    /**
     * Get the location property: The location of the ORC data storage.
     *
     * @return the location value.
     */
    public DatasetLocation getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location of the ORC data storage.
     *
     * @param location the location value to set.
     * @return the OrcDataset object itself.
     */
    public OrcDataset setLocation(DatasetLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get the orcCompressionCodec property: The data orcCompressionCodec. Type: string (or Expression with resultType
     * string).
     *
     * @return the orcCompressionCodec value.
     */
    public Object getOrcCompressionCodec() {
        return this.orcCompressionCodec;
    }

    /**
     * Set the orcCompressionCodec property: The data orcCompressionCodec. Type: string (or Expression with resultType
     * string).
     *
     * @param orcCompressionCodec the orcCompressionCodec value to set.
     * @return the OrcDataset object itself.
     */
    public OrcDataset setOrcCompressionCodec(Object orcCompressionCodec) {
        this.orcCompressionCodec = orcCompressionCodec;
        return this;
    }
}
