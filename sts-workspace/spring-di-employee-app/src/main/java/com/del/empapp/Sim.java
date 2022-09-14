package com.del.empapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Sim {

	@Value("${sim.phoneNo}")
	private long phoneNo;
	
	public Sim() {
		System.out.println("Sim Object Created");
	}
	
	
	public void setPhoneNo(long phoneNo) {
		this.phoneNo=phoneNo;
	}
	
	public void call() {
		System.out.println("Making a call using "+phoneNo);
	}
	
	
}
