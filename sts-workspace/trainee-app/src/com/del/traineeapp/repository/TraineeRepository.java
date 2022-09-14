package com.del.traineeapp.repository;

import java.util.List;

import com.del.traineeapp.model.Trainee;

public interface TraineeRepository {

	public Trainee saveTrainee(Trainee trainee);
	
	public Trainee getTraineeById(int id);
	
	public boolean deleteTrainee(int id);
	
	public List<Trainee> getAllTrainees();
	
	public Trainee updateTrainee(Trainee trainee);
	
	
	
}
