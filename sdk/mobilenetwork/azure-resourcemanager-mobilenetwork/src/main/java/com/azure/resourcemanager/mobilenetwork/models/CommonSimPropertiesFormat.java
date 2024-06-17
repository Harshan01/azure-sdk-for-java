// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Common SIM properties.
 */
@Fluent
public class CommonSimPropertiesFormat {
    /*
     * The provisioning state of the SIM resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The state of the SIM resource.
     */
    @JsonProperty(value = "simState", access = JsonProperty.Access.WRITE_ONLY)
    private SimState simState;

    /*
     * A dictionary of sites to the provisioning state of this SIM on that site.
     */
    @JsonProperty(value = "siteProvisioningState", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, SiteProvisioningState> siteProvisioningState;

    /*
     * The international mobile subscriber identity (IMSI) for the SIM.
     */
    @JsonProperty(value = "internationalMobileSubscriberIdentity", required = true)
    private String internationalMobileSubscriberIdentity;

    /*
     * The integrated circuit card ID (ICCID) for the SIM.
     */
    @JsonProperty(value = "integratedCircuitCardIdentifier")
    private String integratedCircuitCardIdentifier;

    /*
     * An optional free-form text field that can be used to record the device type this SIM is associated with, for example 'Video camera'. The Azure portal allows SIMs to be grouped and filtered based on this value.
     */
    @JsonProperty(value = "deviceType")
    private String deviceType;

    /*
     * The SIM policy used by this SIM. The SIM policy must be in the same location as the SIM.
     */
    @JsonProperty(value = "simPolicy")
    private SimPolicyResourceId simPolicy;

    /*
     * A list of static IP addresses assigned to this SIM. Each address is assigned at a defined network scope, made up of {attached data network, slice}.
     */
    @JsonProperty(value = "staticIpConfiguration")
    private List<SimStaticIpProperties> staticIpConfiguration;

    /*
     * The name of the SIM vendor who provided this SIM, if any.
     */
    @JsonProperty(value = "vendorName", access = JsonProperty.Access.WRITE_ONLY)
    private String vendorName;

    /*
     * The public key fingerprint of the SIM vendor who provided this SIM, if any.
     */
    @JsonProperty(value = "vendorKeyFingerprint", access = JsonProperty.Access.WRITE_ONLY)
    private String vendorKeyFingerprint;

    /**
     * Creates an instance of CommonSimPropertiesFormat class.
     */
    public CommonSimPropertiesFormat() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the SIM resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the simState property: The state of the SIM resource.
     * 
     * @return the simState value.
     */
    public SimState simState() {
        return this.simState;
    }

    /**
     * Get the siteProvisioningState property: A dictionary of sites to the provisioning state of this SIM on that site.
     * 
     * @return the siteProvisioningState value.
     */
    public Map<String, SiteProvisioningState> siteProvisioningState() {
        return this.siteProvisioningState;
    }

    /**
     * Get the internationalMobileSubscriberIdentity property: The international mobile subscriber identity (IMSI) for
     * the SIM.
     * 
     * @return the internationalMobileSubscriberIdentity value.
     */
    public String internationalMobileSubscriberIdentity() {
        return this.internationalMobileSubscriberIdentity;
    }

    /**
     * Set the internationalMobileSubscriberIdentity property: The international mobile subscriber identity (IMSI) for
     * the SIM.
     * 
     * @param internationalMobileSubscriberIdentity the internationalMobileSubscriberIdentity value to set.
     * @return the CommonSimPropertiesFormat object itself.
     */
    public CommonSimPropertiesFormat
        withInternationalMobileSubscriberIdentity(String internationalMobileSubscriberIdentity) {
        this.internationalMobileSubscriberIdentity = internationalMobileSubscriberIdentity;
        return this;
    }

    /**
     * Get the integratedCircuitCardIdentifier property: The integrated circuit card ID (ICCID) for the SIM.
     * 
     * @return the integratedCircuitCardIdentifier value.
     */
    public String integratedCircuitCardIdentifier() {
        return this.integratedCircuitCardIdentifier;
    }

    /**
     * Set the integratedCircuitCardIdentifier property: The integrated circuit card ID (ICCID) for the SIM.
     * 
     * @param integratedCircuitCardIdentifier the integratedCircuitCardIdentifier value to set.
     * @return the CommonSimPropertiesFormat object itself.
     */
    public CommonSimPropertiesFormat withIntegratedCircuitCardIdentifier(String integratedCircuitCardIdentifier) {
        this.integratedCircuitCardIdentifier = integratedCircuitCardIdentifier;
        return this;
    }

    /**
     * Get the deviceType property: An optional free-form text field that can be used to record the device type this SIM
     * is associated with, for example 'Video camera'. The Azure portal allows SIMs to be grouped and filtered based on
     * this value.
     * 
     * @return the deviceType value.
     */
    public String deviceType() {
        return this.deviceType;
    }

    /**
     * Set the deviceType property: An optional free-form text field that can be used to record the device type this SIM
     * is associated with, for example 'Video camera'. The Azure portal allows SIMs to be grouped and filtered based on
     * this value.
     * 
     * @param deviceType the deviceType value to set.
     * @return the CommonSimPropertiesFormat object itself.
     */
    public CommonSimPropertiesFormat withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * Get the simPolicy property: The SIM policy used by this SIM. The SIM policy must be in the same location as the
     * SIM.
     * 
     * @return the simPolicy value.
     */
    public SimPolicyResourceId simPolicy() {
        return this.simPolicy;
    }

    /**
     * Set the simPolicy property: The SIM policy used by this SIM. The SIM policy must be in the same location as the
     * SIM.
     * 
     * @param simPolicy the simPolicy value to set.
     * @return the CommonSimPropertiesFormat object itself.
     */
    public CommonSimPropertiesFormat withSimPolicy(SimPolicyResourceId simPolicy) {
        this.simPolicy = simPolicy;
        return this;
    }

    /**
     * Get the staticIpConfiguration property: A list of static IP addresses assigned to this SIM. Each address is
     * assigned at a defined network scope, made up of {attached data network, slice}.
     * 
     * @return the staticIpConfiguration value.
     */
    public List<SimStaticIpProperties> staticIpConfiguration() {
        return this.staticIpConfiguration;
    }

    /**
     * Set the staticIpConfiguration property: A list of static IP addresses assigned to this SIM. Each address is
     * assigned at a defined network scope, made up of {attached data network, slice}.
     * 
     * @param staticIpConfiguration the staticIpConfiguration value to set.
     * @return the CommonSimPropertiesFormat object itself.
     */
    public CommonSimPropertiesFormat withStaticIpConfiguration(List<SimStaticIpProperties> staticIpConfiguration) {
        this.staticIpConfiguration = staticIpConfiguration;
        return this;
    }

    /**
     * Get the vendorName property: The name of the SIM vendor who provided this SIM, if any.
     * 
     * @return the vendorName value.
     */
    public String vendorName() {
        return this.vendorName;
    }

    /**
     * Get the vendorKeyFingerprint property: The public key fingerprint of the SIM vendor who provided this SIM, if
     * any.
     * 
     * @return the vendorKeyFingerprint value.
     */
    public String vendorKeyFingerprint() {
        return this.vendorKeyFingerprint;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (internationalMobileSubscriberIdentity() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property internationalMobileSubscriberIdentity in model CommonSimPropertiesFormat"));
        }
        if (simPolicy() != null) {
            simPolicy().validate();
        }
        if (staticIpConfiguration() != null) {
            staticIpConfiguration().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CommonSimPropertiesFormat.class);
}
