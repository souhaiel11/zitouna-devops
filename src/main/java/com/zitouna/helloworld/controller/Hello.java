package com.zitouna.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    public String sayHello() {
        return "Hello Zitouna Bank from Spring Boot!";
    }

    @GetMapping("/{name}")
    public String sayHelloName(@PathVariable String name) {
        return "Hello " + name + " from Zitouna Bank!";
    }
}
