package com.sharayu.programs;

import com.sohamglobal.classes.Person;

public class Variables {
	public static void main(String[] args) {
		//Person obj; will not work
		
		//Empty constructor
		Person p1=new Person();
		p1.display();
		
		//parameterized constructor
		Person p2=new Person("Charles Leclerc", "Monaco");
		p2.display();
		
		Person p3=new Person("Lewis Hamilton", "London");
		p3.display();
	}

}
