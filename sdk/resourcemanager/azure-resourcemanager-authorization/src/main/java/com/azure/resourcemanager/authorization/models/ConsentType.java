// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for ConsentType.
 */
public final class ConsentType extends ExpandableStringEnum<ConsentType> {
    /**
     * Static value AllPrincipals for ConsentType.
     */
    public static final ConsentType ALL_PRINCIPALS = fromString("AllPrincipals");

    /**
     * Static value Principal for ConsentType.
     */
    public static final ConsentType PRINCIPAL = fromString("Principal");

    /**
     * Creates or finds a ConsentType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ConsentType.
     */
    @JsonCreator
    public static ConsentType fromString(String name) {
        return fromString(name, ConsentType.class);
    }

    /**
     * @return known ConsentType values.
     */
    public static Collection<ConsentType> values() {
        return values(ConsentType.class);
    }
}
