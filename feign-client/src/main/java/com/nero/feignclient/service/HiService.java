package com.nero.feignclient.service;

import com.nero.feignclient.feign.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiService {
    @Autowired
    EurekaClientFeign eurekaClientFeign;
    public String sayHi() {
        return eurekaClientFeign.sayHi();
    }
}
