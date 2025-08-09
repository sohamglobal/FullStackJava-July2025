package com.sharayu.programs;

import com.sharayu.revision.Product;

public class ProductDetails {
	public static void main(String[] args) {
		Product p1=new Product(123,"galaxy p9","mobile","samsung",75000);
		//if class contains toString(), we can print the objects
		System.out.println(p1);
		p1.setPrice(78900);
		System.out.println(p1);
		System.out.println(p1.getModelName());
		
		Product p2=new Product();
		p2.setProdId(345);
		p2.setModelName("latitude 5490");
		p2.setCategory("laptop");
		p2.setCompany("dell");
		p2.setPrice(79500);
		
		p2.showProductInfo();
	}

}
