package com.sohamglobal.usedcars11.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usedcars")
public class UsedCar {
	
	@Id
	@Column(name="carid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int carId;
	
	@Column(nullable=false)
	private String brand;
	
	@Column(nullable=false)
	private String model;
	
	@Column(name="mfgyear",nullable=false)
	private int mfgYear;
	
	@Column(name="kilometers",nullable=false)
	private int kilometers;
	
	@Column(name="fueltype", nullable=false)
	private String fuelType;
	
	@Column(nullable=false)
	private String color;
	
	@Column(nullable=false)
	private float price;
	
	@Column(name="ownername", nullable=false)
	private String ownerName;
	
	@Column(nullable=false)
	private String mobile;
	
	private String status="AVAILABLE";
		
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMfgYear() {
		return mfgYear;
	}
	public void setMfgYear(int mfgYear) {
		this.mfgYear = mfgYear;
	}
	public int getKilometers() {
		return kilometers;
	}
	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
