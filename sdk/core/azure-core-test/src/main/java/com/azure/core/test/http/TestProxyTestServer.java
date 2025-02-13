// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.test.http;

import io.netty.handler.codec.http.HttpResponseStatus;
import reactor.core.publisher.Mono;
import reactor.netty.DisposableServer;
import reactor.netty.http.server.HttpServer;

import java.io.Closeable;
import java.util.Map;

/**
 * A simple {@link HttpServer} for unit testing the test proxy infrastructure.
 */
public class TestProxyTestServer implements Closeable {
    private final DisposableServer server;

    private static final String TEST_JSON_RESPONSE_BODY = "{\"modelId\":\"0cd2728b-210e-4c05-b706-f70554276bcc\",\"createdDateTime\":\"2022-08-31T00:00:00Z\",\"apiVersion\":\"2022-08-31\",  \"accountKey\" : \"secret_account_key\", \"Operation-Location\" : \"https://resourceInfo.cognitiveservices.azure.com/fr/models//905a58f9-131e-42b8-8410-493ab1517d62\"}";
    private static final String TEST_XML_RESPONSE_BODY = "{\"Body\":\"<UserDelegationKey><SignedTid>sensitiveInformation=</SignedTid></UserDelegationKey>\",\"primaryKey\":\"<PrimaryKey>fakePrimaryKey</PrimaryKey>\", \"TableName\":\"listtable09bf2a3d\"}";
    /**
     * Constructor for TestProxyTestServer
     */
    public TestProxyTestServer() {
        server = HttpServer.create()
            .host("localhost")
            .port(3000)
            .route(routes -> routes
                .get("/", (req, res) -> res.status(HttpResponseStatus.OK).sendString(Mono.just("hello world")))
                .get("/first/path", (req, res) -> res.status(HttpResponseStatus.OK).sendString(Mono.just("first path")))
                .get("/echoheaders", (req, res) -> {
                    for (Map.Entry<String, String> requestHeader : req.requestHeaders()) {
                        res.addHeader(requestHeader.getKey(), requestHeader.getValue());
                    }
                    return res.status(HttpResponseStatus.OK).sendString(Mono.just("echoheaders"));
                })
                .get("/fr/path/1", (req, res) -> {
                    for (Map.Entry<String, String> requestHeader : req.requestHeaders()) {
                        res.addHeader(requestHeader.getKey(), requestHeader.getValue());
                    }
                    return res.status(HttpResponseStatus.OK)
                        .addHeader("Content-Type", "application/json")
                        .sendString(Mono.just(TEST_JSON_RESPONSE_BODY));
                })
                .get("/fr/path/2",
                    (req, res) -> res.status(HttpResponseStatus.OK)
                        .addHeader("Content-Type", "application/json")
                        .sendString(Mono.just(TEST_XML_RESPONSE_BODY))))
            .bindNow();
    }

    @Override
    public void close() {
        server.disposeNow();
    }
}
