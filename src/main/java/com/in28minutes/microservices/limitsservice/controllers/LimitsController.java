package com.in28minutes.microservices.limitsservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.configurations.Configuration;
import com.in28minutes.microservices.limitsservice.models.Limits;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;
    
    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(1, 100);
    }

    @GetMapping("/limits-properties")
    public Limits retrieveAppPropertiesLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}