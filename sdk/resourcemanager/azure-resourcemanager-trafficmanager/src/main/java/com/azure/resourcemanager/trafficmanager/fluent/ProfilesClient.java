// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import com.azure.resourcemanager.trafficmanager.fluent.models.DeleteOperationResultInner;
import com.azure.resourcemanager.trafficmanager.fluent.models.ProfileInner;
import com.azure.resourcemanager.trafficmanager.fluent.models.TrafficManagerNameAvailabilityInner;
import com.azure.resourcemanager.trafficmanager.models.CheckTrafficManagerRelativeDnsNameAvailabilityParameters;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ProfilesClient. */
public interface ProfilesClient
    extends InnerSupportsGet<ProfileInner>,
        InnerSupportsListing<ProfileInner>,
        InnerSupportsDelete<DeleteOperationResultInner> {
    /**
     * Checks the availability of a Traffic Manager Relative DNS name.
     *
     * @param parameters The Traffic Manager name parameters supplied to the CheckTrafficManagerNameAvailability
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Traffic Manager Name Availability response along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<TrafficManagerNameAvailabilityInner>> checkTrafficManagerRelativeDnsNameAvailabilityWithResponseAsync(
        CheckTrafficManagerRelativeDnsNameAvailabilityParameters parameters);

    /**
     * Checks the availability of a Traffic Manager Relative DNS name.
     *
     * @param parameters The Traffic Manager name parameters supplied to the CheckTrafficManagerNameAvailability
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Traffic Manager Name Availability response on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<TrafficManagerNameAvailabilityInner> checkTrafficManagerRelativeDnsNameAvailabilityAsync(
        CheckTrafficManagerRelativeDnsNameAvailabilityParameters parameters);

    /**
     * Checks the availability of a Traffic Manager Relative DNS name.
     *
     * @param parameters The Traffic Manager name parameters supplied to the CheckTrafficManagerNameAvailability
     *     operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Traffic Manager Name Availability response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TrafficManagerNameAvailabilityInner> checkTrafficManagerRelativeDnsNameAvailabilityWithResponse(
        CheckTrafficManagerRelativeDnsNameAvailabilityParameters parameters, Context context);

    /**
     * Checks the availability of a Traffic Manager Relative DNS name.
     *
     * @param parameters The Traffic Manager name parameters supplied to the CheckTrafficManagerNameAvailability
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Traffic Manager Name Availability response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TrafficManagerNameAvailabilityInner checkTrafficManagerRelativeDnsNameAvailability(
        CheckTrafficManagerRelativeDnsNameAvailabilityParameters parameters);

    /**
     * Lists all Traffic Manager profiles within a resource group.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profiles to be listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Traffic Manager profiles operation response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ProfileInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Lists all Traffic Manager profiles within a resource group.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profiles to be listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Traffic Manager profiles operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProfileInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all Traffic Manager profiles within a resource group.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profiles to be listed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Traffic Manager profiles operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProfileInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all Traffic Manager profiles within a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Traffic Manager profiles operation response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ProfileInner> listAsync();

    /**
     * Lists all Traffic Manager profiles within a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Traffic Manager profiles operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProfileInner> list();

    /**
     * Lists all Traffic Manager profiles within a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Traffic Manager profiles operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProfileInner> list(Context context);

    /**
     * Gets a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Traffic Manager profile along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ProfileInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String profileName);

    /**
     * Gets a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Traffic Manager profile on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ProfileInner> getByResourceGroupAsync(String resourceGroupName, String profileName);

    /**
     * Gets a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Traffic Manager profile along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProfileInner> getByResourceGroupWithResponse(
        String resourceGroupName, String profileName, Context context);

    /**
     * Gets a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Traffic Manager profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProfileInner getByResourceGroup(String resourceGroupName, String profileName);

    /**
     * Create or update a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @param parameters The Traffic Manager profile parameters supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Traffic Manager profile along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ProfileInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String profileName, ProfileInner parameters);

    /**
     * Create or update a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @param parameters The Traffic Manager profile parameters supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Traffic Manager profile on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ProfileInner> createOrUpdateAsync(String resourceGroupName, String profileName, ProfileInner parameters);

    /**
     * Create or update a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @param parameters The Traffic Manager profile parameters supplied to the CreateOrUpdate operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Traffic Manager profile along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProfileInner> createOrUpdateWithResponse(
        String resourceGroupName, String profileName, ProfileInner parameters, Context context);

    /**
     * Create or update a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @param parameters The Traffic Manager profile parameters supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Traffic Manager profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProfileInner createOrUpdate(String resourceGroupName, String profileName, ProfileInner parameters);

    /**
     * Deletes a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile to be deleted.
     * @param profileName The name of the Traffic Manager profile to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the request or operation along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DeleteOperationResultInner>> deleteWithResponseAsync(String resourceGroupName, String profileName);

    /**
     * Deletes a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile to be deleted.
     * @param profileName The name of the Traffic Manager profile to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the request or operation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DeleteOperationResultInner> deleteAsync(String resourceGroupName, String profileName);

    /**
     * Deletes a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile to be deleted.
     * @param profileName The name of the Traffic Manager profile to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the request or operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeleteOperationResultInner> deleteWithResponse(
        String resourceGroupName, String profileName, Context context);

    /**
     * Deletes a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile to be deleted.
     * @param profileName The name of the Traffic Manager profile to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the request or operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeleteOperationResultInner delete(String resourceGroupName, String profileName);

    /**
     * Update a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @param parameters The Traffic Manager profile parameters supplied to the Update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Traffic Manager profile along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ProfileInner>> updateWithResponseAsync(
        String resourceGroupName, String profileName, ProfileInner parameters);

    /**
     * Update a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @param parameters The Traffic Manager profile parameters supplied to the Update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Traffic Manager profile on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ProfileInner> updateAsync(String resourceGroupName, String profileName, ProfileInner parameters);

    /**
     * Update a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @param parameters The Traffic Manager profile parameters supplied to the Update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Traffic Manager profile along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProfileInner> updateWithResponse(
        String resourceGroupName, String profileName, ProfileInner parameters, Context context);

    /**
     * Update a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @param parameters The Traffic Manager profile parameters supplied to the Update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Traffic Manager profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProfileInner update(String resourceGroupName, String profileName, ProfileInner parameters);
}
