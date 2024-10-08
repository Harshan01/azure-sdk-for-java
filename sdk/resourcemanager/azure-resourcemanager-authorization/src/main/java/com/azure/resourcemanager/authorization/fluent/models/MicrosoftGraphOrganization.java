// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * organization
 * 
 * The organization resource represents an instance of global settings and resources which operate and are provisioned
 * at the tenant-level.
 */
@Fluent
public final class MicrosoftGraphOrganization extends MicrosoftGraphDirectoryObjectInner {
    /*
     * The collection of service plans associated with the tenant. Not nullable.
     */
    private List<MicrosoftGraphAssignedPlan> assignedPlans;

    /*
     * Telephone number for the organization. NOTE: Although this is a string collection, only one number can be set for
     * this property.
     */
    private List<String> businessPhones;

    /*
     * City name of the address for the organization.
     */
    private String city;

    /*
     * Country/region name of the address for the organization.
     */
    private String country;

    /*
     * Country/region abbreviation for the organization.
     */
    private String countryLetterCode;

    /*
     * Timestamp of when the organization was created. The value cannot be modified and is automatically populated when
     * the organization is created. The Timestamp type represents date and time information using ISO 8601 format and is
     * always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     * Read-only.
     */
    private OffsetDateTime createdDateTime;

    /*
     * The display name for the tenant.
     */
    private String displayName;

    /*
     * Not nullable.
     */
    private List<String> marketingNotificationEmails;

    /*
     * The time and date at which the tenant was last synced with the on-premise directory. The Timestamp type
     * represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC
     * on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     */
    private OffsetDateTime onPremisesLastSyncDateTime;

    /*
     * true if this object is synced from an on-premises directory; false if this object was originally synced from an
     * on-premises directory but is no longer synced; null if this object has never been synced from an on-premises
     * directory (default).
     */
    private Boolean onPremisesSyncEnabled;

    /*
     * Postal code of the address for the organization.
     */
    private String postalCode;

    /*
     * The preferred language for the organization. Should follow ISO 639-1 Code; for example 'en'.
     */
    private String preferredLanguage;

    /*
     * privacyProfile
     */
    private MicrosoftGraphPrivacyProfile privacyProfile;

    /*
     * Not nullable.
     */
    private List<MicrosoftGraphProvisionedPlan> provisionedPlans;

    /*
     * The securityComplianceNotificationMails property.
     */
    private List<String> securityComplianceNotificationMails;

    /*
     * The securityComplianceNotificationPhones property.
     */
    private List<String> securityComplianceNotificationPhones;

    /*
     * State name of the address for the organization.
     */
    private String state;

    /*
     * Street name of the address for organization.
     */
    private String street;

    /*
     * Not nullable.
     */
    private List<String> technicalNotificationMails;

    /*
     * The tenantType property.
     */
    private String tenantType;

    /*
     * The collection of domains associated with this tenant. Not nullable.
     */
    private List<MicrosoftGraphVerifiedDomain> verifiedDomains;

    /*
     * mdmAuthority
     */
    private MicrosoftGraphMdmAuthority mobileDeviceManagementAuthority;

    /*
     * Navigation property to manage certificate-based authentication configuration. Only a single instance of
     * certificateBasedAuthConfiguration can be created in the collection.
     */
    private List<MicrosoftGraphCertificateBasedAuthConfiguration> certificateBasedAuthConfiguration;

    /*
     * The collection of open extensions defined for the organization. Read-only. Nullable.
     */
    private List<MicrosoftGraphExtension> extensions;

    /*
     * The organization resource represents an instance of global settings and resources which operate and are
     * provisioned at the tenant-level.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphOrganization class.
     */
    public MicrosoftGraphOrganization() {
    }

    /**
     * Get the assignedPlans property: The collection of service plans associated with the tenant. Not nullable.
     * 
     * @return the assignedPlans value.
     */
    public List<MicrosoftGraphAssignedPlan> assignedPlans() {
        return this.assignedPlans;
    }

    /**
     * Set the assignedPlans property: The collection of service plans associated with the tenant. Not nullable.
     * 
     * @param assignedPlans the assignedPlans value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withAssignedPlans(List<MicrosoftGraphAssignedPlan> assignedPlans) {
        this.assignedPlans = assignedPlans;
        return this;
    }

    /**
     * Get the businessPhones property: Telephone number for the organization. NOTE: Although this is a string
     * collection, only one number can be set for this property.
     * 
     * @return the businessPhones value.
     */
    public List<String> businessPhones() {
        return this.businessPhones;
    }

    /**
     * Set the businessPhones property: Telephone number for the organization. NOTE: Although this is a string
     * collection, only one number can be set for this property.
     * 
     * @param businessPhones the businessPhones value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withBusinessPhones(List<String> businessPhones) {
        this.businessPhones = businessPhones;
        return this;
    }

    /**
     * Get the city property: City name of the address for the organization.
     * 
     * @return the city value.
     */
    public String city() {
        return this.city;
    }

    /**
     * Set the city property: City name of the address for the organization.
     * 
     * @param city the city value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get the country property: Country/region name of the address for the organization.
     * 
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country property: Country/region name of the address for the organization.
     * 
     * @param country the country value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get the countryLetterCode property: Country/region abbreviation for the organization.
     * 
     * @return the countryLetterCode value.
     */
    public String countryLetterCode() {
        return this.countryLetterCode;
    }

    /**
     * Set the countryLetterCode property: Country/region abbreviation for the organization.
     * 
     * @param countryLetterCode the countryLetterCode value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withCountryLetterCode(String countryLetterCode) {
        this.countryLetterCode = countryLetterCode;
        return this;
    }

    /**
     * Get the createdDateTime property: Timestamp of when the organization was created. The value cannot be modified
     * and is automatically populated when the organization is created. The Timestamp type represents date and time
     * information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look
     * like this: '2014-01-01T00:00:00Z'. Read-only.
     * 
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: Timestamp of when the organization was created. The value cannot be modified
     * and is automatically populated when the organization is created. The Timestamp type represents date and time
     * information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look
     * like this: '2014-01-01T00:00:00Z'. Read-only.
     * 
     * @param createdDateTime the createdDateTime value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the displayName property: The display name for the tenant.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name for the tenant.
     * 
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the marketingNotificationEmails property: Not nullable.
     * 
     * @return the marketingNotificationEmails value.
     */
    public List<String> marketingNotificationEmails() {
        return this.marketingNotificationEmails;
    }

    /**
     * Set the marketingNotificationEmails property: Not nullable.
     * 
     * @param marketingNotificationEmails the marketingNotificationEmails value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withMarketingNotificationEmails(List<String> marketingNotificationEmails) {
        this.marketingNotificationEmails = marketingNotificationEmails;
        return this;
    }

    /**
     * Get the onPremisesLastSyncDateTime property: The time and date at which the tenant was last synced with the
     * on-premise directory. The Timestamp type represents date and time information using ISO 8601 format and is always
     * in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     * 
     * @return the onPremisesLastSyncDateTime value.
     */
    public OffsetDateTime onPremisesLastSyncDateTime() {
        return this.onPremisesLastSyncDateTime;
    }

    /**
     * Set the onPremisesLastSyncDateTime property: The time and date at which the tenant was last synced with the
     * on-premise directory. The Timestamp type represents date and time information using ISO 8601 format and is always
     * in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     * 
     * @param onPremisesLastSyncDateTime the onPremisesLastSyncDateTime value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withOnPremisesLastSyncDateTime(OffsetDateTime onPremisesLastSyncDateTime) {
        this.onPremisesLastSyncDateTime = onPremisesLastSyncDateTime;
        return this;
    }

    /**
     * Get the onPremisesSyncEnabled property: true if this object is synced from an on-premises directory; false if
     * this object was originally synced from an on-premises directory but is no longer synced; null if this object has
     * never been synced from an on-premises directory (default).
     * 
     * @return the onPremisesSyncEnabled value.
     */
    public Boolean onPremisesSyncEnabled() {
        return this.onPremisesSyncEnabled;
    }

    /**
     * Set the onPremisesSyncEnabled property: true if this object is synced from an on-premises directory; false if
     * this object was originally synced from an on-premises directory but is no longer synced; null if this object has
     * never been synced from an on-premises directory (default).
     * 
     * @param onPremisesSyncEnabled the onPremisesSyncEnabled value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withOnPremisesSyncEnabled(Boolean onPremisesSyncEnabled) {
        this.onPremisesSyncEnabled = onPremisesSyncEnabled;
        return this;
    }

    /**
     * Get the postalCode property: Postal code of the address for the organization.
     * 
     * @return the postalCode value.
     */
    public String postalCode() {
        return this.postalCode;
    }

    /**
     * Set the postalCode property: Postal code of the address for the organization.
     * 
     * @param postalCode the postalCode value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get the preferredLanguage property: The preferred language for the organization. Should follow ISO 639-1 Code;
     * for example 'en'.
     * 
     * @return the preferredLanguage value.
     */
    public String preferredLanguage() {
        return this.preferredLanguage;
    }

    /**
     * Set the preferredLanguage property: The preferred language for the organization. Should follow ISO 639-1 Code;
     * for example 'en'.
     * 
     * @param preferredLanguage the preferredLanguage value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
        return this;
    }

    /**
     * Get the privacyProfile property: privacyProfile.
     * 
     * @return the privacyProfile value.
     */
    public MicrosoftGraphPrivacyProfile privacyProfile() {
        return this.privacyProfile;
    }

    /**
     * Set the privacyProfile property: privacyProfile.
     * 
     * @param privacyProfile the privacyProfile value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withPrivacyProfile(MicrosoftGraphPrivacyProfile privacyProfile) {
        this.privacyProfile = privacyProfile;
        return this;
    }

    /**
     * Get the provisionedPlans property: Not nullable.
     * 
     * @return the provisionedPlans value.
     */
    public List<MicrosoftGraphProvisionedPlan> provisionedPlans() {
        return this.provisionedPlans;
    }

    /**
     * Set the provisionedPlans property: Not nullable.
     * 
     * @param provisionedPlans the provisionedPlans value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withProvisionedPlans(List<MicrosoftGraphProvisionedPlan> provisionedPlans) {
        this.provisionedPlans = provisionedPlans;
        return this;
    }

    /**
     * Get the securityComplianceNotificationMails property: The securityComplianceNotificationMails property.
     * 
     * @return the securityComplianceNotificationMails value.
     */
    public List<String> securityComplianceNotificationMails() {
        return this.securityComplianceNotificationMails;
    }

    /**
     * Set the securityComplianceNotificationMails property: The securityComplianceNotificationMails property.
     * 
     * @param securityComplianceNotificationMails the securityComplianceNotificationMails value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization
        withSecurityComplianceNotificationMails(List<String> securityComplianceNotificationMails) {
        this.securityComplianceNotificationMails = securityComplianceNotificationMails;
        return this;
    }

    /**
     * Get the securityComplianceNotificationPhones property: The securityComplianceNotificationPhones property.
     * 
     * @return the securityComplianceNotificationPhones value.
     */
    public List<String> securityComplianceNotificationPhones() {
        return this.securityComplianceNotificationPhones;
    }

    /**
     * Set the securityComplianceNotificationPhones property: The securityComplianceNotificationPhones property.
     * 
     * @param securityComplianceNotificationPhones the securityComplianceNotificationPhones value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization
        withSecurityComplianceNotificationPhones(List<String> securityComplianceNotificationPhones) {
        this.securityComplianceNotificationPhones = securityComplianceNotificationPhones;
        return this;
    }

    /**
     * Get the state property: State name of the address for the organization.
     * 
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: State name of the address for the organization.
     * 
     * @param state the state value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the street property: Street name of the address for organization.
     * 
     * @return the street value.
     */
    public String street() {
        return this.street;
    }

    /**
     * Set the street property: Street name of the address for organization.
     * 
     * @param street the street value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * Get the technicalNotificationMails property: Not nullable.
     * 
     * @return the technicalNotificationMails value.
     */
    public List<String> technicalNotificationMails() {
        return this.technicalNotificationMails;
    }

    /**
     * Set the technicalNotificationMails property: Not nullable.
     * 
     * @param technicalNotificationMails the technicalNotificationMails value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withTechnicalNotificationMails(List<String> technicalNotificationMails) {
        this.technicalNotificationMails = technicalNotificationMails;
        return this;
    }

    /**
     * Get the tenantType property: The tenantType property.
     * 
     * @return the tenantType value.
     */
    public String tenantType() {
        return this.tenantType;
    }

    /**
     * Set the tenantType property: The tenantType property.
     * 
     * @param tenantType the tenantType value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withTenantType(String tenantType) {
        this.tenantType = tenantType;
        return this;
    }

    /**
     * Get the verifiedDomains property: The collection of domains associated with this tenant. Not nullable.
     * 
     * @return the verifiedDomains value.
     */
    public List<MicrosoftGraphVerifiedDomain> verifiedDomains() {
        return this.verifiedDomains;
    }

    /**
     * Set the verifiedDomains property: The collection of domains associated with this tenant. Not nullable.
     * 
     * @param verifiedDomains the verifiedDomains value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withVerifiedDomains(List<MicrosoftGraphVerifiedDomain> verifiedDomains) {
        this.verifiedDomains = verifiedDomains;
        return this;
    }

    /**
     * Get the mobileDeviceManagementAuthority property: mdmAuthority.
     * 
     * @return the mobileDeviceManagementAuthority value.
     */
    public MicrosoftGraphMdmAuthority mobileDeviceManagementAuthority() {
        return this.mobileDeviceManagementAuthority;
    }

    /**
     * Set the mobileDeviceManagementAuthority property: mdmAuthority.
     * 
     * @param mobileDeviceManagementAuthority the mobileDeviceManagementAuthority value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization
        withMobileDeviceManagementAuthority(MicrosoftGraphMdmAuthority mobileDeviceManagementAuthority) {
        this.mobileDeviceManagementAuthority = mobileDeviceManagementAuthority;
        return this;
    }

    /**
     * Get the certificateBasedAuthConfiguration property: Navigation property to manage certificate-based
     * authentication configuration. Only a single instance of certificateBasedAuthConfiguration can be created in the
     * collection.
     * 
     * @return the certificateBasedAuthConfiguration value.
     */
    public List<MicrosoftGraphCertificateBasedAuthConfiguration> certificateBasedAuthConfiguration() {
        return this.certificateBasedAuthConfiguration;
    }

    /**
     * Set the certificateBasedAuthConfiguration property: Navigation property to manage certificate-based
     * authentication configuration. Only a single instance of certificateBasedAuthConfiguration can be created in the
     * collection.
     * 
     * @param certificateBasedAuthConfiguration the certificateBasedAuthConfiguration value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withCertificateBasedAuthConfiguration(
        List<MicrosoftGraphCertificateBasedAuthConfiguration> certificateBasedAuthConfiguration) {
        this.certificateBasedAuthConfiguration = certificateBasedAuthConfiguration;
        return this;
    }

    /**
     * Get the extensions property: The collection of open extensions defined for the organization. Read-only. Nullable.
     * 
     * @return the extensions value.
     */
    public List<MicrosoftGraphExtension> extensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: The collection of open extensions defined for the organization. Read-only. Nullable.
     * 
     * @param extensions the extensions value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withExtensions(List<MicrosoftGraphExtension> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Get the additionalProperties property: The organization resource represents an instance of global settings and
     * resources which operate and are provisioned at the tenant-level.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The organization resource represents an instance of global settings and
     * resources which operate and are provisioned at the tenant-level.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphOrganization object itself.
     */
    public MicrosoftGraphOrganization withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphOrganization withDeletedDateTime(OffsetDateTime deletedDateTime) {
        super.withDeletedDateTime(deletedDateTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphOrganization withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (assignedPlans() != null) {
            assignedPlans().forEach(e -> e.validate());
        }
        if (privacyProfile() != null) {
            privacyProfile().validate();
        }
        if (provisionedPlans() != null) {
            provisionedPlans().forEach(e -> e.validate());
        }
        if (verifiedDomains() != null) {
            verifiedDomains().forEach(e -> e.validate());
        }
        if (certificateBasedAuthConfiguration() != null) {
            certificateBasedAuthConfiguration().forEach(e -> e.validate());
        }
        if (extensions() != null) {
            extensions().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeStringField("deletedDateTime",
            deletedDateTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(deletedDateTime()));
        jsonWriter.writeArrayField("assignedPlans", this.assignedPlans, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("businessPhones", this.businessPhones,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("city", this.city);
        jsonWriter.writeStringField("country", this.country);
        jsonWriter.writeStringField("countryLetterCode", this.countryLetterCode);
        jsonWriter.writeStringField("createdDateTime",
            this.createdDateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.createdDateTime));
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeArrayField("marketingNotificationEmails", this.marketingNotificationEmails,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("onPremisesLastSyncDateTime",
            this.onPremisesLastSyncDateTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.onPremisesLastSyncDateTime));
        jsonWriter.writeBooleanField("onPremisesSyncEnabled", this.onPremisesSyncEnabled);
        jsonWriter.writeStringField("postalCode", this.postalCode);
        jsonWriter.writeStringField("preferredLanguage", this.preferredLanguage);
        jsonWriter.writeJsonField("privacyProfile", this.privacyProfile);
        jsonWriter.writeArrayField("provisionedPlans", this.provisionedPlans,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("securityComplianceNotificationMails", this.securityComplianceNotificationMails,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("securityComplianceNotificationPhones", this.securityComplianceNotificationPhones,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("state", this.state);
        jsonWriter.writeStringField("street", this.street);
        jsonWriter.writeArrayField("technicalNotificationMails", this.technicalNotificationMails,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("tenantType", this.tenantType);
        jsonWriter.writeArrayField("verifiedDomains", this.verifiedDomains,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("mobileDeviceManagementAuthority",
            this.mobileDeviceManagementAuthority == null ? null : this.mobileDeviceManagementAuthority.toString());
        jsonWriter.writeArrayField("certificateBasedAuthConfiguration", this.certificateBasedAuthConfiguration,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("extensions", this.extensions, (writer, element) -> writer.writeJson(element));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphOrganization from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphOrganization if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphOrganization.
     */
    public static MicrosoftGraphOrganization fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphOrganization deserializedMicrosoftGraphOrganization = new MicrosoftGraphOrganization();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphOrganization.withId(reader.getString());
                } else if ("deletedDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphOrganization.withDeletedDateTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("assignedPlans".equals(fieldName)) {
                    List<MicrosoftGraphAssignedPlan> assignedPlans
                        = reader.readArray(reader1 -> MicrosoftGraphAssignedPlan.fromJson(reader1));
                    deserializedMicrosoftGraphOrganization.assignedPlans = assignedPlans;
                } else if ("businessPhones".equals(fieldName)) {
                    List<String> businessPhones = reader.readArray(reader1 -> reader1.getString());
                    deserializedMicrosoftGraphOrganization.businessPhones = businessPhones;
                } else if ("city".equals(fieldName)) {
                    deserializedMicrosoftGraphOrganization.city = reader.getString();
                } else if ("country".equals(fieldName)) {
                    deserializedMicrosoftGraphOrganization.country = reader.getString();
                } else if ("countryLetterCode".equals(fieldName)) {
                    deserializedMicrosoftGraphOrganization.countryLetterCode = reader.getString();
                } else if ("createdDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphOrganization.createdDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("displayName".equals(fieldName)) {
                    deserializedMicrosoftGraphOrganization.displayName = reader.getString();
                } else if ("marketingNotificationEmails".equals(fieldName)) {
                    List<String> marketingNotificationEmails = reader.readArray(reader1 -> reader1.getString());
                    deserializedMicrosoftGraphOrganization.marketingNotificationEmails = marketingNotificationEmails;
                } else if ("onPremisesLastSyncDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphOrganization.onPremisesLastSyncDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("onPremisesSyncEnabled".equals(fieldName)) {
                    deserializedMicrosoftGraphOrganization.onPremisesSyncEnabled
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("postalCode".equals(fieldName)) {
                    deserializedMicrosoftGraphOrganization.postalCode = reader.getString();
                } else if ("preferredLanguage".equals(fieldName)) {
                    deserializedMicrosoftGraphOrganization.preferredLanguage = reader.getString();
                } else if ("privacyProfile".equals(fieldName)) {
                    deserializedMicrosoftGraphOrganization.privacyProfile
                        = MicrosoftGraphPrivacyProfile.fromJson(reader);
                } else if ("provisionedPlans".equals(fieldName)) {
                    List<MicrosoftGraphProvisionedPlan> provisionedPlans
                        = reader.readArray(reader1 -> MicrosoftGraphProvisionedPlan.fromJson(reader1));
                    deserializedMicrosoftGraphOrganization.provisionedPlans = provisionedPlans;
                } else if ("securityComplianceNotificationMails".equals(fieldName)) {
                    List<String> securityComplianceNotificationMails = reader.readArray(reader1 -> reader1.getString());
                    deserializedMicrosoftGraphOrganization.securityComplianceNotificationMails
                        = securityComplianceNotificationMails;
                } else if ("securityComplianceNotificationPhones".equals(fieldName)) {
                    List<String> securityComplianceNotificationPhones
                        = reader.readArray(reader1 -> reader1.getString());
                    deserializedMicrosoftGraphOrganization.securityComplianceNotificationPhones
                        = securityComplianceNotificationPhones;
                } else if ("state".equals(fieldName)) {
                    deserializedMicrosoftGraphOrganization.state = reader.getString();
                } else if ("street".equals(fieldName)) {
                    deserializedMicrosoftGraphOrganization.street = reader.getString();
                } else if ("technicalNotificationMails".equals(fieldName)) {
                    List<String> technicalNotificationMails = reader.readArray(reader1 -> reader1.getString());
                    deserializedMicrosoftGraphOrganization.technicalNotificationMails = technicalNotificationMails;
                } else if ("tenantType".equals(fieldName)) {
                    deserializedMicrosoftGraphOrganization.tenantType = reader.getString();
                } else if ("verifiedDomains".equals(fieldName)) {
                    List<MicrosoftGraphVerifiedDomain> verifiedDomains
                        = reader.readArray(reader1 -> MicrosoftGraphVerifiedDomain.fromJson(reader1));
                    deserializedMicrosoftGraphOrganization.verifiedDomains = verifiedDomains;
                } else if ("mobileDeviceManagementAuthority".equals(fieldName)) {
                    deserializedMicrosoftGraphOrganization.mobileDeviceManagementAuthority
                        = MicrosoftGraphMdmAuthority.fromString(reader.getString());
                } else if ("certificateBasedAuthConfiguration".equals(fieldName)) {
                    List<MicrosoftGraphCertificateBasedAuthConfiguration> certificateBasedAuthConfiguration = reader
                        .readArray(reader1 -> MicrosoftGraphCertificateBasedAuthConfiguration.fromJson(reader1));
                    deserializedMicrosoftGraphOrganization.certificateBasedAuthConfiguration
                        = certificateBasedAuthConfiguration;
                } else if ("extensions".equals(fieldName)) {
                    List<MicrosoftGraphExtension> extensions
                        = reader.readArray(reader1 -> MicrosoftGraphExtension.fromJson(reader1));
                    deserializedMicrosoftGraphOrganization.extensions = extensions;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphOrganization.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphOrganization;
        });
    }
}
