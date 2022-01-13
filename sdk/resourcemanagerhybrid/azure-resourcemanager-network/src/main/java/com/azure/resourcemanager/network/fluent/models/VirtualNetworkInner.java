// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.AddressSpace;
import com.azure.resourcemanager.network.models.DhcpOptions;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Virtual Network resource. */
@Fluent
public final class VirtualNetworkInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkInner.class);

    /*
     * Properties of the virtual network.
     */
    @JsonProperty(value = "properties")
    private VirtualNetworkPropertiesFormat innerProperties;

    /*
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the innerProperties property: Properties of the virtual network.
     *
     * @return the innerProperties value.
     */
    private VirtualNetworkPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualNetworkInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualNetworkInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the addressSpace property: The AddressSpace that contains an array of IP address ranges that can be used by
     * subnets.
     *
     * @return the addressSpace value.
     */
    public AddressSpace addressSpace() {
        return this.innerProperties() == null ? null : this.innerProperties().addressSpace();
    }

    /**
     * Set the addressSpace property: The AddressSpace that contains an array of IP address ranges that can be used by
     * subnets.
     *
     * @param addressSpace the addressSpace value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withAddressSpace(AddressSpace addressSpace) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPropertiesFormat();
        }
        this.innerProperties().withAddressSpace(addressSpace);
        return this;
    }

    /**
     * Get the dhcpOptions property: The dhcpOptions that contains an array of DNS servers available to VMs deployed in
     * the virtual network.
     *
     * @return the dhcpOptions value.
     */
    public DhcpOptions dhcpOptions() {
        return this.innerProperties() == null ? null : this.innerProperties().dhcpOptions();
    }

    /**
     * Set the dhcpOptions property: The dhcpOptions that contains an array of DNS servers available to VMs deployed in
     * the virtual network.
     *
     * @param dhcpOptions the dhcpOptions value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withDhcpOptions(DhcpOptions dhcpOptions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPropertiesFormat();
        }
        this.innerProperties().withDhcpOptions(dhcpOptions);
        return this;
    }

    /**
     * Get the subnets property: A list of subnets in a Virtual Network.
     *
     * @return the subnets value.
     */
    public List<SubnetInner> subnets() {
        return this.innerProperties() == null ? null : this.innerProperties().subnets();
    }

    /**
     * Set the subnets property: A list of subnets in a Virtual Network.
     *
     * @param subnets the subnets value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withSubnets(List<SubnetInner> subnets) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPropertiesFormat();
        }
        this.innerProperties().withSubnets(subnets);
        return this;
    }

    /**
     * Get the virtualNetworkPeerings property: A list of peerings in a Virtual Network.
     *
     * @return the virtualNetworkPeerings value.
     */
    public List<VirtualNetworkPeeringInner> virtualNetworkPeerings() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetworkPeerings();
    }

    /**
     * Set the virtualNetworkPeerings property: A list of peerings in a Virtual Network.
     *
     * @param virtualNetworkPeerings the virtualNetworkPeerings value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withVirtualNetworkPeerings(List<VirtualNetworkPeeringInner> virtualNetworkPeerings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPropertiesFormat();
        }
        this.innerProperties().withVirtualNetworkPeerings(virtualNetworkPeerings);
        return this;
    }

    /**
     * Get the resourceGuid property: The resourceGuid property of the Virtual Network resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Set the resourceGuid property: The resourceGuid property of the Virtual Network resource.
     *
     * @param resourceGuid the resourceGuid value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withResourceGuid(String resourceGuid) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPropertiesFormat();
        }
        this.innerProperties().withResourceGuid(resourceGuid);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the PublicIP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: The provisioning state of the PublicIP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withProvisioningState(String provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPropertiesFormat();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the enableDdosProtection property: Indicates if DDoS protection is enabled for all the protected resources in
     * the virtual network. It requires a DDoS protection plan associated with the resource.
     *
     * @return the enableDdosProtection value.
     */
    public Boolean enableDdosProtection() {
        return this.innerProperties() == null ? null : this.innerProperties().enableDdosProtection();
    }

    /**
     * Set the enableDdosProtection property: Indicates if DDoS protection is enabled for all the protected resources in
     * the virtual network. It requires a DDoS protection plan associated with the resource.
     *
     * @param enableDdosProtection the enableDdosProtection value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withEnableDdosProtection(Boolean enableDdosProtection) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPropertiesFormat();
        }
        this.innerProperties().withEnableDdosProtection(enableDdosProtection);
        return this;
    }

    /**
     * Get the enableVmProtection property: Indicates if VM protection is enabled for all the subnets in the virtual
     * network.
     *
     * @return the enableVmProtection value.
     */
    public Boolean enableVmProtection() {
        return this.innerProperties() == null ? null : this.innerProperties().enableVmProtection();
    }

    /**
     * Set the enableVmProtection property: Indicates if VM protection is enabled for all the subnets in the virtual
     * network.
     *
     * @param enableVmProtection the enableVmProtection value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withEnableVmProtection(Boolean enableVmProtection) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPropertiesFormat();
        }
        this.innerProperties().withEnableVmProtection(enableVmProtection);
        return this;
    }

    /**
     * Get the ddosProtectionPlan property: The DDoS protection plan associated with the virtual network.
     *
     * @return the ddosProtectionPlan value.
     */
    public SubResource ddosProtectionPlan() {
        return this.innerProperties() == null ? null : this.innerProperties().ddosProtectionPlan();
    }

    /**
     * Set the ddosProtectionPlan property: The DDoS protection plan associated with the virtual network.
     *
     * @param ddosProtectionPlan the ddosProtectionPlan value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withDdosProtectionPlan(SubResource ddosProtectionPlan) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPropertiesFormat();
        }
        this.innerProperties().withDdosProtectionPlan(ddosProtectionPlan);
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
