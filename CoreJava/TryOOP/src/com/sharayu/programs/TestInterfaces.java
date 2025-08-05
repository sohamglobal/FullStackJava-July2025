package com.sharayu.programs;

import com.praffull.interfaces.Vehicle;
import com.sohamglobal.classes.HDFC;
import com.sohamglobal.classes.MyCar;

public class TestInterfaces {
	public static void main(String[] args) {
		HDFC obj=new HDFC();
		obj.welcome();
		obj.showRates();
		obj.calcInterest(150000);
		obj.findEMI(275000, 36);
		
		
		MyCar car=new MyCar();
		car.start(); //declared in interface and defined in class
		car.stop(); //declared in interface and defined in class
		car.showMessage(); //declared and defined in the interface
		Vehicle.getRules();  //static method with interface
		car.getFuelTypes(); // from Fuel class
	}

}
