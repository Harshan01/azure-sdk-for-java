// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.models.AfdStateProperties;
import com.azure.resourcemanager.cdn.models.DeploymentStatus;
import com.azure.resourcemanager.cdn.models.SecurityPolicyPropertiesParameters;
import java.io.IOException;

/**
 * The json object that contains properties required to create a security policy.
 */
@Fluent
public final class SecurityPolicyProperties extends AfdStateProperties {
    /*
     * The name of the profile which holds the security policy.
     */
    private String profileName;

    /*
     * object which contains security policy parameters
     */
    private SecurityPolicyPropertiesParameters parameters;

    /*
     * The deploymentStatus property.
     */
    private DeploymentStatus deploymentStatus;

    /*
     * Provisioning status
     */
    private AfdProvisioningState provisioningState;

    /**
     * Creates an instance of SecurityPolicyProperties class.
     */
    public SecurityPolicyProperties() {
    }

    /**
     * Get the profileName property: The name of the profile which holds the security policy.
     * 
     * @return the profileName value.
     */
    public String profileName() {
        return this.profileName;
    }

    /**
     * Get the parameters property: object which contains security policy parameters.
     * 
     * @return the parameters value.
     */
    public SecurityPolicyPropertiesParameters parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: object which contains security policy parameters.
     * 
     * @param parameters the parameters value to set.
     * @return the SecurityPolicyProperties object itself.
     */
    public SecurityPolicyProperties withParameters(SecurityPolicyPropertiesParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     * 
     * @return the deploymentStatus value.
     */
    @Override
    public DeploymentStatus deploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * Get the provisioningState property: Provisioning status.
     * 
     * @return the provisioningState value.
     */
    @Override
    public AfdProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (parameters() != null) {
            parameters().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("parameters", this.parameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SecurityPolicyProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecurityPolicyProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SecurityPolicyProperties.
     */
    public static SecurityPolicyProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SecurityPolicyProperties deserializedSecurityPolicyProperties = new SecurityPolicyProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedSecurityPolicyProperties.provisioningState
                        = AfdProvisioningState.fromString(reader.getString());
                } else if ("deploymentStatus".equals(fieldName)) {
                    deserializedSecurityPolicyProperties.deploymentStatus
                        = DeploymentStatus.fromString(reader.getString());
                } else if ("profileName".equals(fieldName)) {
                    deserializedSecurityPolicyProperties.profileName = reader.getString();
                } else if ("parameters".equals(fieldName)) {
                    deserializedSecurityPolicyProperties.parameters
                        = SecurityPolicyPropertiesParameters.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSecurityPolicyProperties;
        });
    }
}
