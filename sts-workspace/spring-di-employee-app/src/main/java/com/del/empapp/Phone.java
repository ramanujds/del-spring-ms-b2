package com.del.empapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phone {
	
	@Autowired
	private Sim sim;
	
	@Value("${phone.brand}")
	private String brand;
	
	
	
	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void call() {
		sim.call();
	}
	
	public void showBrand() {
		System.out.println("Brand : "+brand);
	}

}
