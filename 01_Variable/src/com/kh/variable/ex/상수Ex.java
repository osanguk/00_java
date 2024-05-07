package com.kh.variable.ex;

public class 상수Ex {
	//���� �޼��� :�ڹ� ���α׷� �����ϴ� ����
	public static void main(String[] args) {
		//���:�� �� ���� ����ϸ� ���� �ٲܼ� ���� ����
		//��� Ű����:final
		
		//����� �ۼ�:�빮�ڷ� �ۼ�,����Ǵ� �ܾ� ���̴�_����
		//����� �빮�ڷ� ǥ���ϴ� ���� �ڹٿ��� �����ڰ��� ��Ģ
		final double PI=3.1415926538;
		System.out.println("����� ǥ���� PI:"+PI);
		
		//MIN ���� �ּҰ�
		final int MIN = 0;
		final int MAX =100;
		
		//����� ������ ���� �����Ϸ��� ������ �߻�
		//MIN =1; // ����� �� ���� 
		
		//��� final�� ����ؼ� 
		//String ���� "Hello world"�־��
		//�츮 ȸ�翡 �鷷���� ��������״�
		//Hello World ������ �����ְ� ����ǰ� �ϰ� ���� ���� ��
		final String GREETING ="Hello world";
		System.out.println(GREETING);

	}

}
