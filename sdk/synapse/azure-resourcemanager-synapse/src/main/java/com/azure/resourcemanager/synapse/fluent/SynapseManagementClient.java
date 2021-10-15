// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for SynapseManagementClient class. */
public interface SynapseManagementClient {
    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the AzureADOnlyAuthenticationsClient object to access its operations.
     *
     * @return the AzureADOnlyAuthenticationsClient object.
     */
    AzureADOnlyAuthenticationsClient getAzureADOnlyAuthentications();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the IpFirewallRulesClient object to access its operations.
     *
     * @return the IpFirewallRulesClient object.
     */
    IpFirewallRulesClient getIpFirewallRules();

    /**
     * Gets the KeysClient object to access its operations.
     *
     * @return the KeysClient object.
     */
    KeysClient getKeys();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the PrivateLinkHubPrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkHubPrivateLinkResourcesClient object.
     */
    PrivateLinkHubPrivateLinkResourcesClient getPrivateLinkHubPrivateLinkResources();

    /**
     * Gets the PrivateLinkHubsClient object to access its operations.
     *
     * @return the PrivateLinkHubsClient object.
     */
    PrivateLinkHubsClient getPrivateLinkHubs();

    /**
     * Gets the PrivateEndpointConnectionsPrivateLinkHubsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsPrivateLinkHubsClient object.
     */
    PrivateEndpointConnectionsPrivateLinkHubsClient getPrivateEndpointConnectionsPrivateLinkHubs();

    /**
     * Gets the SqlPoolsClient object to access its operations.
     *
     * @return the SqlPoolsClient object.
     */
    SqlPoolsClient getSqlPools();

    /**
     * Gets the SqlPoolMetadataSyncConfigsClient object to access its operations.
     *
     * @return the SqlPoolMetadataSyncConfigsClient object.
     */
    SqlPoolMetadataSyncConfigsClient getSqlPoolMetadataSyncConfigs();

    /**
     * Gets the SqlPoolOperationResultsClient object to access its operations.
     *
     * @return the SqlPoolOperationResultsClient object.
     */
    SqlPoolOperationResultsClient getSqlPoolOperationResults();

    /**
     * Gets the SqlPoolGeoBackupPoliciesClient object to access its operations.
     *
     * @return the SqlPoolGeoBackupPoliciesClient object.
     */
    SqlPoolGeoBackupPoliciesClient getSqlPoolGeoBackupPolicies();

    /**
     * Gets the SqlPoolDataWarehouseUserActivitiesClient object to access its operations.
     *
     * @return the SqlPoolDataWarehouseUserActivitiesClient object.
     */
    SqlPoolDataWarehouseUserActivitiesClient getSqlPoolDataWarehouseUserActivities();

    /**
     * Gets the SqlPoolRestorePointsClient object to access its operations.
     *
     * @return the SqlPoolRestorePointsClient object.
     */
    SqlPoolRestorePointsClient getSqlPoolRestorePoints();

    /**
     * Gets the SqlPoolReplicationLinksClient object to access its operations.
     *
     * @return the SqlPoolReplicationLinksClient object.
     */
    SqlPoolReplicationLinksClient getSqlPoolReplicationLinks();

    /**
     * Gets the SqlPoolMaintenanceWindowsClient object to access its operations.
     *
     * @return the SqlPoolMaintenanceWindowsClient object.
     */
    SqlPoolMaintenanceWindowsClient getSqlPoolMaintenanceWindows();

    /**
     * Gets the SqlPoolMaintenanceWindowOptionsClient object to access its operations.
     *
     * @return the SqlPoolMaintenanceWindowOptionsClient object.
     */
    SqlPoolMaintenanceWindowOptionsClient getSqlPoolMaintenanceWindowOptions();

    /**
     * Gets the SqlPoolTransparentDataEncryptionsClient object to access its operations.
     *
     * @return the SqlPoolTransparentDataEncryptionsClient object.
     */
    SqlPoolTransparentDataEncryptionsClient getSqlPoolTransparentDataEncryptions();

    /**
     * Gets the SqlPoolBlobAuditingPoliciesClient object to access its operations.
     *
     * @return the SqlPoolBlobAuditingPoliciesClient object.
     */
    SqlPoolBlobAuditingPoliciesClient getSqlPoolBlobAuditingPolicies();

    /**
     * Gets the SqlPoolOperationsClient object to access its operations.
     *
     * @return the SqlPoolOperationsClient object.
     */
    SqlPoolOperationsClient getSqlPoolOperations();

    /**
     * Gets the SqlPoolUsagesClient object to access its operations.
     *
     * @return the SqlPoolUsagesClient object.
     */
    SqlPoolUsagesClient getSqlPoolUsages();

    /**
     * Gets the SqlPoolSensitivityLabelsClient object to access its operations.
     *
     * @return the SqlPoolSensitivityLabelsClient object.
     */
    SqlPoolSensitivityLabelsClient getSqlPoolSensitivityLabels();

    /**
     * Gets the SqlPoolRecommendedSensitivityLabelsClient object to access its operations.
     *
     * @return the SqlPoolRecommendedSensitivityLabelsClient object.
     */
    SqlPoolRecommendedSensitivityLabelsClient getSqlPoolRecommendedSensitivityLabels();

    /**
     * Gets the SqlPoolSchemasClient object to access its operations.
     *
     * @return the SqlPoolSchemasClient object.
     */
    SqlPoolSchemasClient getSqlPoolSchemas();

    /**
     * Gets the SqlPoolTablesClient object to access its operations.
     *
     * @return the SqlPoolTablesClient object.
     */
    SqlPoolTablesClient getSqlPoolTables();

    /**
     * Gets the SqlPoolTableColumnsClient object to access its operations.
     *
     * @return the SqlPoolTableColumnsClient object.
     */
    SqlPoolTableColumnsClient getSqlPoolTableColumns();

    /**
     * Gets the SqlPoolConnectionPoliciesClient object to access its operations.
     *
     * @return the SqlPoolConnectionPoliciesClient object.
     */
    SqlPoolConnectionPoliciesClient getSqlPoolConnectionPolicies();

    /**
     * Gets the SqlPoolVulnerabilityAssessmentsClient object to access its operations.
     *
     * @return the SqlPoolVulnerabilityAssessmentsClient object.
     */
    SqlPoolVulnerabilityAssessmentsClient getSqlPoolVulnerabilityAssessments();

    /**
     * Gets the SqlPoolVulnerabilityAssessmentScansClient object to access its operations.
     *
     * @return the SqlPoolVulnerabilityAssessmentScansClient object.
     */
    SqlPoolVulnerabilityAssessmentScansClient getSqlPoolVulnerabilityAssessmentScans();

    /**
     * Gets the SqlPoolSecurityAlertPoliciesClient object to access its operations.
     *
     * @return the SqlPoolSecurityAlertPoliciesClient object.
     */
    SqlPoolSecurityAlertPoliciesClient getSqlPoolSecurityAlertPolicies();

    /**
     * Gets the SqlPoolVulnerabilityAssessmentRuleBaselinesClient object to access its operations.
     *
     * @return the SqlPoolVulnerabilityAssessmentRuleBaselinesClient object.
     */
    SqlPoolVulnerabilityAssessmentRuleBaselinesClient getSqlPoolVulnerabilityAssessmentRuleBaselines();

    /**
     * Gets the ExtendedSqlPoolBlobAuditingPoliciesClient object to access its operations.
     *
     * @return the ExtendedSqlPoolBlobAuditingPoliciesClient object.
     */
    ExtendedSqlPoolBlobAuditingPoliciesClient getExtendedSqlPoolBlobAuditingPolicies();

    /**
     * Gets the DataMaskingPoliciesClient object to access its operations.
     *
     * @return the DataMaskingPoliciesClient object.
     */
    DataMaskingPoliciesClient getDataMaskingPolicies();

    /**
     * Gets the DataMaskingRulesClient object to access its operations.
     *
     * @return the DataMaskingRulesClient object.
     */
    DataMaskingRulesClient getDataMaskingRules();

    /**
     * Gets the SqlPoolColumnsClient object to access its operations.
     *
     * @return the SqlPoolColumnsClient object.
     */
    SqlPoolColumnsClient getSqlPoolColumns();

    /**
     * Gets the SqlPoolWorkloadGroupsClient object to access its operations.
     *
     * @return the SqlPoolWorkloadGroupsClient object.
     */
    SqlPoolWorkloadGroupsClient getSqlPoolWorkloadGroups();

    /**
     * Gets the SqlPoolWorkloadClassifiersClient object to access its operations.
     *
     * @return the SqlPoolWorkloadClassifiersClient object.
     */
    SqlPoolWorkloadClassifiersClient getSqlPoolWorkloadClassifiers();

    /**
     * Gets the WorkspaceManagedSqlServerBlobAuditingPoliciesClient object to access its operations.
     *
     * @return the WorkspaceManagedSqlServerBlobAuditingPoliciesClient object.
     */
    WorkspaceManagedSqlServerBlobAuditingPoliciesClient getWorkspaceManagedSqlServerBlobAuditingPolicies();

    /**
     * Gets the WorkspaceManagedSqlServerExtendedBlobAuditingPoliciesClient object to access its operations.
     *
     * @return the WorkspaceManagedSqlServerExtendedBlobAuditingPoliciesClient object.
     */
    WorkspaceManagedSqlServerExtendedBlobAuditingPoliciesClient
        getWorkspaceManagedSqlServerExtendedBlobAuditingPolicies();

    /**
     * Gets the WorkspaceManagedSqlServerSecurityAlertPoliciesClient object to access its operations.
     *
     * @return the WorkspaceManagedSqlServerSecurityAlertPoliciesClient object.
     */
    WorkspaceManagedSqlServerSecurityAlertPoliciesClient getWorkspaceManagedSqlServerSecurityAlertPolicies();

    /**
     * Gets the WorkspaceManagedSqlServerVulnerabilityAssessmentsClient object to access its operations.
     *
     * @return the WorkspaceManagedSqlServerVulnerabilityAssessmentsClient object.
     */
    WorkspaceManagedSqlServerVulnerabilityAssessmentsClient getWorkspaceManagedSqlServerVulnerabilityAssessments();

    /**
     * Gets the WorkspaceManagedSqlServerEncryptionProtectorsClient object to access its operations.
     *
     * @return the WorkspaceManagedSqlServerEncryptionProtectorsClient object.
     */
    WorkspaceManagedSqlServerEncryptionProtectorsClient getWorkspaceManagedSqlServerEncryptionProtectors();

    /**
     * Gets the WorkspaceManagedSqlServerUsagesClient object to access its operations.
     *
     * @return the WorkspaceManagedSqlServerUsagesClient object.
     */
    WorkspaceManagedSqlServerUsagesClient getWorkspaceManagedSqlServerUsages();

    /**
     * Gets the WorkspaceManagedSqlServerRecoverableSqlPoolsClient object to access its operations.
     *
     * @return the WorkspaceManagedSqlServerRecoverableSqlPoolsClient object.
     */
    WorkspaceManagedSqlServerRecoverableSqlPoolsClient getWorkspaceManagedSqlServerRecoverableSqlPools();

    /**
     * Gets the WorkspacesClient object to access its operations.
     *
     * @return the WorkspacesClient object.
     */
    WorkspacesClient getWorkspaces();

    /**
     * Gets the WorkspaceAadAdminsClient object to access its operations.
     *
     * @return the WorkspaceAadAdminsClient object.
     */
    WorkspaceAadAdminsClient getWorkspaceAadAdmins();

    /**
     * Gets the WorkspaceSqlAadAdminsClient object to access its operations.
     *
     * @return the WorkspaceSqlAadAdminsClient object.
     */
    WorkspaceSqlAadAdminsClient getWorkspaceSqlAadAdmins();

    /**
     * Gets the WorkspaceManagedIdentitySqlControlSettingsClient object to access its operations.
     *
     * @return the WorkspaceManagedIdentitySqlControlSettingsClient object.
     */
    WorkspaceManagedIdentitySqlControlSettingsClient getWorkspaceManagedIdentitySqlControlSettings();

    /**
     * Gets the RestorableDroppedSqlPoolsClient object to access its operations.
     *
     * @return the RestorableDroppedSqlPoolsClient object.
     */
    RestorableDroppedSqlPoolsClient getRestorableDroppedSqlPools();

    /**
     * Gets the BigDataPoolsClient object to access its operations.
     *
     * @return the BigDataPoolsClient object.
     */
    BigDataPoolsClient getBigDataPools();

    /**
     * Gets the LibrariesClient object to access its operations.
     *
     * @return the LibrariesClient object.
     */
    LibrariesClient getLibraries();

    /**
     * Gets the LibrariesOperationsClient object to access its operations.
     *
     * @return the LibrariesOperationsClient object.
     */
    LibrariesOperationsClient getLibrariesOperations();

    /**
     * Gets the IntegrationRuntimesClient object to access its operations.
     *
     * @return the IntegrationRuntimesClient object.
     */
    IntegrationRuntimesClient getIntegrationRuntimes();

    /**
     * Gets the IntegrationRuntimeNodeIpAddressOperationsClient object to access its operations.
     *
     * @return the IntegrationRuntimeNodeIpAddressOperationsClient object.
     */
    IntegrationRuntimeNodeIpAddressOperationsClient getIntegrationRuntimeNodeIpAddressOperations();

    /**
     * Gets the IntegrationRuntimeObjectMetadatasClient object to access its operations.
     *
     * @return the IntegrationRuntimeObjectMetadatasClient object.
     */
    IntegrationRuntimeObjectMetadatasClient getIntegrationRuntimeObjectMetadatas();

    /**
     * Gets the IntegrationRuntimeNodesClient object to access its operations.
     *
     * @return the IntegrationRuntimeNodesClient object.
     */
    IntegrationRuntimeNodesClient getIntegrationRuntimeNodes();

    /**
     * Gets the IntegrationRuntimeCredentialsClient object to access its operations.
     *
     * @return the IntegrationRuntimeCredentialsClient object.
     */
    IntegrationRuntimeCredentialsClient getIntegrationRuntimeCredentials();

    /**
     * Gets the IntegrationRuntimeConnectionInfosClient object to access its operations.
     *
     * @return the IntegrationRuntimeConnectionInfosClient object.
     */
    IntegrationRuntimeConnectionInfosClient getIntegrationRuntimeConnectionInfos();

    /**
     * Gets the IntegrationRuntimeAuthKeysOperationsClient object to access its operations.
     *
     * @return the IntegrationRuntimeAuthKeysOperationsClient object.
     */
    IntegrationRuntimeAuthKeysOperationsClient getIntegrationRuntimeAuthKeysOperations();

    /**
     * Gets the IntegrationRuntimeMonitoringDatasClient object to access its operations.
     *
     * @return the IntegrationRuntimeMonitoringDatasClient object.
     */
    IntegrationRuntimeMonitoringDatasClient getIntegrationRuntimeMonitoringDatas();

    /**
     * Gets the IntegrationRuntimeStatusOperationsClient object to access its operations.
     *
     * @return the IntegrationRuntimeStatusOperationsClient object.
     */
    IntegrationRuntimeStatusOperationsClient getIntegrationRuntimeStatusOperations();

    /**
     * Gets the SparkConfigurationsClient object to access its operations.
     *
     * @return the SparkConfigurationsClient object.
     */
    SparkConfigurationsClient getSparkConfigurations();

    /**
     * Gets the SparkConfigurationsOperationsClient object to access its operations.
     *
     * @return the SparkConfigurationsOperationsClient object.
     */
    SparkConfigurationsOperationsClient getSparkConfigurationsOperations();

    /**
     * Gets the KustoOperationsClient object to access its operations.
     *
     * @return the KustoOperationsClient object.
     */
    KustoOperationsClient getKustoOperations();

    /**
     * Gets the KustoPoolsClient object to access its operations.
     *
     * @return the KustoPoolsClient object.
     */
    KustoPoolsClient getKustoPools();

    /**
     * Gets the KustoPoolsOperationsClient object to access its operations.
     *
     * @return the KustoPoolsOperationsClient object.
     */
    KustoPoolsOperationsClient getKustoPoolsOperations();

    /**
     * Gets the KustoPoolChildResourcesClient object to access its operations.
     *
     * @return the KustoPoolChildResourcesClient object.
     */
    KustoPoolChildResourcesClient getKustoPoolChildResources();

    /**
     * Gets the KustoPoolAttachedDatabaseConfigurationsClient object to access its operations.
     *
     * @return the KustoPoolAttachedDatabaseConfigurationsClient object.
     */
    KustoPoolAttachedDatabaseConfigurationsClient getKustoPoolAttachedDatabaseConfigurations();

    /**
     * Gets the KustoPoolDatabasesClient object to access its operations.
     *
     * @return the KustoPoolDatabasesClient object.
     */
    KustoPoolDatabasesClient getKustoPoolDatabases();

    /**
     * Gets the KustoPoolDataConnectionsClient object to access its operations.
     *
     * @return the KustoPoolDataConnectionsClient object.
     */
    KustoPoolDataConnectionsClient getKustoPoolDataConnections();

    /**
     * Gets the KustoPoolPrincipalAssignmentsClient object to access its operations.
     *
     * @return the KustoPoolPrincipalAssignmentsClient object.
     */
    KustoPoolPrincipalAssignmentsClient getKustoPoolPrincipalAssignments();

    /**
     * Gets the KustoPoolDatabasePrincipalAssignmentsClient object to access its operations.
     *
     * @return the KustoPoolDatabasePrincipalAssignmentsClient object.
     */
    KustoPoolDatabasePrincipalAssignmentsClient getKustoPoolDatabasePrincipalAssignments();
}
