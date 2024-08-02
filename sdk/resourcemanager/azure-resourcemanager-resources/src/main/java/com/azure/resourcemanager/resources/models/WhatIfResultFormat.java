// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

/**
 * The format of the What-If results.
 */
public enum WhatIfResultFormat {
    /**
     * Enum value ResourceIdOnly.
     */
    RESOURCE_ID_ONLY("ResourceIdOnly"),

    /**
     * Enum value FullResourcePayloads.
     */
    FULL_RESOURCE_PAYLOADS("FullResourcePayloads");

    /**
     * The actual serialized value for a WhatIfResultFormat instance.
     */
    private final String value;

    WhatIfResultFormat(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a WhatIfResultFormat instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed WhatIfResultFormat object, or null if unable to parse.
     */
    public static WhatIfResultFormat fromString(String value) {
        if (value == null) {
            return null;
        }
        WhatIfResultFormat[] items = WhatIfResultFormat.values();
        for (WhatIfResultFormat item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
