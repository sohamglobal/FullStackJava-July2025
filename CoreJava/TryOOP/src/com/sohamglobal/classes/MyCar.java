package com.sohamglobal.classes;

import com.praffull.interfaces.Vehicle;

public class MyCar extends Fuel implements Vehicle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("My car started...");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("My car stopped..");
	}


}
