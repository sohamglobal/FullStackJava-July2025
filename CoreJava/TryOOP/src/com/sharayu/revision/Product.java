package com.sharayu.revision;

public class Product implements Shopping {
	private int prodId;
	private String modelName;
	private String category;
	private String company;
	private float price;
	//How will i be able to assign data to these private data members?
	// 1] parameterized constructor 2] setters
	public Product() {}
	public Product(int prodId, String modelName, String category, String company, float price) {
		super();
		this.prodId = prodId;
		this.modelName = modelName;
		this.category = category;
		this.company = company;
		this.price = price;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setPrice(float price) {
		this.price = price;
	}


	//How can i retrieve/display values associated with the private data members
	// 1] toString() 2] Write your own function to print 3] getters
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", modelName=" + modelName + ", category=" + category + ", company="
				+ company + ", price=" + price + "]";
	}

	@Override
	public void showProductInfo() {
		// TODO Auto-generated method stub
		System.out.println("Name  : "+modelName);
		System.out.println("Price : "+price);
	}

	public int getProdId() {
		return prodId;
	}

	public String getModelName() {
		return modelName;
	}

	public String getCategory() {
		return category;
	}

	public String getCompany() {
		return company;
	}

	public float getPrice() {
		return price;
	}
	
	
	

}
