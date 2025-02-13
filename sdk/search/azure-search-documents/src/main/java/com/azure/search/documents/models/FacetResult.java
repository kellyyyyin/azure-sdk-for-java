// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A single bucket of a facet query result. Reports the number of documents with a field value falling within a
 * particular range or having a particular value or interval.
 */
@Fluent
public final class FacetResult implements JsonSerializable<FacetResult> {
    /*
     * The approximate count of documents falling within the bucket described by this facet.
     */
    private Long count;

    /*
     * A single bucket of a facet query result. Reports the number of documents with a field value falling within a
     * particular range or having a particular value or interval.
     */
    private Map<String, Object> additionalProperties;

    /** Creates an instance of FacetResult class. */
    public FacetResult() {}

    /**
     * Get the count property: The approximate count of documents falling within the bucket described by this facet.
     *
     * @return the count value.
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * Get the additionalProperties property: A single bucket of a facet query result. Reports the number of documents
     * with a field value falling within a particular range or having a particular value or interval.
     *
     * @return the additionalProperties value.
     */
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: A single bucket of a facet query result. Reports the number of documents
     * with a field value falling within a particular range or having a particular value or interval.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the FacetResult object itself.
     */
    public FacetResult setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("count", this.count);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FacetResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of FacetResult if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IOException If an error occurs while reading the FacetResult.
     */
    public static FacetResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    Long count = null;
                    Map<String, Object> additionalProperties = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("count".equals(fieldName)) {
                            count = reader.getNullable(JsonReader::getLong);
                        } else {
                            if (additionalProperties == null) {
                                additionalProperties = new LinkedHashMap<>();
                            }

                            additionalProperties.put(fieldName, reader.readUntyped());
                        }
                    }
                    FacetResult deserializedValue = new FacetResult();
                    deserializedValue.count = count;
                    deserializedValue.additionalProperties = additionalProperties;

                    return deserializedValue;
                });
    }
}
