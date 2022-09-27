package com.del.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.del.auth.model.User;

public interface UserRepository extends JpaRepository<User, String>{

	@Query("from User where username=:username and password=:password")
	public User findByUsernameAndPassword(String username, String password);
	
}
