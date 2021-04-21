package com.sarasinsteven.springframework.sfgdi.controllers;

import com.sarasinsteven.springframework.sfgdi.services.GreetingServiceImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImplementation());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}