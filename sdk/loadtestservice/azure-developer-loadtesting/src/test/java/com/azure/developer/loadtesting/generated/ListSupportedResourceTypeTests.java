// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class ListSupportedResourceTypeTests extends LoadTestClientTestBase {
    @Test
    @Disabled
    public void testListSupportedResourceTypeTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = serverMetricsClient.listSupportedResourceTypeWithResponse(requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"value\":[\"microsoft.cache/redis\",\"microsoft.compute/virtualmachines\",\"microsoft.compute/virtualmachinescalesets\",\"microsoft.containerservice/managedclusters\",\"microsoft.web/sites\",\"microsoft.web/serverfarms\",\"microsoft.insights/components\",\"microsoft.servicefabricmesh/applications\",\"microsoft.web/staticsites\",\"microsoft.network/trafficmanagerprofiles\",\"microsoft.apimanagement/service\",\"microsoft.classicstorage/storageaccounts\",\"microsoft.storage/storageaccounts\",\"microsoft.storage/storageaccounts/fileservices\",\"microsoft.classicstorage/storageaccounts/fileservices\",\"microsoft.storage/storageaccounts/blobservices\",\"microsoft.classicstorage/storageaccounts/blobservices\",\"microsoft.storage/storageaccounts/tableservices\",\"microsoft.classicstorage/storageaccounts/tableservices\",\"microsoft.documentdb/databaseaccounts\",\"microsoft.sql/managedinstances\",\"microsoft.dbformariadb/servers\",\"microsoft.dbforpostgresql/servers\",\"microsoft.dbforpostgresql/serversv2\",\"microsoft.dbformysql/servers\",\"microsoft.sql/servers/databases\",\"microsoft.sql/servers/elasticpools\",\"microsoft.servicebus/namespaces\",\"microsoft.eventhub/namespaces\",\"microsoft.storage/storageaccounts/queueservices\",\"microsoft.classicstorage/storageaccounts/queueservices\",\"microsoft.eventhub/clusters\",\"microsoft.keyvault/vaults\"]}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
