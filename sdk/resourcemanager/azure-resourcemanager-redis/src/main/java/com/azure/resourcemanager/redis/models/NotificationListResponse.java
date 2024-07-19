// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.redis.fluent.models.UpgradeNotificationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The response of listUpgradeNotifications.
 */
@Fluent
public final class NotificationListResponse {
    /*
     * List of all notifications.
     */
    @JsonProperty(value = "value")
    private List<UpgradeNotificationInner> value;

    /*
     * Link for next set of notifications.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of NotificationListResponse class.
     */
    public NotificationListResponse() {
    }

    /**
     * Get the value property: List of all notifications.
     * 
     * @return the value value.
     */
    public List<UpgradeNotificationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of all notifications.
     * 
     * @param value the value value to set.
     * @return the NotificationListResponse object itself.
     */
    public NotificationListResponse withValue(List<UpgradeNotificationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link for next set of notifications.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
