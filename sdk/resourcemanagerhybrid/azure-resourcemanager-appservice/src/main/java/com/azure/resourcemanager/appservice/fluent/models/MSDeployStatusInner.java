// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.MSDeployProvisioningState;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** MSDeploy ARM response. */
@Fluent
public final class MSDeployStatusInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MSDeployStatusInner.class);

    /*
     * MSDeployStatus resource specific properties
     */
    @JsonProperty(value = "properties")
    private MSDeployStatusProperties innerProperties;

    /**
     * Get the innerProperties property: MSDeployStatus resource specific properties.
     *
     * @return the innerProperties value.
     */
    private MSDeployStatusProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public MSDeployStatusInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the deployer property: Username of deployer.
     *
     * @return the deployer value.
     */
    public String deployer() {
        return this.innerProperties() == null ? null : this.innerProperties().deployer();
    }

    /**
     * Get the provisioningState property: Provisioning state.
     *
     * @return the provisioningState value.
     */
    public MSDeployProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the startTime property: Start time of deploy operation.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Get the endTime property: End time of deploy operation.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.innerProperties() == null ? null : this.innerProperties().endTime();
    }

    /**
     * Get the complete property: Whether the deployment operation has completed.
     *
     * @return the complete value.
     */
    public Boolean complete() {
        return this.innerProperties() == null ? null : this.innerProperties().complete();
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
