package com.sharayu.programs;

import com.praffull.interfaces.Banking;

public class InterestFinder {
	public static void main(String[] args) {
		Banking obj=(balance)->{
			double interest;
			interest=balance*3/100;
			return "Interest will be "+interest;
		};
		
		System.out.println(obj.calcInterest(45000.00));
	}

}
