// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagemover.models.CopyMode;
import com.azure.resourcemanager.storagemover.models.JobDefinitionUpdateParameters;
import org.junit.jupiter.api.Assertions;

public final class JobDefinitionUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobDefinitionUpdateParameters model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"description\":\"jeyp\",\"copyMode\":\"Mirror\",\"agentName\":\"rkgqhcjrefo\"}}")
                .toObject(JobDefinitionUpdateParameters.class);
        Assertions.assertEquals("jeyp", model.description());
        Assertions.assertEquals(CopyMode.MIRROR, model.copyMode());
        Assertions.assertEquals("rkgqhcjrefo", model.agentName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobDefinitionUpdateParameters model =
            new JobDefinitionUpdateParameters()
                .withDescription("jeyp")
                .withCopyMode(CopyMode.MIRROR)
                .withAgentName("rkgqhcjrefo");
        model = BinaryData.fromObject(model).toObject(JobDefinitionUpdateParameters.class);
        Assertions.assertEquals("jeyp", model.description());
        Assertions.assertEquals(CopyMode.MIRROR, model.copyMode());
        Assertions.assertEquals("rkgqhcjrefo", model.agentName());
    }
}
