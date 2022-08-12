// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Routing Choice defines the kind of network routing opted by the user. */
public final class RoutingChoice extends ExpandableStringEnum<RoutingChoice> {
    /** Static value MicrosoftRouting for RoutingChoice. */
    public static final RoutingChoice MICROSOFT_ROUTING = fromString("MicrosoftRouting");

    /** Static value InternetRouting for RoutingChoice. */
    public static final RoutingChoice INTERNET_ROUTING = fromString("InternetRouting");

    /**
     * Creates or finds a RoutingChoice from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RoutingChoice.
     */
    @JsonCreator
    public static RoutingChoice fromString(String name) {
        return fromString(name, RoutingChoice.class);
    }

    /**
     * Gets known RoutingChoice values.
     *
     * @return known RoutingChoice values.
     */
    public static Collection<RoutingChoice> values() {
        return values(RoutingChoice.class);
    }
}
