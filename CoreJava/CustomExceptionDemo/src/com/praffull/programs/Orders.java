package com.praffull.programs;

import com.sharayu.classes.OrderProcessingException;

public class Orders {
	public static void main(String[] args) {
		
		try
		{
			throw new OrderProcessingException(
					"payment failed for the order",
					12345,
					"PAYMENT_ERROR"
					);
		}
		catch(OrderProcessingException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
			System.out.println(e.getOrderId());
		}
	}

}
