// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Properties of a PyPi library in the cluster.
 */
@Fluent
public final class PyPiLibraryProperties extends ClusterLibraryProperties {
    /*
     * Type of the library.
     */
    private Type type = Type.PYPI;

    /*
     * Name of the PyPi package.
     */
    private String name;

    /*
     * Version of the PyPi package.
     */
    private String version;

    /*
     * Timestamp of the latest library management operation.
     */
    private OffsetDateTime timestamp;

    /*
     * Status of the library.
     */
    private Status status;

    /*
     * Error message of the library operation when a failure occurs.
     */
    private String message;

    /**
     * Creates an instance of PyPiLibraryProperties class.
     */
    public PyPiLibraryProperties() {
    }

    /**
     * Get the type property: Type of the library.
     * 
     * @return the type value.
     */
    @Override
    public Type type() {
        return this.type;
    }

    /**
     * Get the name property: Name of the PyPi package.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the PyPi package.
     * 
     * @param name the name value to set.
     * @return the PyPiLibraryProperties object itself.
     */
    public PyPiLibraryProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the version property: Version of the PyPi package.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version of the PyPi package.
     * 
     * @param version the version value to set.
     * @return the PyPiLibraryProperties object itself.
     */
    public PyPiLibraryProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the timestamp property: Timestamp of the latest library management operation.
     * 
     * @return the timestamp value.
     */
    @Override
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Get the status property: Status of the library.
     * 
     * @return the status value.
     */
    @Override
    public Status status() {
        return this.status;
    }

    /**
     * Get the message property: Error message of the library operation when a failure occurs.
     * 
     * @return the message value.
     */
    @Override
    public String message() {
        return this.message;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PyPiLibraryProperties withRemarks(String remarks) {
        super.withRemarks(remarks);
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
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model PyPiLibraryProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PyPiLibraryProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("remarks", remarks());
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("version", this.version);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PyPiLibraryProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PyPiLibraryProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PyPiLibraryProperties.
     */
    public static PyPiLibraryProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PyPiLibraryProperties deserializedPyPiLibraryProperties = new PyPiLibraryProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("remarks".equals(fieldName)) {
                    deserializedPyPiLibraryProperties.withRemarks(reader.getString());
                } else if ("timestamp".equals(fieldName)) {
                    deserializedPyPiLibraryProperties.timestamp = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("status".equals(fieldName)) {
                    deserializedPyPiLibraryProperties.status = Status.fromString(reader.getString());
                } else if ("message".equals(fieldName)) {
                    deserializedPyPiLibraryProperties.message = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPyPiLibraryProperties.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPyPiLibraryProperties.type = Type.fromString(reader.getString());
                } else if ("version".equals(fieldName)) {
                    deserializedPyPiLibraryProperties.version = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPyPiLibraryProperties;
        });
    }
}
