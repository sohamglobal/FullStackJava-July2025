package com.sohamglobal.usedcars11.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sohamglobal.usedcars11.entities.UsedCar;
import com.sohamglobal.usedcars11.repositories.UsedCarsRepo;

@Service
public class UsedCarServices {
	
	//User->HTML form->Controller->Services->Repos->DB
	
	@Autowired
	private UsedCarsRepo carsRepo;
	
	public String addNewCar(UsedCar car)
	{
		carsRepo.save(car);
		return "success";
	}

}
