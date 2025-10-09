package com.sharayu.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cars")
public class Car {
	@Id
	private String carid;
	private String modelnm;
	private String company;
	private float price;
	
	public Car() {}
	
	public Car(String carid, String modelnm, String company, float price) {
		super();
		this.carid = carid;
		this.modelnm = modelnm;
		this.company = company;
		this.price = price;
	}

	public String getCarid() {
		return carid;
	}

	public void setCarid(String carid) {
		this.carid = carid;
	}

	public String getModelnm() {
		return modelnm;
	}

	public void setModelnm(String modelnm) {
		this.modelnm = modelnm;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	
	

}
