// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.AdditionalCapabilities;
import com.azure.resourcemanager.compute.models.DiagnosticsProfile;
import com.azure.resourcemanager.compute.models.HardwareProfile;
import com.azure.resourcemanager.compute.models.NetworkProfile;
import com.azure.resourcemanager.compute.models.OSProfile;
import com.azure.resourcemanager.compute.models.Plan;
import com.azure.resourcemanager.compute.models.SecurityProfile;
import com.azure.resourcemanager.compute.models.Sku;
import com.azure.resourcemanager.compute.models.StorageProfile;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetVMNetworkProfileConfiguration;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetVMProtectionPolicy;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Describes a virtual machine scale set virtual machine. */
@Fluent
public final class VirtualMachineScaleSetVMInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetVMInner.class);

    /*
     * The virtual machine instance ID.
     */
    @JsonProperty(value = "instanceId", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceId;

    /*
     * The virtual machine SKU.
     */
    @JsonProperty(value = "sku", access = JsonProperty.Access.WRITE_ONLY)
    private Sku sku;

    /*
     * Describes the properties of a virtual machine scale set virtual machine.
     */
    @JsonProperty(value = "properties")
    private VirtualMachineScaleSetVMPropertiesInner innerProperties;

    /*
     * Specifies information about the marketplace image used to create the
     * virtual machine. This element is only used for marketplace images.
     * Before you can use a marketplace image from an API, you must enable the
     * image for programmatic use.  In the Azure portal, find the marketplace
     * image that you want to use and then click **Want to deploy
     * programmatically, Get Started ->**. Enter any required information and
     * then click **Save**.
     */
    @JsonProperty(value = "plan")
    private Plan plan;

    /*
     * The virtual machine child extension resources.
     */
    @JsonProperty(value = "resources", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualMachineExtensionInner> resources;

    /*
     * The virtual machine zones.
     */
    @JsonProperty(value = "zones", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> zones;

    /**
     * Get the instanceId property: The virtual machine instance ID.
     *
     * @return the instanceId value.
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * Get the sku property: The virtual machine SKU.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Get the innerProperties property: Describes the properties of a virtual machine scale set virtual machine.
     *
     * @return the innerProperties value.
     */
    private VirtualMachineScaleSetVMPropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the plan property: Specifies information about the marketplace image used to create the virtual machine. This
     * element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable
     * the image for programmatic use. In the Azure portal, find the marketplace image that you want to use and then
     * click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click
     * **Save**.
     *
     * @return the plan value.
     */
    public Plan plan() {
        return this.plan;
    }

    /**
     * Set the plan property: Specifies information about the marketplace image used to create the virtual machine. This
     * element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable
     * the image for programmatic use. In the Azure portal, find the marketplace image that you want to use and then
     * click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click
     * **Save**.
     *
     * @param plan the plan value to set.
     * @return the VirtualMachineScaleSetVMInner object itself.
     */
    public VirtualMachineScaleSetVMInner withPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the resources property: The virtual machine child extension resources.
     *
     * @return the resources value.
     */
    public List<VirtualMachineExtensionInner> resources() {
        return this.resources;
    }

    /**
     * Get the zones property: The virtual machine zones.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineScaleSetVMInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineScaleSetVMInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the latestModelApplied property: Specifies whether the latest model has been applied to the virtual machine.
     *
     * @return the latestModelApplied value.
     */
    public Boolean latestModelApplied() {
        return this.innerProperties() == null ? null : this.innerProperties().latestModelApplied();
    }

    /**
     * Get the vmId property: Azure VM unique ID.
     *
     * @return the vmId value.
     */
    public String vmId() {
        return this.innerProperties() == null ? null : this.innerProperties().vmId();
    }

    /**
     * Get the instanceView property: The virtual machine instance view.
     *
     * @return the instanceView value.
     */
    public VirtualMachineScaleSetVMInstanceViewInner instanceView() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceView();
    }

    /**
     * Get the hardwareProfile property: Specifies the hardware settings for the virtual machine.
     *
     * @return the hardwareProfile value.
     */
    public HardwareProfile hardwareProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().hardwareProfile();
    }

    /**
     * Set the hardwareProfile property: Specifies the hardware settings for the virtual machine.
     *
     * @param hardwareProfile the hardwareProfile value to set.
     * @return the VirtualMachineScaleSetVMInner object itself.
     */
    public VirtualMachineScaleSetVMInner withHardwareProfile(HardwareProfile hardwareProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetVMPropertiesInner();
        }
        this.innerProperties().withHardwareProfile(hardwareProfile);
        return this;
    }

    /**
     * Get the storageProfile property: Specifies the storage settings for the virtual machine disks.
     *
     * @return the storageProfile value.
     */
    public StorageProfile storageProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().storageProfile();
    }

    /**
     * Set the storageProfile property: Specifies the storage settings for the virtual machine disks.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the VirtualMachineScaleSetVMInner object itself.
     */
    public VirtualMachineScaleSetVMInner withStorageProfile(StorageProfile storageProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetVMPropertiesInner();
        }
        this.innerProperties().withStorageProfile(storageProfile);
        return this;
    }

    /**
     * Get the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the virtual
     * machine in the scale set. For instance: whether the virtual machine has the capability to support attaching
     * managed data disks with UltraSSD_LRS storage account type.
     *
     * @return the additionalCapabilities value.
     */
    public AdditionalCapabilities additionalCapabilities() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalCapabilities();
    }

    /**
     * Set the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the virtual
     * machine in the scale set. For instance: whether the virtual machine has the capability to support attaching
     * managed data disks with UltraSSD_LRS storage account type.
     *
     * @param additionalCapabilities the additionalCapabilities value to set.
     * @return the VirtualMachineScaleSetVMInner object itself.
     */
    public VirtualMachineScaleSetVMInner withAdditionalCapabilities(AdditionalCapabilities additionalCapabilities) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetVMPropertiesInner();
        }
        this.innerProperties().withAdditionalCapabilities(additionalCapabilities);
        return this;
    }

    /**
     * Get the osProfile property: Specifies the operating system settings for the virtual machine.
     *
     * @return the osProfile value.
     */
    public OSProfile osProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().osProfile();
    }

    /**
     * Set the osProfile property: Specifies the operating system settings for the virtual machine.
     *
     * @param osProfile the osProfile value to set.
     * @return the VirtualMachineScaleSetVMInner object itself.
     */
    public VirtualMachineScaleSetVMInner withOsProfile(OSProfile osProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetVMPropertiesInner();
        }
        this.innerProperties().withOsProfile(osProfile);
        return this;
    }

    /**
     * Get the securityProfile property: Specifies the Security related profile settings for the virtual machine.
     *
     * @return the securityProfile value.
     */
    public SecurityProfile securityProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().securityProfile();
    }

    /**
     * Set the securityProfile property: Specifies the Security related profile settings for the virtual machine.
     *
     * @param securityProfile the securityProfile value to set.
     * @return the VirtualMachineScaleSetVMInner object itself.
     */
    public VirtualMachineScaleSetVMInner withSecurityProfile(SecurityProfile securityProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetVMPropertiesInner();
        }
        this.innerProperties().withSecurityProfile(securityProfile);
        return this;
    }

    /**
     * Get the networkProfile property: Specifies the network interfaces of the virtual machine.
     *
     * @return the networkProfile value.
     */
    public NetworkProfile networkProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().networkProfile();
    }

    /**
     * Set the networkProfile property: Specifies the network interfaces of the virtual machine.
     *
     * @param networkProfile the networkProfile value to set.
     * @return the VirtualMachineScaleSetVMInner object itself.
     */
    public VirtualMachineScaleSetVMInner withNetworkProfile(NetworkProfile networkProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetVMPropertiesInner();
        }
        this.innerProperties().withNetworkProfile(networkProfile);
        return this;
    }

    /**
     * Get the networkProfileConfiguration property: Specifies the network profile configuration of the virtual machine.
     *
     * @return the networkProfileConfiguration value.
     */
    public VirtualMachineScaleSetVMNetworkProfileConfiguration networkProfileConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().networkProfileConfiguration();
    }

    /**
     * Set the networkProfileConfiguration property: Specifies the network profile configuration of the virtual machine.
     *
     * @param networkProfileConfiguration the networkProfileConfiguration value to set.
     * @return the VirtualMachineScaleSetVMInner object itself.
     */
    public VirtualMachineScaleSetVMInner withNetworkProfileConfiguration(
        VirtualMachineScaleSetVMNetworkProfileConfiguration networkProfileConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetVMPropertiesInner();
        }
        this.innerProperties().withNetworkProfileConfiguration(networkProfileConfiguration);
        return this;
    }

    /**
     * Get the diagnosticsProfile property: Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2015-06-15.
     *
     * @return the diagnosticsProfile value.
     */
    public DiagnosticsProfile diagnosticsProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().diagnosticsProfile();
    }

    /**
     * Set the diagnosticsProfile property: Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2015-06-15.
     *
     * @param diagnosticsProfile the diagnosticsProfile value to set.
     * @return the VirtualMachineScaleSetVMInner object itself.
     */
    public VirtualMachineScaleSetVMInner withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetVMPropertiesInner();
        }
        this.innerProperties().withDiagnosticsProfile(diagnosticsProfile);
        return this;
    }

    /**
     * Get the availabilitySet property: Specifies information about the availability set that the virtual machine
     * should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes
     * to maximize availability. For more information about availability sets, see [Manage the availability of virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual
     * machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM
     * cannot be added to an availability set.
     *
     * @return the availabilitySet value.
     */
    public SubResource availabilitySet() {
        return this.innerProperties() == null ? null : this.innerProperties().availabilitySet();
    }

    /**
     * Set the availabilitySet property: Specifies information about the availability set that the virtual machine
     * should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes
     * to maximize availability. For more information about availability sets, see [Manage the availability of virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual
     * machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM
     * cannot be added to an availability set.
     *
     * @param availabilitySet the availabilitySet value to set.
     * @return the VirtualMachineScaleSetVMInner object itself.
     */
    public VirtualMachineScaleSetVMInner withAvailabilitySet(SubResource availabilitySet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetVMPropertiesInner();
        }
        this.innerProperties().withAvailabilitySet(availabilitySet);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the licenseType property: Specifies that the image or disk that is being used was licensed on-premises.
     * &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client
     * &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are:
     * &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more
     * information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing)
     * &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux
     * Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt;
     * Minimum api-version: 2015-06-15.
     *
     * @return the licenseType value.
     */
    public String licenseType() {
        return this.innerProperties() == null ? null : this.innerProperties().licenseType();
    }

    /**
     * Set the licenseType property: Specifies that the image or disk that is being used was licensed on-premises.
     * &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client
     * &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are:
     * &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more
     * information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing)
     * &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux
     * Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt;
     * Minimum api-version: 2015-06-15.
     *
     * @param licenseType the licenseType value to set.
     * @return the VirtualMachineScaleSetVMInner object itself.
     */
    public VirtualMachineScaleSetVMInner withLicenseType(String licenseType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetVMPropertiesInner();
        }
        this.innerProperties().withLicenseType(licenseType);
        return this;
    }

    /**
     * Get the modelDefinitionApplied property: Specifies whether the model applied to the virtual machine is the model
     * of the virtual machine scale set or the customized model for the virtual machine.
     *
     * @return the modelDefinitionApplied value.
     */
    public String modelDefinitionApplied() {
        return this.innerProperties() == null ? null : this.innerProperties().modelDefinitionApplied();
    }

    /**
     * Get the protectionPolicy property: Specifies the protection policy of the virtual machine.
     *
     * @return the protectionPolicy value.
     */
    public VirtualMachineScaleSetVMProtectionPolicy protectionPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().protectionPolicy();
    }

    /**
     * Set the protectionPolicy property: Specifies the protection policy of the virtual machine.
     *
     * @param protectionPolicy the protectionPolicy value to set.
     * @return the VirtualMachineScaleSetVMInner object itself.
     */
    public VirtualMachineScaleSetVMInner withProtectionPolicy(
        VirtualMachineScaleSetVMProtectionPolicy protectionPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetVMPropertiesInner();
        }
        this.innerProperties().withProtectionPolicy(protectionPolicy);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (plan() != null) {
            plan().validate();
        }
        if (resources() != null) {
            resources().forEach(e -> e.validate());
        }
    }
}
