package cz.smdev.fcm.client.dto

import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("multicast_id")
    val multicastId: Long,
    @SerializedName("success")
    val success: Int,
    @SerializedName("failure")
    val failure: Int,
    @SerializedName("canonical_ids")
    val canonicalIds: Int,
    @SerializedName("results")
    val results: List<Result>
)
