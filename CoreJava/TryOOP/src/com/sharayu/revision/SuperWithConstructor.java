package com.sharayu.revision;

public class SuperWithConstructor {
	public static void main(String[] args) {
		Derived obj=new Derived();
		//it will call empty constructor of derived
		//it will internally call empty constructor of base
		
		Derived obj2=new Derived("praffull","dubai");
		//it will call parameterized constructor of derived
		//By Default-it will internally call EMPTY constructor of base
		
	}

}
