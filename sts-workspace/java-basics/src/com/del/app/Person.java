package com.del.app;

public class Person {
	private String personName;
	private int age;
	private String email;
	private float salary;
	
	public Person() {
	}
	
	

	public Person(String personName, int age, String email, float salary) {
		super();
		this.personName = personName;
		this.age = age;
		this.email = email;
		this.salary = salary;
	}



	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	public float getSalary() {
		return salary;
	}



	public void setSalary(float salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Person [personName=" + personName + ", age=" + age + ", email=" + email + ", salary=" + salary + "]";
	}



	
	
	
}
