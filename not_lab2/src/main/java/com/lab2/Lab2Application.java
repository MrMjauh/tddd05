package com.lab2;

import com.lab2.controller.ItemController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class Lab2Application {

	public static void main(String[] args) {
		System.out.println("Working Directory = " +
				System.getProperty("user.dir"));
		ApplicationContext ctx = new ClassPathXmlApplicationContext("xml/controller.xml");
		ItemController hi = (ItemController) ctx.getBean("itemController");
		//SpringApplication.run(Lab2Application.class, args);
	}
}
