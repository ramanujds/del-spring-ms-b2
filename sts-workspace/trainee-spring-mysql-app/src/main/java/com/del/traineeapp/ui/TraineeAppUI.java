package com.del.traineeapp.ui;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.del.traineeapp.model.Trainee;
import com.del.traineeapp.service.TraineeService;
import com.del.traineeapp.service.TraineeServiceImpl;

@Component
public class TraineeAppUI {
	
	Scanner scan = new Scanner(System.in);
	@Autowired
	TraineeService service;
	
	
	public void showMenu() {
		int input = 1;
		do {
		System.out.println("Choose an option : ");
		System.out.println("1 : Insert new Trainee");
		System.out.println("2 : Search Trainee");
		System.out.println("3 : Delete Trainee");
		System.out.println("4 : Get all trainees");
		System.out.println("0 : Exit");
		System.out.print("Your Input : ");
		input = scan.nextInt();
		
		switch (input) {
		case 1:
			addTrainee();
			break;
		case 2:
			getTrainee();
			break;
		case 3:
			deleteTrainee();
			break;

		case 4:
			getAllTrainees();
			break;
			
		case 0:
			System.exit(0);;
			break;
		default:
			System.out.println("Invalid Input \n");
			break;
		}
		
		}while(input!=0);
	}

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
		try {
			service.addTrainee(trainee);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Trainee Added");
		
		// call the addTrainee() method from service layer to add the trainee
		
	}
	
	public void getTrainee() {
		System.out.println("Enter ID : ");
		int id = scan.nextInt();
		Trainee trainee;
		try {
			trainee = service.findTraineeById(id);
			System.out.println(trainee);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		
		
	}
	
	public void getAllTrainees() {
		try {
			List<Trainee> trainees = service.getAllTrainees();
			trainees.forEach(t->System.out.println(t));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void deleteTrainee() {
		System.out.println("Enter ID : ");
		int id = scan.nextInt();
		try {
			if(service.deleteTrainee(id)) {
				System.out.println("Deleted");
			}
			else {
				System.out.println("Unable to delete");
			}
		} catch (SQLException e) {
			System.err.println(e);
		}
	}
	
	
}
