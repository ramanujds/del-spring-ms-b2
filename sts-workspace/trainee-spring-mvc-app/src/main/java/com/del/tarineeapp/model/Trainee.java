package com.del.tarineeapp.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Trainee {
	
	private int traineeId;
	private String traineeName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate joinDate;
	
	public Trainee() {
		// TODO Auto-generated constructor stub
	}

	public Trainee(int traineeId, String traineeName, LocalDate joinDate) {
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.joinDate = joinDate;
	}

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
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
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", joinDate=" + joinDate + "]";
	}
	

}
