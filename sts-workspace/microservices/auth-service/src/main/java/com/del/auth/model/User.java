package com.del.auth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {

	@Id
	private String username;
	private String password;
	@Column(unique = true)
	private String email;
	@Enumerated
	private UserType userType;
	
	
	
	
}
