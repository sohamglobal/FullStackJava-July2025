package com.sohamglobal.jpasteps09.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sohamglobal.jpasteps09.entities.Account;
import com.sohamglobal.jpasteps09.repositories.AccountRepository;

@Controller
public class SharayuController {
	
	@Autowired
	private AccountRepository accRepo;
	
	
	@GetMapping("/")
	public String homePage()
	{
		return "index.html";
	}
	
	@GetMapping("/newacc")
	public String newAccount()
	{
		return "newaccount.html";
	}
	
	@PostMapping("/addacc")
	public String addAccount(Account obj)
	{
		accRepo.save(obj);
		return "accountcreation.jsp";
	}
	
	@GetMapping("/allacc")
	public String showAccounts(Model m)
	{
		List<Account> list=accRepo.findAll();
		//list.stream().forEach(obj->System.out.println(obj.getAccnm()));
		m.addAttribute("acclist", list);
		return "accreport.jsp";
	}

}
