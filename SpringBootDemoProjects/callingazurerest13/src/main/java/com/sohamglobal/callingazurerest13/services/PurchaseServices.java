package com.sohamglobal.callingazurerest13.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sohamglobal.callingazurerest13.models.Purchase;

@Service
public class PurchaseServices {
	
	private static final String API_URL="http://sohamspring.azurewebsites.net/api/orders/all";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<Purchase> receiveAllPurchases()
	{
		Purchase[] purchases=restTemplate.getForObject(API_URL, Purchase[].class);
		
		return Arrays.asList(purchases);
	}

}
