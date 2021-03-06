package com.nero.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {
    @Value("${foo}")
    private String foo;

    @GetMapping("/foo")
    public String foo() {
        return "hi the foo is " + foo;
    }
}
