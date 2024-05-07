package com.kh.test.main;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		Scanner 스캐너 = new Scanner(System.in);
		System.out.println("숫자 작성");
		int 날짜 = 스캐너.nextInt();
		String 할일;
		
		switch(날짜) {
		case 1:
			할일 = "월요일 : 업무";
			break;
		case 2:
			할일 = "화요일 : 공부";
			break;
		case 3:
			System.out.println("프로그램 종료");
			return;
			
			default :
				할일 = "날짜와 관계없이 휴식";
				break;
				
		}
		System.out.println("일정 : "+할일);
	}

}
