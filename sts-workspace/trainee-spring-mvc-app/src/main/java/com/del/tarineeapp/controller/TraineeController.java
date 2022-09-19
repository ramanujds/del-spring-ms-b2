package com.del.tarineeapp.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.del.tarineeapp.model.Trainee;

@Controller
public class TraineeController {

	
//	@RequestMapping(path = "/register", method = RequestMethod.POST)
	
	@PostMapping("/register")
	public String addTrainee(@RequestParam("traineeId") int traineeId,
								@RequestParam("traineeName") String traineeName,
								@RequestParam("joinDate") String date,
								Model m) {
		
		LocalDate joinDate = LocalDate.parse(date);
		
		Trainee trainee = new Trainee(traineeId, traineeName, joinDate);
		
		System.out.println(trainee);
		m.addAttribute("trainee", trainee);
		
		return "show-trainee.jsp";
	}
	
}
