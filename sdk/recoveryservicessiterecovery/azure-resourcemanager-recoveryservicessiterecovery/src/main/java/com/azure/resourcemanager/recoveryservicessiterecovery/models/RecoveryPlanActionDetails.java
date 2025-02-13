// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Recovery plan action custom details. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = RecoveryPlanActionDetails.class)
@JsonTypeName("RecoveryPlanActionDetails")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "AutomationRunbookActionDetails",
        value = RecoveryPlanAutomationRunbookActionDetails.class),
    @JsonSubTypes.Type(name = "ManualActionDetails", value = RecoveryPlanManualActionDetails.class),
    @JsonSubTypes.Type(name = "ScriptActionDetails", value = RecoveryPlanScriptActionDetails.class)
})
@Immutable
public class RecoveryPlanActionDetails {
    /** Creates an instance of RecoveryPlanActionDetails class. */
    public RecoveryPlanActionDetails() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
