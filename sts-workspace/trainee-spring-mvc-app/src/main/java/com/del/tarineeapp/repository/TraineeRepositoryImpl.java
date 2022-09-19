package com.del.tarineeapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.del.tarineeapp.model.Trainee;

@Repository
public class TraineeRepositoryImpl implements TraineeRepository {
	
	List<Trainee> traineeList = new ArrayList<>();;
	
//	public void init() {
//		traineeList= new ArrayList<>();
//	}

	@Override
	public Trainee addTrainee(Trainee trainee) {
		traineeList.add(trainee);
		return trainee;
	}

	@Override
	public Trainee getTrainee(int traineeId) {
		
		return traineeList.stream().filter(t->t.getTraineeId()==traineeId).findFirst().get();
	}

	@Override
	public List<Trainee> getAllTrainees() {
		return traineeList;
	}

	@Override
	public boolean deleteTrainee(int traineeId) {
		Trainee trainee = getTrainee(traineeId);
		return traineeList.remove(trainee);
	}
	
	

}
