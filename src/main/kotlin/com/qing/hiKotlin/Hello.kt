package com.qing.hiKotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/kotlin") fun hello() = "hello kotlin"
}
