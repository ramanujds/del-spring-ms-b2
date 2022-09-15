package com.del.traineeapp.model;

import java.time.LocalDate;

public class Trainee {

	private int id;
	private String traineeName;
	private LocalDate joinDate;
	
	public Trainee() {
	}
	
	public Trainee(int id, String traineeName, LocalDate joinDate) {
		super();
		this.id = id;
		this.traineeName = traineeName;
		this.joinDate = joinDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "Trainee [id=" + id + ", traineeName=" + traineeName + ", joinDate=" + joinDate + "]";
	}
	
	
	
	
	
}
