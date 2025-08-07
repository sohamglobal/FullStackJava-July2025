package com.sharayu.programs;

import com.sohamglobal.classes.Calculator;
import com.sohamglobal.classes.Friend;

public class TryStatic {
	public static void main(String[] args) {
		//static
		Calculator.add(9, 13);
		Calculator.add(26, 1);
		//non static
		Calculator obj=new Calculator();
		obj.show("sharayu");
		obj.add(12,34);
		//---------------
		
		//Friend.acceptName("praffull");
		Friend f1=new Friend();
		f1.acceptName("praffull");
		f1.showName();
		
		Friend f2=new Friend();
		f2.acceptName("sharayu");
		f2.showName();
		
		f1.showName(); // ???
		f1.acceptName("soham");
		Friend f3=new Friend();
		f3.showName();
		f2.showName();
	}

}
