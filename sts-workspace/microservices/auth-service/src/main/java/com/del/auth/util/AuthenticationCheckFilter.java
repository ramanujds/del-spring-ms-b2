package com.del.auth.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.del.auth.model.User;
import com.del.auth.service.UserService;

@Component
public class AuthenticationCheckFilter implements Filter {
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private UserService service;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("Request Intercepted..");
		
		
		HttpServletRequest req = (HttpServletRequest) request;
		
		if(req.getRequestURI().startsWith("/public")) {
			chain.doFilter(request, response);
			return;
		}
		
		String token = req.getHeader("auth");
		if(token==null || token=="") {
			throw new RuntimeException("Invalid Credentials");
		}
		
		String username = jwtUtil.decodeToken(token);
		User user;
		try {
		user = service.findByUsername(username);
		}
		catch (Exception e) {
			throw new RuntimeException("Invalid Credentials");
		}
		if(user==null) {
			throw new RuntimeException("Invalid Credentials");
		}
				
		
		
		chain.doFilter(request, response);
		
	}
	
	

}
