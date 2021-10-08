// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.generated;

import com.azure.core.util.Context;

/** Samples for SubAccountTagRules Delete. */
public final class SubAccountTagRulesDeleteSamples {
    /*
     * x-ms-original-file: specification/logz/resource-manager/Microsoft.Logz/stable/2020-10-01/examples/SubAccountTagRules_Delete.json
     */
    /**
     * Sample code: TagRules_Delete.
     *
     * @param manager Entry point to LogzManager.
     */
    public static void tagRulesDelete(com.azure.resourcemanager.logz.LogzManager manager) {
        manager
            .subAccountTagRules()
            .deleteWithResponse("myResourceGroup", "myMonitor", "SubAccount1", "default", Context.NONE);
    }
}
