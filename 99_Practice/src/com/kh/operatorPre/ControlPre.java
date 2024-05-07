package com.kh.operatorPre;

import java.util.Scanner;

public class ControlPre {
	//�ǽ����� 1�� Ȧ,¦ ��Ÿ����
	public static void practice1() {
		//Ű����� �Է¹��� ������ ��� �̸鼭 ¦���϶��� ¦���Դϴ� ���
		Scanner sc =new Scanner (System.in);
		
		System.out.print("������ �����ÿ� :");
		int number = sc.nextInt();
		
		// ����̸鼭 ¦�� �϶��� ¦���Դϴ�.
		//���� ���ڰ� 2�� ������ �������� 0�� ��� ¦���̴�.
		
		//���࿡ ���ڰ� ����� ��쿡�� Ȧ,¦�� ��Ÿ�� ���̴�.
		//�߶󳻱� (ctrl + x) ���� (ctrl +c) �ٿ��ֱ�: (ctrl +v)
		if(number >0) {//�Է� ���� ���ڰ� ����� ��� Ȧ¦ ����
			if(number % 2 == 0) {//���ڰ� ¦���� ��� ����ϱ�
				System.out.println("¦���� ¦��.");
			}else {
				System.out.println("Ȧ������ �Ʊ����̾�.");
			}
			
		}else {		//�Է¹��� ���ڰ� ������ ��� ����ϱ�
			System.out.println("�����ڳ�...... ����� �������.....");
		}
		
		
		
		
	}
		
	public static void practice2() {
		//Ű����� ������ ���� �Է�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� :");
		int korean = sc.nextInt();
		
		System.out.print("�������� :");
		int english = sc.nextInt();
		
		System.out.print("�������� :");
		int math = sc.nextInt();
		
		//�հ�� ��� ���
		int totalScore = korean + english + math;//�հ�
		double averageScore =totalScore /3.0;
		//�հ� ���� �Ǻ�
		//3 ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���
		if(korean >=40 && english >=40 && math>40 && averageScore >=60) {
			System.out.println("���� ����: "+korean);
			System.out.println("���� ����: "+english);
			System.out.println("���� ����: "+math);
			System.out.println(" �� ����� : "+averageScore);
			
			System.out.println("�� �θ�! �հ��̾߾ƾ�!!!!");
			
		}else {
			System.out.println("��HAP�� �ƽ����� ���ư��׶�");
		}
		
	}
		
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
	}
	
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		
		//Ű�� ������ �Է� �ޱ�
		System.out.print("Ű(m)�� �Է��ϼ���:");
		double height = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է��ϼ���:");
		double weight = sc.nextDouble();
		
		//bmi ���	bmi= ü�������� �񸸵��� Ȯ���ϴ� ��
		double bmi = weight / (height * height);
		
		//bmi ������ ���� ��� ���
		if(bmi < 18.5) {
			System.out.println("��ü�� �� �� �� ������");
			
		}else if (bmi<23) {
			System.out.println("�ߺ� ���� �Դϴ� ����");
			
		}else if (bmi<25) {
			System.out.println("��ü���Ӵ�");
		}else if (bmi<30) {
			System.out.println("���� �� �׸� �Ӱ� ��");
		}else {
			System.out.println("���� ���� �ö󰣰ſ� �񸸷��� �峭 �ƴϳ׿�");
		}
		
	}
	
	public static void practice5() {
		//�߰� �⸻ ���� �⼮ �Է�
		Scanner sc =new Scanner(System.in);
		System.out.print("�߰� ����: ");
		double mid = sc.nextDouble();
		System.out.print("�⸻ ����: ");
		double fin = sc.nextDouble();
		System.out.print("���� ����: ");
		double assig = sc.nextDouble();
		System.out.print("�⼮ Ƚ��: ");
		int attend =sc.nextInt();
		
		//�⼮ ���� ���
		double attendPer = attend / 20*100;
		
		
		
		
		//�򰡺����� ���� ���� ���
		//�߰� 20 �⸻ 30 ���� 30 �⼮ 20 = 100��
		
		//�⼮ ���� ���
		
		//�߰� ���� 20
		double midScore = mid*0.2;
		//�⸻ ���� 30
		double fiScore = fin*0.3;
		//���� ���� 30
		double asScore = assig*0.3;
		//�⼮ ���� 20
		double attendScore = attendPer*0.2;
		
		
		double totalScore = midScore + fiScore +asScore + attendScore;
		
		if(totalScore >= 70 && attendPer >= 70) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		System.out.println("======���======");
		System.out.println("�߰���� ���� (20�� ����):" + midScore);
		System.out.println("�⸻��� ���� (20�� ����):" + fiScore);
		System.out.println("�⼮ ���� (20�� ����):" + asScore);
		System.out.println(" �� ���� (20�� ����):" + attendScore);
		
		
		
	}
	
	/*
	 *
	 * 1~12 ������ ���� �Է� �޾� �ش� ���� �ϼ��� ����ϼ���.
	 * 2�� ������ �������� �ʽ��ϴ�.
	 * 00���� �߸� �Է��� ���Դϴ�. ��/�� �빮�� o
	 */
	public static void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1���� 12 �� �ϳ� �Է� :");
		int month = sc.nextInt();
		
		int daysMonth;
		switch (month) {
		case 1: case 3: case 5: case 7 :case 8:case 10:case 12:
			daysMonth = 31;
			break;
			
		case 4: case 6: case 9: case11:
			daysMonth = 30;
			break;
			
		case 2:
			daysMonth = 28;
			break;
			
		
		default:System.out.println(month+"���� �������� �ʽ��ϴ�.");
		//daysMonth=0;
		return;
				
		}
		System.out.println(month+"����"+daysMonth+"�ϱ��� �ֽ��ϴ�.");
	}
	
	
	
	

	public static void main(String[] args) {
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		//practice5();
		practice6();
	}

}
