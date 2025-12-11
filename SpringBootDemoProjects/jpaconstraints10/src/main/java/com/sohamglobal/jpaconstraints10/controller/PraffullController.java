package com.sohamglobal.jpaconstraints10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sohamglobal.jpaconstraints10.entity.Employee;
import com.sohamglobal.jpaconstraints10.repo.EmpRepo;

@Controller
public class PraffullController {
	
	@Autowired
	private EmpRepo empRepo;
	
	@GetMapping("/")
	public String homePage()
	{
		Employee obj=new Employee();
		obj.setEmpnm("praffull");
		obj.setDept("data");
		obj.setPost("analyst");
		obj.setMobile("7391966656");
		obj.setSalary(21900);
		
		empRepo.save(obj);
		
		return "index.jsp";
	}

}
