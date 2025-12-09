package com.sohamglobal.jpasteps09.controllers;

import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
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
	public String addAccount(Account obj,Model m)
	{
		String msg="";
		try
		{
			if(accRepo.existsById(obj.getAccno()))
			{
				throw new IllegalArgumentException("Account already exists");
			}
			
			accRepo.save(obj);
			msg="Account opened successfully";
		}
		catch(IllegalArgumentException e)
		{
			msg=e.getMessage();
		}
		
		m.addAttribute("stat", msg);
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
	
	@GetMapping("/depo")
	public String depo()
	{
		return "depositform.html";
	}
	
	@PostMapping("/deposit")
	public String deposit(int accno,float amount)
	{
		System.out.println(accno);
		System.out.println(amount);
		
		Account obj=accRepo.findById(accno).get();
		System.out.println("Name : "+obj.getAccnm());
		System.out.println("Type : "+obj.getAcctype());
		System.out.println("Balance : "+obj.getBalance());
		
		obj.setBalance(obj.getBalance()+amount);
		System.out.println("Balance : "+obj.getBalance());
		accRepo.save(obj);
		
		return "depositdone.jsp";
	}
	
	@GetMapping("/del")
	public String del()
	{
		return "delete.html";
	}
	
	@PostMapping("/delete")
	public String delete(int accno,Model m)
	{
		String msg="";
		
		try
		{
		Account obj=accRepo.findById(accno).get();
		accRepo.delete(obj);
		msg="Account closed successfully";
		}
		catch(Exception e)
		{
			msg="Account not found";
		}
		
		
		m.addAttribute("stat", msg);
		return "deleted.jsp";
	}
	
	@GetMapping("/searchtype")
	public String searchType()
	{
		return "searchtype.html";
	}
	
	@PostMapping("/searchbytype")
	public String searchByType(String acctype,Model m)
	{
		List<Account> list=accRepo.findByAcctype(acctype);
		list.stream().forEach(obj->System.out.println(obj.getAccnm()));
		
		m.addAttribute("typ", acctype);
		m.addAttribute("acclist", list);
		return "listbytype.jsp";
	}

}
