package com.qing.hiKotlin

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping

@SpringBootApplication
@RestController
class HiKotlinApplication {
    @GetMapping("/")
    fun hello() = "Hello, Kotlin SpringBoot!"

    @Bean
    fun logEndpoints(applicationContext: ApplicationContext): CommandLineRunner = CommandLineRunner {
        val handlerMapping = applicationContext.getBean(RequestMappingHandlerMapping::class.java)
        handlerMapping.handlerMethods.forEach { (info, _) ->
            val patterns = info.directPaths // ✅ Spring Boot 3.x 推荐用法
            println("Mapped URL: $patterns")
        }
    }

}

fun main(args: Array<String>) {
    runApplication<HiKotlinApplication>(*args)
}
