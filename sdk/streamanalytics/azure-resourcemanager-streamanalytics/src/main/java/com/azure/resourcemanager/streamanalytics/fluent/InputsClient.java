// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.streamanalytics.fluent.models.InputInner;
import com.azure.resourcemanager.streamanalytics.fluent.models.ResourceTestStatusInner;
import com.azure.resourcemanager.streamanalytics.models.InputsCreateOrReplaceResponse;
import com.azure.resourcemanager.streamanalytics.models.InputsGetResponse;
import com.azure.resourcemanager.streamanalytics.models.InputsUpdateResponse;

/** An instance of this class provides access to all the operations defined in InputsClient. */
public interface InputsClient {
    /**
     * Creates an input or replaces an already existing input under an existing streaming job.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param inputName The name of the input.
     * @param input The definition of the input that will be used to create a new input or replace the existing one
     *     under the streaming job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an input object, containing all information associated with the named input.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InputInner createOrReplace(String resourceGroupName, String jobName, String inputName, InputInner input);

    /**
     * Creates an input or replaces an already existing input under an existing streaming job.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param inputName The name of the input.
     * @param input The definition of the input that will be used to create a new input or replace the existing one
     *     under the streaming job.
     * @param ifMatch The ETag of the input. Omit this value to always overwrite the current input. Specify the
     *     last-seen ETag value to prevent accidentally overwriting concurrent changes.
     * @param ifNoneMatch Set to '*' to allow a new input to be created, but to prevent updating an existing input.
     *     Other values will result in a 412 Pre-condition Failed response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an input object, containing all information associated with the named input.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InputsCreateOrReplaceResponse createOrReplaceWithResponse(
        String resourceGroupName,
        String jobName,
        String inputName,
        InputInner input,
        String ifMatch,
        String ifNoneMatch,
        Context context);

    /**
     * Updates an existing input under an existing streaming job. This can be used to partially update (ie. update one
     * or two properties) an input without affecting the rest the job or input definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param inputName The name of the input.
     * @param input An Input object. The properties specified here will overwrite the corresponding properties in the
     *     existing input (ie. Those properties will be updated). Any properties that are set to null here will mean
     *     that the corresponding property in the existing input will remain the same and not change as a result of this
     *     PATCH operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an input object, containing all information associated with the named input.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InputInner update(String resourceGroupName, String jobName, String inputName, InputInner input);

    /**
     * Updates an existing input under an existing streaming job. This can be used to partially update (ie. update one
     * or two properties) an input without affecting the rest the job or input definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param inputName The name of the input.
     * @param input An Input object. The properties specified here will overwrite the corresponding properties in the
     *     existing input (ie. Those properties will be updated). Any properties that are set to null here will mean
     *     that the corresponding property in the existing input will remain the same and not change as a result of this
     *     PATCH operation.
     * @param ifMatch The ETag of the input. Omit this value to always overwrite the current input. Specify the
     *     last-seen ETag value to prevent accidentally overwriting concurrent changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an input object, containing all information associated with the named input.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InputsUpdateResponse updateWithResponse(
        String resourceGroupName, String jobName, String inputName, InputInner input, String ifMatch, Context context);

    /**
     * Deletes an input from the streaming job.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param inputName The name of the input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String jobName, String inputName);

    /**
     * Deletes an input from the streaming job.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param inputName The name of the input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String jobName, String inputName, Context context);

    /**
     * Gets details about the specified input.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param inputName The name of the input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified input.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InputInner get(String resourceGroupName, String jobName, String inputName);

    /**
     * Gets details about the specified input.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param inputName The name of the input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified input.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InputsGetResponse getWithResponse(String resourceGroupName, String jobName, String inputName, Context context);

    /**
     * Lists all of the inputs under the specified streaming job.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object containing a list of inputs under a streaming job.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<InputInner> listByStreamingJob(String resourceGroupName, String jobName);

    /**
     * Lists all of the inputs under the specified streaming job.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param select The $select OData query parameter. This is a comma-separated list of structural properties to
     *     include in the response, or "*" to include all properties. By default, all properties are returned except
     *     diagnostics. Currently only accepts '*' as a valid value.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object containing a list of inputs under a streaming job.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<InputInner> listByStreamingJob(
        String resourceGroupName, String jobName, String select, Context context);

    /**
     * Tests whether an input’s datasource is reachable and usable by the Azure Stream Analytics service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param inputName The name of the input.
     * @param input If the input specified does not already exist, this parameter must contain the full input definition
     *     intended to be tested. If the input specified already exists, this parameter can be left null to test the
     *     existing input as is or if specified, the properties specified will overwrite the corresponding properties in
     *     the existing input (exactly like a PATCH operation) and the resulting input will be tested.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the status of the test operation along with error information, if applicable.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ResourceTestStatusInner>, ResourceTestStatusInner> beginTest(
        String resourceGroupName, String jobName, String inputName, InputInner input);

    /**
     * Tests whether an input’s datasource is reachable and usable by the Azure Stream Analytics service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param inputName The name of the input.
     * @param input If the input specified does not already exist, this parameter must contain the full input definition
     *     intended to be tested. If the input specified already exists, this parameter can be left null to test the
     *     existing input as is or if specified, the properties specified will overwrite the corresponding properties in
     *     the existing input (exactly like a PATCH operation) and the resulting input will be tested.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the status of the test operation along with error information, if applicable.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ResourceTestStatusInner>, ResourceTestStatusInner> beginTest(
        String resourceGroupName, String jobName, String inputName, InputInner input, Context context);

    /**
     * Tests whether an input’s datasource is reachable and usable by the Azure Stream Analytics service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param inputName The name of the input.
     * @param input If the input specified does not already exist, this parameter must contain the full input definition
     *     intended to be tested. If the input specified already exists, this parameter can be left null to test the
     *     existing input as is or if specified, the properties specified will overwrite the corresponding properties in
     *     the existing input (exactly like a PATCH operation) and the resulting input will be tested.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the status of the test operation along with error information, if applicable.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourceTestStatusInner test(String resourceGroupName, String jobName, String inputName, InputInner input);

    /**
     * Tests whether an input’s datasource is reachable and usable by the Azure Stream Analytics service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param inputName The name of the input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the status of the test operation along with error information, if applicable.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourceTestStatusInner test(String resourceGroupName, String jobName, String inputName);

    /**
     * Tests whether an input’s datasource is reachable and usable by the Azure Stream Analytics service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param inputName The name of the input.
     * @param input If the input specified does not already exist, this parameter must contain the full input definition
     *     intended to be tested. If the input specified already exists, this parameter can be left null to test the
     *     existing input as is or if specified, the properties specified will overwrite the corresponding properties in
     *     the existing input (exactly like a PATCH operation) and the resulting input will be tested.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the status of the test operation along with error information, if applicable.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourceTestStatusInner test(
        String resourceGroupName, String jobName, String inputName, InputInner input, Context context);
}
