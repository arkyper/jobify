package com.arkyper.jobify.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    
    @GetMapping("/health")
    public String healthCheck(){
        return "Server is up and running...";
    }
}
