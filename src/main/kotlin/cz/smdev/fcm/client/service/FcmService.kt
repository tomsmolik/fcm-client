package cz.smdev.fcm.client.service

import cz.smdev.fcm.client.dto.Message
import cz.smdev.fcm.client.dto.Response
import kotlinx.coroutines.Deferred
import retrofit2.http.Body
import retrofit2.http.POST

interface FcmService {

    @POST("send")
    fun send(@Body message: Message): Deferred<Response>
}
