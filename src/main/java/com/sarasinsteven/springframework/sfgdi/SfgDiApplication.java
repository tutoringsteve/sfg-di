package com.sarasinsteven.springframework.sfgdi;

import com.sarasinsteven.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		//SpringApplication.run( ) returns an ApplicationContext which we can store.
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		//bean name is class name lowercase first letter
		//must be cast because it returns type Object
		MyController myController = (MyController) ctx.getBean("myController");

		//Notice that we did not construct the object myController with the MyController constructor
		//The SpringFramework is going out and retrieving a reference to this object for us using the application context
		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
