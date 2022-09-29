package com.del.shoppieapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ShoppieAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppieAppApplication.class, args);
	}
	
	@Bean
	public RestTemplate getrRestTemplateBean() {
		return new RestTemplate();
	}

}
