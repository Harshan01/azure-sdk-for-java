// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redhatopenshift.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.redhatopenshift.fluent.models.OpenShiftVersionInner;
import java.io.IOException;
import java.util.List;

/**
 * OpenShiftVersionList represents a List of available versions.
 */
@Fluent
public final class OpenShiftVersionList implements JsonSerializable<OpenShiftVersionList> {
    /*
     * The List of available versions.
     */
    private List<OpenShiftVersionInner> value;

    /*
     * Next Link to next operation.
     */
    private String nextLink;

    /**
     * Creates an instance of OpenShiftVersionList class.
     */
    public OpenShiftVersionList() {
    }

    /**
     * Get the value property: The List of available versions.
     * 
     * @return the value value.
     */
    public List<OpenShiftVersionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The List of available versions.
     * 
     * @param value the value value to set.
     * @return the OpenShiftVersionList object itself.
     */
    public OpenShiftVersionList withValue(List<OpenShiftVersionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Next Link to next operation.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Next Link to next operation.
     * 
     * @param nextLink the nextLink value to set.
     * @return the OpenShiftVersionList object itself.
     */
    public OpenShiftVersionList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OpenShiftVersionList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OpenShiftVersionList if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OpenShiftVersionList.
     */
    public static OpenShiftVersionList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OpenShiftVersionList deserializedOpenShiftVersionList = new OpenShiftVersionList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<OpenShiftVersionInner> value
                        = reader.readArray(reader1 -> OpenShiftVersionInner.fromJson(reader1));
                    deserializedOpenShiftVersionList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedOpenShiftVersionList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOpenShiftVersionList;
        });
    }
}
