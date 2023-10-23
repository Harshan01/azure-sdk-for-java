// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.baremetalinfrastructure.models.StorageProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** AzureBareMetalStorageInstance info on Azure (ARM properties and AzureBareMetalStorage properties). */
@Fluent
public final class AzureBareMetalStorageInstanceInner extends Resource {
    /*
     * AzureBareMetalStorageInstance properties
     */
    @JsonProperty(value = "properties")
    private AzureBareMetalStorageInstanceProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of AzureBareMetalStorageInstanceInner class. */
    public AzureBareMetalStorageInstanceInner() {
    }

    /**
     * Get the innerProperties property: AzureBareMetalStorageInstance properties.
     *
     * @return the innerProperties value.
     */
    private AzureBareMetalStorageInstanceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBareMetalStorageInstanceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBareMetalStorageInstanceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the azureBareMetalStorageInstanceUniqueIdentifier property: Specifies the AzureBareMetaStorageInstance unique
     * ID.
     *
     * @return the azureBareMetalStorageInstanceUniqueIdentifier value.
     */
    public String azureBareMetalStorageInstanceUniqueIdentifier() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().azureBareMetalStorageInstanceUniqueIdentifier();
    }

    /**
     * Set the azureBareMetalStorageInstanceUniqueIdentifier property: Specifies the AzureBareMetaStorageInstance unique
     * ID.
     *
     * @param azureBareMetalStorageInstanceUniqueIdentifier the azureBareMetalStorageInstanceUniqueIdentifier value to
     *     set.
     * @return the AzureBareMetalStorageInstanceInner object itself.
     */
    public AzureBareMetalStorageInstanceInner withAzureBareMetalStorageInstanceUniqueIdentifier(
        String azureBareMetalStorageInstanceUniqueIdentifier) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureBareMetalStorageInstanceProperties();
        }
        this
            .innerProperties()
            .withAzureBareMetalStorageInstanceUniqueIdentifier(azureBareMetalStorageInstanceUniqueIdentifier);
        return this;
    }

    /**
     * Get the storageProperties property: Specifies the storage properties for the AzureBareMetalStorage instance.
     *
     * @return the storageProperties value.
     */
    public StorageProperties storageProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().storageProperties();
    }

    /**
     * Set the storageProperties property: Specifies the storage properties for the AzureBareMetalStorage instance.
     *
     * @param storageProperties the storageProperties value to set.
     * @return the AzureBareMetalStorageInstanceInner object itself.
     */
    public AzureBareMetalStorageInstanceInner withStorageProperties(StorageProperties storageProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureBareMetalStorageInstanceProperties();
        }
        this.innerProperties().withStorageProperties(storageProperties);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
