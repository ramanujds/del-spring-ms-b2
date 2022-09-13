package com.del.empapp;

import java.util.List;

public class Employee {
	
	private Phone phone;
	
	private int id;
	private String empName;
	private List<String> skills;
	
	public void connectEmployee() {
		phone.call();
	}
	
	public void printEmployee() {
		System.out.println("ID : "+id);
		System.out.println("Name : "+empName);
		System.out.println("Skills : "+skills);
	}

}
