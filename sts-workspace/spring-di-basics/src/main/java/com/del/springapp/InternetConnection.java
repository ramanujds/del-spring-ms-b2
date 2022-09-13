package com.del.springapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("airtel4g")
public class InternetConnection {
	
	@Value("${conn-name}")
	private String connectionName;
	
	
	
	public InternetConnection(String connectionName) {
		this.connectionName = connectionName;
	}

	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
	}

	public InternetConnection() {
		System.out.println("Internet Connection Object Created..");
	}

	public void connect() {
		System.out.println("Connected to Internet using "+connectionName+"... Meeting is Starting..");
	}
	
}
