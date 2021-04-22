package com.sarasinsteven.springframework.sfgdi;

import com.sarasinsteven.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {


		//SpringApplication.run( ) returns an ApplicationContext which we can store.
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");

		System.out.println("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("\nmyController");
		//bean name is class name lowercase first letter
		//must be cast because it returns type Object
		MyController myController = (MyController) ctx.getBean("myController");

		//Notice that we did not construct the object myController with the MyController constructor
		//The SpringFramework is going out and retrieving a reference to this object for us using the application context
		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("\n------ Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		//Not needed when we @Autowire the GreetingService property in PropertyInjectedController
		//But don't forget to also add @Service to the PropertyInjectedGreetingService class
		//propertyInjectedController.greetingService = new PropertyInjectedGreetingService();

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("\n------ Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("\n------ Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
	}

}
