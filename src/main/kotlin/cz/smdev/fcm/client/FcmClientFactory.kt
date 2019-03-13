package cz.smdev.fcm.client

import com.google.gson.GsonBuilder

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory

import cz.smdev.fcm.client.dto.ErrorResult
import cz.smdev.fcm.client.service.FcmService
import cz.smdev.fcm.client.converter.ErrorResultDeserializer

import org.slf4j.LoggerFactory

object ClientFactory {

    private val logger = LoggerFactory.getLogger(ClientFactory::class.java)

    private const val HEADER_AUTHORIZATION = "Authorization"

    fun provide(baseUrl: String, fcmKey: String): FcmService {

        val client = OkHttpClient().newBuilder()
            .addNetworkInterceptor { chain ->
                chain
                    .request()
                    .newBuilder()
                    .addHeader(HEADER_AUTHORIZATION, "key=$fcmKey")
                    .build()
                    .let(chain::proceed)
            }
            .addInterceptor(HttpLoggingInterceptor(
                HttpLoggingInterceptor.Logger {
                    logger.debug(it)
                }
            ).apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .build()

        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create(
                GsonBuilder()
                    .registerTypeAdapter(ErrorResult::class.java, ErrorResultDeserializer())
                    .create()
            ))
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()
            .create(FcmService::class.java)
    }
}
