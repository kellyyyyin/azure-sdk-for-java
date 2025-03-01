// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ReplicationEligibilityResultsOperationsClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ReplicationEligibilityResultsCollectionInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ReplicationEligibilityResultsInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ReplicationEligibilityResultsOperationsClient.
 */
public final class ReplicationEligibilityResultsOperationsClientImpl
    implements ReplicationEligibilityResultsOperationsClient {
    /** The proxy service used to perform REST calls. */
    private final ReplicationEligibilityResultsOperationsService service;

    /** The service client containing this operation class. */
    private final SiteRecoveryManagementClientImpl client;

    /**
     * Initializes an instance of ReplicationEligibilityResultsOperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ReplicationEligibilityResultsOperationsClientImpl(SiteRecoveryManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ReplicationEligibilityResultsOperationsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SiteRecoveryManagementClientReplicationEligibilityResultsOperations
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SiteRecoveryManageme")
    public interface ReplicationEligibilityResultsOperationsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute"
                + "/virtualMachines/{virtualMachineName}/providers/Microsoft.RecoveryServices"
                + "/replicationEligibilityResults")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ReplicationEligibilityResultsCollectionInner>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("virtualMachineName") String virtualMachineName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute"
                + "/virtualMachines/{virtualMachineName}/providers/Microsoft.RecoveryServices"
                + "/replicationEligibilityResults/default")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ReplicationEligibilityResultsInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("virtualMachineName") String virtualMachineName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the validation errors in case the VM is unsuitable for protection.
     *
     * <p>Validates whether a given VM can be protected or not in which case returns list of errors.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param virtualMachineName Virtual Machine name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication eligibility results collection response model along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ReplicationEligibilityResultsCollectionInner>> listWithResponseAsync(
        String resourceGroupName, String virtualMachineName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (virtualMachineName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter virtualMachineName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            virtualMachineName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the validation errors in case the VM is unsuitable for protection.
     *
     * <p>Validates whether a given VM can be protected or not in which case returns list of errors.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param virtualMachineName Virtual Machine name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication eligibility results collection response model along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ReplicationEligibilityResultsCollectionInner>> listWithResponseAsync(
        String resourceGroupName, String virtualMachineName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (virtualMachineName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter virtualMachineName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                resourceGroupName,
                this.client.getSubscriptionId(),
                virtualMachineName,
                accept,
                context);
    }

    /**
     * Gets the validation errors in case the VM is unsuitable for protection.
     *
     * <p>Validates whether a given VM can be protected or not in which case returns list of errors.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param virtualMachineName Virtual Machine name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication eligibility results collection response model on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ReplicationEligibilityResultsCollectionInner> listAsync(
        String resourceGroupName, String virtualMachineName) {
        return listWithResponseAsync(resourceGroupName, virtualMachineName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the validation errors in case the VM is unsuitable for protection.
     *
     * <p>Validates whether a given VM can be protected or not in which case returns list of errors.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param virtualMachineName Virtual Machine name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication eligibility results collection response model along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ReplicationEligibilityResultsCollectionInner> listWithResponse(
        String resourceGroupName, String virtualMachineName, Context context) {
        return listWithResponseAsync(resourceGroupName, virtualMachineName, context).block();
    }

    /**
     * Gets the validation errors in case the VM is unsuitable for protection.
     *
     * <p>Validates whether a given VM can be protected or not in which case returns list of errors.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param virtualMachineName Virtual Machine name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication eligibility results collection response model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ReplicationEligibilityResultsCollectionInner list(String resourceGroupName, String virtualMachineName) {
        return listWithResponse(resourceGroupName, virtualMachineName, Context.NONE).getValue();
    }

    /**
     * Gets the validation errors in case the VM is unsuitable for protection.
     *
     * <p>Validates whether a given VM can be protected or not in which case returns list of errors.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param virtualMachineName Virtual Machine name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication eligibility results response model along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ReplicationEligibilityResultsInner>> getWithResponseAsync(
        String resourceGroupName, String virtualMachineName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (virtualMachineName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter virtualMachineName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            virtualMachineName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the validation errors in case the VM is unsuitable for protection.
     *
     * <p>Validates whether a given VM can be protected or not in which case returns list of errors.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param virtualMachineName Virtual Machine name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication eligibility results response model along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ReplicationEligibilityResultsInner>> getWithResponseAsync(
        String resourceGroupName, String virtualMachineName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (virtualMachineName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter virtualMachineName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                resourceGroupName,
                this.client.getSubscriptionId(),
                virtualMachineName,
                accept,
                context);
    }

    /**
     * Gets the validation errors in case the VM is unsuitable for protection.
     *
     * <p>Validates whether a given VM can be protected or not in which case returns list of errors.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param virtualMachineName Virtual Machine name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication eligibility results response model on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ReplicationEligibilityResultsInner> getAsync(String resourceGroupName, String virtualMachineName) {
        return getWithResponseAsync(resourceGroupName, virtualMachineName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the validation errors in case the VM is unsuitable for protection.
     *
     * <p>Validates whether a given VM can be protected or not in which case returns list of errors.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param virtualMachineName Virtual Machine name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication eligibility results response model along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ReplicationEligibilityResultsInner> getWithResponse(
        String resourceGroupName, String virtualMachineName, Context context) {
        return getWithResponseAsync(resourceGroupName, virtualMachineName, context).block();
    }

    /**
     * Gets the validation errors in case the VM is unsuitable for protection.
     *
     * <p>Validates whether a given VM can be protected or not in which case returns list of errors.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param virtualMachineName Virtual Machine name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication eligibility results response model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ReplicationEligibilityResultsInner get(String resourceGroupName, String virtualMachineName) {
        return getWithResponse(resourceGroupName, virtualMachineName, Context.NONE).getValue();
    }
}
