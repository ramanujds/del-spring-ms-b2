package com.del.traineeapp.repository;

import java.util.ArrayList;
import java.util.List;

import com.del.traineeapp.model.Trainee;

public class TraineeRepositoryImpl implements TraineeRepository {
	
	private List<Trainee> traineeList = new ArrayList<>();

	
	public Trainee saveTrainee(Trainee trainee) {
		traineeList.add(trainee);
		return trainee;
	}

	
	public Trainee getTraineeById(int id) {
		
		// return traineeList.stream().filter(t->t.getId()==id).findFirst().get();
		
		Trainee trainee = null;
		for(Trainee t:traineeList) {
			if(t.getId()==id) {
				trainee=t;
			}
		}
		return trainee;
	}

	@Override
	public boolean deleteTrainee(int id) {
		Trainee trainee = getTraineeById(id);
		return traineeList.remove(trainee);
		
	}

	@Override
	public List<Trainee> getAllTrainees() {
		return traineeList;
	}

	@Override
	public Trainee updateTrainee(Trainee newTrainee) {
		Trainee oldTrainee = getTraineeById(newTrainee.getId());
		oldTrainee.setJoinDate(newTrainee.getJoinDate());
		oldTrainee.setTraineeName(newTrainee.getTraineeName());
		return newTrainee;
	}

	
	
}
