package com.kh.op;

import java.util.Scanner;

public class OperatorPre {

	public static void main(String[] args) {
		����1();
	}
		//���� ������ִ� ���� �޼���
		//public static void main(String[] args){
		
		//�������� ����ϴ� �޼���� �ƴ�
		//���� �ʿ��� �� ������ ����ϴ� �޼���
		//�޼���: Ư�� ���³� ����� ������ ���� ����
		//static :������ 
	//static�� �ٴ� ���� �ڷ����̳� ������ ��Ƽ� ���°� �ƴ϶�
	//�ܵ����� ���������� �޸𸮿��� ����� �� ������ ��Ÿ���� ǥ��
	
	
	
	public static void ����1() {
		
		
		
		//1. int num1 = 10 int num2 =3
		//���ϱ� ���� ���ϱ� ������ ����� ����ϱ�
		
		//2.double num3 = 2.5 double num4 =3.5
		//���ϱ� ���� ���ϱ� ������ ����� ����ϱ�
		
		Scanner sc =new Scanner(System.in);
		int num1 = 10;
		int num2 = 3;
		int ���ϱ� =num1+num2;
		System.out.println("���ϱ�:"+���ϱ�);
		int ���� =num1-num2;
		System.out.println("����:"+����);
		int ���ϱ� =num1*num2;
		System.out.println("���ϱ�:"+���ϱ�);
		int ������ =num1/num2;
		System.out.println("������:"+������);
		
		double num3 =2.5;
		double num4=3.5;
		
		double a =num3+num4;
		System.out.println("���ϱ� ���:"+a);
		
		double b =num3-num4;
		System.out.println("���� ���:"+b);
		
		double c =num3*num4;
		System.out.println("���ϱ� ���:"+c);
		
		double d =num3/num4;
		System.out.println("������ ���:"+d);
		

	}

}
