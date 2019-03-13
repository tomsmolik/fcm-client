package cz.smdev.fcm.client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FcmClientApplication

fun main(args: Array<String>) {
    runApplication<FcmClientApplication>(*args)
}
