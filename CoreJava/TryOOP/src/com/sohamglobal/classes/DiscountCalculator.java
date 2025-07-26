package com.sohamglobal.classes;

public class DiscountCalculator {
	
	public void calcDiscount(float amount)
	{
		float discount;
		if(amount>20000)
			discount=amount*15/100;
		else
			discount=amount*10/100;
		
		System.out.println("Discount will be "+discount);
		//return(discount); not returning anything so void
	}

}
