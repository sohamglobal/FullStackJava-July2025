package com.sohamglobal.jpasteps09.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sohamglobal.jpasteps09.entities.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}
