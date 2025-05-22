package com.qing.hiKotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class HiKotlinApplication {
    @GetMapping("/") fun hello() = "Hello, Kotlin SpringBoot!"
}

fun main(args: Array<String>) {
    runApplication<HiKotlinApplication>(*args)
}
