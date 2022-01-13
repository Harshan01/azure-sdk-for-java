// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.streamanalytics.fluent.models.BlobReferenceInputDataSourceProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes a blob input data source that contains reference data. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Microsoft.Storage/Blob")
@Fluent
public final class BlobReferenceInputDataSource extends ReferenceInputDataSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BlobReferenceInputDataSource.class);

    /*
     * The properties that are associated with a blob input containing
     * reference data. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties")
    private BlobReferenceInputDataSourceProperties innerProperties;

    /**
     * Get the innerProperties property: The properties that are associated with a blob input containing reference data.
     * Required on PUT (CreateOrReplace) requests.
     *
     * @return the innerProperties value.
     */
    private BlobReferenceInputDataSourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
