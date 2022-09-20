package com.del.tarineeapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.del.tarineeapp.model.Trainee;

@Repository("trainee_jpa_repo")
public class TraineeRepositoryJpaImpl implements TraineeRepository {
	
	@PersistenceContext
	private EntityManager emgr;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		emgr.persist(trainee);
		return trainee;
	}

	@Override
	public Trainee getTrainee(int traineeId) {
		return emgr.find(Trainee.class, traineeId);
	}

	@Override
	public List<Trainee> getAllTrainees() {
		Query findAll = emgr.createQuery("from Trainee");
		return findAll.getResultList();
	}

	@Override
	public boolean deleteTrainee(int traineeId) {
		Trainee trainee = getTrainee(traineeId);
		emgr.remove(trainee);
		return true;
	}
	
	@Override
	public Trainee updateTrainee(Trainee trainee) {
		
		Trainee oldTrainee = getTrainee(trainee.getTraineeId());
		oldTrainee.setTraineeName(trainee.getTraineeName());
		oldTrainee.setJoinDate(trainee.getJoinDate());
		return trainee;
		
	}
	
	 @Override
	public Trainee getTraineeByName(String traineeName) {
		
		 Query findByName = emgr.createQuery("from Trainee where traineeName=:tname");
		 findByName.setParameter("tname", traineeName);
		 
		 Trainee trainee = (Trainee) findByName.getSingleResult();
		 
		 return trainee;
		 
	}
	
	

}
