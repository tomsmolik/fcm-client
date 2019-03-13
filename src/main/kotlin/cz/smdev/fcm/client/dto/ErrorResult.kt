package cz.smdev.fcm.client.dto

enum class ErrorResult(val key: String) {

    MISSING_REGISTRATION_TOKEN("MissingRegistration"),
    INVALID_REGISTRATION_TOKEN("InvalidRegistration"),
    NOT_REGISTERED_DEVICE("NotRegistered"),
    MISMATCH_SENDER_ID("MismatchSenderId"),
    MESSAGE_TOO_BIG("MessageTooBig"),
    INVALID_PARAMETERS("InvalidParameters"),
    INVALID_DATA_KEY("InvalidDataKey"),
    INVALID_TIME_TO_LIVE("InvalidTtl"),
    INVALID_PACKAGE_NAME("InvalidPackageName"),
    INTERNAL_SERVER_ERROR("InternalServerError"),
    DEVICE_MESSAGE_RATE_EXCEEDED("DeviceMessageRateExceeded"),
    TOPICS_MESSAGE_RATE_EXCEEDED("TopicsMessageRateExceeded"),
    INVALID_APN_CREDENTIAL("InvalidApnsCredential"),
    UNKNOWN("Unknown");

    companion object {

        fun getByKey(key: String): ErrorResult {
            values().forEach {
                if (key == it.key) return it
            }
            throw IllegalArgumentException("Unknown error type.")
        }
    }
}
