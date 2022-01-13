// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Container App Secret. */
@Fluent
public final class Secret {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Secret.class);

    /*
     * Secret Name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Secret Value.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name property: Secret Name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Secret Name.
     *
     * @param name the name value to set.
     * @return the Secret object itself.
     */
    public Secret withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Secret Value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Secret Value.
     *
     * @param value the value value to set.
     * @return the Secret object itself.
     */
    public Secret withValue(String value) {
        this.value = value;
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
