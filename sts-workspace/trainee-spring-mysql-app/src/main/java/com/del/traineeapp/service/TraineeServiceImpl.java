package com.del.traineeapp.service;

import java.sql.SQLException;
import java.util.List;

import com.del.traineeapp.model.Trainee;
import com.del.traineeapp.repository.TraineeRepository;
import com.del.traineeapp.repository.TraineeRepositoryJdbcImpl;

public class TraineeServiceImpl implements TraineeService {

	private TraineeRepository repo = new TraineeRepositoryJdbcImpl();

	@Override
	public Trainee addTrainee(Trainee trainee)throws SQLException {
		return repo.saveTrainee(trainee);
	}

	@Override
	public Trainee findTraineeById(int id)throws SQLException {
		return repo.getTraineeById(id);
	}

	@Override
	public boolean deleteTrainee(int id)throws SQLException {
		return repo.deleteTrainee(id);
	}

	@Override
	public List<Trainee> getAllTrainees()throws SQLException {
		return repo.getAllTrainees();
	}
	
	
	
}
