// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Azure Data Lake Gen2 datastore configuration.
 */
@Fluent
public final class AzureDataLakeGen2Datastore extends DatastoreProperties {
    /*
     * [Required] Storage type backing the datastore.
     */
    private DatastoreType datastoreType = DatastoreType.AZURE_DATA_LAKE_GEN2;

    /*
     * [Required] The name of the Data Lake Gen2 filesystem.
     */
    private String filesystem;

    /*
     * [Required] Storage account name.
     */
    private String accountName;

    /*
     * Azure cloud endpoint for the storage account.
     */
    private String endpoint;

    /*
     * Protocol used to communicate with the storage account.
     */
    private String protocol;

    /*
     * Indicates which identity to use to authenticate service data access to customer's storage.
     */
    private ServiceDataAccessAuthIdentity serviceDataAccessAuthIdentity;

    /*
     * Azure Subscription Id
     */
    private String subscriptionId;

    /*
     * Azure Resource Group name
     */
    private String resourceGroup;

    /*
     * Readonly property to indicate if datastore is the workspace default datastore
     */
    private Boolean isDefault;

    /**
     * Creates an instance of AzureDataLakeGen2Datastore class.
     */
    public AzureDataLakeGen2Datastore() {
    }

    /**
     * Get the datastoreType property: [Required] Storage type backing the datastore.
     * 
     * @return the datastoreType value.
     */
    @Override
    public DatastoreType datastoreType() {
        return this.datastoreType;
    }

    /**
     * Get the filesystem property: [Required] The name of the Data Lake Gen2 filesystem.
     * 
     * @return the filesystem value.
     */
    public String filesystem() {
        return this.filesystem;
    }

    /**
     * Set the filesystem property: [Required] The name of the Data Lake Gen2 filesystem.
     * 
     * @param filesystem the filesystem value to set.
     * @return the AzureDataLakeGen2Datastore object itself.
     */
    public AzureDataLakeGen2Datastore withFilesystem(String filesystem) {
        this.filesystem = filesystem;
        return this;
    }

    /**
     * Get the accountName property: [Required] Storage account name.
     * 
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: [Required] Storage account name.
     * 
     * @param accountName the accountName value to set.
     * @return the AzureDataLakeGen2Datastore object itself.
     */
    public AzureDataLakeGen2Datastore withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the endpoint property: Azure cloud endpoint for the storage account.
     * 
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: Azure cloud endpoint for the storage account.
     * 
     * @param endpoint the endpoint value to set.
     * @return the AzureDataLakeGen2Datastore object itself.
     */
    public AzureDataLakeGen2Datastore withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the protocol property: Protocol used to communicate with the storage account.
     * 
     * @return the protocol value.
     */
    public String protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Protocol used to communicate with the storage account.
     * 
     * @param protocol the protocol value to set.
     * @return the AzureDataLakeGen2Datastore object itself.
     */
    public AzureDataLakeGen2Datastore withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the serviceDataAccessAuthIdentity property: Indicates which identity to use to authenticate service data
     * access to customer's storage.
     * 
     * @return the serviceDataAccessAuthIdentity value.
     */
    public ServiceDataAccessAuthIdentity serviceDataAccessAuthIdentity() {
        return this.serviceDataAccessAuthIdentity;
    }

    /**
     * Set the serviceDataAccessAuthIdentity property: Indicates which identity to use to authenticate service data
     * access to customer's storage.
     * 
     * @param serviceDataAccessAuthIdentity the serviceDataAccessAuthIdentity value to set.
     * @return the AzureDataLakeGen2Datastore object itself.
     */
    public AzureDataLakeGen2Datastore
        withServiceDataAccessAuthIdentity(ServiceDataAccessAuthIdentity serviceDataAccessAuthIdentity) {
        this.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
        return this;
    }

    /**
     * Get the subscriptionId property: Azure Subscription Id.
     * 
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Azure Subscription Id.
     * 
     * @param subscriptionId the subscriptionId value to set.
     * @return the AzureDataLakeGen2Datastore object itself.
     */
    public AzureDataLakeGen2Datastore withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroup property: Azure Resource Group name.
     * 
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup property: Azure Resource Group name.
     * 
     * @param resourceGroup the resourceGroup value to set.
     * @return the AzureDataLakeGen2Datastore object itself.
     */
    public AzureDataLakeGen2Datastore withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Get the isDefault property: Readonly property to indicate if datastore is the workspace default datastore.
     * 
     * @return the isDefault value.
     */
    @Override
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataLakeGen2Datastore withCredentials(DatastoreCredentials credentials) {
        super.withCredentials(credentials);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataLakeGen2Datastore withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataLakeGen2Datastore withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataLakeGen2Datastore withProperties(Map<String, String> properties) {
        super.withProperties(properties);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (filesystem() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property filesystem in model AzureDataLakeGen2Datastore"));
        }
        if (accountName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property accountName in model AzureDataLakeGen2Datastore"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureDataLakeGen2Datastore.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("credentials", credentials());
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("properties", properties(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("filesystem", this.filesystem);
        jsonWriter.writeStringField("accountName", this.accountName);
        jsonWriter.writeStringField("datastoreType", this.datastoreType == null ? null : this.datastoreType.toString());
        jsonWriter.writeStringField("endpoint", this.endpoint);
        jsonWriter.writeStringField("protocol", this.protocol);
        jsonWriter.writeStringField("serviceDataAccessAuthIdentity",
            this.serviceDataAccessAuthIdentity == null ? null : this.serviceDataAccessAuthIdentity.toString());
        jsonWriter.writeStringField("subscriptionId", this.subscriptionId);
        jsonWriter.writeStringField("resourceGroup", this.resourceGroup);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureDataLakeGen2Datastore from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureDataLakeGen2Datastore if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureDataLakeGen2Datastore.
     */
    public static AzureDataLakeGen2Datastore fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureDataLakeGen2Datastore deserializedAzureDataLakeGen2Datastore = new AzureDataLakeGen2Datastore();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("credentials".equals(fieldName)) {
                    deserializedAzureDataLakeGen2Datastore.withCredentials(DatastoreCredentials.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedAzureDataLakeGen2Datastore.withDescription(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedAzureDataLakeGen2Datastore.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    Map<String, String> properties = reader.readMap(reader1 -> reader1.getString());
                    deserializedAzureDataLakeGen2Datastore.withProperties(properties);
                } else if ("isDefault".equals(fieldName)) {
                    deserializedAzureDataLakeGen2Datastore.isDefault = reader.getNullable(JsonReader::getBoolean);
                } else if ("filesystem".equals(fieldName)) {
                    deserializedAzureDataLakeGen2Datastore.filesystem = reader.getString();
                } else if ("accountName".equals(fieldName)) {
                    deserializedAzureDataLakeGen2Datastore.accountName = reader.getString();
                } else if ("datastoreType".equals(fieldName)) {
                    deserializedAzureDataLakeGen2Datastore.datastoreType = DatastoreType.fromString(reader.getString());
                } else if ("endpoint".equals(fieldName)) {
                    deserializedAzureDataLakeGen2Datastore.endpoint = reader.getString();
                } else if ("protocol".equals(fieldName)) {
                    deserializedAzureDataLakeGen2Datastore.protocol = reader.getString();
                } else if ("serviceDataAccessAuthIdentity".equals(fieldName)) {
                    deserializedAzureDataLakeGen2Datastore.serviceDataAccessAuthIdentity
                        = ServiceDataAccessAuthIdentity.fromString(reader.getString());
                } else if ("subscriptionId".equals(fieldName)) {
                    deserializedAzureDataLakeGen2Datastore.subscriptionId = reader.getString();
                } else if ("resourceGroup".equals(fieldName)) {
                    deserializedAzureDataLakeGen2Datastore.resourceGroup = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureDataLakeGen2Datastore;
        });
    }
}
