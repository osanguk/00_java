package com.kh.op;

import java.util.Scanner;

public class OperatorPre2 {

	public static void method1() {
		//��ĳ�ʷ� �Է��� ���� true���� false ���� �غ� ��
		Scanner sc = new Scanner(System.in);
		System.out.print("a�� ���� �Է��ϼ���:");
		int a = sc.nextInt();
		System.out.print("b�� ���� �Է��ϼ���:");
		int b = sc.nextInt();
		
		System.out.println("a:"+a+",b:"+b);
		System.out.println("a �� b�� ������ == true�� ���� ��");
		System.out.println("a==b:"+(a==b));
		System.out.println("a�� b�� �ٸ��� ! =false�� ���� ��");
		System.out.println("a!=b:"+(a!=b));
	}
		
		//method 2�� ���� ���� �����ڸ� ����� ���� 
		//�񱳿����ڸ� ����ؼ� ���� ������ Ʋ���� Ȯ���غ� ��
		
		public static void method2() {

			Scanner sc = new Scanner(System.in);
			System.out.print("c�� ���� �Է��Ͻÿ�:");
			//���࿡ 11�� �Է��޴ٸ� c=11
			int c= sc.nextInt();
			System.out.print("d�� ���� �Է��Ͻÿ�:");
			int d= sc.nextInt();
			
			
			int e= ++c;//c+1=c �ְڴ� ����� �빮�� c =12
			//int f =++c; �� �Ѵٸ� f�� ���� ��� ��������
			//System.out.println("f:"+f); f �� ����غ���
			System.out.println("c:"+c+",d:"+d+",e" +e);
			System.out.println("c==d :"+(c==d));
			System.out.println("c == e:"+(c==e));
			
			int f =++c;
		
			System.out.println("f:"+f);
		
	}
		//method3 ���� ����ϱ�
		
		
		public static void method3() {
			//������ǥ:��� ����� ������ ���� ������������ �Ѵ�.
			Scanner sc = new Scanner(System.in);
			System.out.print("�ο����� �Է��ϼ���:");
			int people = sc.nextInt();//�ο��� ���ϱ�
			
			System.out.println("���� ��Ƽ��"+people+"���� �����߽��ϴ�.");
			System.out.print("���� �����ϰ� �ִ� �� ������ ������ �Է��ϼ���.:");
			int candies = sc.nextInt();
			System.out.println("���� ������ �ִ� ������"+candies+"�� �Դϴ�.");
			
			System.out.println("�׷�����, �׷��� �����ϰ� ���� ���� ������ ������ � �Դϱ�?:");
			
			//�� ����� �����ϰ� �������� ������ ���� = �� ������ ����/�� �ο��� ��
				int 			perPerson = candies / people;
			
			//1�δ� �����ϰ� �������� ������ ����
				System.out.println("1�δ� �����ϰ� �������� ���� ����:"+perPerson);
			//�����ְ� ���� ������ ������ ����ϱ�
				//���� ������ ���� = �� ������ ����%���;
				int remain= candies% people;
				System.out.println("�������� ���� ������ ����:"+remain);
				
			//�ο����� ���� ������ Ű����� �Է¹ޱ�
			//1�δ� �����ϰ� �������� ������ ������
			//�����ְ� ���� ������ ������ ����ϱ�
			
			
			
			
			
			
			
			
			
		}
	public static void main(String[] args) {
		//�������� ����� �޼��常 �ۼ�
		//method1();
		//method2();
		method3();
	}

}

