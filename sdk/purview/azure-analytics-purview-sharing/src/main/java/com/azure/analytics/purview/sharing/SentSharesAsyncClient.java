// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing;

import com.azure.analytics.purview.sharing.implementation.SentSharesImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.PollerFlux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous PurviewShareClient type. */
@ServiceClient(builder = SentSharesClientBuilder.class, isAsync = true)
public final class SentSharesAsyncClient {
    @Generated private final SentSharesImpl serviceClient;

    /**
     * Initializes an instance of SentSharesAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    SentSharesAsyncClient(SentSharesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get a list of sent shares.
     *
     * <p>List sent shares.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>skipToken</td><td>String</td><td>No</td><td>The continuation token to list the next page</td></tr>
     *     <tr><td>filter</td><td>String</td><td>No</td><td>Filters the results using OData syntax</td></tr>
     *     <tr><td>orderby</td><td>String</td><td>No</td><td>Sorts the results using OData syntax</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Optional)
     *     type: String (Optional)
     * }
     * }</pre>
     *
     * @param referenceName A name that references a data store.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return list of sent shares as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getAllSentShares(String referenceName, RequestOptions requestOptions) {
        return this.serviceClient.getAllSentSharesAsync(referenceName, requestOptions);
    }

    /**
     * Get a sent share by guid.
     *
     * <p>Get a sent share.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Optional)
     *     type: String (Optional)
     * }
     * }</pre>
     *
     * @param sentShareId Id of the sent share.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a sent share along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getSentShareWithResponse(String sentShareId, RequestOptions requestOptions) {
        return this.serviceClient.getSentShareWithResponseAsync(sentShareId, requestOptions);
    }

    /**
     * Create or replace a sent share.
     *
     * <p>Create or replace a sent share.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Optional)
     *     type: String (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Optional)
     *     type: String (Optional)
     * }
     * }</pre>
     *
     * @param sentShareId Id of the sent share.
     * @param sentShare The sent share to create or replace.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of a sent share data transfer object.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginCreateOrReplaceSentShare(
            String sentShareId, BinaryData sentShare, RequestOptions requestOptions) {
        return this.serviceClient.beginCreateOrReplaceSentShareAsync(sentShareId, sentShare, requestOptions);
    }

    /**
     * Deletes a sent share.
     *
     * <p>Delete a sent share.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     endTime: OffsetDateTime (Optional)
     *     error (Optional): {
     *         code: String (Required)
     *         details (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         message: String (Required)
     *         target: String (Optional)
     *     }
     *     id: String (Optional)
     *     startTime: OffsetDateTime (Optional)
     *     status: String(Running/TransientFailure/Succeeded/Failed/NotStarted) (Required)
     * }
     * }</pre>
     *
     * @param sentShareId Id of the sent share.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of response for long running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, Void> beginDeleteSentShare(String sentShareId, RequestOptions requestOptions) {
        return this.serviceClient.beginDeleteSentShareAsync(sentShareId, requestOptions);
    }

    /**
     * List all sent share invitations in a sent share
     *
     * <p>List sent share recipients.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>skipToken</td><td>String</td><td>No</td><td>The continuation token to list the next page</td></tr>
     *     <tr><td>filter</td><td>String</td><td>No</td><td>Filters the results using OData syntax</td></tr>
     *     <tr><td>orderby</td><td>String</td><td>No</td><td>Sorts the results using OData syntax</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Optional)
     *     type: String (Optional)
     * }
     * }</pre>
     *
     * @param sentShareId Id of the sent share.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return list of the sent share invitations as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getAllSentShareInvitations(String sentShareId, RequestOptions requestOptions) {
        return this.serviceClient.getAllSentShareInvitationsAsync(sentShareId, requestOptions);
    }

    /**
     * Get sent share invitation for a given sent share
     *
     * <p>Get recipient for a given sent share.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Optional)
     *     type: String (Optional)
     * }
     * }</pre>
     *
     * @param sentShareId Id of the sent share.
     * @param sentShareInvitationId Id of the sent share invitation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return recipient for a given sent share along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getSentShareInvitationWithResponse(
            String sentShareId, String sentShareInvitationId, RequestOptions requestOptions) {
        return this.serviceClient.getSentShareInvitationWithResponseAsync(
                sentShareId, sentShareInvitationId, requestOptions);
    }

    /**
     * Create a sent share invitation.
     *
     * <p>Create a recipient for a given sent share.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Optional)
     *     type: String (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Optional)
     *     type: String (Optional)
     * }
     * }</pre>
     *
     * @param sentShareId Id of the sent share.
     * @param sentShareInvitationId Id of the sent share invitation.
     * @param sentShareInvitation The sent share invitation to create.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a sent share invitation data transfer object along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createSentShareInvitationWithResponse(
            String sentShareId,
            String sentShareInvitationId,
            BinaryData sentShareInvitation,
            RequestOptions requestOptions) {
        return this.serviceClient.createSentShareInvitationWithResponseAsync(
                sentShareId, sentShareInvitationId, sentShareInvitation, requestOptions);
    }

    /**
     * Delete Invitation in a share.
     *
     * <p>Delete a sent share invitation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     endTime: OffsetDateTime (Optional)
     *     error (Optional): {
     *         code: String (Required)
     *         details (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         message: String (Required)
     *         target: String (Optional)
     *     }
     *     id: String (Optional)
     *     startTime: OffsetDateTime (Optional)
     *     status: String(Running/TransientFailure/Succeeded/Failed/NotStarted) (Required)
     * }
     * }</pre>
     *
     * @param sentShareId Id of the sent share.
     * @param sentShareInvitationId Id of the sent share invitation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of response for long running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, Void> beginDeleteSentShareInvitation(
            String sentShareId, String sentShareInvitationId, RequestOptions requestOptions) {
        return this.serviceClient.beginDeleteSentShareInvitationAsync(
                sentShareId, sentShareInvitationId, requestOptions);
    }

    /**
     * Notifies the recipient of the sent share invitation.
     *
     * <p>Notifies the user recipient of the sent share invitation, does not apply to service invitations.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Optional)
     *     type: String (Optional)
     * }
     * }</pre>
     *
     * @param sentShareId Id of the sent share.
     * @param sentShareInvitationId Id of the sent share invitation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a sent share invitation data transfer object along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> notifyUserSentShareInvitationWithResponse(
            String sentShareId, String sentShareInvitationId, RequestOptions requestOptions) {
        return this.serviceClient.notifyUserSentShareInvitationWithResponseAsync(
                sentShareId, sentShareInvitationId, requestOptions);
    }
}
