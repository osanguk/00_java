package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionEx2 {

	public static void method1() {/*
		 if 	- else if	- else
		 �����
		 if(����){
		 	������ ���� ��� ������ �ڵ� �ۼ�
		 }else if (����2){
		 
		 	������ ������ ��� ������ �ڵ� �ۼ�
		 } else {
		 	���� 1�� ����2�� ��� ������ ��� ������ �ڵ� �ۼ�
		 	}
		 	
		 */
		// ���࿡ ���� 2000�� �̻� ���� ��� �ýø� ź��
		// ���࿡ ���� 1500~1900 ���� ���� ��� ���� ������ ź��
		//���� ���� ���� ��� �ɾ��.
		
		
		int money = 1800;//���� ���� ���� �ִ� ��
		
		if(money >=2000) {//2000�� �̻��� ���
			System.out.print("�ý� Ÿ�� ������");
		} else if (money >+ 1500 && money <=1900) {//2000�̻��� ������ 1500�� �̻� ���� ���
			System.out.println("���� �������� �ɾ3");
		} else {//1400�� ���� ������� �ɾ
			System.out.println("�׳� �ɾ �θ�");
		}
		
		
	}

	public static void method2() {
		Scanner sc =new Scanner(System.in);
		System.out.println("�ȳ��ϼ���.khƼ�ϳ����Դϴ�.");
		System.out.print("���̸� �Է����ּ���. :");
		int age = sc.nextInt();
		
		if(age <=13) {
			System.out.println("���");
		}else if (age <=18) {
			System.out.println("û�ҳ�");
		}else {
			System.out.println("����");
		}
	}
	
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ȳ��ϼ��� ����ִ� �޷��̿���!");
		System.out.print("���� �Է��� ����:");
		int month = sc.nextInt();
		String result;
		if(month ==1 || month == 2||month== 12)	
		result=("�ܿ�");
		else if(month >=3 && month <= 5) {
			result=("��");
		}else if (month >=6 && month <= 8) {
			result=("����");
		}else if(month >=9 && month <= 11) {
			result=("����");
		} else {
			result=("�׷� ������ ���ܴ�");
		}
		
		

	}
	
	public static void method4() {
		//13�� ���� ��� 14~ 18 û�ҳ� 19�� �̻� ����
		
		int age = 15;
			//������ ����� Ȱ�� �������� ���̿� ���� ǥ�⸦ ���
		String result;
		if(age <=13) {
			result = "���";
		}else if (age >= 14 && age <= 18) {
			result = "û�ҳ�";
		}else {
			result = "����";
		}
	 System.out.println(result + "�Դϴ�.");
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
