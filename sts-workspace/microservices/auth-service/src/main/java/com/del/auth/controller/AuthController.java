package com.del.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.del.auth.dto.UserCredentials;
import com.del.auth.model.User;
import com.del.auth.service.UserService;

@RestController
public class AuthController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/public/users")
	public User addUser(@RequestBody User user) {
		return service.registerUser(user);
	}
	
	@PostMapping("/public/authenticate")
	public String login(@RequestBody UserCredentials creds) {
		return service.authenticateUser(creds);
	}

}
