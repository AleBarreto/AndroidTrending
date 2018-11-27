package com.anderson.androidtrend.model


import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("total_count", "incomplete_results", "items")
class Response {

    @JsonProperty("total_count")
    var totalCount: Int? = null
    @JsonProperty("incomplete_results")
    var incompleteResults: Boolean? = null
    @JsonProperty("items")
    var items: List<Item>? = null

}