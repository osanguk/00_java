package com.kh.oop.method.ex;

public class HamburgerStore {
	private String Name;
	private int Price;
	
	
	public void setName(String name) {
		Name = name;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getName() {
		return Name;
	}
	public int getPrice() {
		return Price;
	}
	
	public HamburgerStore() {
		
	}
	
	
	public HamburgerStore(String HambugerName, int HamburgerPrice) {
		
	}
	public void inforHamburger() {
		System.out.println("버거이름 : " + Name);
		System.out.println("버거가격 : " + Price);
	}
	
	
	
	public static void main(String[] args) {
		
		
		HamburgerStore hb1 = new HamburgerStore();
		hb1.setName("불고기버거 세트");
		hb1.setPrice(5000);
		hb1.inforHamburger();
		
		HamburgerStore hb2 = new HamburgerStore();
		hb1.setName("치즈버거 세트");
		hb1.setPrice(4000);
		hb1.inforHamburger();
		
		HamburgerStore hb3 = new HamburgerStore();
		hb1.setName("치킨버거 세트");
		hb1.setPrice(7000);
		hb1.inforHamburger();
		
		HamburgerStore hb4 = new HamburgerStore();
		hb1.setName("미트러버버거 세트");
		hb1.setPrice(8000);
		hb1.inforHamburger();
		
		HamburgerStore hb5 = new HamburgerStore();
		hb1.setName("스테이크버거 세트");
		hb1.setPrice(7700);
		hb1.inforHamburger();
		
		HamburgerStore hb6 = new HamburgerStore();
		hb1.setName("버터 스테이크 버거 세트");
		hb1.setPrice(7900);
		hb1.inforHamburger();
		
		HamburgerStore hb7 = new HamburgerStore();
		hb1.setName("왕버거 세트");
		hb1.inforHamburger();
		hb1.setPrice(10000);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
