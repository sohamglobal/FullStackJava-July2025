package com.sharayu.programs;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<Double> obj=(amount)->{
			Double discount;
			discount=amount*10/100;
			System.out.println("Discount will be "+discount);
		};
		
		obj.accept(15700.00);
	}

}
