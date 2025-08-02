package com.sharayu.programs;
import com.sohamglobal.classes.*;

public class TestInheritance {
	public static void main(String[] args) {
		//Single
		//One x=new One(); as One is abstract base
		Two obj=new Two();
		obj.calcSum(9, 13);
		obj.calcSquare(23);
		
		//Hierarchical
		Dog brownie=new Dog();
		brownie.eat(); //Animal inherited
		brownie.bark(); //self Dog
		brownie.sleep(); //Animal inherited
		
		Tiger t=new Tiger();
		t.hunt();
		t.eat();
		t.sleep();
		
		//Multilevel
		GamingLaptop gLap=new GamingLaptop();
		gLap.powerOn();  //Device
		gLap.use("powerpoint presentation"); //Laptop
		gLap.playGame(); //GamingLaptop
		gLap.powerOff(); //Device
		
		
	}

}
