package com.kh.operatorPre;

import java.util.Scanner;

public class OperatorPre {
	//�⺻ ��� �޼���
	//�������� ����ϴ� �޼��尡 �ƴ����� ��Ȳ�� ����
	//���� �޼��忡�� ȣ���� ����� �� �ִ� �޼��� �� �ϳ�
	public static void practice1() {
		
		
		Scanner sc = new Scanner(System.in);
		// ��ĳ�ʸ� �ҷ��� ������ �ٷ� sc ��ĳ�ʷ� ��ĳ�� ����� �ҷ��͵� ������
		//System.out.print�� �̿��ؼ� � �ൿ�� �����ϰ� �ִ���
		//Ȯ���ϴ� ������ ������ ��
		//�ο� �� �Է� �ޱ�
		//��ĳ�ʸ� �̿��ؼ� Ű����� �Է¹��� ������ ��ǻ�Ϳ� ���
				//System.inŰ����� �Է� ���� �� �ְ� ���ִ� ��� �ý���
				//Scanner:Ű����� �Է¹��� ������ ��ǻ�ͷ� ���
		System.out.print("�ο� ���� �Է��ϼ���:");
		int people = sc.nextInt();
		//���� ���� �Է� �ޱ�
		System.out.print("���� ������ �Է��ϼ���:");
		int candies = sc.nextInt();
		
		//1�δ� ������ ���� ���� ���
		int getCandies = candies / people;
		
		//�����ְ� ���� ���� ���� ���
		int reMain = candies%people;
		
		System.out.println("���� �ο�:"+people);
		System.out.println("ĵ�� �� ����:"+candies);
		System.out.println("�����ϰ� �������� ĵ�� ����:"+getCandies);
		System.out.println("���� ĵ�� ����"+reMain);
	}
	
	
	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		//�̸� �Է� �ޱ�
		System.out.print("�̸� :");
		String name = sc.nextLine();
		//�г� �̸� �ޱ�
		System.out.print("�г�(���ڸ�) :");
		int grade = sc.nextInt();
		//�� �Է� �ޱ�
		System.out.print("��(���ڸ�) :");
		int  classNum = sc.nextInt();
		// ��ȣ �Է� �ޱ�
		System.out.print("��ȣ(���ڸ�) :");
		int num = sc.nextInt();
		//���� �Է� �ޱ� String-.char
		System.out.print("����(M/F):");
		//String gender = sc.next();
		char gender = sc.next().charAt(0);
		//���� �Է� �ޱ�(�Ҽ��� ��° �ڸ� ������ �Է� ����)
		System.out.print("����:");
		double score = sc.nextDouble();
		//������ ���� ��� ���ڿ� ����
		//��ĳ�ʷ� char ���� �Է¹ް��� �� ���
		//charAt�� ����Ͽ� ���ڿ� ��ġ�� �о���� �۾��� �����ؾ� ��
		//�ý������� ���� ���
		//System - out - print()
		//Scanner - next -charAt(���ڸ�����)
		//						���� �������ϴ� ���� ��ġ
		//T A B L E = 5����
		//���� �� �� ���� ���� �ʹٸ�
		//charAt(0): �� �� ���ڸ� ����
		//charAt(1) :�ι��� ���� ����
		//charAt(2):����° ���ڸ� ����
		//charAt(3):�׹�° ���ڸ� ����
		//charAt(4):�ټ���° ���ڸ� ����
		//���� ������ ��� ���ڿ� ����
		System.out.println("�̸� :"+name);
		System.out.println("�г� :"+grade);
		System.out.println(" �� :"+classNum);
		System.out.println("��ȣ :"+num);
		System.out.println("���� :"+gender);
		//System.out.println("���� :"+score);
		// ������� �Ҽ��� 4��° �ڸ����� ����ϱ� ���� :%.4f
		// �Ҽ��� 2��° �ڸ����� ����ϱ� ���Ѵٸ� %.2f
		System.out.printf("���� : %.2f");
		
	}
	
	
	
	public static void practice3() {
		
		//2���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������
		//true �ƴϸ� false
		Scanner sc = new Scanner(System.in);
		//���� ���� �Է�
		System.out.print("���� ������ �Է��ϼ��� :");
		int korean = sc.nextInt();
		//�������� �Է�
		System.out.print("���� ������ �Է��ϼ��� :");
		int english = sc.nextInt();
		//�������� �Է�
		System.out.print("���� ������ �Է��ϼ��� :");
		int math = sc.nextInt();
		
		//�Է� ���� ������ �հ� ���
		//��������
		//��������+ ��������+��������+��������
		
		
		int total = korean+ english+ math;
		
		//�� ���� ������ 3�� �ؼ� ��� ���� ����ϱ�
		//������ ������ �Ҽ��� �̿� ������ ���´ٴ� ������ ���� ������
		//�Ǽ�(�Ҽ��� �ڸ��� ���� ��)�� ���´ٴ� ������ ����
		double average =(double) total / 3.0;
		System.out.println("�������� : "+korean);
		System.out.println("�������� : "+english);
		System.out.println("�������� : "+math);
		System.out.println("���� + ���� +���� : "+total);
		System.out.println("���� ���� ���� ������� : "+average);
	}
	
	public static void method4() {
		Scanner sc = new Scanner(System.in);
		//ù��° �� �Է� �ޱ�
		System.out.print("ù ��° ���� �Է��ϼ��� :");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� �Է��ϼ��� :");
		int num2 = sc.nextInt();
		
		
		//==true ==���ʿ� �ִ� ���� ������ true
		// 3==5 false��� ǥ��
		//5==5 true��� ǥ��
		// !=���ʿ� �ִ� ���� �ٸ��� �ٸ��� �¾�! true
		//3 !=5 true ��� ǥ��
		//3 !=3 false ��� ǥ��
		//true false ǥ���ҋ� �� ���� true false�� ǥ���ޱ� ���ؼ���
		//boolean�� ����ؼ� ǥ���� ��
		//���� ���� ��� ���� = true or false;
		// = equal
		boolean result= num1 == num2 ;
		System.out.println("num1 �� num2�� ��� :"+result);
		
	}
	
	/*
	 * �ǽ� ���� 4�� ����
	 * 2���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� �ٸ��� !=
	 * 								true ��� ������ false ���
	 */
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù�� �� �� �Է�:");
		int num1 =sc.nextInt();
		
		System.out.print("�ι� �� �� �Է�:");
		int num2 =sc.nextInt();
		
		boolean ��� = num1 ==num2;
		System.out.println("num1 �� num2 �� ����"+���);
		
	}
	
	
	public static void practice5() {
		//��ĳ�� ����ؼ� int�� ������ 3���� �����
		Scanner sc = new Scanner(System.in);
		//int �� ������ 3���� �����
		
		System.out.println("num1 �� ���� �Է��ϼ��� :");
		int num1 =sc.nextInt();
		System.out.println("num2 �� ���� �Է��ϼ��� :");
		int num2 =sc.nextInt();
		System.out.println("num3 �� ���� �Է��ϼ��� :");
		int num3 =sc.nextInt();
		
		//  ampersand  && and
		// ����1 && ����2 = true
		// (true)&&(true) = true
		// (true)&&(false) = false
		//(false)&&(true) = false
		//(false)&&(false) = false
					
		//			num1�̶� num2�� ���� �� && num2 �� num3�� ������ 
		
		boolean result =  (num1 != num2) &&(num2 == num3);
		
		
		//||vertical bar or
		//����1 or ����2
		//(true) or (false)=true
		//(false)or(true)=true
		//(true) or (true) = true
		//| Enter ���� backspace �Ʒ� ��ȭ ǥ�ø� shft + �����ָ�|
		boolean isOR =(num1 == num2)||(num1 == num2);
		System.out.println("num1:" + num1 +",num2 :"+num2+",num3 :"+num3);
		System.out.println("result :"+result);
		
	}
	
	
	
	public static void main(String[] args) {
		//�ۼ����� �޼��� �߿��� �����̳� ����ϰ��� �ϴ� �޼��� �ۼ�
		//practice1();
		//practice2();
		//practice3();
		//method4();
		//practice4();
		practice5();
	}
	

}
