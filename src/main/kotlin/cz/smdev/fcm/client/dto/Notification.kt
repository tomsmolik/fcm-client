package cz.smdev.fcm.client.dto

import com.google.gson.annotations.SerializedName

data class Notification(
    @SerializedName("title")
    val title: String,
    @SerializedName("body")
    val body: String? = null,
    @SerializedName("icon")
    val icon: String? = null,
    @SerializedName("sound")
    val sound: String? = null,
    @SerializedName("tag")
    val tag: String? = null,
    @SerializedName("color")
    val color: String? = null,
    @SerializedName("click_action")
    val clickAction: String? = null,
    @SerializedName("body_loc_key")
    val bodyLocKey: String? = null,
    @SerializedName("body_loc_args")
    val bodyLocArgs: String? = null,
    @SerializedName("title_loc_key")
    val titleLocKey: String? = null,
    @SerializedName("title_loc_args")
    val titleLocArgs: String? = null
)
