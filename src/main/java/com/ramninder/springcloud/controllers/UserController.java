package com.ramninder.springcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ramninder.springcloud.security.SecurityService;

@Controller
public class UserController {
	
	@Autowired
	private SecurityService securityService;

	@GetMapping("/")
	public String showLoginpage() {

		return "/login";
	}
	
	@PostMapping("/login")
	public String login(String email, String password) {
		boolean loginResponse = securityService.login(email, password);
		if(loginResponse) {
			return "index";
		}
		return "login";
	}
	
	
	

}
