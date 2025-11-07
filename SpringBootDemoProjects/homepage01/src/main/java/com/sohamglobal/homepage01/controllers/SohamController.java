package com.sohamglobal.homepage01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SohamController {
	
	// Map the function with URL -> http://localhost:8080
	@GetMapping("/")
	public String homePage()
	{
		return "index.html";
	}

}
