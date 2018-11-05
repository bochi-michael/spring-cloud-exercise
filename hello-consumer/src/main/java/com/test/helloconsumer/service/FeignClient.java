package com.test.helloconsumer.service;

import org.springframework.web.bind.annotation.*;

@org.springframework.cloud.openfeign.FeignClient("hello-service")
public interface FeignClient {
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    String testHello(@RequestParam("name") String name);
}
