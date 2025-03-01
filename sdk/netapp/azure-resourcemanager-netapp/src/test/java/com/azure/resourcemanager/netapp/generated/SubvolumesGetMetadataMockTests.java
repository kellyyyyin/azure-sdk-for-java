// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.SubvolumeModel;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SubvolumesGetMetadataMockTests {
    @Test
    public void testGetMetadata() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"id\":\"ytunlbfjkwr\",\"name\":\"nkqbhsyrq\",\"type\":\"jqhden\",\"properties\":{\"path\":\"l\",\"parentPath\":\"akdkifmjnnawtqab\",\"size\":5710243161782085788,\"bytesUsed\":1035962610522456238,\"permissions\":\"qoweyirdhl\",\"creationTimeStamp\":\"2021-10-24T15:23:04Z\",\"accessedTimeStamp\":\"2021-09-15T11:45:30Z\",\"modifiedTimeStamp\":\"2021-07-25T17:04:59Z\",\"changedTimeStamp\":\"2021-06-30T03:10:24Z\",\"provisioningState\":\"Succeeded\"}}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        NetAppFilesManager manager =
            NetAppFilesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        SubvolumeModel response =
            manager
                .subvolumes()
                .getMetadata(
                    "nbmhyree", "dzqavbpdqmjxlyyz", "lgouwtlmjj", "uojqt", "baxk", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("l", response.path());
        Assertions.assertEquals("akdkifmjnnawtqab", response.parentPath());
        Assertions.assertEquals(5710243161782085788L, response.size());
        Assertions.assertEquals(1035962610522456238L, response.bytesUsed());
        Assertions.assertEquals("qoweyirdhl", response.permissions());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-24T15:23:04Z"), response.creationTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-15T11:45:30Z"), response.accessedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-25T17:04:59Z"), response.modifiedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-30T03:10:24Z"), response.changedTimestamp());
        Assertions.assertEquals("Succeeded", response.provisioningState());
    }
}
