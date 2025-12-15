package com.sohamglobal.usedcars11.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sohamglobal.usedcars11.entities.Enquiry;
import com.sohamglobal.usedcars11.entities.UsedCar;
import com.sohamglobal.usedcars11.services.EnquiryServices;
import com.sohamglobal.usedcars11.services.UsedCarServices;

@Controller
public class CarController {
	
	@Autowired
	private UsedCarServices carServices;
	
	
	
	@GetMapping("/")
	public String homePage(Model model)
	{
		List<UsedCar> list=carServices.getAllCars();
		model.addAttribute("carlist", list);
		return "index.jsp";
	}

	@PostMapping("/login")
	public String login(String username,String password)
	{
		String page="";
		if(username.equals("sharayu") && password.equals("spider"))
			page="AdminPanel.jsp";
		else
			page="LoginFailed.jsp";
		
		return page;
	}
	
	@GetMapping("/newcar")
	public String newCar()
	{
		return "NewCarEntry.html";
	}
	
	@PostMapping("/savecar")
	public String saveCar(UsedCar car)
	{
		String stat=carServices.addNewCar(car);
		return "NewCarAdded.jsp";
	}
	
	
}
