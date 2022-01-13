// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.common.sas;

import com.azure.storage.common.implementation.Constants;
import com.azure.storage.common.implementation.SasImplUtils;
import com.azure.storage.common.implementation.TimeAndFormat;
import com.azure.storage.common.implementation.StorageImplUtils;

import java.time.OffsetDateTime;
import java.util.Map;
import java.util.function.Function;

/**
 * Represents the components that make up an Azure Storage SAS' query parameters. This type is not constructed directly
 * by the user; it is only generated by the URLParts type. NOTE: Instances of this class are immutable to ensure thread
 * safety.
 */
public class CommonSasQueryParameters {

    private final String version;

    private final SasProtocol protocol;

    private final TimeAndFormat startTime;

    private final TimeAndFormat expiryTime;

    private final SasIpRange sasIpRange;

    private final String permissions;

    private final String signature;

    private final String services;

    private final String resourceTypes;

    private final String identifier;

    private final String keyObjectId;

    private final String keyTenantId;

    private final TimeAndFormat keyStart;

    private final TimeAndFormat keyExpiry;

    private final String keyService;

    private final String keyVersion;

    private final String resource;

    private final String cacheControl;

    private final String contentDisposition;

    private final String contentEncoding;

    private final String contentLanguage;

    private final String contentType;

    private final Integer directoryDepth;

    private final String authorizedObjectId;

    private final String unauthorizedObjectId;

    private final String correlationId;

    private final String encryptionScope;

    /**
     * Creates a new {@link CommonSasQueryParameters} object.
     *
     * @param queryParamsMap All query parameters for the request as key-value pairs
     * @param removeSasParametersFromMap When {@code true}, the SAS query parameters will be removed from
     * queryParamsMap
     */
    public CommonSasQueryParameters(Map<String, String[]> queryParamsMap, boolean removeSasParametersFromMap) {
        this.version = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SERVICE_VERSION,
            removeSasParametersFromMap);
        this.protocol = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_PROTOCOL,
            removeSasParametersFromMap, SasProtocol::parse);
        this.startTime = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_START_TIME,
            removeSasParametersFromMap, StorageImplUtils::parseDateAndFormat);
        this.expiryTime = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_EXPIRY_TIME,
            removeSasParametersFromMap, StorageImplUtils::parseDateAndFormat);
        this.sasIpRange = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_IP_RANGE,
            removeSasParametersFromMap, SasIpRange::parse);
        this.permissions = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_PERMISSIONS,
            removeSasParametersFromMap);
        this.signature = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNATURE,
            removeSasParametersFromMap);
        this.resourceTypes = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_RESOURCES_TYPES,
            removeSasParametersFromMap);
        this.services = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SERVICES,
            removeSasParametersFromMap);
        this.identifier = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_IDENTIFIER,
            removeSasParametersFromMap);
        this.keyObjectId = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_OBJECT_ID,
            removeSasParametersFromMap);
        this.keyTenantId = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_TENANT_ID,
            removeSasParametersFromMap);
        this.keyStart = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_KEY_START,
            removeSasParametersFromMap, StorageImplUtils::parseDateAndFormat);
        this.keyExpiry = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_KEY_EXPIRY,
            removeSasParametersFromMap, StorageImplUtils::parseDateAndFormat);
        this.keyService = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_KEY_SERVICE,
            removeSasParametersFromMap);
        this.keyVersion = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_KEY_VERSION,
            removeSasParametersFromMap);
        this.resource = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_RESOURCE,
            removeSasParametersFromMap);
        this.cacheControl = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_CACHE_CONTROL,
            removeSasParametersFromMap);
        this.contentDisposition = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_CONTENT_DISPOSITION,
            removeSasParametersFromMap);
        this.contentEncoding = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_CONTENT_ENCODING,
            removeSasParametersFromMap);
        this.contentLanguage = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_CONTENT_LANGUAGE,
            removeSasParametersFromMap);
        this.contentType = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_CONTENT_TYPE,
            removeSasParametersFromMap);
        this.authorizedObjectId = getQueryParameter(queryParamsMap,
            Constants.UrlConstants.SAS_PREAUTHORIZED_AGENT_OBJECT_ID, removeSasParametersFromMap);
        this.unauthorizedObjectId = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_AGENT_OBJECT_ID,
            removeSasParametersFromMap);
        this.correlationId = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_CORRELATION_ID,
            removeSasParametersFromMap);
        this.directoryDepth = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_DIRECTORY_DEPTH,
            removeSasParametersFromMap, Integer::parseInt);
        this.encryptionScope = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_ENCRYPTION_SCOPE,
            removeSasParametersFromMap);
    }

    /**
     * Helper method to get a query parameter
     *
     * @param parameters A {@code Map} of parameters to values to search.
     * @param name The name of parameter to find.
     * @param remove Whether or not to remove the parameter from the map.
     * @return A String representing the query parameter
     */
    private String getQueryParameter(Map<String, String[]> parameters, String name, boolean remove) {
        return getQueryParameter(parameters, name, remove, value -> value);
    }

    /**
     * Helper method to get a query parameter
     *
     * @param <T> The object type.
     * @param parameters A {@code Map} of parameters to values to search.
     * @param name The name of parameter to find.
     * @param remove Whether or not to remove the parameter from the map.
     * @param converter Function that transforms the value to a String.
     * @return The object
     */
    private <T> T getQueryParameter(Map<String, String[]> parameters, String name, boolean remove, Function<String,
        T> converter) {
        String[] parameterValue = parameters.get(name);
        if (parameterValue == null) {
            return null;
        }

        if (remove) {
            parameters.remove(name);
        }

        return converter.apply(parameterValue[0]);
    }

    /**
     * Encodes all SAS query parameters into a string that can be appended to a URL.
     *
     * @return A {@code String} representing the SAS query parameters.
     */
    public String encode() {
        /*
         We should be url-encoding each key and each value, but because we know all the keys and values will encode to
         themselves, we cheat except for the signature value.
         */
        StringBuilder sb = new StringBuilder();

        // Common
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SERVICE_VERSION, this.version);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_PROTOCOL, this.protocol);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_START_TIME,
            SasImplUtils.formatQueryParameterDate(this.startTime));
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_EXPIRY_TIME,
            SasImplUtils.formatQueryParameterDate(this.expiryTime));
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_IP_RANGE, this.sasIpRange);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_PERMISSIONS, this.permissions);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNATURE, this.signature);

        // Account
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SERVICES, this.services);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_RESOURCES_TYPES, this.resourceTypes);

        // Services
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_IDENTIFIER, this.identifier);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_OBJECT_ID, this.keyObjectId);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_TENANT_ID, this.keyTenantId);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_KEY_START,
            SasImplUtils.formatQueryParameterDate(this.keyStart));
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_KEY_EXPIRY,
            SasImplUtils.formatQueryParameterDate(this.keyExpiry));
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_KEY_SERVICE, this.keyService);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_KEY_VERSION, this.keyVersion);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_RESOURCE, this.resource);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CACHE_CONTROL, this.cacheControl);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CONTENT_DISPOSITION,
            this.contentDisposition);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CONTENT_ENCODING, this.contentEncoding);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CONTENT_LANGUAGE, this.contentLanguage);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CONTENT_TYPE, this.contentType);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_PREAUTHORIZED_AGENT_OBJECT_ID,
            this.authorizedObjectId);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_AGENT_OBJECT_ID,
            this.unauthorizedObjectId);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CORRELATION_ID, this.correlationId);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_DIRECTORY_DEPTH, this.directoryDepth);
        SasImplUtils.tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_ENCRYPTION_SCOPE, this.encryptionScope);

        return sb.toString();
    }

    /**
     * @return The signed identifier. Please see <a href="https://docs.microsoft.com/rest/api/storageservices/establishing-a-stored-access-policy">here</a>
     * for more information.
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * @return The storage resource.
     */
    public String getResource() {
        return resource;
    }

    /**
     * @return The Cache-Control header value when a client accesses the resource with this sas token.
     */
    public String getCacheControl() {
        return cacheControl;
    }

    /**
     * @return The Content-Disposition header value when a client accesses the resource with this sas token.
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /**
     * @return The Content-Encoding header value when a client accesses the resource with this sas token.
     */
    public String getContentEncoding() {
        return contentEncoding;
    }

    /**
     * @return The Content-Language header value when a client accesses the resource with this sas token.
     */
    public String getContentLanguage() {
        return contentLanguage;
    }

    /**
     * @return The Content-Type header value when a client accesses the resource with this sas token.
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * @return the object ID of the key.
     */
    public String getKeyObjectId() {
        return keyObjectId;
    }

    /**
     * @return the tenant ID of the key.
     */
    public String getKeyTenantId() {
        return keyTenantId;
    }

    /**
     * @return the datetime when the key becomes active.
     */
    public OffsetDateTime getKeyStart() {
        return keyStart.getDateTime();
    }

    /**
     * @return the datetime when the key expires.
     */
    public OffsetDateTime getKeyExpiry() {
        return keyExpiry.getDateTime();
    }

    /**
     * @return the services that are permitted by the key.
     */
    public String getKeyService() {
        return keyService;
    }

    /**
     * @return the service version that created the key.
     */
    public String getKeyVersion() {
        return keyVersion;
    }

    /**
     * @return The storage services being accessed (only for Account SAS). Please refer to {@link AccountSasService} for
     * more details.
     */
    public String getServices() {
        return services;
    }

    /**
     * @return The storage resource types being accessed (only for Account SAS). Please refer to {@link
     * AccountSasResourceType} for more details.
     */
    public String getResourceTypes() {
        return resourceTypes;
    }

    /**
     * @return The storage version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @return The allowed HTTP protocol(s) or {@code null}. Please refer to {@link SasProtocol} for more details.
     */
    public SasProtocol getProtocol() {
        return protocol;
    }

    /**
     * @return The start time for this SAS token or {@code null}.
     */
    public OffsetDateTime getStartTime() {
        return startTime.getDateTime();
    }

    /**
     * @return The expiry time for this SAS token.
     */
    public OffsetDateTime getExpiryTime() {
        return expiryTime.getDateTime();
    }

    /**
     * @return {@link SasIpRange}
     */
    public SasIpRange getSasIpRange() {
        return sasIpRange;
    }

    /**
     * @return Please refer to *SASPermission classes for more details.
     */
    public String getPermissions() {
        return permissions;
    }

    /**
     * @return The signature for the SAS token.
     */
    public String getSignature() {
        return signature;
    }

    /**
     * @return The directory depth of the resource this SAS token authorizes.
     */
    public Integer getDirectoryDepth() {
        return directoryDepth;
    }

    /**
     * @return The AAD object ID of a user assumed to be authorized by the owner of the user delegation key to perform
     * the action granted by the SAS token. The service will validate the SAS token and ensure that the owner of the
     * user delegation key has the required permissions before granting access but no additional permission check for
     * the agent object id will be performed.
     */
    public String getPreauthorizedAgentObjectId() {
        return authorizedObjectId;
    }

    /**
     * @return The AAD object ID of a user assumed to be unauthorized by the owner of the user delegation key to
     * perform the action granted by the SAS token. The service will validate the SAS token and ensure that the owner
     * of the user delegation key has the required permissions before granting access and the service will perform an
     * additional POSIX ACL check to determine if this user is authorized to perform the requested operation.
     */
    public String getAgentObjectId() {
        return unauthorizedObjectId;
    }

    /**
     * @return The correlation id to correlate the storage audit logs with the audit logs used by the principal
     * generating and distributing the SAS.
     */
    public String getCorrelationId() {
        return correlationId;
    }

    /**
     * @return An encryption scope that will be applied to any write operations performed with the sas.
     */
    public String getEncryptionScope() {
        return encryptionScope;
    }
}
