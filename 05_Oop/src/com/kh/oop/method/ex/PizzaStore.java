package com.kh.oop.method.ex;

public class PizzaStore {
	private String pizzaName;
	private int pizzaPrice;
	
	
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}
	public String getPizzaName() {
		return pizzaName;
	}
	public int getPizzaPrice() {
		return pizzaPrice;
	}
	
	public PizzaStore() {
		
	}
	public PizzaStore(String pizzaName, int pizzaPrice) {
		this.pizzaName =pizzaName;
		this.pizzaPrice=pizzaPrice;
	}
	
	
	public void inforPizza() {
		System.out.println("피자이름 : " + pizzaName);
		System.out.println("피자가격 : " + pizzaPrice);
	}
	
	//메서드 : main
	public static void main(String[] args) {
		
		PizzaStore pizza1 = new PizzaStore();
		pizza1.setPizzaName("페페로니 피자");
		pizza1.setPizzaPrice(11000);
		
		pizza1.inforPizza();
		
		System.out.println("-----------------");
		PizzaStore pizza2 = new PizzaStore();
		pizza2.setPizzaName("스테이크 피자");
		pizza2.inforPizza();
		
		//필수 생성자로 피자 생성
		
		PizzaStore pizza3 = new PizzaStore("치즈 피자",13000);
		pizza3.inforPizza();
		
		
	}

}
