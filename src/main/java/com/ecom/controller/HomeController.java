package com.ecom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	
	@GetMapping("/")
	public String index() {
		System.out.println("HomeController.index()");
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		System.out.println("HomeController.login()");
		return "login";
	}
	
	
	@GetMapping("/register")
	public String register() {
		System.out.println("HomeController.register()");
		return "register";
	}
	
}
