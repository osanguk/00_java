package com.kh.operatorPre;

import java.util.Scanner;

public class OperatorPre3 {
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("num1 의 값을 입력하세요 :");
		int num1 =sc.nextInt();
		System.out.println("num2 의 값을 입력하세요 :");
		int num2 =sc.nextInt();
				
		boolean result1 = num1 > num2;
		System.out.println(result1+"=num1>num2");
		boolean result2 = num1 >= num2;
		System.out.println(result2+"=num1>=num2");
		boolean result3 = num1 < num2;
		System.out.println(result3+"=num1<num2");
		boolean result4 = num1 <= num2;
		System.out.println(result4+"=num1<=num2");
		
		
	}
	
	//public static void method1()을 만들어서
	//Scanner 를 이용해 num1 num2 의 값을 입력받고
	//< >  를 사용해서 입력 받은 < > 중 어떤 값에서 true 가 나오는지 확인하기
	//boolean result1 = num1 >num2;
	//boolean result2 = num1 >=num2;
	//boolean result3 = num1 <num2;
	//boolean result4 = num1 <=num2;
	
	
	//응용편
	//public static void method2() num1 num2 num3 를 받고
	// &&|| 사용해서 크고 작은 값 홧인하기
	//boolean result = (num1 <num2) && (num2 == num3) 참이 되는가?
	
public static void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번 째 숫 자 :");
		int num1 = sc.nextInt();
		System.out.print("두 번 째 숫 자 :");
		int num2 = sc.nextInt();
		System.out.print("세 번 째 숫 자 :");
		int num3 = sc.nextInt();
		
		boolean result = (num1 <num2) && (num2 == num3);
		System.out.println("(num1 < num2) && (num2 == num3) 결과");
	
	}


	public static void main(String[] args) {
		//method1();
		method2();
		
		
	}
	
	
	
}
