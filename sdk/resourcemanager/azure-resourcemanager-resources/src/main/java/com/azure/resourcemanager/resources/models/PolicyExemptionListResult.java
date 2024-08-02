// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.resources.fluent.models.PolicyExemptionInner;
import java.io.IOException;
import java.util.List;

/**
 * List of policy exemptions.
 */
@Fluent
public final class PolicyExemptionListResult implements JsonSerializable<PolicyExemptionListResult> {
    /*
     * An array of policy exemptions.
     */
    private List<PolicyExemptionInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of PolicyExemptionListResult class.
     */
    public PolicyExemptionListResult() {
    }

    /**
     * Get the value property: An array of policy exemptions.
     * 
     * @return the value value.
     */
    public List<PolicyExemptionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of policy exemptions.
     * 
     * @param value the value value to set.
     * @return the PolicyExemptionListResult object itself.
     */
    public PolicyExemptionListResult withValue(List<PolicyExemptionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PolicyExemptionListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PolicyExemptionListResult if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PolicyExemptionListResult.
     */
    public static PolicyExemptionListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PolicyExemptionListResult deserializedPolicyExemptionListResult = new PolicyExemptionListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<PolicyExemptionInner> value
                        = reader.readArray(reader1 -> PolicyExemptionInner.fromJson(reader1));
                    deserializedPolicyExemptionListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedPolicyExemptionListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPolicyExemptionListResult;
        });
    }
}
