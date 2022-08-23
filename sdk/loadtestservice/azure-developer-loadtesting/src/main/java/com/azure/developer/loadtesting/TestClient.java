// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.developer.loadtesting;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the synchronous LoadTestClient type. */
@ServiceClient(builder = TestClientBuilder.class)
public final class TestClient {

    @Generated private final TestAsyncClient client;

    /**
     * Initializes an instance of TestClient class.
     *
     * @param client the async client.
     */
    @Generated
    TestClient(TestAsyncClient client) {
        this.client = client;
    }

    /**
     * Create a new test or Update an existing test.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     testId: String (Optional)
     *     description: String (Optional)
     *     displayName: String (Optional)
     *     resourceId: String (Optional)
     *     loadTestConfig (Optional): {
     *         engineInstances: Integer (Optional)
     *         splitAllCSVs: Boolean (Optional)
     *     }
     *     passFailCriteria (Optional): {
     *         passFailMetrics (Optional): {
     *             String (Optional): {
     *                 clientmetric: String (Optional)
     *                 aggregate: String (Optional)
     *                 condition: String (Optional)
     *                 requestName: String (Optional)
     *                 value: Double (Optional)
     *                 action: String (Optional)
     *                 actualValue: Double (Optional)
     *                 result: String (Optional)
     *             }
     *         }
     *     }
     *     createdDateTime: OffsetDateTime (Optional)
     *     createdBy: String (Optional)
     *     lastModifiedDateTime: OffsetDateTime (Optional)
     *     lastModifiedBy: String (Optional)
     *     inputArtifacts (Optional): {
     *         configUrl (Optional): {
     *             url: String (Optional)
     *             fileId: String (Optional)
     *             filename: String (Optional)
     *             fileType: String(0/1/2) (Optional)
     *             expireTime: OffsetDateTime (Optional)
     *             validationStatus: String (Optional)
     *         }
     *         testScriptUrl (Optional): (recursive schema, see testScriptUrl above)
     *         userPropUrl (Optional): (recursive schema, see userPropUrl above)
     *         inputArtifactsZipFileurl (Optional): (recursive schema, see inputArtifactsZipFileurl above)
     *         additionalUrls (Optional): [
     *             (recursive schema, see above)
     *         ]
     *     }
     *     secrets (Optional): {
     *         String (Optional): {
     *             value: String (Optional)
     *             type: String (Optional)
     *         }
     *     }
     *     environmentVariables (Optional): {
     *         String: String (Optional)
     *     }
     *     subnetId: String (Optional)
     *     keyvaultReferenceIdentityType: String (Optional)
     *     keyvaultReferenceIdentityId: String (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     testId: String (Optional)
     *     description: String (Optional)
     *     displayName: String (Optional)
     *     resourceId: String (Optional)
     *     loadTestConfig (Optional): {
     *         engineInstances: Integer (Optional)
     *         splitAllCSVs: Boolean (Optional)
     *     }
     *     passFailCriteria (Optional): {
     *         passFailMetrics (Optional): {
     *             String (Optional): {
     *                 clientmetric: String (Optional)
     *                 aggregate: String (Optional)
     *                 condition: String (Optional)
     *                 requestName: String (Optional)
     *                 value: Double (Optional)
     *                 action: String (Optional)
     *                 actualValue: Double (Optional)
     *                 result: String (Optional)
     *             }
     *         }
     *     }
     *     createdDateTime: OffsetDateTime (Optional)
     *     createdBy: String (Optional)
     *     lastModifiedDateTime: OffsetDateTime (Optional)
     *     lastModifiedBy: String (Optional)
     *     inputArtifacts (Optional): {
     *         configUrl (Optional): {
     *             url: String (Optional)
     *             fileId: String (Optional)
     *             filename: String (Optional)
     *             fileType: String(0/1/2) (Optional)
     *             expireTime: OffsetDateTime (Optional)
     *             validationStatus: String (Optional)
     *         }
     *         testScriptUrl (Optional): (recursive schema, see testScriptUrl above)
     *         userPropUrl (Optional): (recursive schema, see userPropUrl above)
     *         inputArtifactsZipFileurl (Optional): (recursive schema, see inputArtifactsZipFileurl above)
     *         additionalUrls (Optional): [
     *             (recursive schema, see above)
     *         ]
     *     }
     *     secrets (Optional): {
     *         String (Optional): {
     *             value: String (Optional)
     *             type: String (Optional)
     *         }
     *     }
     *     environmentVariables (Optional): {
     *         String: String (Optional)
     *     }
     *     subnetId: String (Optional)
     *     keyvaultReferenceIdentityType: String (Optional)
     *     keyvaultReferenceIdentityId: String (Optional)
     * }
     * }</pre>
     *
     * @param testId Unique name for load test, must be a valid URL character ^[a-z0-9_-]*$.
     * @param body Load test model.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return load test model along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateTestWithResponse(
            String testId, BinaryData body, RequestOptions requestOptions) {
        return this.client.createOrUpdateTestWithResponse(testId, body, requestOptions).block();
    }

    /**
     * Delete a test by its name.
     *
     * @param testId Unique name for load test, must be a valid URL character ^[a-z0-9_-]*$.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteLoadTestWithResponse(String testId, RequestOptions requestOptions) {
        return this.client.deleteLoadTestWithResponse(testId, requestOptions).block();
    }

    /**
     * Get load test details by test name.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     testId: String (Optional)
     *     description: String (Optional)
     *     displayName: String (Optional)
     *     resourceId: String (Optional)
     *     loadTestConfig (Optional): {
     *         engineInstances: Integer (Optional)
     *         splitAllCSVs: Boolean (Optional)
     *     }
     *     passFailCriteria (Optional): {
     *         passFailMetrics (Optional): {
     *             String (Optional): {
     *                 clientmetric: String (Optional)
     *                 aggregate: String (Optional)
     *                 condition: String (Optional)
     *                 requestName: String (Optional)
     *                 value: Double (Optional)
     *                 action: String (Optional)
     *                 actualValue: Double (Optional)
     *                 result: String (Optional)
     *             }
     *         }
     *     }
     *     createdDateTime: OffsetDateTime (Optional)
     *     createdBy: String (Optional)
     *     lastModifiedDateTime: OffsetDateTime (Optional)
     *     lastModifiedBy: String (Optional)
     *     inputArtifacts (Optional): {
     *         configUrl (Optional): {
     *             url: String (Optional)
     *             fileId: String (Optional)
     *             filename: String (Optional)
     *             fileType: String(0/1/2) (Optional)
     *             expireTime: OffsetDateTime (Optional)
     *             validationStatus: String (Optional)
     *         }
     *         testScriptUrl (Optional): (recursive schema, see testScriptUrl above)
     *         userPropUrl (Optional): (recursive schema, see userPropUrl above)
     *         inputArtifactsZipFileurl (Optional): (recursive schema, see inputArtifactsZipFileurl above)
     *         additionalUrls (Optional): [
     *             (recursive schema, see above)
     *         ]
     *     }
     *     secrets (Optional): {
     *         String (Optional): {
     *             value: String (Optional)
     *             type: String (Optional)
     *         }
     *     }
     *     environmentVariables (Optional): {
     *         String: String (Optional)
     *     }
     *     subnetId: String (Optional)
     *     keyvaultReferenceIdentityType: String (Optional)
     *     keyvaultReferenceIdentityId: String (Optional)
     * }
     * }</pre>
     *
     * @param testId Unique name for load test, must be a valid URL character ^[a-z0-9_-]*$.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return load test details by test name along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getLoadTestWithResponse(String testId, RequestOptions requestOptions) {
        return this.client.getLoadTestWithResponse(testId, requestOptions).block();
    }

    /**
     * Get all load tests by the fully qualified resource Id e.g
     * subscriptions/{subId}/resourceGroups/{rg}/providers/Microsoft.LoadTestService/loadtests/{resName}.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>orderBy</td><td>String</td><td>No</td><td>Sort on one of the field - lastModifiedDateTime, displayName, createdBy in (field asc/desc) format. eg: displayName asc.</td></tr>
     *     <tr><td>search</td><td>String</td><td>No</td><td>Filter search based on searchable fields - testId, createdBy.</td></tr>
     *     <tr><td>lastUpdatedStartTime</td><td>OffsetDateTime</td><td>No</td><td>Start DateTime(ISO 8601 literal format) of the last updated time range to filter tests.</td></tr>
     *     <tr><td>lastUpdatedEndTime</td><td>OffsetDateTime</td><td>No</td><td>End DateTime(ISO 8601 literal format) of the last updated time range to filter tests.</td></tr>
     *     <tr><td>continuationToken</td><td>String</td><td>No</td><td>Continuation token to get the next page of response.</td></tr>
     *     <tr><td>maxPageSize</td><td>Integer</td><td>No</td><td>Number of results in response.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value (Required): [
     *          (Required){
     *             testId: String (Optional)
     *             description: String (Optional)
     *             displayName: String (Optional)
     *             resourceId: String (Optional)
     *             loadTestConfig (Optional): {
     *                 engineInstances: Integer (Optional)
     *                 splitAllCSVs: Boolean (Optional)
     *             }
     *             passFailCriteria (Optional): {
     *                 passFailMetrics (Optional): {
     *                     String (Optional): {
     *                         clientmetric: String (Optional)
     *                         aggregate: String (Optional)
     *                         condition: String (Optional)
     *                         requestName: String (Optional)
     *                         value: Double (Optional)
     *                         action: String (Optional)
     *                         actualValue: Double (Optional)
     *                         result: String (Optional)
     *                     }
     *                 }
     *             }
     *             createdDateTime: OffsetDateTime (Optional)
     *             createdBy: String (Optional)
     *             lastModifiedDateTime: OffsetDateTime (Optional)
     *             lastModifiedBy: String (Optional)
     *             inputArtifacts (Optional): {
     *                 configUrl (Optional): {
     *                     url: String (Optional)
     *                     fileId: String (Optional)
     *                     filename: String (Optional)
     *                     fileType: String(0/1/2) (Optional)
     *                     expireTime: OffsetDateTime (Optional)
     *                     validationStatus: String (Optional)
     *                 }
     *                 testScriptUrl (Optional): (recursive schema, see testScriptUrl above)
     *                 userPropUrl (Optional): (recursive schema, see userPropUrl above)
     *                 inputArtifactsZipFileurl (Optional): (recursive schema, see inputArtifactsZipFileurl above)
     *                 additionalUrls (Optional): [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *             secrets (Optional): {
     *                 String (Optional): {
     *                     value: String (Optional)
     *                     type: String (Optional)
     *                 }
     *             }
     *             environmentVariables (Optional): {
     *                 String: String (Optional)
     *             }
     *             subnetId: String (Optional)
     *             keyvaultReferenceIdentityType: String (Optional)
     *             keyvaultReferenceIdentityId: String (Optional)
     *         }
     *     ]
     *     nextLink: String (Optional)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return all load tests by the fully qualified resource Id e.g
     *     subscriptions/{subId}/resourceGroups/{rg}/providers/Microsoft.LoadTestService/loadtests/{resName} along with
     *     {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> listLoadTestSearchWithResponse(RequestOptions requestOptions) {
        return this.client.listLoadTestSearchWithResponse(requestOptions).block();
    }

    /**
     * Upload input file for a given test name. File size can't be more than 50 MB. Existing file with same name for the
     * given test will be overwritten. File should be provided in the request body as multipart/form-data.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>fileType</td><td>Integer</td><td>No</td><td>Integer representation of the file type (0 = JMX_FILE, 1 = USER_PROPERTIES, 2 = ADDITIONAL_ARTIFACTS).</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * BinaryData
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     url: String (Optional)
     *     fileId: String (Optional)
     *     filename: String (Optional)
     *     fileType: String(0/1/2) (Optional)
     *     expireTime: OffsetDateTime (Optional)
     *     validationStatus: String (Optional)
     * }
     * }</pre>
     *
     * @param testId Unique name for load test, must be a valid URL character ^[a-z0-9_-]*$.
     * @param fileId Unique identifier for test file, must be a valid URL character ^[a-z0-9_-]*$.
     * @param file The file to be uploaded.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return fileUrl Model along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> uploadTestFileWithResponse(
            String testId, String fileId, BinaryData file, RequestOptions requestOptions) {
        return this.client.uploadTestFileWithResponse(testId, fileId, file, requestOptions).block();
    }

    /**
     * Get test file by the file name.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     url: String (Optional)
     *     fileId: String (Optional)
     *     filename: String (Optional)
     *     fileType: String(0/1/2) (Optional)
     *     expireTime: OffsetDateTime (Optional)
     *     validationStatus: String (Optional)
     * }
     * }</pre>
     *
     * @param testId Unique name for load test, must be a valid URL character ^[a-z0-9_-]*$.
     * @param fileId Unique identifier for test file, must be a valid URL character ^[a-z0-9_-]*$.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return test file by the file name along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getTestFileWithResponse(String testId, String fileId, RequestOptions requestOptions) {
        return this.client.getTestFileWithResponse(testId, fileId, requestOptions).block();
    }

    /**
     * Delete file by the file name for a test.
     *
     * @param testId Unique name for load test, must be a valid URL character ^[a-z0-9_-]*$.
     * @param fileId Unique identifier for test file, must be a valid URL character ^[a-z0-9_-]*$.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteTestFileWithResponse(String testId, String fileId, RequestOptions requestOptions) {
        return this.client.deleteTestFileWithResponse(testId, fileId, requestOptions).block();
    }

    /**
     * Get all test files.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>continuationToken</td><td>String</td><td>No</td><td>Continuation token to get the next page of response.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value (Required): [
     *          (Required){
     *             url: String (Optional)
     *             fileId: String (Optional)
     *             filename: String (Optional)
     *             fileType: String(0/1/2) (Optional)
     *             expireTime: OffsetDateTime (Optional)
     *             validationStatus: String (Optional)
     *         }
     *     ]
     *     nextLink: String (Optional)
     * }
     * }</pre>
     *
     * @param testId Unique name for load test, must be a valid URL character ^[a-z0-9_-]*$.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return all test files along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getAllTestFilesWithResponse(String testId, RequestOptions requestOptions) {
        return this.client.getAllTestFilesWithResponse(testId, requestOptions).block();
    }
}
