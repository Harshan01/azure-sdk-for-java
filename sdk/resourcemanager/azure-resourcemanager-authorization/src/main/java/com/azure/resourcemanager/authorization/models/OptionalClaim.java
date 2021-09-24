// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifying the claims to be included in a token.
 */
@Fluent
public final class OptionalClaim {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(OptionalClaim.class);

    /*
     * Claim name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Claim source.
     */
    @JsonProperty(value = "source")
    private String source;

    /*
     * Is this a required claim.
     */
    @JsonProperty(value = "essential")
    private Boolean essential;

    /*
     * Any object
     */
    @JsonProperty(value = "additionalProperties")
    private Object additionalProperties;

    /**
     * Get the name property: Claim name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Claim name.
     * 
     * @param name the name value to set.
     * @return the OptionalClaim object itself.
     */
    public OptionalClaim withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the source property: Claim source.
     * 
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: Claim source.
     * 
     * @param source the source value to set.
     * @return the OptionalClaim object itself.
     */
    public OptionalClaim withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the essential property: Is this a required claim.
     * 
     * @return the essential value.
     */
    public Boolean essential() {
        return this.essential;
    }

    /**
     * Set the essential property: Is this a required claim.
     * 
     * @param essential the essential value to set.
     * @return the OptionalClaim object itself.
     */
    public OptionalClaim withEssential(Boolean essential) {
        this.essential = essential;
        return this;
    }

    /**
     * Get the additionalProperties property: Any object.
     * 
     * @return the additionalProperties value.
     */
    public Object additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Any object.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the OptionalClaim object itself.
     */
    public OptionalClaim withAdditionalProperties(Object additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
