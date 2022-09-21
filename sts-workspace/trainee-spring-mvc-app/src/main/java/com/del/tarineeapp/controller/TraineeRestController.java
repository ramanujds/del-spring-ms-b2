package com.del.tarineeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.del.tarineeapp.model.Trainee;
import com.del.tarineeapp.service.TraineeService;

@RestController
public class TraineeRestController {
	
	@Autowired
	private TraineeService service;
	
	@GetMapping("/trainees/{id}")
	public Trainee getTrainee(@PathVariable int id) {
		return service.searchTrainee(id);
	}
	
	@GetMapping("/trainees")
	public List<Trainee> getAllTrainees(){
		return service.getAllTrainees();
	}
	
	@PostMapping("/trainees")
	public Trainee addTrainee(@RequestBody Trainee trainee) {
		return service.addTrainee(trainee);
	}
	
	@DeleteMapping("/trainees/{id}")
	public boolean deleteTrainee(@PathVariable("id") int traineeId) {
		return service.deleteTrainee(traineeId);
	}
	
	@PutMapping("/trainees")
	public Trainee updateTrainee(@RequestBody Trainee trainee) {
		return service.updateTrainee(trainee);
	}

}
