// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionModelInner;
import com.azure.resourcemanager.security.models.IoTSecuritySolutionsList;
import com.azure.resourcemanager.security.models.SecuritySolutionStatus;
import com.azure.resourcemanager.security.models.UnmaskedIpLoggingStatus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IoTSecuritySolutionsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IoTSecuritySolutionsList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"location\":\"oaeupfhyhltrpmo\",\"properties\":{\"workspace\":\"cma\",\"displayName\":\"u\",\"status\":\"Disabled\",\"export\":[],\"disabledDataSources\":[],\"iotHubs\":[],\"autoDiscoveredResources\":[],\"recommendationsConfiguration\":[],\"unmaskedIpLoggingStatus\":\"Enabled\",\"additionalWorkspaces\":[]},\"tags\":{\"xodpuozmyzydagfu\":\"pk\",\"dxwzywqsmbsurexi\":\"xbezyiuokktwh\"},\"id\":\"o\",\"name\":\"yocf\",\"type\":\"fksymddystki\"}],\"nextLink\":\"xhqyudxorrqnb\"}")
                .toObject(IoTSecuritySolutionsList.class);
        Assertions.assertEquals("oaeupfhyhltrpmo", model.value().get(0).location());
        Assertions.assertEquals("pk", model.value().get(0).tags().get("xodpuozmyzydagfu"));
        Assertions.assertEquals("cma", model.value().get(0).workspace());
        Assertions.assertEquals("u", model.value().get(0).displayName());
        Assertions.assertEquals(SecuritySolutionStatus.DISABLED, model.value().get(0).status());
        Assertions.assertEquals(UnmaskedIpLoggingStatus.ENABLED, model.value().get(0).unmaskedIpLoggingStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IoTSecuritySolutionsList model =
            new IoTSecuritySolutionsList()
                .withValue(
                    Arrays
                        .asList(
                            new IoTSecuritySolutionModelInner()
                                .withLocation("oaeupfhyhltrpmo")
                                .withTags(mapOf("xodpuozmyzydagfu", "pk", "dxwzywqsmbsurexi", "xbezyiuokktwh"))
                                .withWorkspace("cma")
                                .withDisplayName("u")
                                .withStatus(SecuritySolutionStatus.DISABLED)
                                .withExport(Arrays.asList())
                                .withDisabledDataSources(Arrays.asList())
                                .withIotHubs(Arrays.asList())
                                .withRecommendationsConfiguration(Arrays.asList())
                                .withUnmaskedIpLoggingStatus(UnmaskedIpLoggingStatus.ENABLED)
                                .withAdditionalWorkspaces(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(IoTSecuritySolutionsList.class);
        Assertions.assertEquals("oaeupfhyhltrpmo", model.value().get(0).location());
        Assertions.assertEquals("pk", model.value().get(0).tags().get("xodpuozmyzydagfu"));
        Assertions.assertEquals("cma", model.value().get(0).workspace());
        Assertions.assertEquals("u", model.value().get(0).displayName());
        Assertions.assertEquals(SecuritySolutionStatus.DISABLED, model.value().get(0).status());
        Assertions.assertEquals(UnmaskedIpLoggingStatus.ENABLED, model.value().get(0).unmaskedIpLoggingStatus());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
