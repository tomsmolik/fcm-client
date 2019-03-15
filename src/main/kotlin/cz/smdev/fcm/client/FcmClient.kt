package cz.smdev.fcm.client

import cz.smdev.fcm.client.service.FcmService

class FcmClient(apiKey: String) : FcmService by FcmClientFactory.provide(BASE_URL, apiKey) {

    companion object {
        const val BASE_URL = "https://fcm.googleapis.com/fcm/"
    }
}
