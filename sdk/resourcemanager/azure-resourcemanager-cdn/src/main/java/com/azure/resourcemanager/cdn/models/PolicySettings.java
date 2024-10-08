// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Defines contents of a web application firewall global configuration.
 */
@Fluent
public final class PolicySettings implements JsonSerializable<PolicySettings> {
    /*
     * describes if the policy is in enabled state or disabled state
     */
    private PolicyEnabledState enabledState;

    /*
     * Describes if it is in detection mode or prevention mode at policy level.
     */
    private PolicyMode mode;

    /*
     * If action type is redirect, this field represents the default redirect URL for the client.
     */
    private String defaultRedirectUrl;

    /*
     * If the action type is block, this field defines the default customer overridable http response status code.
     */
    private PolicySettingsDefaultCustomBlockResponseStatusCode defaultCustomBlockResponseStatusCode;

    /*
     * If the action type is block, customer can override the response body. The body must be specified in base64
     * encoding.
     */
    private String defaultCustomBlockResponseBody;

    /**
     * Creates an instance of PolicySettings class.
     */
    public PolicySettings() {
    }

    /**
     * Get the enabledState property: describes if the policy is in enabled state or disabled state.
     * 
     * @return the enabledState value.
     */
    public PolicyEnabledState enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: describes if the policy is in enabled state or disabled state.
     * 
     * @param enabledState the enabledState value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withEnabledState(PolicyEnabledState enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Get the mode property: Describes if it is in detection mode or prevention mode at policy level.
     * 
     * @return the mode value.
     */
    public PolicyMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: Describes if it is in detection mode or prevention mode at policy level.
     * 
     * @param mode the mode value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withMode(PolicyMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the defaultRedirectUrl property: If action type is redirect, this field represents the default redirect URL
     * for the client.
     * 
     * @return the defaultRedirectUrl value.
     */
    public String defaultRedirectUrl() {
        return this.defaultRedirectUrl;
    }

    /**
     * Set the defaultRedirectUrl property: If action type is redirect, this field represents the default redirect URL
     * for the client.
     * 
     * @param defaultRedirectUrl the defaultRedirectUrl value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withDefaultRedirectUrl(String defaultRedirectUrl) {
        this.defaultRedirectUrl = defaultRedirectUrl;
        return this;
    }

    /**
     * Get the defaultCustomBlockResponseStatusCode property: If the action type is block, this field defines the
     * default customer overridable http response status code.
     * 
     * @return the defaultCustomBlockResponseStatusCode value.
     */
    public PolicySettingsDefaultCustomBlockResponseStatusCode defaultCustomBlockResponseStatusCode() {
        return this.defaultCustomBlockResponseStatusCode;
    }

    /**
     * Set the defaultCustomBlockResponseStatusCode property: If the action type is block, this field defines the
     * default customer overridable http response status code.
     * 
     * @param defaultCustomBlockResponseStatusCode the defaultCustomBlockResponseStatusCode value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withDefaultCustomBlockResponseStatusCode(
        PolicySettingsDefaultCustomBlockResponseStatusCode defaultCustomBlockResponseStatusCode) {
        this.defaultCustomBlockResponseStatusCode = defaultCustomBlockResponseStatusCode;
        return this;
    }

    /**
     * Get the defaultCustomBlockResponseBody property: If the action type is block, customer can override the response
     * body. The body must be specified in base64 encoding.
     * 
     * @return the defaultCustomBlockResponseBody value.
     */
    public String defaultCustomBlockResponseBody() {
        return this.defaultCustomBlockResponseBody;
    }

    /**
     * Set the defaultCustomBlockResponseBody property: If the action type is block, customer can override the response
     * body. The body must be specified in base64 encoding.
     * 
     * @param defaultCustomBlockResponseBody the defaultCustomBlockResponseBody value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withDefaultCustomBlockResponseBody(String defaultCustomBlockResponseBody) {
        this.defaultCustomBlockResponseBody = defaultCustomBlockResponseBody;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("enabledState", this.enabledState == null ? null : this.enabledState.toString());
        jsonWriter.writeStringField("mode", this.mode == null ? null : this.mode.toString());
        jsonWriter.writeStringField("defaultRedirectUrl", this.defaultRedirectUrl);
        jsonWriter.writeStringField("defaultCustomBlockResponseStatusCode",
            this.defaultCustomBlockResponseStatusCode == null
                ? null
                : this.defaultCustomBlockResponseStatusCode.toString());
        jsonWriter.writeStringField("defaultCustomBlockResponseBody", this.defaultCustomBlockResponseBody);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PolicySettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PolicySettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the PolicySettings.
     */
    public static PolicySettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PolicySettings deserializedPolicySettings = new PolicySettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabledState".equals(fieldName)) {
                    deserializedPolicySettings.enabledState = PolicyEnabledState.fromString(reader.getString());
                } else if ("mode".equals(fieldName)) {
                    deserializedPolicySettings.mode = PolicyMode.fromString(reader.getString());
                } else if ("defaultRedirectUrl".equals(fieldName)) {
                    deserializedPolicySettings.defaultRedirectUrl = reader.getString();
                } else if ("defaultCustomBlockResponseStatusCode".equals(fieldName)) {
                    deserializedPolicySettings.defaultCustomBlockResponseStatusCode
                        = PolicySettingsDefaultCustomBlockResponseStatusCode.fromInt(reader.getInt());
                } else if ("defaultCustomBlockResponseBody".equals(fieldName)) {
                    deserializedPolicySettings.defaultCustomBlockResponseBody = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPolicySettings;
        });
    }
}
