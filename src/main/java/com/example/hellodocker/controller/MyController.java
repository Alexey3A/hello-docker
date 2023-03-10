package com.example.hellodocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/FQDN")
public class MyController {

    @GetMapping("/greetings")
    public String showGreetings(){
        return "hi";
    }
}
