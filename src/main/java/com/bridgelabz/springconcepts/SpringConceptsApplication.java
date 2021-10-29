package com.bridgelabz.springconcepts;

import com.bridgelabz.springconcepts.component.DemoBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) 
	{
		System.out.print("Welcome to spring concept demo");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println("Demo Bean ="+demoBean.toString());
	}

}
