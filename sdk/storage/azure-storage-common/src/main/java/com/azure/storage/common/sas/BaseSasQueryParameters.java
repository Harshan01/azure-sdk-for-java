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
 * by the user; it is only generated by the SASSignatureValues type. Once generated, it can be set on a ClientBuilder
 * object to be constructed as part of a URL or it can be encoded into a {@code String} and appended to a URL directly
 * (though caution should be taken here in case there are existing query parameters, which might affect the appropriate
 * means of appending these query parameters). NOTE: Instances of this class are immutable to ensure thread safety.
 * @deprecated Please use the generateSas method on the desired client after initializing the appropriate
 * SasSignatureValues object.
 */
@Deprecated
public abstract class BaseSasQueryParameters {
    /**
     * The Storage version.
     */
    protected String version;

    /**
     * The allowed HTTP/HTTPS protocols.
     */
    protected SasProtocol protocol;

    /**
     * The start time for the SAS's validity.
     */
    protected OffsetDateTime startTime;

    /**
     * The end time for the SAS's validity.
     */
    protected OffsetDateTime expiryTime;

    /**
     * The IP range that the SAS validates.
     */
    protected SasIpRange sasIpRange;

    /**
     * The permissions of the SAS.
     */
    protected String permissions;

    /**
     * The signature of the SAS.
     */
    protected String signature;

    /**
     * Creates a new {@link BaseSasQueryParameters} object.
     *
     * @param queryParamsMap All query parameters for the request as key-value pairs
     * @param removeSASParametersFromMap When {@code true}, the SAS query parameters will be removed from
     * queryParamsMap
     * @deprecated Please use SasSignatureValues
     */
    @Deprecated
    public BaseSasQueryParameters(Map<String, String[]> queryParamsMap, boolean removeSASParametersFromMap) {
        this.version = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SERVICE_VERSION,
            removeSASParametersFromMap);
        this.protocol = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_PROTOCOL,
            removeSASParametersFromMap, SasProtocol::parse);
        this.startTime = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_START_TIME,
            removeSASParametersFromMap, StorageImplUtils::parseDateAndFormat).getDateTime();
        this.expiryTime = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_EXPIRY_TIME,
            removeSASParametersFromMap, StorageImplUtils::parseDateAndFormat).getDateTime();
        this.sasIpRange = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_IP_RANGE,
            removeSASParametersFromMap, SasIpRange::parse);
        this.permissions = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_PERMISSIONS,
            removeSASParametersFromMap);
        this.signature = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNATURE,
            removeSASParametersFromMap);
    }

    /**
     * Helper method to get a query parameter
     *
     * @param parameters A {@code Map} of parameters to values to search.
     * @param name The name of parameter to find.
     * @param remove Whether or not to remove the parameter from the map.
     * @return A String representing the query parameter
     * @deprecated Please use SasSignatureValues
     */
    @Deprecated
    protected String getQueryParameter(Map<String, String[]> parameters, String name, boolean remove) {
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
     * @deprecated Please use SasSignatureValues
     */
    @Deprecated
    protected <T> T getQueryParameter(Map<String, String[]> parameters, String name, boolean remove, Function<String,
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
     * Creates a new {@link BaseSasQueryParameters} object. These objects are only created internally by
     * SASSignatureValues classes.
     *
     * @param version A {@code String} representing the storage version.
     * @param protocol A {@code String} representing the allowed HTTP protocol(s) or {@code null}.
     * @param startTime A {@code java.util.Date} representing the start time for this SAS token or {@code null}.
     * @param expiryTime A {@code java.util.Date} representing the expiry time for this SAS token.
     * @param sasIpRange A {@link SasIpRange} representing the range of valid IP addresses for this SAS token or
     * {@code null}.
     * @param permissions A {@code String} representing the storage permissions or {@code null}.
     * @param signature A {@code String} representing the signature for the SAS token.
     * @deprecated Please use SasSignatureValues
     */
    @Deprecated
    public BaseSasQueryParameters(String version, SasProtocol protocol, OffsetDateTime startTime,
        OffsetDateTime expiryTime, SasIpRange sasIpRange, String permissions, String signature) {
        this.version = version;
        this.protocol = protocol;
        this.startTime = startTime;
        this.expiryTime = expiryTime;
        this.sasIpRange = sasIpRange;
        this.permissions = permissions;
        this.signature = signature;
    }

    /**
     * @return The storage version
     * @deprecated Please use SasSignatureValues
     */
    @Deprecated
    public String getVersion() {
        return version;
    }

    /**
     * @return The allowed HTTP protocol(s) or {@code null}. Please refer to {@link SasProtocol} for more details.
     * @deprecated Please use SasSignatureValues
     */
    @Deprecated
    public SasProtocol getProtocol() {
        return protocol;
    }

    /**
     * @return The start time for this SAS token or {@code null}.
     * @deprecated Please use SasSignatureValues
     */
    @Deprecated
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    /**
     * @return The expiry time for this SAS token.
     * @deprecated Please use SasSignatureValues
     */
    @Deprecated
    public OffsetDateTime getExpiryTime() {
        return expiryTime;
    }

    /**
     * @return {@link SasIpRange}
     * @deprecated Please use SasSignatureValues
     */
    @Deprecated
    public SasIpRange getSasIpRange() {
        return sasIpRange;
    }

    /**
     * @return Please refer to *SASPermission classes for more details.
     * @deprecated Please use SasSignatureValues
     */
    @Deprecated
    public String getPermissions() {
        return permissions;
    }

    /**
     * @return The signature for the SAS token.
     * @deprecated Please use SasSignatureValues
     */
    @Deprecated
    public String getSignature() {
        return signature;
    }

    /**
     * Shared helper method to append a SAS query parameter.
     *
     * @param sb The {@code StringBuilder} to append to.
     * @param param The {@code String} parameter to append.
     * @param value The value of the parameter to append.
     * @deprecated Please use SasSignatureValues
     */
    @Deprecated
    protected void tryAppendQueryParameter(StringBuilder sb, String param, Object value) {
        SasImplUtils.tryAppendQueryParameter(sb, param, value);
    }

    /**
     * Formats date time SAS query parameters.
     *
     * @param dateTime The SAS date time.
     * @return A String representing the SAS date time.
     * @deprecated Please use SasSignatureValues
     */
    @Deprecated
    protected String formatQueryParameterDate(OffsetDateTime dateTime) {
        return SasImplUtils.formatQueryParameterDate(new TimeAndFormat(dateTime, null));
    }

    /**
     * Encodes all SAS query parameters into a string that can be appended to a URL.
     *
     * @return A {@code String} representing the SAS query parameters.
     * @deprecated Please use the generateSas method on the desired client after initializing the appropriate
     * SasSignatureValues object.
     */
    @Deprecated
    public abstract String encode();
}
