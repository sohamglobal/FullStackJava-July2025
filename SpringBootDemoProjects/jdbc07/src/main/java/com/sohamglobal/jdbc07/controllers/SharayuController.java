package com.sohamglobal.jdbc07.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sohamglobal.jdbc07.dtos.Account;
import com.sohamglobal.jdbc07.services.AccountServices;

@Controller
public class SharayuController {
	
	@Autowired
	private AccountServices accServices;
	
	@GetMapping("/")
	public String home()
	{
		return "index.html";
	}
	
	@GetMapping("/newacc")
	public String newAcc()
	{
		return "newaccount.html";
	}
	
	@PostMapping("/addacc")
	public String addAcc(Account obj,Model m)
	{
		System.out.println(obj.getAccnm());
		System.out.println(obj.getBalance());
		
		String stat=accServices.addAccount(obj);
		m.addAttribute("status", stat);
		return "newaccountstatus.jsp";
	}

}
