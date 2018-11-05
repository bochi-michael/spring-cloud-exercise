package com.test.helloconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Profile("ribbon")
public class RibbonService implements HelloService {

    private final RestTemplate restTemplate;

    @Autowired
    public RibbonService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String testHello() {
        return restTemplate.getForObject("http://hello-service/hello?name=ribbon", String.class);
    }
}
