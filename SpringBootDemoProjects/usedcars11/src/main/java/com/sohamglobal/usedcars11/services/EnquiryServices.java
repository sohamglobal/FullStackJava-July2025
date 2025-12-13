package com.sohamglobal.usedcars11.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sohamglobal.usedcars11.entities.Enquiry;
import com.sohamglobal.usedcars11.repositories.EnquiryRepo;

@Service
public class EnquiryServices {
	
	@Autowired
	private EnquiryRepo enqRepo;
	
	public String addNewEnquiry(Enquiry e)
	{
		enqRepo.save(e);
		return "success";
	}

}
