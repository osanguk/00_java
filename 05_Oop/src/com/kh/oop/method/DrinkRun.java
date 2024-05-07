package com.kh.oop.method;

public class DrinkRun {
	public static void main(String[] args) {
		
		DrinkMaker drinkMaker = new DrinkMaker("아메리카노",2,3);

		DrinkStore drinkStore = new DrinkStore(drinkMaker, "서울","빠나쁘레쏘", true);
		
		drinkStore.orderDrink();
		
		DrinkMaker tea = new DrinkMaker("허브티",1,10);
		//음료 가게 객체 생성
		DrinkStore store = new DrinkStore(tea,"경기","멕아커피",false);
		store.orderDrink();
}
}