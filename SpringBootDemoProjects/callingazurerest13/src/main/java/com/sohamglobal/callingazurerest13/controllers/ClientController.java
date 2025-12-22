package com.sohamglobal.callingazurerest13.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sohamglobal.callingazurerest13.models.Purchase;
import com.sohamglobal.callingazurerest13.services.PurchaseServices;

@RestController
public class ClientController {
	
	@Autowired
	private PurchaseServices purchaseServices;
	
	@GetMapping("/azure/purchases")
	public List<Purchase> getAllPurchases()
	{
		return purchaseServices.receiveAllPurchases();
	}
	

}
