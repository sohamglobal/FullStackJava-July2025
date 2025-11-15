package com.sohamglobal.serviceslayer05.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sohamglobal.serviceslayer05.services.UserServices;

@Controller
public class SohamController {
	
	//dependency injection
	@Autowired
	private UserServices userv;
	
	@GetMapping("/")
	public String homePage()
	{
		return "index.html";
	}
	
	@PostMapping("/login")
	public String login(String userid,String password,Model m)
	{
		System.out.println(userid);
		System.out.println(password);
		//UserServices userv=new UserServices();
		String status=userv.authenticate(userid, password);
		System.out.println(status);
		m.addAttribute("stat", status);
		return "User.jsp";
	}

}
