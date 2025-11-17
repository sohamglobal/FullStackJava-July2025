package com.sohamglobal.dependencyinjection06.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sohamglobal.dependencyinjection06.services.ShoppingServices;

@Controller
public class SohamController {
	
	@Autowired
	private ShoppingServices shopServ;
	
	@GetMapping("/")
	public String home()
	{
		return "index.html";
	}

	@PostMapping("/calcdisc")
	public String calcdisc(String custName,double purchAmount,Model model)
	{
		double disc=shopServ.calculateDiscount(purchAmount);
		double bill=purchAmount-disc;
		
		System.out.println(disc);
		System.out.println(bill);
		
		model.addAttribute("name", custName);
		model.addAttribute("amount", purchAmount);
		model.addAttribute("discount", disc);
		model.addAttribute("netbill", bill);
		
		return "Bill.jsp";
	}
}
