package com.sarasinsteven.springframework.sfgdi.controllers;

import com.sarasinsteven.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    //Note we use the interface but will inject an instance of an implementing class

    //Could have placed @Autowired here! Incredible. Best practice is to place above the setter.
    private GreetingService greetingService;

    //@Autowired automatically injects an instance of this property when you grab this controller class from the context
    //@Qualifier with the lowerCamelCase bean name tells Spring which implementation to use when injecting.
    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
