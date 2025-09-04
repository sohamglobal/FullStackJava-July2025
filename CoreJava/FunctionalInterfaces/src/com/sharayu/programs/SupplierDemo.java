package com.sharayu.programs;

import java.util.Calendar;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<String> obj=()->{
			Calendar cal=Calendar.getInstance();
			return cal.getTime().toString();
		};
		
		System.out.println(obj.get());
	}

}
