package com.kh.example.practice2.model.vo;

public class Product {
	
	private String pName;
	private int price;
	private String brand;
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	public Product() {
		
	}
	public void information() {
		
		System.out.println("이름 : ");
		System.out.println("가격 : ");
		System.out.println("브랜드 : ");
	}

}
