// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

/**
 * The location type.
 */
public enum LocationType {
    /**
     * Enum value Region.
     */
    REGION("Region"),

    /**
     * Enum value EdgeZone.
     */
    EDGE_ZONE("EdgeZone");

    /**
     * The actual serialized value for a LocationType instance.
     */
    private final String value;

    LocationType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a LocationType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed LocationType object, or null if unable to parse.
     */
    public static LocationType fromString(String value) {
        if (value == null) {
            return null;
        }
        LocationType[] items = LocationType.values();
        for (LocationType item : items) {
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
