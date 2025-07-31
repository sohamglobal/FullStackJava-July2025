package com.sharayu.programs;
import com.sohamglobal.classes.*;

public class TestInheritance {
	public static void main(String[] args) {
		Two obj=new Two();
		obj.calcSum(9, 13);
		obj.calcSquare(23);
		
		
		Dog brownie=new Dog();
		brownie.eat(); //Animal inherited
		brownie.bark(); //self Dog
		brownie.sleep(); //Animal inherited
		
		Tiger t=new Tiger();
		t.hunt();
		t.eat();
		t.sleep();
	}

}
