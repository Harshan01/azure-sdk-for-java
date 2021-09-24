// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 * The UserBase model.
 */
@Fluent
public class UserBase {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(UserBase.class);

    /*
     * This must be specified if you are using a federated domain for the
     * user's userPrincipalName (UPN) property when creating a new user
     * account. It is used to associate an on-premises Active Directory user
     * account with their Azure AD user object.
     */
    @JsonProperty(value = "immutableId")
    private String immutableId;

    /*
     * A two letter country code (ISO standard 3166). Required for users that
     * will be assigned licenses due to legal requirement to check for
     * availability of services in countries. Examples include: "US", "JP", and
     * "GB".
     */
    @JsonProperty(value = "usageLocation")
    private String usageLocation;

    /*
     * The given name for the user.
     */
    @JsonProperty(value = "givenName")
    private String givenName;

    /*
     * The user's surname (family name or last name).
     */
    @JsonProperty(value = "surname")
    private String surname;

    /*
     * A string value that can be used to classify user types in your
     * directory, such as 'Member' and 'Guest'.
     */
    @JsonProperty(value = "userType")
    private UserType userType;

    /*
     * Dictionary of <AnyObject>
     */
    @JsonIgnore
    private Map<String, Object> additionalProperties;

    /**
     * Get the immutableId property: This must be specified if you are using a
     * federated domain for the user's userPrincipalName (UPN) property when
     * creating a new user account. It is used to associate an on-premises
     * Active Directory user account with their Azure AD user object.
     * 
     * @return the immutableId value.
     */
    public String immutableId() {
        return this.immutableId;
    }

    /**
     * Set the immutableId property: This must be specified if you are using a
     * federated domain for the user's userPrincipalName (UPN) property when
     * creating a new user account. It is used to associate an on-premises
     * Active Directory user account with their Azure AD user object.
     * 
     * @param immutableId the immutableId value to set.
     * @return the UserBase object itself.
     */
    public UserBase withImmutableId(String immutableId) {
        this.immutableId = immutableId;
        return this;
    }

    /**
     * Get the usageLocation property: A two letter country code (ISO standard
     * 3166). Required for users that will be assigned licenses due to legal
     * requirement to check for availability of services in countries. Examples
     * include: "US", "JP", and "GB".
     * 
     * @return the usageLocation value.
     */
    public String usageLocation() {
        return this.usageLocation;
    }

    /**
     * Set the usageLocation property: A two letter country code (ISO standard
     * 3166). Required for users that will be assigned licenses due to legal
     * requirement to check for availability of services in countries. Examples
     * include: "US", "JP", and "GB".
     * 
     * @param usageLocation the usageLocation value to set.
     * @return the UserBase object itself.
     */
    public UserBase withUsageLocation(String usageLocation) {
        this.usageLocation = usageLocation;
        return this;
    }

    /**
     * Get the givenName property: The given name for the user.
     * 
     * @return the givenName value.
     */
    public String givenName() {
        return this.givenName;
    }

    /**
     * Set the givenName property: The given name for the user.
     * 
     * @param givenName the givenName value to set.
     * @return the UserBase object itself.
     */
    public UserBase withGivenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

    /**
     * Get the surname property: The user's surname (family name or last name).
     * 
     * @return the surname value.
     */
    public String surname() {
        return this.surname;
    }

    /**
     * Set the surname property: The user's surname (family name or last name).
     * 
     * @param surname the surname value to set.
     * @return the UserBase object itself.
     */
    public UserBase withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    /**
     * Get the userType property: A string value that can be used to classify
     * user types in your directory, such as 'Member' and 'Guest'.
     * 
     * @return the userType value.
     */
    public UserType userType() {
        return this.userType;
    }

    /**
     * Set the userType property: A string value that can be used to classify
     * user types in your directory, such as 'Member' and 'Guest'.
     * 
     * @param userType the userType value to set.
     * @return the UserBase object itself.
     */
    public UserBase withUserType(UserType userType) {
        this.userType = userType;
        return this;
    }

    /**
     * Get the additionalProperties property: Dictionary of &lt;AnyObject&gt;.
     * 
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dictionary of &lt;AnyObject&gt;.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the UserBase object itself.
     */
    public UserBase withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
