package com.example.bb.healthcheck;

import org.springframework.web.bind.annotation.GetMapping;

public class HealthCheck {

    @GetMapping("/health")
    public String healthCheck() {
        return "healthy";
    }

}
