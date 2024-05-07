package com.kh.oop.method.ex;

public class IceCream {
	//필드
	private String name;
 	private int sugar;
	private boolean milk;
	
	
	public void setAnme(String name) {
		this.name = name;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	public String getAnme() {
		return name;
	}
	public int getSugar() {
		return sugar;
	}
	public boolean isMilk() {
		return milk;
	}
	
	public IceCream() {
		
	}
	public IceCream(String name,int sugar,boolean milk) {
		
	}
	public void inforIceCream() {
		System.out.println("아이스크림 생성");
		System.out.println("이름 : " + name);
		System.out.println("설탕 :" + sugar);
		System.out.println("우유 : " + milk);
		
		
		if(milk) {
			System.out.println("우유 추가");
		}else {
			System.out.println("no milk");
		}
	}
	private void name() {
		IceCream ice = new IceCream();
		ice.setAnme("월드콘");
		ice.setSugar(3);
		ice.setMilk(false);
		
	}
	
	
//메서드
	//Setter
	//Getter
	//생성자 : 기본
	//생성자 : 필수 임름 설탕 우유 유무
	//void makeIceCream(){ 아이스크림 만들고 이름 설탕 우유 유무 출력
	//아이스크림 만들고
	//이름 설탕 우유 유무 출력
	// 우유는 추가 하면 우유 추가
	// 우유 미추가하면 우유미추가
//IceCreamRun -> 메인메서드	

}
