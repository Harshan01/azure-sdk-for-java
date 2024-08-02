// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Information about a single resource change predicted by What-If operation.
 */
@Fluent
public final class WhatIfChange implements JsonSerializable<WhatIfChange> {
    /*
     * Resource ID
     */
    private String resourceId;

    /*
     * Type of change that will be made to the resource when the deployment is executed.
     */
    private ChangeType changeType;

    /*
     * The explanation about why the resource is unsupported by What-If.
     */
    private String unsupportedReason;

    /*
     * The snapshot of the resource before the deployment is executed.
     */
    private Object before;

    /*
     * The predicted snapshot of the resource after the deployment is executed.
     */
    private Object after;

    /*
     * The predicted changes to resource properties.
     */
    private List<WhatIfPropertyChange> delta;

    /**
     * Creates an instance of WhatIfChange class.
     */
    public WhatIfChange() {
    }

    /**
     * Get the resourceId property: Resource ID.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Resource ID.
     * 
     * @param resourceId the resourceId value to set.
     * @return the WhatIfChange object itself.
     */
    public WhatIfChange withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the changeType property: Type of change that will be made to the resource when the deployment is executed.
     * 
     * @return the changeType value.
     */
    public ChangeType changeType() {
        return this.changeType;
    }

    /**
     * Set the changeType property: Type of change that will be made to the resource when the deployment is executed.
     * 
     * @param changeType the changeType value to set.
     * @return the WhatIfChange object itself.
     */
    public WhatIfChange withChangeType(ChangeType changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * Get the unsupportedReason property: The explanation about why the resource is unsupported by What-If.
     * 
     * @return the unsupportedReason value.
     */
    public String unsupportedReason() {
        return this.unsupportedReason;
    }

    /**
     * Set the unsupportedReason property: The explanation about why the resource is unsupported by What-If.
     * 
     * @param unsupportedReason the unsupportedReason value to set.
     * @return the WhatIfChange object itself.
     */
    public WhatIfChange withUnsupportedReason(String unsupportedReason) {
        this.unsupportedReason = unsupportedReason;
        return this;
    }

    /**
     * Get the before property: The snapshot of the resource before the deployment is executed.
     * 
     * @return the before value.
     */
    public Object before() {
        return this.before;
    }

    /**
     * Set the before property: The snapshot of the resource before the deployment is executed.
     * 
     * @param before the before value to set.
     * @return the WhatIfChange object itself.
     */
    public WhatIfChange withBefore(Object before) {
        this.before = before;
        return this;
    }

    /**
     * Get the after property: The predicted snapshot of the resource after the deployment is executed.
     * 
     * @return the after value.
     */
    public Object after() {
        return this.after;
    }

    /**
     * Set the after property: The predicted snapshot of the resource after the deployment is executed.
     * 
     * @param after the after value to set.
     * @return the WhatIfChange object itself.
     */
    public WhatIfChange withAfter(Object after) {
        this.after = after;
        return this;
    }

    /**
     * Get the delta property: The predicted changes to resource properties.
     * 
     * @return the delta value.
     */
    public List<WhatIfPropertyChange> delta() {
        return this.delta;
    }

    /**
     * Set the delta property: The predicted changes to resource properties.
     * 
     * @param delta the delta value to set.
     * @return the WhatIfChange object itself.
     */
    public WhatIfChange withDelta(List<WhatIfPropertyChange> delta) {
        this.delta = delta;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property resourceId in model WhatIfChange"));
        }
        if (changeType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property changeType in model WhatIfChange"));
        }
        if (delta() != null) {
            delta().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WhatIfChange.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("resourceId", this.resourceId);
        jsonWriter.writeStringField("changeType", this.changeType == null ? null : this.changeType.toString());
        jsonWriter.writeStringField("unsupportedReason", this.unsupportedReason);
        jsonWriter.writeUntypedField("before", this.before);
        jsonWriter.writeUntypedField("after", this.after);
        jsonWriter.writeArrayField("delta", this.delta, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WhatIfChange from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WhatIfChange if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WhatIfChange.
     */
    public static WhatIfChange fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WhatIfChange deserializedWhatIfChange = new WhatIfChange();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceId".equals(fieldName)) {
                    deserializedWhatIfChange.resourceId = reader.getString();
                } else if ("changeType".equals(fieldName)) {
                    deserializedWhatIfChange.changeType = ChangeType.fromString(reader.getString());
                } else if ("unsupportedReason".equals(fieldName)) {
                    deserializedWhatIfChange.unsupportedReason = reader.getString();
                } else if ("before".equals(fieldName)) {
                    deserializedWhatIfChange.before = reader.readUntyped();
                } else if ("after".equals(fieldName)) {
                    deserializedWhatIfChange.after = reader.readUntyped();
                } else if ("delta".equals(fieldName)) {
                    List<WhatIfPropertyChange> delta
                        = reader.readArray(reader1 -> WhatIfPropertyChange.fromJson(reader1));
                    deserializedWhatIfChange.delta = delta;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWhatIfChange;
        });
    }
}
