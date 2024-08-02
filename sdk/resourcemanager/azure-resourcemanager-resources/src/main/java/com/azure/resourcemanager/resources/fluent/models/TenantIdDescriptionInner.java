// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.resources.models.TenantCategory;
import java.io.IOException;
import java.util.List;

/**
 * Tenant Id information.
 */
@Immutable
public final class TenantIdDescriptionInner implements JsonSerializable<TenantIdDescriptionInner> {
    /*
     * The fully qualified ID of the tenant. For example, /tenants/8d65815f-a5b6-402f-9298-045155da7d74
     */
    private String id;

    /*
     * The tenant ID. For example, 8d65815f-a5b6-402f-9298-045155da7d74
     */
    private String tenantId;

    /*
     * Category of the tenant.
     */
    private TenantCategory tenantCategory;

    /*
     * Country/region name of the address for the tenant.
     */
    private String country;

    /*
     * Country/region abbreviation for the tenant.
     */
    private String countryCode;

    /*
     * The display name of the tenant.
     */
    private String displayName;

    /*
     * The list of domains for the tenant.
     */
    private List<String> domains;

    /*
     * The default domain for the tenant.
     */
    private String defaultDomain;

    /*
     * The tenant type. Only available for 'Home' tenant category.
     */
    private String tenantType;

    /*
     * The tenant's branding logo URL. Only available for 'Home' tenant category.
     */
    private String tenantBrandingLogoUrl;

    /**
     * Creates an instance of TenantIdDescriptionInner class.
     */
    public TenantIdDescriptionInner() {
    }

    /**
     * Get the id property: The fully qualified ID of the tenant. For example,
     * /tenants/8d65815f-a5b6-402f-9298-045155da7d74.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the tenantId property: The tenant ID. For example, 8d65815f-a5b6-402f-9298-045155da7d74.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the tenantCategory property: Category of the tenant.
     * 
     * @return the tenantCategory value.
     */
    public TenantCategory tenantCategory() {
        return this.tenantCategory;
    }

    /**
     * Get the country property: Country/region name of the address for the tenant.
     * 
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Get the countryCode property: Country/region abbreviation for the tenant.
     * 
     * @return the countryCode value.
     */
    public String countryCode() {
        return this.countryCode;
    }

    /**
     * Get the displayName property: The display name of the tenant.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the domains property: The list of domains for the tenant.
     * 
     * @return the domains value.
     */
    public List<String> domains() {
        return this.domains;
    }

    /**
     * Get the defaultDomain property: The default domain for the tenant.
     * 
     * @return the defaultDomain value.
     */
    public String defaultDomain() {
        return this.defaultDomain;
    }

    /**
     * Get the tenantType property: The tenant type. Only available for 'Home' tenant category.
     * 
     * @return the tenantType value.
     */
    public String tenantType() {
        return this.tenantType;
    }

    /**
     * Get the tenantBrandingLogoUrl property: The tenant's branding logo URL. Only available for 'Home' tenant
     * category.
     * 
     * @return the tenantBrandingLogoUrl value.
     */
    public String tenantBrandingLogoUrl() {
        return this.tenantBrandingLogoUrl;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TenantIdDescriptionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TenantIdDescriptionInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TenantIdDescriptionInner.
     */
    public static TenantIdDescriptionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TenantIdDescriptionInner deserializedTenantIdDescriptionInner = new TenantIdDescriptionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedTenantIdDescriptionInner.id = reader.getString();
                } else if ("tenantId".equals(fieldName)) {
                    deserializedTenantIdDescriptionInner.tenantId = reader.getString();
                } else if ("tenantCategory".equals(fieldName)) {
                    deserializedTenantIdDescriptionInner.tenantCategory = TenantCategory.fromString(reader.getString());
                } else if ("country".equals(fieldName)) {
                    deserializedTenantIdDescriptionInner.country = reader.getString();
                } else if ("countryCode".equals(fieldName)) {
                    deserializedTenantIdDescriptionInner.countryCode = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedTenantIdDescriptionInner.displayName = reader.getString();
                } else if ("domains".equals(fieldName)) {
                    List<String> domains = reader.readArray(reader1 -> reader1.getString());
                    deserializedTenantIdDescriptionInner.domains = domains;
                } else if ("defaultDomain".equals(fieldName)) {
                    deserializedTenantIdDescriptionInner.defaultDomain = reader.getString();
                } else if ("tenantType".equals(fieldName)) {
                    deserializedTenantIdDescriptionInner.tenantType = reader.getString();
                } else if ("tenantBrandingLogoUrl".equals(fieldName)) {
                    deserializedTenantIdDescriptionInner.tenantBrandingLogoUrl = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTenantIdDescriptionInner;
        });
    }
}
