package com.test.helloconsumer.service;


import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("feign")
@Service
@EnableFeignClients
public class FeignService implements HelloService {

    private final FeignClient feignClient;

    public FeignService(FeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @Override
    public String testHello() {
        return feignClient.testHello("feign");
    }
}
