package com.del.tarineeapp.repository;

import java.util.List;

import com.del.tarineeapp.model.Trainee;

public interface TraineeRepository {

	public Trainee addTrainee(Trainee trainee);
	
	public Trainee getTrainee(int traineeId);
	
	public List<Trainee> getAllTrainees();
	
	public boolean deleteTrainee(int traineeId);
	
	public Trainee updateTrainee(Trainee trainee);
	
	public Trainee getTraineeByName(String traineeName);
	
	
}
