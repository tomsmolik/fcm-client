package cz.smdev.fcm.client.service

import kotlinx.coroutines.Deferred

import retrofit2.http.POST
import retrofit2.http.Body

import cz.smdev.fcm.client.dto.Message
import cz.smdev.fcm.client.dto.Response

interface FcmService {

    @POST("send")
    fun send(@Body message: Message): Deferred<Response>
}
