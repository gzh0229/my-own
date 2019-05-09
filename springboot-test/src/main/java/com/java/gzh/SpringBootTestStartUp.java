package com.java.gzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SpringBootTestStartUp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestStartUp.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "hello";
    }

}
