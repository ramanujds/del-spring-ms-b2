package com.del.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public String sayHello(@RequestParam("username") String username, Model m) {
		m.addAttribute("username", username);
		return "hello.jsp";
	}
	
	@RequestMapping("/bye")
	public String sayBye() {
		return "bye.jsp";
	}
	
}
