package com.test.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class WelcomeController {
    @GetMapping("/")
    public String welcome() throws Exception {
        return "Welcome to sample Spring boot !!!  ,Time : "+ LocalTime.now();
    }
}
