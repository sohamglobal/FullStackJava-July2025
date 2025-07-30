package com.sharayu.programs;
import com.sohamglobal.classes.*;

public class TryFunctionOverloading {
	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.calcSum();
		obj.calcSum(12, 23);
		obj.calcSum(9);
	}

}
