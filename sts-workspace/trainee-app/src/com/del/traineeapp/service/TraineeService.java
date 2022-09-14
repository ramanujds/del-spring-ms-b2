package com.del.traineeapp.service;

import java.util.List;

import com.del.traineeapp.model.Trainee;

public interface TraineeService {

	public Trainee searchTrainee(int id);
	
	public Trainee addTrainee(Trainee trainee);
	
	public boolean deleteTrainee(int id);
	
	public Trainee updateTrainee(Trainee trainee);
	
	public List<Trainee> getAllTrainees();
	
}
