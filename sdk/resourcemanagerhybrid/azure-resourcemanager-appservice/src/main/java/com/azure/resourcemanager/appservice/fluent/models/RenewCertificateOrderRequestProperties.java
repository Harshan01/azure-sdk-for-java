// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RenewCertificateOrderRequest resource specific properties. */
@Fluent
public final class RenewCertificateOrderRequestProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RenewCertificateOrderRequestProperties.class);

    /*
     * Certificate Key Size.
     */
    @JsonProperty(value = "keySize")
    private Integer keySize;

    /*
     * Csr to be used for re-key operation.
     */
    @JsonProperty(value = "csr")
    private String csr;

    /*
     * Should we change the ASC type (from managed private key to external
     * private key and vice versa).
     */
    @JsonProperty(value = "isPrivateKeyExternal")
    private Boolean isPrivateKeyExternal;

    /**
     * Get the keySize property: Certificate Key Size.
     *
     * @return the keySize value.
     */
    public Integer keySize() {
        return this.keySize;
    }

    /**
     * Set the keySize property: Certificate Key Size.
     *
     * @param keySize the keySize value to set.
     * @return the RenewCertificateOrderRequestProperties object itself.
     */
    public RenewCertificateOrderRequestProperties withKeySize(Integer keySize) {
        this.keySize = keySize;
        return this;
    }

    /**
     * Get the csr property: Csr to be used for re-key operation.
     *
     * @return the csr value.
     */
    public String csr() {
        return this.csr;
    }

    /**
     * Set the csr property: Csr to be used for re-key operation.
     *
     * @param csr the csr value to set.
     * @return the RenewCertificateOrderRequestProperties object itself.
     */
    public RenewCertificateOrderRequestProperties withCsr(String csr) {
        this.csr = csr;
        return this;
    }

    /**
     * Get the isPrivateKeyExternal property: Should we change the ASC type (from managed private key to external
     * private key and vice versa).
     *
     * @return the isPrivateKeyExternal value.
     */
    public Boolean isPrivateKeyExternal() {
        return this.isPrivateKeyExternal;
    }

    /**
     * Set the isPrivateKeyExternal property: Should we change the ASC type (from managed private key to external
     * private key and vice versa).
     *
     * @param isPrivateKeyExternal the isPrivateKeyExternal value to set.
     * @return the RenewCertificateOrderRequestProperties object itself.
     */
    public RenewCertificateOrderRequestProperties withIsPrivateKeyExternal(Boolean isPrivateKeyExternal) {
        this.isPrivateKeyExternal = isPrivateKeyExternal;
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
