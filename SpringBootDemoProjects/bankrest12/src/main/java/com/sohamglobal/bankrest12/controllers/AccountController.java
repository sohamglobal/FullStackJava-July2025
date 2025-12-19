package com.sohamglobal.bankrest12.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sohamglobal.bankrest12.entities.Account;
import com.sohamglobal.bankrest12.services.AccountServices;

@RestController
@RequestMapping("/bank/api")
public class AccountController {
	
	@Autowired
	private AccountServices accServices;
	
	//GET End point ->  http://localhost:8083/bank/api/all
	@CrossOrigin(origins = "*")
	@GetMapping("/all")
	public List<Account> getAll()
	{
		return accServices.getAllAccounts();
	}
	
	//GET End point ->  http://localhost:8083/bank/api/search/1035
	// allow the service to be called from any third party client
	@CrossOrigin(origins = "*")
	@GetMapping("/search/{accno}")
	public Account searchAccount(@PathVariable int accno)
	{
		return accServices.getOneAccount(accno);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/search/type/{acctype}")
	public List<Account> getByType(@PathVariable String acctype)
	{
		return accServices.searchByType(acctype);
	}
	
	
	@CrossOrigin(origins = "*")
	@PostMapping("/add")
	public Account addAccount(@RequestBody Account acc)
	{
		return accServices.addNewAccount(acc);
	}
	
	@PutMapping("/deposit")
	public String deposit(int accno,float amount)
	{
		return accServices.depositAmount(accno, amount);
	}
	
	@DeleteMapping("/close")
	public String closeAccount(int accno)
	{
		return accServices.deleteAccount(accno);
	}

}
