package com.sohamglobal.jpaconstraints10.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sohamglobal.jpaconstraints10.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
