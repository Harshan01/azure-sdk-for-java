/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of table in sync group schema.
 */
public class SyncGroupSchemaTable {
    /**
     * List of columns in sync group schema.
     */
    @JsonProperty(value = "columns")
    private List<SyncGroupSchemaTableColumn> columns;

    /**
     * Quoted name of sync group schema table.
     */
    @JsonProperty(value = "quotedName")
    private String quotedName;

    /**
     * Get list of columns in sync group schema.
     *
     * @return the columns value
     */
    public List<SyncGroupSchemaTableColumn> columns() {
        return this.columns;
    }

    /**
     * Set list of columns in sync group schema.
     *
     * @param columns the columns value to set
     * @return the SyncGroupSchemaTable object itself.
     */
    public SyncGroupSchemaTable withColumns(List<SyncGroupSchemaTableColumn> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Get quoted name of sync group schema table.
     *
     * @return the quotedName value
     */
    public String quotedName() {
        return this.quotedName;
    }

    /**
     * Set quoted name of sync group schema table.
     *
     * @param quotedName the quotedName value to set
     * @return the SyncGroupSchemaTable object itself.
     */
    public SyncGroupSchemaTable withQuotedName(String quotedName) {
        this.quotedName = quotedName;
        return this;
    }

}
