// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation;

import com.azure.core.http.HttpHeaders;
import com.azure.cosmos.BridgeInternal;
import com.azure.cosmos.CosmosException;

/**
 * While this class is public, but it is not part of our published public APIs.
 * This is meant to be internally used only by our sdk.
 */
public class ConflictException extends CosmosException {

    private static final long serialVersionUID = 1L;

    ConflictException() {
        this(RMResources.EntityAlreadyExists);
    }

    /**
     * Instantiates a new Conflict exception.
     *
     * @param cosmosError the cosmos error
     * @param lsn the lsn
     * @param partitionKeyRangeId the partition key range id
     * @param responseHeaders the response headers
     */
    public ConflictException(CosmosError cosmosError, long lsn, String partitionKeyRangeId,
                             HttpHeaders responseHeaders) {
        super(HttpConstants.StatusCodes.CONFLICT, cosmosError, responseHeaders);
        BridgeInternal.setLSN(this, lsn);
        BridgeInternal.setPartitionKeyRangeId(this, partitionKeyRangeId);
    }

    ConflictException(String msg) {
        super(HttpConstants.StatusCodes.CONFLICT, msg);
    }

    /**
     * Instantiates a new Conflict exception.
     *
     * @param message the message
     * @param headers the headers
     * @param requestUriString the request uri string
     */
    public ConflictException(String message, HttpHeaders headers, String requestUriString) {
        this(message, null, headers, requestUriString);
    }

    ConflictException(String message,
                      Exception innerException,
                      HttpHeaders headers,
                      String requestUriString) {
        super(String.format("%s: %s", RMResources.EntityAlreadyExists, message),
            innerException,
            headers,
            HttpConstants.StatusCodes.CONFLICT,
            requestUriString);
    }
}
