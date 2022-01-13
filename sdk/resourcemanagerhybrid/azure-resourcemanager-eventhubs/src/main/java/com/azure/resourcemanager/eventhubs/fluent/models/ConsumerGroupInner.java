// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Single item in List or Get Consumer group operation. */
@Fluent
public final class ConsumerGroupInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConsumerGroupInner.class);

    /*
     * Single item in List or Get Consumer group operation
     */
    @JsonProperty(value = "properties")
    private ConsumerGroupProperties innerProperties;

    /**
     * Get the innerProperties property: Single item in List or Get Consumer group operation.
     *
     * @return the innerProperties value.
     */
    private ConsumerGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the createdAt property: Exact time the message was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.innerProperties() == null ? null : this.innerProperties().createdAt();
    }

    /**
     * Get the updatedAt property: The exact time the message was updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedAt();
    }

    /**
     * Get the userMetadata property: User Metadata is a placeholder to store user-defined string data with maximum
     * length 1024. e.g. it can be used to store descriptive data, such as list of teams and their contact information
     * also user-defined configuration settings can be stored.
     *
     * @return the userMetadata value.
     */
    public String userMetadata() {
        return this.innerProperties() == null ? null : this.innerProperties().userMetadata();
    }

    /**
     * Set the userMetadata property: User Metadata is a placeholder to store user-defined string data with maximum
     * length 1024. e.g. it can be used to store descriptive data, such as list of teams and their contact information
     * also user-defined configuration settings can be stored.
     *
     * @param userMetadata the userMetadata value to set.
     * @return the ConsumerGroupInner object itself.
     */
    public ConsumerGroupInner withUserMetadata(String userMetadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConsumerGroupProperties();
        }
        this.innerProperties().withUserMetadata(userMetadata);
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
