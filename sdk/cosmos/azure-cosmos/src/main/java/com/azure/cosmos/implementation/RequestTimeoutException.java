// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation;

import com.azure.core.http.HttpHeaders;
import com.azure.cosmos.BridgeInternal;
import com.azure.cosmos.CosmosException;

import java.net.URI;
import java.util.Map;

/**
 * The type Request timeout exception.
 */
public class RequestTimeoutException extends CosmosException {

    /**
     * Instantiates a new Request timeout exception.
     */
    public RequestTimeoutException() {
        this(RMResources.RequestTimeout, null);
    }

    /**
     * Instantiates a new Request timeout exception.
     *
     * @param cosmosError the cosmos error
     * @param lsn the lsn
     * @param partitionKeyRangeId the partition key range id
     * @param responseHeaders the response headers
     */
    public RequestTimeoutException(CosmosError cosmosError, long lsn, String partitionKeyRangeId,
                                   HttpHeaders responseHeaders) {
        super(HttpConstants.StatusCodes.REQUEST_TIMEOUT, cosmosError, responseHeaders);
        BridgeInternal.setLSN(this, lsn);
        BridgeInternal.setPartitionKeyRangeId(this, partitionKeyRangeId);
    }

    /**
     * Instantiates a new Request timeout exception.
     *
     * @param message the message
     * @param requestUri the request uri
     */
    public RequestTimeoutException(String message, URI requestUri) {
        this(message, null, null, requestUri);
    }

    /**
     * Instantiates a new Request timeout exception.
     *
     * @param message the message
     * @param headers the headers
     * @param requestUrl the request url
     */
    public RequestTimeoutException(String message, HttpHeaders headers, URI requestUrl) {
        super(message,
            null,
            headers,
            HttpConstants.StatusCodes.REQUEST_TIMEOUT,
            requestUrl != null
                ? requestUrl.toString()
                : null);
    }

    RequestTimeoutException(String message,
                            Exception innerException,
                            HttpHeaders headers,
                            URI requestUrl) {
        super(message, innerException, headers, HttpConstants.StatusCodes.REQUEST_TIMEOUT,
            requestUrl != null ? requestUrl.toString() : null);
    }

    private static String message(String localIP, String baseMessage) {
        if (!Strings.isNullOrEmpty(localIP)) {
            return String.format(
                RMResources.ExceptionMessageAddIpAddress,
                baseMessage,
                localIP);
        }

        return baseMessage;
    }
}
