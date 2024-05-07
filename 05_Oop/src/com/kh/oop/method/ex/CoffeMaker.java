package com.kh.oop.method.ex;

public class CoffeMaker {
	//필드
	
	private String coffeeType;
	private int sugar;
	private boolean milk;
	
	
	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	public String getCoffeeType() {
		return coffeeType;
	}
	public int getSugar() {
		return sugar;
	}
	public boolean isMilk() {
		return milk;
	}
	
	public CoffeMaker() {
		
	}
	
	public CoffeMaker(String coffetype, int sugar, boolean milk ) {
		this.coffeeType = coffeeType;
		this.sugar = sugar;
		this.milk = milk;
		
	}
	public void inforCoffee() {
		System.out.println("커피를 제조합니다.");
		System.out.println("종류 : " + coffeeType);
		System.out.println("설탕 : " + sugar + " g");
		//만약에 우유가 추가 됐다면
		if(milk) {
			System.out.println("우유 추가");
		}else {
			System.out.println("우유 미추가");	
		
		}
		System.out.println("커피 준비 완료");
	}
	

	
	

}
