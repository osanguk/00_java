package com.kh.oop.method;

public class Car {
	//필드
	public String brand;
	public String model;
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public		int year;
	
	public Car() {
		
		
	}
	
	
	public Car(String brand, String model,int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getYear() {
		return year;
	}
	
	
	public static void main(String[] args) {
		
		Car car1 = new Car("Toyota","Carmy",2022);
		
		System.out.println(car1.getBrand()+"   "+car1.getModel()+"   " + car1.getYear());
		
		
		
	}

}
