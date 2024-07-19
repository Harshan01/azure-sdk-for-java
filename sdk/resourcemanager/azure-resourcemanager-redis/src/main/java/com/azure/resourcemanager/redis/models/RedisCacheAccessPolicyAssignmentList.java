// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.redis.fluent.models.RedisCacheAccessPolicyAssignmentInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * List of access policies assignments (with properties) of a Redis cache.
 */
@Fluent
public final class RedisCacheAccessPolicyAssignmentList {
    /*
     * List of access policies assignments (with properties) of a Redis cache.
     */
    @JsonProperty(value = "value")
    private List<RedisCacheAccessPolicyAssignmentInner> value;

    /*
     * Link for next set.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of RedisCacheAccessPolicyAssignmentList class.
     */
    public RedisCacheAccessPolicyAssignmentList() {
    }

    /**
     * Get the value property: List of access policies assignments (with properties) of a Redis cache.
     * 
     * @return the value value.
     */
    public List<RedisCacheAccessPolicyAssignmentInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of access policies assignments (with properties) of a Redis cache.
     * 
     * @param value the value value to set.
     * @return the RedisCacheAccessPolicyAssignmentList object itself.
     */
    public RedisCacheAccessPolicyAssignmentList withValue(List<RedisCacheAccessPolicyAssignmentInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link for next set.
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
