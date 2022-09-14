package com.del.empapp;

public class Sim {

	private long phoneNo;
	
	public void setPhoneNo(long phoneNo) {
		this.phoneNo=phoneNo;
	}
	
	public void call() {
		System.out.println("Making a call using "+phoneNo);
	}
	
	
}
