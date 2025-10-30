package com.praffull.services;

public class LoginService {
	private String userid;
	private String password;
	private String userStatus;
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserStatus() {
		checkUser();
		return userStatus;
	}
	
	
	private void checkUser()
	{
		//logic to check the userid and password
	}
	
	
	

}
