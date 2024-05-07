package com.kh.oop.method;

public class CoffeeRun {
	
	public static void main(String[] args) {
		
		CoffeMaker cm = new CoffeMaker("아메리카노", 1 , false);
		
		CoffeeStore cs = new CoffeeStore(cm, "꺼피빈", "서울시 강남구");
				
		cs.orderCoffee();
	}

}
