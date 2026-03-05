package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("home")
	String homePage() {
		
		
		return "homePage";
		
	}
	
	@GetMapping("/add")
	String add() {
		
		
		return "add";
		
	}
}
