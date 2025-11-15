package com.sohamglobal.serviceslayer05.services;

import org.springframework.stereotype.Service;

@Service
public class UserServices {
	
	public String authenticate(String userid,String password)
	{
		String status="";
		if(password.equals("chelsea"))
			status="success";
		else
			status="failed";
		
		return status;
			
	}

}
