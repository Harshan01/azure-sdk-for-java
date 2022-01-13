// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.CircuitConnectionStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Express Route Circuit Connection in an ExpressRouteCircuitPeering resource. */
@Fluent
public final class ExpressRouteCircuitConnectionInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteCircuitConnectionInner.class);

    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private ExpressRouteCircuitConnectionPropertiesFormat innerProperties;

    /*
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the innerProperties property: The properties property.
     *
     * @return the innerProperties value.
     */
    private ExpressRouteCircuitConnectionPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Gets name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the ExpressRouteCircuitConnectionInner object itself.
     */
    public ExpressRouteCircuitConnectionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /** {@inheritDoc} */
    @Override
    public ExpressRouteCircuitConnectionInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the expressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of the
     * circuit initiating connection.
     *
     * @return the expressRouteCircuitPeering value.
     */
    public SubResource expressRouteCircuitPeering() {
        return this.innerProperties() == null ? null : this.innerProperties().expressRouteCircuitPeering();
    }

    /**
     * Set the expressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of the
     * circuit initiating connection.
     *
     * @param expressRouteCircuitPeering the expressRouteCircuitPeering value to set.
     * @return the ExpressRouteCircuitConnectionInner object itself.
     */
    public ExpressRouteCircuitConnectionInner withExpressRouteCircuitPeering(SubResource expressRouteCircuitPeering) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitConnectionPropertiesFormat();
        }
        this.innerProperties().withExpressRouteCircuitPeering(expressRouteCircuitPeering);
        return this;
    }

    /**
     * Get the peerExpressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of
     * the peered circuit.
     *
     * @return the peerExpressRouteCircuitPeering value.
     */
    public SubResource peerExpressRouteCircuitPeering() {
        return this.innerProperties() == null ? null : this.innerProperties().peerExpressRouteCircuitPeering();
    }

    /**
     * Set the peerExpressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of
     * the peered circuit.
     *
     * @param peerExpressRouteCircuitPeering the peerExpressRouteCircuitPeering value to set.
     * @return the ExpressRouteCircuitConnectionInner object itself.
     */
    public ExpressRouteCircuitConnectionInner withPeerExpressRouteCircuitPeering(
        SubResource peerExpressRouteCircuitPeering) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitConnectionPropertiesFormat();
        }
        this.innerProperties().withPeerExpressRouteCircuitPeering(peerExpressRouteCircuitPeering);
        return this;
    }

    /**
     * Get the addressPrefix property: /29 IP address space to carve out Customer addresses for tunnels.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().addressPrefix();
    }

    /**
     * Set the addressPrefix property: /29 IP address space to carve out Customer addresses for tunnels.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the ExpressRouteCircuitConnectionInner object itself.
     */
    public ExpressRouteCircuitConnectionInner withAddressPrefix(String addressPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitConnectionPropertiesFormat();
        }
        this.innerProperties().withAddressPrefix(addressPrefix);
        return this;
    }

    /**
     * Get the authorizationKey property: The authorization key.
     *
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.innerProperties() == null ? null : this.innerProperties().authorizationKey();
    }

    /**
     * Set the authorizationKey property: The authorization key.
     *
     * @param authorizationKey the authorizationKey value to set.
     * @return the ExpressRouteCircuitConnectionInner object itself.
     */
    public ExpressRouteCircuitConnectionInner withAuthorizationKey(String authorizationKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitConnectionPropertiesFormat();
        }
        this.innerProperties().withAuthorizationKey(authorizationKey);
        return this;
    }

    /**
     * Get the circuitConnectionStatus property: Express Route Circuit Connection State. Possible values are:
     * 'Connected' and 'Disconnected'.
     *
     * @return the circuitConnectionStatus value.
     */
    public CircuitConnectionStatus circuitConnectionStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().circuitConnectionStatus();
    }

    /**
     * Get the provisioningState property: Provisioning state of the circuit connection resource. Possible values are:
     * 'Succeeded', 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
