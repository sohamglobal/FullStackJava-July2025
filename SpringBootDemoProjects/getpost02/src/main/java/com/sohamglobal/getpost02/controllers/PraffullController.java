package com.sohamglobal.getpost02.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PraffullController {
	
	@GetMapping("/")
	public String home()
	{
		return "index.html";
	}
	
	@GetMapping("/contact")
	public String contact()
	{
		return "ContactUs.html";
	}
	
	@PostMapping("/welcome")
	public String welcome()
	{
		System.out.println("post mapping successful");
		return "welcome.html";
	}

}
