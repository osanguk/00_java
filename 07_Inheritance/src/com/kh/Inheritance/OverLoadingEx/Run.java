package com.kh.Inheritance.OverLoadingEx;

import java.util.Scanner;

public class Run {

	public void practice17() {
		
		String[] chickenMenu = {"양념치킨","후라이드치킨","간장치킨"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("치킨이름을 입력 : ");
		String inputChic = sc.next();
		
		boolean found = false;
		
		for(String 치킨 : chickenMenu) {
			//System.out.println(치킨);
			if(치킨.equals(inputChic) ) {
				found = true;
				break;
			}
		}
	}
	
	if(found) {
		System.out.println(inputChic + "배달 가능");{
			
		}else {
			System.out.println(inputChic + "은(는) 없는 메뉴 입니다.");
		}
	}
	
	
	
	public static void main(String[] args) {

		
		Person 사람1 = new Person();
		사람1.setName("홍길동");
		
		Person 사람2 = new Person("박영희");
		
		Person 사람3 = new Person("김철수", 17);
	}

	
}
