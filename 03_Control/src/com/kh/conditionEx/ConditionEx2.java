package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionEx2 {

	public static void method1() {/*
		 if 	- else if	- else
		 사용방법
		 if(조건){
		 	조건이 참일 경우 실행할 코드 작성
		 }else if (조건2){
		 
		 	조건이 거짓일 경우 실행할 코드 작성
		 } else {
		 	조건 1과 조건2가 모두 거짓일 경우 실행할 코드 작성
		 	}
		 	
		 */
		// 만약에 돈이 2000원 이상 있을 경우 택시를 탄다
		// 만약에 돈이 1500~1900 이하 있을 경우 대중 교통을 탄다
		//만약 돈이 없을 경우 걸어간다.
		
		
		int money = 1800;//내가 지금 갖고 있는 돈
		
		if(money >=2000) {//2000원 이상일 경우
			System.out.print("택시 타고 가버려");
		} else if (money >+ 1500 && money <=1900) {//2000이상은 없으나 1500원 이상 있을 경우
			System.out.println("대중 교통으로 걸어가3");
		} else {//1400원 이하 있을경우 걸어간
			System.out.println("그냥 걸어가 인마");
		}
		
		
	}

	public static void method2() {
		Scanner sc =new Scanner(System.in);
		System.out.println("안녕하세요.kh티켓나라입니다.");
		System.out.print("나이를 입력해주세요. :");
		int age = sc.nextInt();
		
		if(age <=13) {
			System.out.println("어린이");
		}else if (age <=18) {
			System.out.println("청소년");
		}else {
			System.out.println("성인");
		}
	}
	
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("안녕하세요 살아있는 달력이에요!");
		System.out.print("달을 입력해 놔라:");
		int month = sc.nextInt();
		String result;
		if(month ==1 || month == 2||month== 12)	
		result=("겨울");
		else if(month >=3 && month <= 5) {
			result=("봄");
		}else if (month >=6 && month <= 8) {
			result=("여름");
		}else if(month >=9 && month <= 11) {
			result=("가을");
		} else {
			result=("그런 계절은 없단다");
		}
		
		

	}
	
	public static void method4() {
		//13세 이하 어린이 14~ 18 청소년 19세 이상 성인
		
		int age = 15;
			//변수의 기능을 활용 마지막에 나이에 따른 표기를 출력
		String result;
		if(age <=13) {
			result = "어린이";
		}else if (age >= 14 && age <= 18) {
			result = "청소년";
		}else {
			result = "성인";
		}
	 System.out.println(result + "입니다.");
	}
	
	
	public static void practice1() {
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		String result;
		
		
	}
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//method4();
		
		
		

	}

}
