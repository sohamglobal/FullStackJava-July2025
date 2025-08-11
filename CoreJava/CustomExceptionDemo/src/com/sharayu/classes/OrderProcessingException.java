package com.sharayu.classes;

public class OrderProcessingException extends Exception {
	private int orderId;
	private String errorCode;
	
	public OrderProcessingException(String message,int orderId,String errorCode)
	{
		super(message);
		this.orderId=orderId;
		this.errorCode=errorCode;
	}

	public int getOrderId() {
		return orderId;
	}

	public String getErrorCode() {
		return errorCode;
	}
	
	

}
