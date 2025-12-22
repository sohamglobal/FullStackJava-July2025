package com.sohamglobal.callingazurerest13.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sohamglobal.callingazurerest13.models.Purchase;
import com.sohamglobal.callingazurerest13.services.PurchaseServices;

@Controller
public class DisplayController {
	
	@Autowired
	private PurchaseServices purchaseServices;
	
	@GetMapping("/purchases")
	public String showPurchases(Model m)
	{
		List<Purchase> list=purchaseServices.receiveAllPurchases();
		m.addAttribute("purchlist", list);
		
		list.stream().forEach(obj->System.out.println(obj.getCustnm()));
		
		return "ShowPurchases.jsp";
	}

}
