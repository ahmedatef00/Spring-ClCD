package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldController {
    @RequestMapping("/")
    public String hello() {
        return "<h1> Congratulations. You have successfully deployed the sample Spring Boot Application. </h1>";
    }
}
