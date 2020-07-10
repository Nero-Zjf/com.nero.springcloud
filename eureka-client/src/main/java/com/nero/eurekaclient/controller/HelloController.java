package com.nero.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String hello() {
        return "hi i am from " + port;
    }
}
