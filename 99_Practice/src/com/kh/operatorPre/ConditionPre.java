package com.kh.operatorPre;

import java.util.Scanner;

public class ConditionPre {
	
	//public static void method1(){
		//���� �� 2���� �޾Ƽ� ���� �ΰ��� ��ġ�ϴ��� Ȯ��
		//Scanner sc = new Scanner(System.in);
		//int num1 = sc.nextInt();
		//int num2 = sc.nextInt();
		//���ٸ� �����ϴ�. ���
		//���� �ʴٸ� ���� �ʽ��ϴ�. ����ϱ�
	
	/*
	 public static void method2(){
	 if �� Ȱ�� ���� �� 2���� �޾Ƽ� ���� 2���� ��ġ�ϴ��� Ȯ��
	 Scanner sc = new Scanner(System.in);
		int str1 = sc.nextLine();
		int str2 = sc.nextLine();
		���ٸ� �����ϴ�. ���
		���� ������ ���� �ʴٰ� ���
	 */
	
	
	
	
	
	//�������� ������ ���� �޼���
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("num1�� �� �Է��ϼ���. :");
		int num1 = sc.nextInt();
		System.out.println("num2�� ���� �Է��ϼ���. :");
		int num2 = sc.nextInt();
		if (num1 == num2) {
			System.out.println(num1 + "��"+num2 +"�� ���� �����ϴ�.");
			
		}else {
			System.out.println(num1 + "��"+num2 +"�� ���� �����ʽ��ϴ�.");
		}
		
				
	}
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("str1�� �� �Է��ϼ���. :");
		String str1 = sc.nextLine();
		System.out.println("str2�� �� �Է��ϼ���. :");
		String str2 = sc.nextLine();
		if(str1.equals(str2)) {
			System.out.println(str1 + "��"+str2 +"�� ���� �����ϴ�.");
		}else {
			System.out.println(str1 + "��"+str2 +"�� ���� ���� �ʽ��ϴ�.");
		}
	}
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("double1�� �� �Է��ϼ���. :");
		double double1 = sc.nextDouble();
		System.out.println("double2�� �� �Է��ϼ���. :");
		double double2 = sc.nextDouble();
		
		if (double1 == double2) {
			System.out.println(double1 + "��"+double2 +"�� ���� �����ϴ�.");
		}else {
			System.out.println(double1 + "��"+double2 +"�� ���� ���� �ʽ��ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		method1();
		method2();
		method3();
	}
		}
	
		


