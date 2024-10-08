// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The container group encryption properties.
 */
@Fluent
public final class EncryptionProperties implements JsonSerializable<EncryptionProperties> {
    /*
     * The keyvault base url.
     */
    private String vaultBaseUrl;

    /*
     * The encryption key name.
     */
    private String keyName;

    /*
     * The encryption key version.
     */
    private String keyVersion;

    /*
     * The keyvault managed identity.
     */
    private String identity;

    /**
     * Creates an instance of EncryptionProperties class.
     */
    public EncryptionProperties() {
    }

    /**
     * Get the vaultBaseUrl property: The keyvault base url.
     * 
     * @return the vaultBaseUrl value.
     */
    public String vaultBaseUrl() {
        return this.vaultBaseUrl;
    }

    /**
     * Set the vaultBaseUrl property: The keyvault base url.
     * 
     * @param vaultBaseUrl the vaultBaseUrl value to set.
     * @return the EncryptionProperties object itself.
     */
    public EncryptionProperties withVaultBaseUrl(String vaultBaseUrl) {
        this.vaultBaseUrl = vaultBaseUrl;
        return this;
    }

    /**
     * Get the keyName property: The encryption key name.
     * 
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: The encryption key name.
     * 
     * @param keyName the keyName value to set.
     * @return the EncryptionProperties object itself.
     */
    public EncryptionProperties withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the keyVersion property: The encryption key version.
     * 
     * @return the keyVersion value.
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the keyVersion property: The encryption key version.
     * 
     * @param keyVersion the keyVersion value to set.
     * @return the EncryptionProperties object itself.
     */
    public EncryptionProperties withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

    /**
     * Get the identity property: The keyvault managed identity.
     * 
     * @return the identity value.
     */
    public String identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The keyvault managed identity.
     * 
     * @param identity the identity value to set.
     * @return the EncryptionProperties object itself.
     */
    public EncryptionProperties withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vaultBaseUrl() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property vaultBaseUrl in model EncryptionProperties"));
        }
        if (keyName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property keyName in model EncryptionProperties"));
        }
        if (keyVersion() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property keyVersion in model EncryptionProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EncryptionProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("vaultBaseUrl", this.vaultBaseUrl);
        jsonWriter.writeStringField("keyName", this.keyName);
        jsonWriter.writeStringField("keyVersion", this.keyVersion);
        jsonWriter.writeStringField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EncryptionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EncryptionProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the EncryptionProperties.
     */
    public static EncryptionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EncryptionProperties deserializedEncryptionProperties = new EncryptionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("vaultBaseUrl".equals(fieldName)) {
                    deserializedEncryptionProperties.vaultBaseUrl = reader.getString();
                } else if ("keyName".equals(fieldName)) {
                    deserializedEncryptionProperties.keyName = reader.getString();
                } else if ("keyVersion".equals(fieldName)) {
                    deserializedEncryptionProperties.keyVersion = reader.getString();
                } else if ("identity".equals(fieldName)) {
                    deserializedEncryptionProperties.identity = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEncryptionProperties;
        });
    }
}
