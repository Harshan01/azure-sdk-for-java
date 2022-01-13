// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpResponse;

/** Exception thrown for an invalid response with GraphError information. */
public final class GraphErrorException extends HttpResponseException {
    /**
     * Initializes a new instance of the GraphErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public GraphErrorException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the GraphErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public GraphErrorException(String message, HttpResponse response, GraphError value) {
        super(message, response, value);
    }

    @Override
    public GraphError getValue() {
        return (GraphError) super.getValue();
    }
}
