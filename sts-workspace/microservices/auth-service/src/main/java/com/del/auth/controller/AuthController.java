package com.del.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.del.auth.dto.UserCredentials;
import com.del.auth.model.User;
import com.del.auth.service.UserService;

@RestController
@RequestMapping("/public")
public class AuthController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return service.registerUser(user);
	}
	
	@PostMapping("/authenticate")
	public String login(@RequestBody UserCredentials creds) {
		return service.authenticateUser(creds);
	}

}
