package com.test.helloconsumer;

import com.test.helloconsumer.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final HelloService helloService;

    public Controller(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("test-hello")
    public String testHello() {
        return helloService.testHello();
    }
}
