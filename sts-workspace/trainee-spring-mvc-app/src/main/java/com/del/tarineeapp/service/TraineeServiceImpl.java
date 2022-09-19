package com.del.tarineeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.del.tarineeapp.model.Trainee;
import com.del.tarineeapp.repository.TraineeRepository;

@Service
public class TraineeServiceImpl implements TraineeService{
	
	@Autowired
	private TraineeRepository repo;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		return repo.addTrainee(trainee);
	}

	@Override
	public Trainee searchTrainee(int traineeId) {
		return repo.getTrainee(traineeId);
	}

	@Override
	public List<Trainee> getAllTrainees() {
		return repo.getAllTrainees();
	}

	@Override
	public boolean deleteTrainee(int traineeId) {
		return repo.deleteTrainee(traineeId);
	}
 
}
