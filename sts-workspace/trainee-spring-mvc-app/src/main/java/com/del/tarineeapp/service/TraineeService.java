package com.del.tarineeapp.service;

import java.util.List;

import com.del.tarineeapp.model.Trainee;

public interface TraineeService {

	public Trainee addTrainee(Trainee trainee);
	
	public Trainee searchTrainee(int traineeId);
	
	public List<Trainee> getAllTrainees();
	
	public boolean deleteTrainee(int traineeId);
	
	public Trainee updateTrainee(Trainee trainee);
	
}
