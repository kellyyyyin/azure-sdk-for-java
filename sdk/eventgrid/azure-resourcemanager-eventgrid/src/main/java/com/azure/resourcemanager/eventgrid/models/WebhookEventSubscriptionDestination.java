// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.fluent.models.WebhookEventSubscriptionDestinationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Information about the webhook destination for an event subscription. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType")
@JsonTypeName("WebHook")
@Fluent
public final class WebhookEventSubscriptionDestination extends EventSubscriptionDestination {
    /*
     * WebHook Properties of the event subscription destination.
     */
    @JsonProperty(value = "properties")
    private WebhookEventSubscriptionDestinationProperties innerProperties;

    /**
     * Get the innerProperties property: WebHook Properties of the event subscription destination.
     *
     * @return the innerProperties value.
     */
    private WebhookEventSubscriptionDestinationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the endpointUrl property: The URL that represents the endpoint of the destination of an event subscription.
     *
     * @return the endpointUrl value.
     */
    public String endpointUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().endpointUrl();
    }

    /**
     * Set the endpointUrl property: The URL that represents the endpoint of the destination of an event subscription.
     *
     * @param endpointUrl the endpointUrl value to set.
     * @return the WebhookEventSubscriptionDestination object itself.
     */
    public WebhookEventSubscriptionDestination withEndpointUrl(String endpointUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebhookEventSubscriptionDestinationProperties();
        }
        this.innerProperties().withEndpointUrl(endpointUrl);
        return this;
    }

    /**
     * Get the endpointBaseUrl property: The base URL that represents the endpoint of the destination of an event
     * subscription.
     *
     * @return the endpointBaseUrl value.
     */
    public String endpointBaseUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().endpointBaseUrl();
    }

    /**
     * Get the maxEventsPerBatch property: Maximum number of events per batch.
     *
     * @return the maxEventsPerBatch value.
     */
    public Integer maxEventsPerBatch() {
        return this.innerProperties() == null ? null : this.innerProperties().maxEventsPerBatch();
    }

    /**
     * Set the maxEventsPerBatch property: Maximum number of events per batch.
     *
     * @param maxEventsPerBatch the maxEventsPerBatch value to set.
     * @return the WebhookEventSubscriptionDestination object itself.
     */
    public WebhookEventSubscriptionDestination withMaxEventsPerBatch(Integer maxEventsPerBatch) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebhookEventSubscriptionDestinationProperties();
        }
        this.innerProperties().withMaxEventsPerBatch(maxEventsPerBatch);
        return this;
    }

    /**
     * Get the preferredBatchSizeInKilobytes property: Preferred batch size in Kilobytes.
     *
     * @return the preferredBatchSizeInKilobytes value.
     */
    public Integer preferredBatchSizeInKilobytes() {
        return this.innerProperties() == null ? null : this.innerProperties().preferredBatchSizeInKilobytes();
    }

    /**
     * Set the preferredBatchSizeInKilobytes property: Preferred batch size in Kilobytes.
     *
     * @param preferredBatchSizeInKilobytes the preferredBatchSizeInKilobytes value to set.
     * @return the WebhookEventSubscriptionDestination object itself.
     */
    public WebhookEventSubscriptionDestination withPreferredBatchSizeInKilobytes(
        Integer preferredBatchSizeInKilobytes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebhookEventSubscriptionDestinationProperties();
        }
        this.innerProperties().withPreferredBatchSizeInKilobytes(preferredBatchSizeInKilobytes);
        return this;
    }

    /**
     * Get the azureActiveDirectoryTenantId property: The Azure Active Directory Tenant ID to get the access token that
     * will be included as the bearer token in delivery requests.
     *
     * @return the azureActiveDirectoryTenantId value.
     */
    public String azureActiveDirectoryTenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().azureActiveDirectoryTenantId();
    }

    /**
     * Set the azureActiveDirectoryTenantId property: The Azure Active Directory Tenant ID to get the access token that
     * will be included as the bearer token in delivery requests.
     *
     * @param azureActiveDirectoryTenantId the azureActiveDirectoryTenantId value to set.
     * @return the WebhookEventSubscriptionDestination object itself.
     */
    public WebhookEventSubscriptionDestination withAzureActiveDirectoryTenantId(String azureActiveDirectoryTenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebhookEventSubscriptionDestinationProperties();
        }
        this.innerProperties().withAzureActiveDirectoryTenantId(azureActiveDirectoryTenantId);
        return this;
    }

    /**
     * Get the azureActiveDirectoryApplicationIdOrUri property: The Azure Active Directory Application ID or URI to get
     * the access token that will be included as the bearer token in delivery requests.
     *
     * @return the azureActiveDirectoryApplicationIdOrUri value.
     */
    public String azureActiveDirectoryApplicationIdOrUri() {
        return this.innerProperties() == null ? null : this.innerProperties().azureActiveDirectoryApplicationIdOrUri();
    }

    /**
     * Set the azureActiveDirectoryApplicationIdOrUri property: The Azure Active Directory Application ID or URI to get
     * the access token that will be included as the bearer token in delivery requests.
     *
     * @param azureActiveDirectoryApplicationIdOrUri the azureActiveDirectoryApplicationIdOrUri value to set.
     * @return the WebhookEventSubscriptionDestination object itself.
     */
    public WebhookEventSubscriptionDestination withAzureActiveDirectoryApplicationIdOrUri(
        String azureActiveDirectoryApplicationIdOrUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebhookEventSubscriptionDestinationProperties();
        }
        this.innerProperties().withAzureActiveDirectoryApplicationIdOrUri(azureActiveDirectoryApplicationIdOrUri);
        return this;
    }

    /**
     * Get the deliveryAttributeMappings property: Delivery attribute details.
     *
     * @return the deliveryAttributeMappings value.
     */
    public List<DeliveryAttributeMapping> deliveryAttributeMappings() {
        return this.innerProperties() == null ? null : this.innerProperties().deliveryAttributeMappings();
    }

    /**
     * Set the deliveryAttributeMappings property: Delivery attribute details.
     *
     * @param deliveryAttributeMappings the deliveryAttributeMappings value to set.
     * @return the WebhookEventSubscriptionDestination object itself.
     */
    public WebhookEventSubscriptionDestination withDeliveryAttributeMappings(
        List<DeliveryAttributeMapping> deliveryAttributeMappings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebhookEventSubscriptionDestinationProperties();
        }
        this.innerProperties().withDeliveryAttributeMappings(deliveryAttributeMappings);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
