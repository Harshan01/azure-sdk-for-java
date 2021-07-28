// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PermissionProperty. */
public final class PermissionProperty extends ExpandableStringEnum<PermissionProperty> {
    /** Static value AWS::AWSSecurityHubReadOnlyAccess for PermissionProperty. */
    public static final PermissionProperty AWS_AWSSECURITY_HUB_READ_ONLY_ACCESS =
        fromString("AWS::AWSSecurityHubReadOnlyAccess");

    /** Static value AWS::SecurityAudit for PermissionProperty. */
    public static final PermissionProperty AWS_SECURITY_AUDIT = fromString("AWS::SecurityAudit");

    /** Static value AWS::AmazonSSMAutomationRole for PermissionProperty. */
    public static final PermissionProperty AWS_AMAZON_SSMAUTOMATION_ROLE = fromString("AWS::AmazonSSMAutomationRole");

    /** Static value GCP::Security Center Admin Viewer for PermissionProperty. */
    public static final PermissionProperty GCP_SECURITY_CENTER_ADMIN_VIEWER =
        fromString("GCP::Security Center Admin Viewer");

    /**
     * Creates or finds a PermissionProperty from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PermissionProperty.
     */
    @JsonCreator
    public static PermissionProperty fromString(String name) {
        return fromString(name, PermissionProperty.class);
    }

    /** @return known PermissionProperty values. */
    public static Collection<PermissionProperty> values() {
        return values(PermissionProperty.class);
    }
}
