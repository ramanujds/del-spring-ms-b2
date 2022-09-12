package com.del.app;

import java.util.Objects;

public class Person implements Comparable<Person> {
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



	
	public int compareTo(Person p) {
		return (int)(this.salary-p.salary);
		
	}



	@Override
	public int hashCode() {
		return Objects.hash(age, email, personName, salary);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(email, other.email) && Objects.equals(personName, other.personName)
				&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
	}
	
	
	
}
