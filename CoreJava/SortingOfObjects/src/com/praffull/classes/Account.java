package com.praffull.classes;

public class Account {
	private int accountNumber;
	private String accountName;
	private int age;
	private String accountType;
	private double balance;
	
	public Account(int accountNumber, String accountName, int age, String accountType, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.age = age;
		this.accountType = accountType;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", age=" + age
				+ ", accountType=" + accountType + ", balance=" + balance + "]";
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public int getAge() {
		return age;
	}

	public String getAccountType() {
		return accountType;
	}

	public double getBalance() {
		return balance;
	}
	
	

}
