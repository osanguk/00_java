package com.kh.variable.ex;

import com.kh.variable.pre.EnumPre.계절;

public class EnumEx {
	public enum 날짜들{
		월요일,
		화요일,
		수요일,
		목요일,
		금요일,
		토요일,
		일요일
	}
	public static void main(String[] args) {
		
		System.out.println("월요일 : " + 날짜들.월요일);
		System.out.println("화요일 : " + 날짜들.화요일);
		System.out.println("수요일 : " + 날짜들.수요일);
		
		계절[] 계절들 = 계절.values();
		System.out.println("계절들에 정의된 모든 상수");
		for(계절 r : 계절들) {
			System.out.println(r);
			
		}
		
		계절 봄 = 계절.valueOf("봄");
		System.out.println("봄 과 일치하는 상수 : " + 봄);
		
		//ordinal(): 순서 길이 측정
		System.out.println("봄 상수의 순서 :" + 봄.ordinal());
		
		//name():상수의 이름을 전달
		System.out.println("봄 상수의 이름 : " + 봄.name());
		
		//toString : values() 로 사용했던 것 처럼 사용해서 출력
		System.out.println(봄.toString());
		
		//getClass() : 클래스 객체 반환
		System.out.println("클래스의 객체는 : " + 계절들.getClass());
		
		
		
		
		
		
		
	} 
}
