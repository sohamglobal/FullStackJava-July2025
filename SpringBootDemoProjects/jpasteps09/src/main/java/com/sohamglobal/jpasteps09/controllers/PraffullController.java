package com.sohamglobal.jpasteps09.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sohamglobal.jpasteps09.entities.Account;
import com.sohamglobal.jpasteps09.repositories.AccountRepository;

@RestController
public class PraffullController {
	
	@Autowired
	private AccountRepository accRepo;
	
	
	@GetMapping("/all")
	public List<Account> getAllAccounts()
	{
		return accRepo.findAll();
	}

}
