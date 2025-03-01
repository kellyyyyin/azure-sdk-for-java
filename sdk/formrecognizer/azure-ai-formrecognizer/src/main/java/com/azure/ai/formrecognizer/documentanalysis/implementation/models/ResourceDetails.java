// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** General information regarding the current resource. */
@Fluent
public final class ResourceDetails {
    /*
     * Details regarding custom document models.
     */
    @JsonProperty(value = "customDocumentModels", required = true)
    private CustomDocumentModelsDetails customDocumentModels;

    /*
     * Quota used, limit, and next reset date/time.
     */
    @JsonProperty(value = "customNeuralDocumentModelBuilds", required = true)
    private QuotaDetails customNeuralDocumentModelBuilds;

    /** Creates an instance of ResourceDetails class. */
    public ResourceDetails() {}

    /**
     * Get the customDocumentModels property: Details regarding custom document models.
     *
     * @return the customDocumentModels value.
     */
    public CustomDocumentModelsDetails getCustomDocumentModels() {
        return this.customDocumentModels;
    }

    /**
     * Set the customDocumentModels property: Details regarding custom document models.
     *
     * @param customDocumentModels the customDocumentModels value to set.
     * @return the ResourceDetails object itself.
     */
    public ResourceDetails setCustomDocumentModels(CustomDocumentModelsDetails customDocumentModels) {
        this.customDocumentModels = customDocumentModels;
        return this;
    }

    /**
     * Get the customNeuralDocumentModelBuilds property: Quota used, limit, and next reset date/time.
     *
     * @return the customNeuralDocumentModelBuilds value.
     */
    public QuotaDetails getCustomNeuralDocumentModelBuilds() {
        return this.customNeuralDocumentModelBuilds;
    }

    /**
     * Set the customNeuralDocumentModelBuilds property: Quota used, limit, and next reset date/time.
     *
     * @param customNeuralDocumentModelBuilds the customNeuralDocumentModelBuilds value to set.
     * @return the ResourceDetails object itself.
     */
    public ResourceDetails setCustomNeuralDocumentModelBuilds(QuotaDetails customNeuralDocumentModelBuilds) {
        this.customNeuralDocumentModelBuilds = customNeuralDocumentModelBuilds;
        return this;
    }
}
