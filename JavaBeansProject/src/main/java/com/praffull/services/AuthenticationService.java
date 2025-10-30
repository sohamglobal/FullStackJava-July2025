package com.praffull.services;

public class AuthenticationService {
	
	int code;
	String status;
	
	
	public void setCode(int code) {
		this.code = code;
		checkTheCode();
	}
	
	private void checkTheCode()
	{
		if(code==4362)
			status="success";
		else
			status="failed";
	}
		
	public String getStatus() {
		return status;
	}
	
	
	

}
