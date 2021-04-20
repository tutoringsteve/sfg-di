package com.sarasinsteven.springframework.sfgdi.controllers;

import com.sarasinsteven.springframework.sfgdi.services.GreetingServiceImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    //setup the test environment
    @BeforeEach
    void setUp() {
        //mimicking what the SpringFrame Work would be doing
        controller = new PropertyInjectedController();

        controller.greetingService = new GreetingServiceImplementation();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}