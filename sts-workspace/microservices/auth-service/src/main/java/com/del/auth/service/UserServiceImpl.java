package com.del.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.del.auth.dto.UserCredentials;
import com.del.auth.model.User;
import com.del.auth.repository.UserRepository;
import com.del.auth.util.JwtUtil;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	public String authenticateUser(UserCredentials creds) {
		
		User user = 
				
				repo.findByUsernameAndPassword(creds.getUsername(), creds.getPassword());
		
		if(user!=null) {
			return jwtUtil.generateToken(user.getUsername());
		}
		throw new RuntimeException("Invalid Credentails");
	}
	
	
	public User registerUser(User user) {
		return repo.save(user);
	}
	
	@Override
	public User findByUsername(String username) {
		return repo.findById(username).get();
	}

}
