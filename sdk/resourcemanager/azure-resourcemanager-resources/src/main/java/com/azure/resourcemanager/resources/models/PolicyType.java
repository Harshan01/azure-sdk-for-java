// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
 */
public final class PolicyType extends ExpandableStringEnum<PolicyType> {
    /**
     * Static value NotSpecified for PolicyType.
     */
    public static final PolicyType NOT_SPECIFIED = fromString("NotSpecified");

    /**
     * Static value BuiltIn for PolicyType.
     */
    public static final PolicyType BUILT_IN = fromString("BuiltIn");

    /**
     * Static value Custom for PolicyType.
     */
    public static final PolicyType CUSTOM = fromString("Custom");

    /**
     * Static value Static for PolicyType.
     */
    public static final PolicyType STATIC = fromString("Static");

    /**
     * Creates a new instance of PolicyType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PolicyType() {
    }

    /**
     * Creates or finds a PolicyType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PolicyType.
     */
    public static PolicyType fromString(String name) {
        return fromString(name, PolicyType.class);
    }

    /**
     * Gets known PolicyType values.
     * 
     * @return known PolicyType values.
     */
    public static Collection<PolicyType> values() {
        return values(PolicyType.class);
    }
}
