// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.search.documents.models.AnswerResult;
import com.azure.search.documents.models.FacetResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** Response containing search results from an index. */
@Immutable
public final class SearchDocumentsResult implements JsonSerializable<SearchDocumentsResult> {
    /*
     * The total count of results found by the search operation, or null if the count was not requested. If present,
     * the count may be greater than the number of results in this response. This can happen if you use the $top or
     * $skip parameters, or if Azure Cognitive Search can't return all the requested documents in a single Search
     * response.
     */
    private Long count;

    /*
     * A value indicating the percentage of the index that was included in the query, or null if minimumCoverage was
     * not specified in the request.
     */
    private Double coverage;

    /*
     * The facet query results for the search operation, organized as a collection of buckets for each faceted field;
     * null if the query did not include any facet expressions.
     */
    private Map<String, List<FacetResult>> facets;

    /*
     * The answers query results for the search operation; null if the answers query parameter was not specified or set
     * to 'none'.
     */
    private List<AnswerResult> answers;

    /*
     * Continuation JSON payload returned when Azure Cognitive Search can't return all the requested results in a
     * single Search response. You can use this JSON along with @odata.nextLink to formulate another POST Search
     * request to get the next part of the search response.
     */
    private SearchRequest nextPageParameters;

    /*
     * The sequence of results returned by the query.
     */
    private final List<SearchResult> results;

    /*
     * Continuation URL returned when Azure Cognitive Search can't return all the requested results in a single Search
     * response. You can use this URL to formulate another GET or POST Search request to get the next part of the
     * search response. Make sure to use the same verb (GET or POST) as the request that produced this response.
     */
    private String nextLink;

    /**
     * Creates an instance of SearchDocumentsResult class.
     *
     * @param results the results value to set.
     */
    public SearchDocumentsResult(List<SearchResult> results) {
        this.results = results;
    }

    /**
     * Get the count property: The total count of results found by the search operation, or null if the count was not
     * requested. If present, the count may be greater than the number of results in this response. This can happen if
     * you use the $top or $skip parameters, or if Azure Cognitive Search can't return all the requested documents in a
     * single Search response.
     *
     * @return the count value.
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * Get the coverage property: A value indicating the percentage of the index that was included in the query, or null
     * if minimumCoverage was not specified in the request.
     *
     * @return the coverage value.
     */
    public Double getCoverage() {
        return this.coverage;
    }

    /**
     * Get the facets property: The facet query results for the search operation, organized as a collection of buckets
     * for each faceted field; null if the query did not include any facet expressions.
     *
     * @return the facets value.
     */
    public Map<String, List<FacetResult>> getFacets() {
        return this.facets;
    }

    /**
     * Get the answers property: The answers query results for the search operation; null if the answers query parameter
     * was not specified or set to 'none'.
     *
     * @return the answers value.
     */
    public List<AnswerResult> getAnswers() {
        return this.answers;
    }

    /**
     * Get the nextPageParameters property: Continuation JSON payload returned when Azure Cognitive Search can't return
     * all the requested results in a single Search response. You can use this JSON along with @odata.nextLink to
     * formulate another POST Search request to get the next part of the search response.
     *
     * @return the nextPageParameters value.
     */
    public SearchRequest getNextPageParameters() {
        return this.nextPageParameters;
    }

    /**
     * Get the results property: The sequence of results returned by the query.
     *
     * @return the results value.
     */
    public List<SearchResult> getResults() {
        return this.results;
    }

    /**
     * Get the nextLink property: Continuation URL returned when Azure Cognitive Search can't return all the requested
     * results in a single Search response. You can use this URL to formulate another GET or POST Search request to get
     * the next part of the search response. Make sure to use the same verb (GET or POST) as the request that produced
     * this response.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.results, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeNumberField("@odata.count", this.count);
        jsonWriter.writeNumberField("@search.coverage", this.coverage);
        jsonWriter.writeMapField(
                "@search.facets",
                this.facets,
                (writer, element) -> writer.writeArray(element, (writer1, element1) -> writer1.writeJson(element1)));
        jsonWriter.writeArrayField("@search.answers", this.answers, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("@search.nextPageParameters", this.nextPageParameters);
        jsonWriter.writeStringField("@odata.nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchDocumentsResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchDocumentsResult if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SearchDocumentsResult.
     */
    public static SearchDocumentsResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean resultsFound = false;
                    List<SearchResult> results = null;
                    Long count = null;
                    Double coverage = null;
                    Map<String, List<FacetResult>> facets = null;
                    List<AnswerResult> answers = null;
                    SearchRequest nextPageParameters = null;
                    String nextLink = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("value".equals(fieldName)) {
                            results = reader.readArray(reader1 -> SearchResult.fromJson(reader1));
                            resultsFound = true;
                        } else if ("@odata.count".equals(fieldName)) {
                            count = reader.getNullable(JsonReader::getLong);
                        } else if ("@search.coverage".equals(fieldName)) {
                            coverage = reader.getNullable(JsonReader::getDouble);
                        } else if ("@search.facets".equals(fieldName)) {
                            facets =
                                    reader.readMap(
                                            reader1 -> reader1.readArray(reader2 -> FacetResult.fromJson(reader2)));
                        } else if ("@search.answers".equals(fieldName)) {
                            answers = reader.readArray(reader1 -> AnswerResult.fromJson(reader1));
                        } else if ("@search.nextPageParameters".equals(fieldName)) {
                            nextPageParameters = SearchRequest.fromJson(reader);
                        } else if ("@odata.nextLink".equals(fieldName)) {
                            nextLink = reader.getString();
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (resultsFound) {
                        SearchDocumentsResult deserializedValue = new SearchDocumentsResult(results);
                        deserializedValue.count = count;
                        deserializedValue.coverage = coverage;
                        deserializedValue.facets = facets;
                        deserializedValue.answers = answers;
                        deserializedValue.nextPageParameters = nextPageParameters;
                        deserializedValue.nextLink = nextLink;

                        return deserializedValue;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!resultsFound) {
                        missingProperties.add("value");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
