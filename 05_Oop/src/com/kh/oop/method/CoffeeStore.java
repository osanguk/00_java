package com.kh.oop.method;

public class CoffeeStore {
	//필드
	private CoffeMaker maker;
	private String storeName;
	private String location;
	
	public void setMaker(CoffeMaker maker) {
		this.maker = maker;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public CoffeMaker getMaker() {
		return maker;
	}
	public String getStoreName() {
		return storeName;
	}
	public String getLocation() {
		return location;
	}
	public CoffeeStore() {
		
	}
	public CoffeeStore(CoffeMaker maker, String storeName, String location) {
		this.maker=maker;
		this.storeName = storeName;
		this.location = location;
	}
	public void orderCoffee() {
		System.out.println("지역 : " + location);
		System.out.println(storeName + "에 대한 커피 정보");
	}

}
