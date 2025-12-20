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
	
	public List<Account> searchByType(String type)
	{
		return accRepo.findByAcctype(type);
	}
	
	public Account addNewAccount(Account obj)
	{
		return accRepo.save(obj);
	}
	
	public String depositAmount(int accno,float amount)
	{
		String status="";
		Account obj=accRepo.findById(accno).get();
		if(obj!=null)
		{
			obj.setBalance(obj.getBalance()+amount);
			accRepo.save(obj);
			status="success";
		}
		else
			status="failed";
		
		return status;
		
	}
	
	public String deleteAccount(int accno)
	{
		String status="";
		Account obj=accRepo.findById(accno).get();
		if(obj!=null)
		{
			accRepo.delete(obj);
			status="success";
		}
		else
			status="failed";
		
		return status;
	}
	
	public String transfer(int fromacc,int toacc,float amount)
	{
		Account objfrom=accRepo.findById(fromacc).get();
		Account objto=accRepo.findById(toacc).get();
		String status="";
		
		if(objfrom!=null && objto!=null)
		{
			objfrom.setBalance(objfrom.getBalance()-amount);
			objto.setBalance(objto.getBalance()+amount);
			accRepo.save(objfrom);
			accRepo.save(objto);
			status="success";
		}
		else
			status="failed";
		
		return status;
	}

}
