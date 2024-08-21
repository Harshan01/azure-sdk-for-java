// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redhatopenshift.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.redhatopenshift.fluent.models.MachinePoolInner;
import java.io.IOException;
import java.util.List;

/**
 * MachinePoolList represents a list of MachinePools.
 */
@Fluent
public final class MachinePoolList implements JsonSerializable<MachinePoolList> {
    /*
     * The list of Machine Pools.
     */
    private List<MachinePoolInner> value;

    /*
     * The link used to get the next page of operations.
     */
    private String nextLink;

    /**
     * Creates an instance of MachinePoolList class.
     */
    public MachinePoolList() {
    }

    /**
     * Get the value property: The list of Machine Pools.
     * 
     * @return the value value.
     */
    public List<MachinePoolInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of Machine Pools.
     * 
     * @param value the value value to set.
     * @return the MachinePoolList object itself.
     */
    public MachinePoolList withValue(List<MachinePoolInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link used to get the next page of operations.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of operations.
     * 
     * @param nextLink the nextLink value to set.
     * @return the MachinePoolList object itself.
     */
    public MachinePoolList withNextLink(String nextLink) {
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
     * Reads an instance of MachinePoolList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MachinePoolList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MachinePoolList.
     */
    public static MachinePoolList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MachinePoolList deserializedMachinePoolList = new MachinePoolList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<MachinePoolInner> value = reader.readArray(reader1 -> MachinePoolInner.fromJson(reader1));
                    deserializedMachinePoolList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedMachinePoolList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMachinePoolList;
        });
    }
}
