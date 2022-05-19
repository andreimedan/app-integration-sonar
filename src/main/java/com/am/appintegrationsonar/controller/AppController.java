package com.am.appintegrationsonar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/status")
    public String getStatus() {
        System.out.println("ready");
        return "UP!";
    }
}
