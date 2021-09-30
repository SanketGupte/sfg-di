package com.sanket.sfgdi.services.impl;

import com.sanket.sfgdi.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
