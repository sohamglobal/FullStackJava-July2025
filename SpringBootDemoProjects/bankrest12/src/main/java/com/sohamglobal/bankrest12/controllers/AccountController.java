package com.sohamglobal.bankrest12.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sohamglobal.bankrest12.entities.Account;
import com.sohamglobal.bankrest12.services.AccountServices;

@RestController
@RequestMapping("/bank/api")
public class AccountController {
	
	@Autowired
	private AccountServices accServices;
	
	@GetMapping("/all")
	public List<Account> getAll()
	{
		return accServices.getAllAccounts();
	}
	
	@GetMapping("/search/{accno}")
	public Account searchAccount(@PathVariable int accno)
	{
		return accServices.getOneAccount(accno);
	}

}
