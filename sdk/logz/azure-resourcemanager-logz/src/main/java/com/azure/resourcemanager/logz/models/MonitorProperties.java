// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties specific to the monitor resource. */
@Fluent
public final class MonitorProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MonitorProperties.class);

    /*
     * Flag specifying if the resource provisioning state as tracked by ARM.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Flag specifying if the resource monitoring is enabled or disabled.
     */
    @JsonProperty(value = "monitoringStatus")
    private MonitoringStatus monitoringStatus;

    /*
     * Flag specifying the Marketplace Subscription Status of the resource. If
     * payment is not made in time, the resource will go in Suspended state.
     */
    @JsonProperty(value = "marketplaceSubscriptionStatus")
    private MarketplaceSubscriptionStatus marketplaceSubscriptionStatus;

    /*
     * The logzOrganizationProperties property.
     */
    @JsonProperty(value = "logzOrganizationProperties")
    private LogzOrganizationProperties logzOrganizationProperties;

    /*
     * The userInfo property.
     */
    @JsonProperty(value = "userInfo")
    private UserInfo userInfo;

    /*
     * The planData property.
     */
    @JsonProperty(value = "planData")
    private PlanData planData;

    /*
     * The liftrResourceCategory property.
     */
    @JsonProperty(value = "liftrResourceCategory", access = JsonProperty.Access.WRITE_ONLY)
    private LiftrResourceCategories liftrResourceCategory;

    /*
     * The priority of the resource.
     */
    @JsonProperty(value = "liftrResourcePreference", access = JsonProperty.Access.WRITE_ONLY)
    private Integer liftrResourcePreference;

    /**
     * Get the provisioningState property: Flag specifying if the resource provisioning state as tracked by ARM.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the monitoringStatus property: Flag specifying if the resource monitoring is enabled or disabled.
     *
     * @return the monitoringStatus value.
     */
    public MonitoringStatus monitoringStatus() {
        return this.monitoringStatus;
    }

    /**
     * Set the monitoringStatus property: Flag specifying if the resource monitoring is enabled or disabled.
     *
     * @param monitoringStatus the monitoringStatus value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withMonitoringStatus(MonitoringStatus monitoringStatus) {
        this.monitoringStatus = monitoringStatus;
        return this;
    }

    /**
     * Get the marketplaceSubscriptionStatus property: Flag specifying the Marketplace Subscription Status of the
     * resource. If payment is not made in time, the resource will go in Suspended state.
     *
     * @return the marketplaceSubscriptionStatus value.
     */
    public MarketplaceSubscriptionStatus marketplaceSubscriptionStatus() {
        return this.marketplaceSubscriptionStatus;
    }

    /**
     * Set the marketplaceSubscriptionStatus property: Flag specifying the Marketplace Subscription Status of the
     * resource. If payment is not made in time, the resource will go in Suspended state.
     *
     * @param marketplaceSubscriptionStatus the marketplaceSubscriptionStatus value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withMarketplaceSubscriptionStatus(
        MarketplaceSubscriptionStatus marketplaceSubscriptionStatus) {
        this.marketplaceSubscriptionStatus = marketplaceSubscriptionStatus;
        return this;
    }

    /**
     * Get the logzOrganizationProperties property: The logzOrganizationProperties property.
     *
     * @return the logzOrganizationProperties value.
     */
    public LogzOrganizationProperties logzOrganizationProperties() {
        return this.logzOrganizationProperties;
    }

    /**
     * Set the logzOrganizationProperties property: The logzOrganizationProperties property.
     *
     * @param logzOrganizationProperties the logzOrganizationProperties value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withLogzOrganizationProperties(LogzOrganizationProperties logzOrganizationProperties) {
        this.logzOrganizationProperties = logzOrganizationProperties;
        return this;
    }

    /**
     * Get the userInfo property: The userInfo property.
     *
     * @return the userInfo value.
     */
    public UserInfo userInfo() {
        return this.userInfo;
    }

    /**
     * Set the userInfo property: The userInfo property.
     *
     * @param userInfo the userInfo value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    /**
     * Get the planData property: The planData property.
     *
     * @return the planData value.
     */
    public PlanData planData() {
        return this.planData;
    }

    /**
     * Set the planData property: The planData property.
     *
     * @param planData the planData value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withPlanData(PlanData planData) {
        this.planData = planData;
        return this;
    }

    /**
     * Get the liftrResourceCategory property: The liftrResourceCategory property.
     *
     * @return the liftrResourceCategory value.
     */
    public LiftrResourceCategories liftrResourceCategory() {
        return this.liftrResourceCategory;
    }

    /**
     * Get the liftrResourcePreference property: The priority of the resource.
     *
     * @return the liftrResourcePreference value.
     */
    public Integer liftrResourcePreference() {
        return this.liftrResourcePreference;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logzOrganizationProperties() != null) {
            logzOrganizationProperties().validate();
        }
        if (userInfo() != null) {
            userInfo().validate();
        }
        if (planData() != null) {
            planData().validate();
        }
    }
}
