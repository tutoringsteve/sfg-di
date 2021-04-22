package com.sarasinsteven.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//Tells Spring that of the two implementations of the GreetingService interface, this is the implementation bean for Spring to consume.
@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor Injected!";
    }
}
