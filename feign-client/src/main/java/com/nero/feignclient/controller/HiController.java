package com.nero.feignclient.controller;

import com.nero.feignclient.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private HiService hiService;

    @GetMapping("/callhi")
    public String hello() {
        return hiService.sayHi();
    }
}
