package com.del.traineeapp.configuration;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.del.traineeapp")
public class AppConfig {
	
	@Bean
	public Scanner getScanner() {
		return new Scanner(System.in);
	}

}
