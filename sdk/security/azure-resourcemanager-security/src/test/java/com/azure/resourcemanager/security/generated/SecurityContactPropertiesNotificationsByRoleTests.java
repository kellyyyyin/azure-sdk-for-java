// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.Roles;
import com.azure.resourcemanager.security.models.SecurityContactPropertiesNotificationsByRole;
import com.azure.resourcemanager.security.models.State;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SecurityContactPropertiesNotificationsByRoleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecurityContactPropertiesNotificationsByRole model =
            BinaryData
                .fromString("{\"state\":\"Failed\",\"roles\":[\"Contributor\"]}")
                .toObject(SecurityContactPropertiesNotificationsByRole.class);
        Assertions.assertEquals(State.FAILED, model.state());
        Assertions.assertEquals(Roles.CONTRIBUTOR, model.roles().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecurityContactPropertiesNotificationsByRole model =
            new SecurityContactPropertiesNotificationsByRole()
                .withState(State.FAILED)
                .withRoles(Arrays.asList(Roles.CONTRIBUTOR));
        model = BinaryData.fromObject(model).toObject(SecurityContactPropertiesNotificationsByRole.class);
        Assertions.assertEquals(State.FAILED, model.state());
        Assertions.assertEquals(Roles.CONTRIBUTOR, model.roles().get(0));
    }
}
