package com.del.empapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		 
		System.out.println("App Launched");
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
//		Employee emp = context.getBean(Employee.class);
//		
//		emp.connectEmployee();
//		emp.printEmployee();
//		
//		Employee emp2 = context.getBean(Employee.class);
//		Employee emp3 = context.getBean(Employee.class);

	}

}
