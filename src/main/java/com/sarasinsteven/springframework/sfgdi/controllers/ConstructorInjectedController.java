package com.sarasinsteven.springframework.sfgdi.controllers;

import com.sarasinsteven.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    //The @Autowired annotation is actually optional for a Constructor!
    //@Autowired
    //@Qualifier with the lowerCamelCase bean name tells Spring which implementation to use when injecting.
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
