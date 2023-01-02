package com.elky.websocket

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinWebSocketApplication

fun main(args: Array<String>) {
    runApplication<KotlinWebSocketApplication>(*args)
}
