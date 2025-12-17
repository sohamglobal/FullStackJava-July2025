package com.sohamglobal.bankrest12.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sohamglobal.bankrest12.entities.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
	
}
