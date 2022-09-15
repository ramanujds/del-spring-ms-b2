package com.del.traineeapp.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.del.traineeapp.model.Trainee;

public class TraineeRepositoryJdbcImpl implements TraineeRepository {

	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet queryResult;
	
	/*
	 * 
	 * SQL Queries
	 * 
	 * create database deloitte_db;
	 * use deloitte_db;
	 * create table trainee(id numeric(5), trainee_name varchar(50), join_date date);
	 * 
	 * 
	 * 
	 */

	public void connectDb() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deloitte_db", "root", "password");
	}

	@Override
	public Trainee saveTrainee(Trainee trainee) throws SQLException {
		connectDb();
		String sql = "insert into trainee values(?,?,?)";
		psmt = conn.prepareStatement(sql);
		psmt.setInt(1, trainee.getId());
		psmt.setString(2, trainee.getTraineeName());
		psmt.setDate(3, Date.valueOf(trainee.getJoinDate()));
		psmt.executeUpdate();

		return trainee;
	}

	@Override
	public Trainee getTraineeById(int id) throws SQLException {
		connectDb();
		String sql = "select * from trainee where id=?";
		psmt = conn.prepareStatement(sql);
		psmt.setInt(1, id);
		queryResult = psmt.executeQuery();
		if (queryResult.next()) {

			String traineeName = queryResult.getString("trainee_name");
			LocalDate joinDate = queryResult.getDate("join_date").toLocalDate();

			Trainee trainee = new Trainee(id, traineeName, joinDate);
			return trainee;
		}
		return null;
	}

	@Override
	public boolean deleteTrainee(int id) throws SQLException {
		connectDb();
		String sql = "delete from trainee where id=?";
		return false;
	}

	@Override
	public List<Trainee> getAllTrainees() throws SQLException {
		connectDb();
		String sql = "select * from trainee";
		psmt = conn.prepareStatement(sql);
		queryResult = psmt.executeQuery();
		
		List<Trainee> traineeList = new ArrayList<>();
		
		while(queryResult.next()) {
			int id = queryResult.getInt("id");
			String traineeName = queryResult.getString("trainee_name");
			LocalDate joinDate = queryResult.getDate("join_date").toLocalDate();

			Trainee trainee = new Trainee(id, traineeName, joinDate);
			
			traineeList.add(trainee);
		}
		
		return traineeList;
	}

}
