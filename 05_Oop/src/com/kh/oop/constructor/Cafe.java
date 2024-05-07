package com.kh.oop.constructor;

public class Cafe { // 맨위는 ()가 안들어감
	public String name;
	public String location;
	public int tablenum;
	
	
	public Cafe(String name, String location, int tablenum) {
	this.name = name;
	this.location = location;
	this.tablenum = tablenum;
	}
	
	public Cafe() {
		// TODO Auto-generated constructor stub
	}

	//void 메서드 만들기
	public void cafeInfo() {
		System.out.println("카페이름 : "+ name);
		System.out.println("카페위치 :"+location);
		System.out.println("테이블넘버 : "+ tablenum);
		
		//카페이름 지역 테이블수 출력
		//System.out.println("---------------"); -= 15개 적음
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("안녕하세요.kh민족입니다.");
		System.out.println("=== 카페 조회===");
		
		Cafe cafe1 =new Cafe();
		cafe1.name = "kh카페";
		cafe1.tablenum = 5;
		cafe1.cafeInfo();
		
		//Cafe 객체를 사용해서 
		//1. 기본생성자로 cafe1 만들기
		// 이름 테이블 작성 출력
		
		System.out.println("카페명: " + cafe1.name);
		
		//2. 기본 생성자 cafe2 만들기
		//지역 테이블 작성하고 출력
		Cafe cafe2= new Cafe();
		cafe2.location = "서울";
		cafe2.tablenum = 10;
		cafe2.cafeInfo();
		
		
		//3. 필수 생성자 cafe3 만들기
		//필수로 생성한 내용 출력
		
		
		
		
		
	}

}
