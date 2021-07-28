// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An error response from Attestation. */
@Fluent
public final class CloudErrorBody {
    /*
     * An identifier for the error. Codes are invariant and are intended to be
     * consumed programmatically.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * A message describing the error, intended to be suitable for displaying
     * in a user interface.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the code property: An identifier for the error. Codes are invariant and are intended to be consumed
     * programmatically.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: An identifier for the error. Codes are invariant and are intended to be consumed
     * programmatically.
     *
     * @param code the code value to set.
     * @return the CloudErrorBody object itself.
     */
    public CloudErrorBody setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: A message describing the error, intended to be suitable for displaying in a user
     * interface.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: A message describing the error, intended to be suitable for displaying in a user
     * interface.
     *
     * @param message the message value to set.
     * @return the CloudErrorBody object itself.
     */
    public CloudErrorBody setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
