package com.del.traineeapp.repository;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.del.traineeapp.model.Trainee;

@Repository
public class TraineeRepositorySpringDataImpl implements TraineeRepository, InitializingBean{
	
	
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	RowMapper<Trainee> mapper;
	
	@Value("${url}")
	String url;
	
	@Value("${username}")
	String username;
	
	@Value("${password}")
	String password;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		DriverManagerDataSource dataSource = new DriverManagerDataSource(url,username,password);
		jdbcTemplate = new JdbcTemplate(dataSource);
		
	}
	

	@Override
	public Trainee saveTrainee(Trainee trainee) throws SQLException {
		jdbcTemplate.update("insert into trainee values(?,?,?)",
									trainee.getId(),trainee.getTraineeName(),trainee.getJoinDate());
		return trainee;
	}

	@Override
	public Trainee getTraineeById(int id) throws SQLException {
		 Trainee trainee = jdbcTemplate.queryForObject("select * from trainee where id="+id,
				 mapper);
		 return trainee;
		
	}

	@Override
	public boolean deleteTrainee(int id) throws SQLException {
		
	int count =	jdbcTemplate.update("delete from trainee where id=?",
				id);
	
	return count>0;

	}

	@Override
	public List<Trainee> getAllTrainees() throws SQLException {
		List<Trainee> list = jdbcTemplate.query("select * from trainee",mapper);
		return list;
	}

	
	
}
