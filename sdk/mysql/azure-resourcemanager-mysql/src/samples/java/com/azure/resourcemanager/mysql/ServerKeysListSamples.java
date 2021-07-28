// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql;

import com.azure.core.util.Context;

/** Samples for ServerKeys List. */
public final class ServerKeysListSamples {
    /**
     * Sample code: List the keys for a MySQL Server.
     *
     * @param mySqlManager Entry point to MySqlManager. The Microsoft Azure management API provides create, read,
     *     update, and delete functionality for Azure MySQL resources including servers, databases, firewall rules, VNET
     *     rules, log files and configurations with new business model.
     */
    public static void listTheKeysForAMySQLServer(com.azure.resourcemanager.mysql.MySqlManager mySqlManager) {
        mySqlManager.serverKeys().list("testrg", "testserver", Context.NONE);
    }
}
