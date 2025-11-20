package com.sohamglobal.jstl08.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sohamglobal.jstl08.dtos.Employee;

@Controller
public class SohamController {
	
	@GetMapping("/")
	public String home()
	{
		return "index.html";
	}
	
	@GetMapping("/empone")
	public String showOneEmp(Model model)
	{
		Employee employee=new Employee(1827,"Jos Buttler","Development","Spring Boot Developer","london",73100);
		model.addAttribute("emp", employee);
		return "OneEmp.jsp";
	}
	
	@GetMapping("/emplist")
	public String showEmpList(Model model)
	{
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1952,"Pat Cummins","Admin","Manager","Sydney",63150));
		list.add(new Employee(1315,"Steve Smith","Data","Analyst","New York",54660));
		list.add(new Employee(1635,"Ben Stokes","Development","Developer","Liverpool",54200));
		list.add(new Employee(1542,"Dominik Szoboszlai","Finanace","Auditor","Chicago",64750));
		list.add(new Employee(1744,"Virgil Van Dijk","Admin","Executive","Manchester",76430));
		
		model.addAttribute("elist", list);
		return "EmpList.jsp";
	}
	
	@GetMapping("/empreport")
	public String showReport(Model model)
	{
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1952,"Pat Cummins","Admin","Manager","Sydney",63150));
		list.add(new Employee(1315,"Steve Smith","Data","Analyst","New York",54660));
		list.add(new Employee(1635,"Ben Stokes","Development","Developer","Liverpool",54200));
		list.add(new Employee(1542,"Dominik Szoboszlai","Finanace","Auditor","Chicago",64750));
		list.add(new Employee(1744,"Virgil Van Dijk","Admin","Executive","Manchester",76430));
		
		model.addAttribute("elist", list);
		
		return "EmpReport.jsp";
	}

}
