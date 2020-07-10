package com.nero.feignclient.feign;

import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHi() {
        return "hystrix on";
    }
}
