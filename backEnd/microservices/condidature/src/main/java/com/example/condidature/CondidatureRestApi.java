package com.example.condidature;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic3/condidature")
public class CondidatureRestApi {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello I'm Microservice Condidature";
    }
}
