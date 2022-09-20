package com.del.tarineeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.del.tarineeapp.model.Trainee;
import com.del.tarineeapp.repository.TraineeRepository;

@Service
public class TraineeServiceImpl implements TraineeService{
	
	@Autowired
	@Qualifier("trainee_jpa_repo")
	private TraineeRepository repo;

	@Transactional
	public Trainee addTrainee(Trainee trainee) {
		return repo.addTrainee(trainee);
	}

	
	public Trainee searchTrainee(int traineeId) {
		return repo.getTrainee(traineeId);
	}

	
	public List<Trainee> getAllTrainees() {
		return repo.getAllTrainees();
	}

	@Transactional
	public boolean deleteTrainee(int traineeId) {
		return repo.deleteTrainee(traineeId);
	}
	

	@Transactional
	public Trainee updateTrainee(Trainee trainee) {
		return repo.updateTrainee(trainee);
	}
 
}
