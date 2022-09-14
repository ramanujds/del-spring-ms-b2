package com.del.traineeapp.service;

import java.util.List;

import com.del.traineeapp.model.Trainee;
import com.del.traineeapp.repository.TraineeRepository;
import com.del.traineeapp.repository.TraineeRepositoryImpl;
import com.del.traineeapp.repository.TraineeRepositoryJdbcImpl;

public class TraineeServiceImpl implements TraineeService {
	
	TraineeRepository repo = new TraineeRepositoryJdbcImpl();

	@Override
	public Trainee searchTrainee(int id) {
		return repo.getTraineeById(id);
	}

	@Override
	public Trainee addTrainee(Trainee trainee) {
		return repo.saveTrainee(trainee);
	}

	@Override
	public boolean deleteTrainee(int id) {
		return repo.deleteTrainee(id);
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		return repo.updateTrainee(trainee);
	}

	@Override
	public List<Trainee> getAllTrainees() {
		return repo.getAllTrainees();
	}

	
	
}
