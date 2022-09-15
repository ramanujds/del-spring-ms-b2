package com.del.traineeapp.service;

import java.sql.SQLException;
import java.util.List;

import com.del.traineeapp.model.Trainee;

public interface TraineeService {

	public Trainee addTrainee(Trainee trainee)throws SQLException;
	public Trainee findTraineeById(int id)throws SQLException;
	public boolean deleteTrainee(int id)throws SQLException;
	public List<Trainee> getAllTrainees()throws SQLException;
	
	
	
}
