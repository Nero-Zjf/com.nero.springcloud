package com.nero.feignclient.feign;

import com.nero.feignclient.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client",configuration = FeignConfig.class,fallback = HiHystrix.class)
public interface EurekaClientFeign {
    @GetMapping("/hi")
    String sayHi();
}
