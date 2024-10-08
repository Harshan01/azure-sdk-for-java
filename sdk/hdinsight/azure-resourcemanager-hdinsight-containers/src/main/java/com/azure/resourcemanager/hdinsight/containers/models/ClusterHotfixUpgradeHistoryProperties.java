// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Cluster hotfix upgrade history properties.
 */
@Fluent
public final class ClusterHotfixUpgradeHistoryProperties extends ClusterInPlaceUpgradeHistoryProperties {
    /*
     * Type of upgrade.
     */
    private ClusterUpgradeHistoryType upgradeType = ClusterUpgradeHistoryType.HOTFIX_UPGRADE;

    /**
     * Creates an instance of ClusterHotfixUpgradeHistoryProperties class.
     */
    public ClusterHotfixUpgradeHistoryProperties() {
    }

    /**
     * Get the upgradeType property: Type of upgrade.
     * 
     * @return the upgradeType value.
     */
    @Override
    public ClusterUpgradeHistoryType upgradeType() {
        return this.upgradeType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeHistoryProperties withSourceClusterVersion(String sourceClusterVersion) {
        super.withSourceClusterVersion(sourceClusterVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeHistoryProperties withSourceOssVersion(String sourceOssVersion) {
        super.withSourceOssVersion(sourceOssVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeHistoryProperties withSourceBuildNumber(String sourceBuildNumber) {
        super.withSourceBuildNumber(sourceBuildNumber);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeHistoryProperties withTargetClusterVersion(String targetClusterVersion) {
        super.withTargetClusterVersion(targetClusterVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeHistoryProperties withTargetOssVersion(String targetOssVersion) {
        super.withTargetOssVersion(targetOssVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeHistoryProperties withTargetBuildNumber(String targetBuildNumber) {
        super.withTargetBuildNumber(targetBuildNumber);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeHistoryProperties withComponentName(String componentName) {
        super.withComponentName(componentName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeHistoryProperties withSeverity(ClusterUpgradeHistorySeverityType severity) {
        super.withSeverity(severity);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeHistoryProperties withUtcTime(String utcTime) {
        super.withUtcTime(utcTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeHistoryProperties
        withUpgradeResult(ClusterUpgradeHistoryUpgradeResultType upgradeResult) {
        super.withUpgradeResult(upgradeResult);
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("utcTime", utcTime());
        jsonWriter.writeStringField("upgradeResult", upgradeResult() == null ? null : upgradeResult().toString());
        jsonWriter.writeStringField("sourceClusterVersion", sourceClusterVersion());
        jsonWriter.writeStringField("sourceOssVersion", sourceOssVersion());
        jsonWriter.writeStringField("sourceBuildNumber", sourceBuildNumber());
        jsonWriter.writeStringField("targetClusterVersion", targetClusterVersion());
        jsonWriter.writeStringField("targetOssVersion", targetOssVersion());
        jsonWriter.writeStringField("targetBuildNumber", targetBuildNumber());
        jsonWriter.writeStringField("componentName", componentName());
        jsonWriter.writeStringField("severity", severity() == null ? null : severity().toString());
        jsonWriter.writeStringField("upgradeType", this.upgradeType == null ? null : this.upgradeType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterHotfixUpgradeHistoryProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterHotfixUpgradeHistoryProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClusterHotfixUpgradeHistoryProperties.
     */
    public static ClusterHotfixUpgradeHistoryProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterHotfixUpgradeHistoryProperties deserializedClusterHotfixUpgradeHistoryProperties
                = new ClusterHotfixUpgradeHistoryProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("utcTime".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeHistoryProperties.withUtcTime(reader.getString());
                } else if ("upgradeResult".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeHistoryProperties
                        .withUpgradeResult(ClusterUpgradeHistoryUpgradeResultType.fromString(reader.getString()));
                } else if ("sourceClusterVersion".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeHistoryProperties.withSourceClusterVersion(reader.getString());
                } else if ("sourceOssVersion".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeHistoryProperties.withSourceOssVersion(reader.getString());
                } else if ("sourceBuildNumber".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeHistoryProperties.withSourceBuildNumber(reader.getString());
                } else if ("targetClusterVersion".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeHistoryProperties.withTargetClusterVersion(reader.getString());
                } else if ("targetOssVersion".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeHistoryProperties.withTargetOssVersion(reader.getString());
                } else if ("targetBuildNumber".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeHistoryProperties.withTargetBuildNumber(reader.getString());
                } else if ("componentName".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeHistoryProperties.withComponentName(reader.getString());
                } else if ("severity".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeHistoryProperties
                        .withSeverity(ClusterUpgradeHistorySeverityType.fromString(reader.getString()));
                } else if ("upgradeType".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeHistoryProperties.upgradeType
                        = ClusterUpgradeHistoryType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterHotfixUpgradeHistoryProperties;
        });
    }
}
