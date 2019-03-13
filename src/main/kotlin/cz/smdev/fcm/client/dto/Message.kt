package cz.smdev.fcm.client.dto

import com.google.gson.annotations.SerializedName

data class Message(
    @SerializedName("to")
    val to: String? = null,
    @SerializedName("registration_ids")
    val registrationIds: List<String>? = null,
    @SerializedName("condition")
    val condition: String? = null,
    @SerializedName("collapse_key")
    val collapseKey: String? = null,
    @SerializedName("priority")
    val priority: String? = null,
    @SerializedName("time_to_live")
    val timeToLive: Int? = null,
    @SerializedName("delay_while_idle")
    val delayWhileIdle: Boolean? = null,
    @SerializedName("restricted_package_name")
    val restrictedPackageName: String? = null,
    @SerializedName("notification")
    val notification: Notification? = null,
    @SerializedName("data")
    val data: Map<String, String>? = null
)
