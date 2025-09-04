package com.sharayu.programs;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<String> obj=(password)->{
			if(password.equals("chelsea"))
				return true;
			else
				return false;
		};
		
		System.out.println(obj.test("liverpool"));
	}

}
