package com.kh.conditionEx;
//��Ű�� : �ۼ��� ������ ���� ��ġ

import java.util.Scanner;

//���ǹ� ��ɹ� Ŭ���� 
public class ConditionEx {
	/*
	 IF �־��� ������ �� �϶� ����Ǵ� �ڵ� ���
	 else ������ ������ �� ����Ǵ� �ڵ� ���(�ʼ��� �ƴ�)
	  
	  ����
	  if (���ǹ�) {
	  	������ ���� ��� ������ �ڵ� �ۼ�
	  	���࿡ ���ǹ��� ������ ���� �ƴ� ���
	 	�ڵ����� ���� ����
	 	
	 	
	 
	 	
	 */
	
	
	
	//�޼��� 1: 19�� �̻��� ���� �Դϴ�
	//���� �޼���
	public static void method1() {

		
		Scanner sc =new Scanner(System.in);
		System.out.print("������ ���̸� �Է��ϼ���:");
		int age = sc.nextInt();
		//���࿡ ���� ���̰� 19�� �̻��̶��
		//�����Դϴ�.�� ���
			if(age >= 19) {
				//agr�� ���� 19 �̻��̸� �����Դϴ� ��µǰ� �ϱ�
				System.out.println("�����Դϴ�.");
			}else {
				// ���࿡ ������ �ƴ϶�� ������ �ƴմϴ�.
				System.out.println("������ �ƴմϴ�.");
			}
			
			
		
		
		

	}
	public static void method2() {
		int num =7;
		//���࿡ num�� ¦���� ��� ¦���Դϴ�. ���
		//¦�� 2 % 0
		if (num% 2 == 0) {
			System.out.println("¦�� �Դϴ�.");

		}else {
			System.out.println("�� �Ӹ�! �̰� Ȧ���߾�!");
		}
	}
	
	public static void method3() {
		int age = 19;
		//���࿡
			// true			true
		
		if(age > 0 &&  age<14) {
			//���࿡ �� �л��� ���̰� 0���� ũ�� 14���� ������ 
			//��̶�� ǥ��
			System.out.println("��Դϴ�.");
		}else
			System.out.println("��� �ƴմϴ�.");
		
		//14���ʹ� ��̰� �ƴմϴ�.
	}
	
	//Scanner Ȱ���ؼ� ����
	//public static void practice1()
		//���̰� 10�� �̻� 20�� �̸��� ���� 10��
		//�ܴ̿� 10�밡 �ƴ��� ���
	
	//public static void practice2()
		//���̰� 80�� �̻��̸� 80�� �̻��Դϴ�. ���
	
	
	
	public static void practice1() {
		int age = 19;
		if(age > 10 &&  age<20) {
			System.out.println("10�� �Դϴ�.");
		}else {
			System.out.println("10�밡 �ƴմϴ�");
		}
			
	}
	
	
	
	public static void practice2() {
		int age = 7;
		if(age > 80 &&  age<80) {
			System.out.println("���� ���� 80���̻��̶��!.");
		}else {
			System.out.println("�� 80�� �̸��̴�");
		}
			
	}
	
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//practice1();
		practice2();
	}
}
