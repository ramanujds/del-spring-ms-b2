package com.del.traineeapp.configuration;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.del.traineeapp.model.Trainee;

@Component
public class TraineeResultMapper implements RowMapper<Trainee> {

	@Override
	public Trainee mapRow(ResultSet queryResult, int rowNum) throws SQLException {
		String traineeName = queryResult.getString("trainee_name");
		LocalDate joinDate = queryResult.getDate("join_date").toLocalDate();
		int id = queryResult.getInt("id");
		Trainee trainee = new Trainee(id, traineeName, joinDate);
		return trainee;
	}
	
	
	

}
