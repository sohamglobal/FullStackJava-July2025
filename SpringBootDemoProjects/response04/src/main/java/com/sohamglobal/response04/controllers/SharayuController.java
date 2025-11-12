package com.sohamglobal.response04.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SharayuController {
	
	@GetMapping("/")
	public String home()
	{
		return "index.html";
	}
	
	@GetMapping("/showdata")
	public String showData(Model m)
	{
		String developer="Sharayu";
		String company="spider projects one";
		String tech="Java Spring Boot";
		System.out.println(developer);
		
		m.addAttribute("devnm", developer);
		m.addAttribute("cnm", company);
		m.addAttribute("tech", tech);
		m.addAttribute("demoby", "Praffull");
		return "ShowingJavaData.jsp";
	}

}
