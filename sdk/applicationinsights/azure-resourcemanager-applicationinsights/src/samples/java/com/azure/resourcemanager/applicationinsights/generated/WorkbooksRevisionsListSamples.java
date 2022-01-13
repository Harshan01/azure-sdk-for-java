// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.Context;

/** Samples for Workbooks RevisionsList. */
public final class WorkbooksRevisionsListSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2021-08-01/examples/WorkbookRevisionsList.json
     */
    /**
     * Sample code: WorkbookRevisionsList.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbookRevisionsList(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager.workbooks().revisionsList("my-resource-group", "deadb33f-5e0d-4064-8ebb-1a4ed0313eb2", Context.NONE);
    }
}
