package com.praffull.services;

public class DiscountCalculator {
	private double purchAmount;
	private double discount;
	
	public void setPurchAmount(double purchAmount) {
		this.purchAmount = purchAmount;
		calcDiscount();
	}
	
	
	private void calcDiscount()
	{
		if(purchAmount>20000)
			discount=purchAmount*13/100;
		else
			discount=purchAmount*9/100;
	}

	public double getDiscount() {
		return discount;
	}
	
	
	
	

}
