/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in DatabaseAutomaticTunings.
 */
public class DatabaseAutomaticTuningsInner {
    /** The Retrofit service to perform REST calls. */
    private DatabaseAutomaticTuningsService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of DatabaseAutomaticTuningsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DatabaseAutomaticTuningsInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(DatabaseAutomaticTuningsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for DatabaseAutomaticTunings to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DatabaseAutomaticTuningsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2015_05_01_preview.DatabaseAutomaticTunings get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/automaticTuning/current")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2015_05_01_preview.DatabaseAutomaticTunings update" })
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/automaticTuning/current")
        Observable<Response<ResponseBody>> update(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Path("subscriptionId") String subscriptionId, @Body DatabaseAutomaticTuningInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a database's automatic tuning.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DatabaseAutomaticTuningInner object if successful.
     */
    public DatabaseAutomaticTuningInner get(String resourceGroupName, String serverName, String databaseName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, databaseName).toBlocking().single().body();
    }

    /**
     * Gets a database's automatic tuning.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DatabaseAutomaticTuningInner> getAsync(String resourceGroupName, String serverName, String databaseName, final ServiceCallback<DatabaseAutomaticTuningInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName, databaseName), serviceCallback);
    }

    /**
     * Gets a database's automatic tuning.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DatabaseAutomaticTuningInner object
     */
    public Observable<DatabaseAutomaticTuningInner> getAsync(String resourceGroupName, String serverName, String databaseName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, databaseName).map(new Func1<ServiceResponse<DatabaseAutomaticTuningInner>, DatabaseAutomaticTuningInner>() {
            @Override
            public DatabaseAutomaticTuningInner call(ServiceResponse<DatabaseAutomaticTuningInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a database's automatic tuning.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DatabaseAutomaticTuningInner object
     */
    public Observable<ServiceResponse<DatabaseAutomaticTuningInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, serverName, databaseName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DatabaseAutomaticTuningInner>>>() {
                @Override
                public Observable<ServiceResponse<DatabaseAutomaticTuningInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DatabaseAutomaticTuningInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DatabaseAutomaticTuningInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DatabaseAutomaticTuningInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DatabaseAutomaticTuningInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Update automatic tuning properties for target database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters The requested automatic tuning resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DatabaseAutomaticTuningInner object if successful.
     */
    public DatabaseAutomaticTuningInner update(String resourceGroupName, String serverName, String databaseName, DatabaseAutomaticTuningInner parameters) {
        return updateWithServiceResponseAsync(resourceGroupName, serverName, databaseName, parameters).toBlocking().single().body();
    }

    /**
     * Update automatic tuning properties for target database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters The requested automatic tuning resource state.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DatabaseAutomaticTuningInner> updateAsync(String resourceGroupName, String serverName, String databaseName, DatabaseAutomaticTuningInner parameters, final ServiceCallback<DatabaseAutomaticTuningInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, serverName, databaseName, parameters), serviceCallback);
    }

    /**
     * Update automatic tuning properties for target database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters The requested automatic tuning resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DatabaseAutomaticTuningInner object
     */
    public Observable<DatabaseAutomaticTuningInner> updateAsync(String resourceGroupName, String serverName, String databaseName, DatabaseAutomaticTuningInner parameters) {
        return updateWithServiceResponseAsync(resourceGroupName, serverName, databaseName, parameters).map(new Func1<ServiceResponse<DatabaseAutomaticTuningInner>, DatabaseAutomaticTuningInner>() {
            @Override
            public DatabaseAutomaticTuningInner call(ServiceResponse<DatabaseAutomaticTuningInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Update automatic tuning properties for target database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters The requested automatic tuning resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DatabaseAutomaticTuningInner object
     */
    public Observable<ServiceResponse<DatabaseAutomaticTuningInner>> updateWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName, DatabaseAutomaticTuningInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.update(resourceGroupName, serverName, databaseName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DatabaseAutomaticTuningInner>>>() {
                @Override
                public Observable<ServiceResponse<DatabaseAutomaticTuningInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DatabaseAutomaticTuningInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DatabaseAutomaticTuningInner> updateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DatabaseAutomaticTuningInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DatabaseAutomaticTuningInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
