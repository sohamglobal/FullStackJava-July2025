package com.sharayu.programs;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<Integer, String> obj=(marks)->{
			if(marks>=35)
				return "pass";
			else
				return "fail";
		};
		
		System.out.println(obj.apply(33));
	}

}
