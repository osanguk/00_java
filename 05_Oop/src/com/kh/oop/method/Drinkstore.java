package com.kh.oop.method;

public class Drinkstore {
	
	private DrinkMaker maker;
	private String location;
	private String name;
	private String takeout;
	
	
	public void setMaker(DrinkMaker maker) {
		this.maker = maker;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTakeout(String takeout) {
		this.takeout = takeout;
	}
	public DrinkMaker getMaker() {
		return maker;
	}
	public String getLocation() {
		return location;
	}
	public String getName() {
		return name;
	}
	public String getTakeout() {
		return takeout;
	}
	public Drinkstore(DrinkMaker maker, String location, String name,String takeout) {
		
	}

}
