package com.del.traineeapp.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.del.traineeapp.model.Trainee;
import com.del.traineeapp.service.TraineeService;
import com.del.traineeapp.service.TraineeServiceImpl;

public class TraineeAppUI {
	
	Scanner scan = new Scanner(System.in);
	private TraineeService service=new TraineeServiceImpl();

	public void addTrainee() {
		// Read trainee details from user
		System.out.println("Enter ID : ");
		int id = scan.nextInt();
		
		System.out.println("Enter Name : ");
		String traineeName = scan.next()+scan.nextLine();
		
		System.out.println("Enter Joined Date(yyyy-MM-dd) : ");
		String date = scan.nextLine();
		LocalDate joinDate = LocalDate.parse(date);
		
		Trainee trainee = new Trainee(id, traineeName, joinDate) ;
		service.addTrainee(trainee);
		
		System.out.println("Trainee Added");
		
		// call the addTrainee() method from service layer to add the trainee
		
	}
	
	public void searchTrainee() {
		
		
	}
	
	
}
