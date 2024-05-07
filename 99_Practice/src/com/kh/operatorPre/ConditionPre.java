package com.kh.operatorPre;

import java.util.Scanner;

public class ConditionPre {
	
	//public static void method1(){
		//숫자 값 2개를 받아서 숫자 두개가 일치하는지 확인
		//Scanner sc = new Scanner(System.in);
		//int num1 = sc.nextInt();
		//int num2 = sc.nextInt();
		//같다면 같습니다. 출력
		//같지 않다면 같지 않습니다. 출력하기
	
	/*
	 public static void method2(){
	 if 문 활용 문자 값 2개를 받아서 문자 2개가 일치하는지 확인
	 Scanner sc = new Scanner(System.in);
		int str1 = sc.nextLine();
		int str2 = sc.nextLine();
		같다면 같습니다. 출력
		같지 않으면 같지 않다고 출력
	 */
	
	
	
	
	
	//최종으로 실행할 메인 메서드
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("num1의 값 입력하세요. :");
		int num1 = sc.nextInt();
		System.out.println("num2의 값을 입력하세요. :");
		int num2 = sc.nextInt();
		if (num1 == num2) {
			System.out.println(num1 + "과"+num2 +"의 값이 같습니다.");
			
		}else {
			System.out.println(num1 + "과"+num2 +"의 값이 같지않습니다.");
		}
		
				
	}
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("str1의 값 입력하세요. :");
		String str1 = sc.nextLine();
		System.out.println("str2의 값 입력하세요. :");
		String str2 = sc.nextLine();
		if(str1.equals(str2)) {
			System.out.println(str1 + "과"+str2 +"의 값이 같습니다.");
		}else {
			System.out.println(str1 + "과"+str2 +"의 값이 같지 않습니다.");
		}
	}
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("double1의 값 입력하세요. :");
		double double1 = sc.nextDouble();
		System.out.println("double2의 값 입력하세요. :");
		double double2 = sc.nextDouble();
		
		if (double1 == double2) {
			System.out.println(double1 + "과"+double2 +"의 값이 같습니다.");
		}else {
			System.out.println(double1 + "과"+double2 +"의 값이 같지 않습니다.");
		}
	}
	
	public static void main(String[] args) {
		method1();
		method2();
		method3();
	}
		}
	
		


