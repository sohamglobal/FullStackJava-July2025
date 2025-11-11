package com.sohamglobal.receiverequest03.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sohamglobal.receiverequest03.dtos.User;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class RequestController {
	
	@GetMapping("/")
	public String home()
	{
		return "index.html";
	}
	
	/*
	@PostMapping("/login")
	public String login(HttpServletRequest request)
	{
		String id=request.getParameter("uid");
		String ps=request.getParameter("psw");
		System.out.println(id+"   "+ps);
		return "done";
	}
	*/
	@PostMapping("/login")
	public String login(String uid,String psw)
	{
		System.out.println(uid+"   "+psw);
		return "done";
	}
	
	@GetMapping("/register")
	public String register()
	{
		return "register.html";
	}
	
	@PostMapping("/adduser")
	public String addUser(User obj)
	{
		System.out.println(obj.getFullname());
		System.out.println(obj.getAge());
		System.out.println(obj.getEmail());
		//insertDataInDB(obj)
		//tomcat jasper
		return "registrationstatus.jsp";
	}
}
