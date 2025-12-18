package com.sohamglobal.bankrest12.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sohamglobal.bankrest12.entities.Account;
import com.sohamglobal.bankrest12.repositories.AccountRepository;

@Service
public class AccountServices {
	
	@Autowired
	private AccountRepository accRepo;
	
	public List<Account> getAllAccounts()
	{
		return accRepo.findAll();
	}
	
	public Account getOneAccount(int accno)
	{
		return accRepo.findById(accno).get();
	}
	
	public Account addNewAccount(Account obj)
	{
		return accRepo.save(obj);
	}

}
