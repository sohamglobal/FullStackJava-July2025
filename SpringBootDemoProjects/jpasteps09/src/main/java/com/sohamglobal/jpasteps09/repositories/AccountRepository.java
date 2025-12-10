package com.sohamglobal.jpasteps09.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sohamglobal.jpasteps09.entities.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

	// Finder methods
	//Name
	List<Account> findByAccnm(String accnm);
	List<Account> findByAccnmContaining(String pattern); //("his");
	List<Account> findByAccnmStartingWith(String prefix); //("Sha");
	List<Account> findByAccnmEndingWith(String suffix); //("kar");
	List<Account> findByAccnmIn(List<String> names); 
	
	//Type
	List<Account> findByAcctype(String acctype);
	List<Account> findByAcctypeIgnoreCase(String type);
	
	//Balance
	List<Account> findByBalanceGreaterThan(float amount);
	List<Account> findByBalanceLessThan(float amount);
	List<Account> findByBalanceBetween(float min,float max);
	
	//Multiple
	//select * from accounts where accnm='praffull' and acctype='saving';
	List<Account> findByAccnmAndAcctype(String name,String type);
	List<Account> findByAccnmOrAcctype(String name,String type);
	//select * from accounts where acctype='current' and balance>40000;
	List<Account> findByAcctypeAndBalanceGreaterThan(String type,float amount);
	
	
	//Exist and counter methods
	boolean existsByAccnm(String name);
	int countByAcctype(String type);
	
	//Delete methods
	long deleteByAcctype(String type);
	long deleteByBalanceLessThan(float amount);
	
	//Custom queries
	@Query("select a from Account a where a.balance> :bal")
	List<Account> getRichAccounts(float bal);
	
	@Query("select a.accnm from Account a where a.accno= :no")
	String getAccountName(int no);
	
	
	
	
	
	
	
}
