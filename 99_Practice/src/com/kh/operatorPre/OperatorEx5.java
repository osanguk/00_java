package com.kh.operatorPre;

import java.util.Scanner;

public class OperatorEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 �� ������
		 == : ���� ������ true
		 ���� ���
		 		5== 5 true
		 		3== 5 false
		 		5== 3 false
		 !=: ���� �ٸ��� true
		 	���� ���
		 		5==5 false
		 		3!=5 true
		 		5!=3 true
		 		
		 �� ������
		 &&:���� ������ �� ���� ������ ��� ���� ���� ��ü ǥ���� ��
		 	���� ��� 
		 		(5 == 5)&&(5==5): true
		 		(5 !=3)&&(3 == 3): true
		 		(5 ==5) &&(5 == 3): false
		 		(3 == 5)&&(5 == 5): false
		||: ���� ������ �� �� �ϳ��� ���̸� ��
		���� ���
		(5 == 5) || (5 == 5) true
		(5 == 5) || (5 == 3) true
		(5 == 3) || (3 == 3) true
		(5 == 3) || (3 == 5) false
		
	 �� ������ > < >= <=
	 ���� > ������: �������� ������ ������ ũ�� true
	 			�����̶� �������� �ʰ��� �̸��� �� ����ϴ� ǥ��
	 ���� >= ������ :�������� ������ ������ ũ�ų� ������ true
	 				�����̶� �������� �̻� ���� ó�� ���� ���� ����ϴ� ǥ��
	 ���� < ������ : �������� ���� ���ʺ��� ũ�� true
	 			 �����̶� �������� �ʰ��� �̸��� �� ����ϴ� ǥ��
	 			 
	 ���� <= ������: �������� ���� ���ʺ��� ũ�ų� ������ true
	 				�����̶� �������� �̻� ����ó�� ���� ���� ����ϴ� ǥ��
	 
	 
		
		 		
		 */
	
		int num1= 10;
		int num2= 20;
		
		//num1 num2 ���� 1.������ 2. �ٸ��� 3.� ���� �� ū��
		//1.num1 == num22
		// ����	=true false
		boolean result1 = num1 == num2;//num1 num2 �� ���ٸ� ��
		boolean result2 = num1 !=num2;//num1 num2 �� �ٸ��ٸ� ��
		boolean result3 = num1 < num2;//num2�� num1���� ũ�ٸ� ��
		System.out.println("result1 :"+result1);
		System.out.println("result2:"+result2);
		System.out.println("result3:"+result3);
		
		
		
		
		

	}

}
