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
	
	@GetMapping("/namaste")
	public String index2() {
		System.out.println("HomeController.index2()");
		return "index";
	}
	
}
