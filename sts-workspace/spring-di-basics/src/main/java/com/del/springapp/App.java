package com.del.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		

		// BeanFactory
		// ApplicationContext
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Laptop myLaptop = context.getBean("macbook",Laptop.class); 
		InternetConnection conn = context.getBean("jio4G",InternetConnection.class);
		myLaptop.joinMeeting();
		
		
		
	}

}
