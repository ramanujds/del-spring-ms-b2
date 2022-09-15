package com.del.traineeapp.repository;

import java.sql.SQLException;
import java.util.List;

import com.del.traineeapp.model.Trainee;

public interface TraineeRepository {

	public Trainee saveTrainee(Trainee trainee) throws SQLException;
	
	public Trainee getTraineeById(int id)throws SQLException;
	
	public boolean deleteTrainee(int id)throws SQLException;
	
	public List<Trainee> getAllTrainees()throws SQLException;
	
}
