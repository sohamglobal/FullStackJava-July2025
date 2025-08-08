package com.sohamglobal.classes;

public class Account {
	private int accountNumber;
	private String accountName;
	private String accountType;
	private double balance;
	
	public Account(int accountNumber, String accountName, String accountType, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountType="
				+ accountType + ", balance=" + balance + "]";
	}
	
	

}
