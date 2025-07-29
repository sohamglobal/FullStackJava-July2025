package com.sharayu.programs;

import com.sohamglobal.classes.Person;

public class Variables {
	public static void main(String[] args) {
		Person obj=new Person();
		obj.display();
		
		obj.newPerson("Charles Leclerc", "Monaco");
		obj.display();
		
		obj.newPerson("Lewis Hamilton", "London");
		obj.display();
	}

}
