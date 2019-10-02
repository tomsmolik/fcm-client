package cz.smdev.fcm.client.converter

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import cz.smdev.fcm.client.dto.ErrorResult
import java.lang.reflect.Type

class ErrorResultDeserializer : JsonDeserializer<ErrorResult> {

    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): ErrorResult {
        return try {
            ErrorResult.getByKey(json.asString)
        } catch (e: IllegalArgumentException) {
            ErrorResult.UNKNOWN
        }
    }
}
