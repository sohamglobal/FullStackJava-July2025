package com.sharayu.programs;

import com.sohamglobal.classes.*;

public class CustomerBilling {
	public static void main(String[] args) {
		DiscountCalculator obj=new DiscountCalculator();
		obj.calcDiscount(12500);
		obj.showDiscount();
		
		obj.calcDiscount(5400);
		obj.showDiscount();
		System.out.println("Object running...");
	}

}
