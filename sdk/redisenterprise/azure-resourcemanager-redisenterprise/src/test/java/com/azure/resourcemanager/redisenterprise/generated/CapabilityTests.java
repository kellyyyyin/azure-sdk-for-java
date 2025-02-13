// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.redisenterprise.models.Capability;
import org.junit.jupiter.api.Assertions;

public final class CapabilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Capability model =
            BinaryData.fromString("{\"name\":\"oklyaxuconuq\",\"value\":false}").toObject(Capability.class);
        Assertions.assertEquals("oklyaxuconuq", model.name());
        Assertions.assertEquals(false, model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Capability model = new Capability().withName("oklyaxuconuq").withValue(false);
        model = BinaryData.fromObject(model).toObject(Capability.class);
        Assertions.assertEquals("oklyaxuconuq", model.name());
        Assertions.assertEquals(false, model.value());
    }
}
