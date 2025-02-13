// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.fluent.models.CacheInner;
import com.azure.resourcemanager.storagecache.models.CacheIdentity;
import com.azure.resourcemanager.storagecache.models.CacheIdentityType;
import com.azure.resourcemanager.storagecache.models.CacheSku;
import com.azure.resourcemanager.storagecache.models.CachesListResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CachesListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CachesListResult model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"fwnfnb\",\"value\":[{\"identity\":{\"principalId\":\"nlebxetqgtzxd\",\"tenantId\":\"qbqqwxr\",\"type\":\"None\",\"userAssignedIdentities\":{}},\"properties\":{\"cacheSizeGB\":69356874,\"scalingFactor\":72.7998351594212,\"mountAddresses\":[],\"provisioningState\":\"Creating\",\"subnet\":\"mpmngnzscxaqwoo\",\"zones\":[],\"primingJobs\":[],\"spaceAllocation\":[]},\"sku\":{\"name\":\"rxnjeaseipheofl\"},\"location\":\"keyyi\",\"tags\":{\"masxazjpqyegu\":\"bdlwtgrhpdjpj\",\"wdslfhotwmcy\":\"lhbxxhejjzzvdud\",\"cftadeh\":\"pwlbjnpg\",\"dejbavo\":\"nltyfsoppusuesnz\"},\"id\":\"xzdmohctb\",\"name\":\"vudwx\",\"type\":\"ndnvo\"},{\"identity\":{\"principalId\":\"jjugwdkcglhslaz\",\"tenantId\":\"yggdtjixh\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"properties\":{\"cacheSizeGB\":194127225,\"scalingFactor\":8.463135298414981,\"mountAddresses\":[],\"provisioningState\":\"Creating\",\"subnet\":\"fyexfwhy\",\"zones\":[],\"primingJobs\":[],\"spaceAllocation\":[]},\"sku\":{\"name\":\"ynnaam\"},\"location\":\"ectehf\",\"tags\":{\"ypvhezrkg\":\"cj\",\"sle\":\"hcjrefovgmk\"},\"id\":\"yvxyqjp\",\"name\":\"cattpngjcrcczsq\",\"type\":\"jh\"}]}")
                .toObject(CachesListResult.class);
        Assertions.assertEquals("fwnfnb", model.nextLink());
        Assertions.assertEquals("keyyi", model.value().get(0).location());
        Assertions.assertEquals("bdlwtgrhpdjpj", model.value().get(0).tags().get("masxazjpqyegu"));
        Assertions.assertEquals(CacheIdentityType.NONE, model.value().get(0).identity().type());
        Assertions.assertEquals("rxnjeaseipheofl", model.value().get(0).sku().name());
        Assertions.assertEquals(69356874, model.value().get(0).cacheSizeGB());
        Assertions.assertEquals(72.7998351594212D, model.value().get(0).scalingFactor());
        Assertions.assertEquals("mpmngnzscxaqwoo", model.value().get(0).subnet());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CachesListResult model =
            new CachesListResult()
                .withNextLink("fwnfnb")
                .withValue(
                    Arrays
                        .asList(
                            new CacheInner()
                                .withLocation("keyyi")
                                .withTags(
                                    mapOf(
                                        "masxazjpqyegu",
                                        "bdlwtgrhpdjpj",
                                        "wdslfhotwmcy",
                                        "lhbxxhejjzzvdud",
                                        "cftadeh",
                                        "pwlbjnpg",
                                        "dejbavo",
                                        "nltyfsoppusuesnz"))
                                .withIdentity(
                                    new CacheIdentity()
                                        .withType(CacheIdentityType.NONE)
                                        .withUserAssignedIdentities(mapOf()))
                                .withSku(new CacheSku().withName("rxnjeaseipheofl"))
                                .withCacheSizeGB(69356874)
                                .withScalingFactor(72.7998351594212D)
                                .withSubnet("mpmngnzscxaqwoo")
                                .withZones(Arrays.asList()),
                            new CacheInner()
                                .withLocation("ectehf")
                                .withTags(mapOf("ypvhezrkg", "cj", "sle", "hcjrefovgmk"))
                                .withIdentity(
                                    new CacheIdentity()
                                        .withType(CacheIdentityType.USER_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withSku(new CacheSku().withName("ynnaam"))
                                .withCacheSizeGB(194127225)
                                .withScalingFactor(8.463135298414981D)
                                .withSubnet("fyexfwhy")
                                .withZones(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(CachesListResult.class);
        Assertions.assertEquals("fwnfnb", model.nextLink());
        Assertions.assertEquals("keyyi", model.value().get(0).location());
        Assertions.assertEquals("bdlwtgrhpdjpj", model.value().get(0).tags().get("masxazjpqyegu"));
        Assertions.assertEquals(CacheIdentityType.NONE, model.value().get(0).identity().type());
        Assertions.assertEquals("rxnjeaseipheofl", model.value().get(0).sku().name());
        Assertions.assertEquals(69356874, model.value().get(0).cacheSizeGB());
        Assertions.assertEquals(72.7998351594212D, model.value().get(0).scalingFactor());
        Assertions.assertEquals("mpmngnzscxaqwoo", model.value().get(0).subnet());
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
