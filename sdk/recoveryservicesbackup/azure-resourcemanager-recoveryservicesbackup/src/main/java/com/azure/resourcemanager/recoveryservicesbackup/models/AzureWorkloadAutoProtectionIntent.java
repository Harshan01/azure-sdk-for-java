// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure Recovery Services Vault specific protection intent item. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "protectionIntentItemType",
    defaultImpl = AzureWorkloadAutoProtectionIntent.class)
@JsonTypeName("AzureWorkloadAutoProtectionIntent")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "AzureWorkloadSQLAutoProtectionIntent",
        value = AzureWorkloadSqlAutoProtectionIntent.class)
})
@Fluent
public class AzureWorkloadAutoProtectionIntent extends AzureRecoveryServiceVaultProtectionIntent {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureWorkloadAutoProtectionIntent.class);

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadAutoProtectionIntent withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadAutoProtectionIntent withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadAutoProtectionIntent withItemId(String itemId) {
        super.withItemId(itemId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadAutoProtectionIntent withPolicyId(String policyId) {
        super.withPolicyId(policyId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadAutoProtectionIntent withProtectionState(ProtectionStatus protectionState) {
        super.withProtectionState(protectionState);
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
}
