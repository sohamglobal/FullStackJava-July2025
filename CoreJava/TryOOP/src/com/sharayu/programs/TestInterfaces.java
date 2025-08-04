package com.sharayu.programs;

import com.sohamglobal.classes.HDFC;

public class TestInterfaces {
	public static void main(String[] args) {
		HDFC obj=new HDFC();
		obj.welcome();
		obj.showRates();
		obj.calcInterest(150000);
		obj.findEMI(275000, 36);
	}

}
