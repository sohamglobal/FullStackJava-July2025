package com.sohamglobal.dependencyinjection06.services;

import org.springframework.stereotype.Service;

@Service
public class ShoppingServices {
	
	public double calculateDiscount(double amount)
	{
		double discount;
		
		if(amount>20000)
			discount=amount*13/100;
		else
			discount=amount*9/100;
		
		return discount;
	}

}
