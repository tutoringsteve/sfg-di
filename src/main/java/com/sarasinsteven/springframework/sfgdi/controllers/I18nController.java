package com.sarasinsteven.springframework.sfgdi.controllers;
import com.sarasinsteven.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//I18n = Internationalization it is a numeronym substituting the middle 18 letters with 18.
//This controller class will return back two different languages depending on the profile that we have active.

@Controller
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

