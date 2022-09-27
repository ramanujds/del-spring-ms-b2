package com.del.auth.service;

import com.del.auth.dto.UserCredentials;
import com.del.auth.model.User;


public interface UserService {

	
	
	public String authenticateUser(UserCredentials creds);
	
	public User registerUser(User user);
	
	public User findByUsername(String username);
	
	
}
