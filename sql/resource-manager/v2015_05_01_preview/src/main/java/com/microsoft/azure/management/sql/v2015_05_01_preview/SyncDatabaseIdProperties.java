/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.SyncDatabaseIdPropertiesInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.SqlManager;

/**
 * Type representing SyncDatabaseIdProperties.
 */
public interface SyncDatabaseIdProperties extends HasInner<SyncDatabaseIdPropertiesInner>, HasManager<SqlManager> {
    /**
     * @return the id value.
     */
    String id();

}
