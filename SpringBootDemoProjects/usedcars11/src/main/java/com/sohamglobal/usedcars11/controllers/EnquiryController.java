package com.sohamglobal.usedcars11.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sohamglobal.usedcars11.entities.Enquiry;
import com.sohamglobal.usedcars11.services.EnquiryServices;

@Controller
public class EnquiryController {
	
	@Autowired
	private EnquiryServices enqServices;

	@GetMapping("/newenq")
	public String newEnq()
	{
		return "NewEnquiry.html";
	}
	
	@PostMapping("/saveenq")
	public String saveEnq(Enquiry enq,Model m)
	{
		enqServices.addNewEnquiry(enq);
		m.addAttribute("enquiry", enq);
		return "NewEnquiryAdded.jsp";
	}
	
}
