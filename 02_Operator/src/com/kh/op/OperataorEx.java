package com.kh.op;

import java.util.Scanner;

public class OperataorEx {
	//���� �޼��� ȣ��
	public static void main(String[] args) {
		//���� ��ĳ�ʷ� �Է¹��� ���� ��µǰ� g�ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�ȳ��ϼ��� ���� �Դϴ�.");
		System.out.print("a�ǰ��� �Է��ϼ���:");
		int a= sc.nextInt();
		System.out.print("b�ǰ��� �Է��ϼ���:");
		int b= sc.nextInt();
		
		System.out.println(a+b);
		//����
		int sum = a+b;
		System.out.println("sum:"+sum);
		//����
		int dif = a-b;
		System.out.println("���� ��� dif:"+dif);
		
		//����
		int mul =a*b;
		System.out.println("���� ��� mul:"+mul);
		//������
		int div =b/a;
		System.out.println("������ ��� div:"+div);
		
	}

}
