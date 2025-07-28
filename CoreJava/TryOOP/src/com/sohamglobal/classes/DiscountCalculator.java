package com.sohamglobal.classes;

public class DiscountCalculator {
	
	//data member
	private float discount;
	
	public void calcDiscount(float amount)
	{
		//amount is not a data member it is a local variable of the function
		if(amount>20000)
			discount=amount*15/100;
		else
			discount=amount*10/100;
		
		//System.out.println("Discount will be "+discount);
		//return(discount); not returning anything so void
	}
	
	public void showDiscount()
	{
		//System.out.println("Amount is "+amount);
		System.out.println("Discount will be "+discount);
	}

}
