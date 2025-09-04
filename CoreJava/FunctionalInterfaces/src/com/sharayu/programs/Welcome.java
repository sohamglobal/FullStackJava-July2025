package com.sharayu.programs;

import com.praffull.interfaces.MyFunctionalInterface;
import com.praffull.interfaces.SquareFunctionalInterface;

public class Welcome {
	public static void main(String[] args) {
		MyFunctionalInterface f=()->System.out.println("welcome to java");
		f.sayHello();
		
		
		SquareFunctionalInterface sfi=(n)->{
			int sq=n*n;
			System.out.println("square is "+sq);
		};
		
		sfi.calcSquare(13);
	}

}
