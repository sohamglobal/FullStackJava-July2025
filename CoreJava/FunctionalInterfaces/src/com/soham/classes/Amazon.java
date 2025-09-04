package com.soham.classes;

import com.praffull.interfaces.Shopping;

public class Amazon implements Shopping {

	@Override
	public void calcDiscount(double amount) {
		// TODO Auto-generated method stub
		double discount;
		discount=amount*10/100;
		System.out.println("Discount is "+discount);
	}

	@Override
	public void thanks() {
		// TODO Auto-generated method stub
		System.out.println("Thanks for shopping on Amazon");
	}

}
