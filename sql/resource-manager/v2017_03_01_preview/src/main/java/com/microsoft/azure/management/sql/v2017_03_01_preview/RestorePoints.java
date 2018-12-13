/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.RestorePointsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing RestorePoints.
 */
public interface RestorePoints extends HasInner<RestorePointsInner> {
    /**
     * Gets a restore point.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param restorePointName The name of the restore point.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RestorePoint> getAsync(String resourceGroupName, String serverName, String databaseName, String restorePointName);

    /**
     * Gets a list of database restore points.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RestorePoint> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName);

    /**
     * Deletes a restore point.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param restorePointName The name of the restore point.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serverName, String databaseName, String restorePointName);

    /**
     * Creates a restore point for a data warehouse.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param restorePointLabel The restore point label to apply
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RestorePoint> createAsync(String resourceGroupName, String serverName, String databaseName, String restorePointLabel);

}
