// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.ClusterPrincipalAssignmentInner;
import com.azure.resourcemanager.kusto.models.ClusterPrincipalRole;
import com.azure.resourcemanager.kusto.models.PrincipalType;
import org.junit.jupiter.api.Assertions;

public final class ClusterPrincipalAssignmentInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterPrincipalAssignmentInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"principalId\":\"sszdnru\",\"role\":\"AllDatabasesAdmin\",\"tenantId\":\"uhmuouqfprwzwbn\",\"principalType\":\"Group\",\"tenantName\":\"tnwu\",\"principalName\":\"gazxuf\",\"provisioningState\":\"Creating\",\"aadObjectId\":\"kyfi\"},\"id\":\"rfidfvzwdz\",\"name\":\"htymw\",\"type\":\"sdkf\"}")
                .toObject(ClusterPrincipalAssignmentInner.class);
        Assertions.assertEquals("sszdnru", model.principalId());
        Assertions.assertEquals(ClusterPrincipalRole.ALL_DATABASES_ADMIN, model.role());
        Assertions.assertEquals("uhmuouqfprwzwbn", model.tenantId());
        Assertions.assertEquals(PrincipalType.GROUP, model.principalType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterPrincipalAssignmentInner model =
            new ClusterPrincipalAssignmentInner()
                .withPrincipalId("sszdnru")
                .withRole(ClusterPrincipalRole.ALL_DATABASES_ADMIN)
                .withTenantId("uhmuouqfprwzwbn")
                .withPrincipalType(PrincipalType.GROUP);
        model = BinaryData.fromObject(model).toObject(ClusterPrincipalAssignmentInner.class);
        Assertions.assertEquals("sszdnru", model.principalId());
        Assertions.assertEquals(ClusterPrincipalRole.ALL_DATABASES_ADMIN, model.role());
        Assertions.assertEquals("uhmuouqfprwzwbn", model.tenantId());
        Assertions.assertEquals(PrincipalType.GROUP, model.principalType());
    }
}
