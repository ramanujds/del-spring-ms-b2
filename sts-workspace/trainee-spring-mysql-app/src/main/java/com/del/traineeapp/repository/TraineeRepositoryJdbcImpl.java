package com.del.traineeapp.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.del.traineeapp.model.Trainee;

public class TraineeRepositoryJdbcImpl implements TraineeRepository {
	
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet queryResult;

	@Override
	public Trainee saveTrainee(Trainee trainee) throws SQLException {
		
		String sql = "insert into trainee values(?,?,?)";
		psmt = conn.prepareStatement(sql);
		psmt.setInt(1, trainee.getId());
		psmt.setString(2, trainee.getTraineeName());
		psmt.setDate(3, Date.valueOf(trainee.getJoinDate()));
		psmt.executeUpdate();
		
		return null;
	}

	@Override
	public Trainee getTraineeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteTrainee(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Trainee> getAllTrainees() {
		// TODO Auto-generated method stub
		return null;
	}

}
