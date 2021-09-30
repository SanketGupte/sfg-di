package com.sanket.sfgdi.services.impl;

import com.sanket.sfgdi.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
