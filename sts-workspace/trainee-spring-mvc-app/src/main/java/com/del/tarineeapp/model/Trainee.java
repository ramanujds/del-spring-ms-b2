package com.del.tarineeapp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "trainee_db")
public class Trainee {
	
	@Id
	@Column(name = "trainee_id")
	private int traineeId;
	
	@Column(length = 50, nullable = false, name = "trainee_name")
	private String traineeName;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="join_date")
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
