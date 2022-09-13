package com.del.springapp;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	@Autowired
	@Qualifier("airtel4g")
	private InternetConnection connection;
	
	@Value("${brand}")
	private String brand;
	@Value("${ram}")
	private int ram;
	@Value("#{${supportedConnections}}")
	private Set<String> supportedConnections;

	public Laptop() {
		System.out.println("Laptop Object Created..");
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setConnection(InternetConnection connection) {
		this.connection = connection;
	}

	public void setSupportedConnections(Set<String> supportedConnections) {
		this.supportedConnections = supportedConnections;
	}

	public void joinMeeting() {
		connection.connect();
		System.out.println("Meeting Joined");
	}

	public void printDetails() {
		System.out.println("Brand : " + brand);
		System.out.println("Memory : " + ram);
		supportedConnections.forEach(c->System.out.println(c));
	}

}
