package com.qing.hiKotlin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaController {

    @GetMapping("/java")
    public String index() {
        return "hello java";
    }
}
