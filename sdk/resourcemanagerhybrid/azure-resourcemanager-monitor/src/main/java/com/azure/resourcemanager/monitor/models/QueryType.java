// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for QueryType. */
public final class QueryType extends ExpandableStringEnum<QueryType> {
    /** Static value ResultCount for QueryType. */
    public static final QueryType RESULT_COUNT = fromString("ResultCount");

    /**
     * Creates or finds a QueryType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding QueryType.
     */
    @JsonCreator
    public static QueryType fromString(String name) {
        return fromString(name, QueryType.class);
    }

    /** @return known QueryType values. */
    public static Collection<QueryType> values() {
        return values(QueryType.class);
    }
}
