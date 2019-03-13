package cz.smdev.fcm.client.dto

import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("message_id")
    val messageId: String,
    @SerializedName("registration_id")
    val registrationId: String?,
    @SerializedName("error")
    val error: ErrorResult?
)
