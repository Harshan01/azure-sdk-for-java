// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redhatopenshift.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * ProvisioningState represents a provisioning state.
 */
public final class ProvisioningState extends ExpandableStringEnum<ProvisioningState> {
    /**
     * Static value AdminUpdating for ProvisioningState.
     */
    public static final ProvisioningState ADMIN_UPDATING = fromString("AdminUpdating");

    /**
     * Static value Canceled for ProvisioningState.
     */
    public static final ProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value Creating for ProvisioningState.
     */
    public static final ProvisioningState CREATING = fromString("Creating");

    /**
     * Static value Deleting for ProvisioningState.
     */
    public static final ProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Failed for ProvisioningState.
     */
    public static final ProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Succeeded for ProvisioningState.
     */
    public static final ProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Updating for ProvisioningState.
     */
    public static final ProvisioningState UPDATING = fromString("Updating");

    /**
     * Creates a new instance of ProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProvisioningState() {
    }

    /**
     * Creates or finds a ProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ProvisioningState.
     */
    public static ProvisioningState fromString(String name) {
        return fromString(name, ProvisioningState.class);
    }

    /**
     * Gets known ProvisioningState values.
     * 
     * @return known ProvisioningState values.
     */
    public static Collection<ProvisioningState> values() {
        return values(ProvisioningState.class);
    }
}
