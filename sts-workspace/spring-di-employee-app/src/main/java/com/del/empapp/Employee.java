package com.del.empapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Autowired
	private Phone phone;
	
	@Value("${employee.id}")
	private int id;
	
	@Value("${employee.name}")
	private String empName;
	
	@Value("#{${employee.skills}}")
	private List<String> skills;
	
	
	
	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public void connectEmployee() {
		phone.call();
	}
	
	public void printEmployee() {
		System.out.println("ID : "+id);
		System.out.println("Name : "+empName);
		System.out.println("Skills : "+skills);
		phone.showBrand();	
		}

}
