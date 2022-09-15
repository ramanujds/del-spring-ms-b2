package com.del.traineeapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.del.traineeapp.configuration.AppConfig;
import com.del.traineeapp.ui.TraineeAppUI;

public class TraineeAppMain {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		TraineeAppUI app = context.getBean(TraineeAppUI.class);
		
		app.showMenu();
		
	}

}
