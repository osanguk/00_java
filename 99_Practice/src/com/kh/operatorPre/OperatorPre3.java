package com.kh.operatorPre;

import java.util.Scanner;

public class OperatorPre3 {
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("num1 �� ���� �Է��ϼ��� :");
		int num1 =sc.nextInt();
		System.out.println("num2 �� ���� �Է��ϼ��� :");
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
	
	//public static void method1()�� ����
	//Scanner �� �̿��� num1 num2 �� ���� �Է¹ް�
	//< >  �� ����ؼ� �Է� ���� < > �� � ������ true �� �������� Ȯ���ϱ�
	//boolean result1 = num1 >num2;
	//boolean result2 = num1 >=num2;
	//boolean result3 = num1 <num2;
	//boolean result4 = num1 <=num2;
	
	
	//������
	//public static void method2() num1 num2 num3 �� �ް�
	// &&|| ����ؼ� ũ�� ���� �� ȱ���ϱ�
	//boolean result = (num1 <num2) && (num2 == num3) ���� �Ǵ°�?
	
public static void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù �� ° �� �� :");
		int num1 = sc.nextInt();
		System.out.print("�� �� ° �� �� :");
		int num2 = sc.nextInt();
		System.out.print("�� �� ° �� �� :");
		int num3 = sc.nextInt();
		
		boolean result = (num1 <num2) && (num2 == num3);
		System.out.println("(num1 < num2) && (num2 == num3) ���");
	
	}


	public static void main(String[] args) {
		//method1();
		method2();
		
		
	}
	
	
	
}
