package com.kh.op;

public class OperatorEx4 {

	public static void main(String[] args) {
		/*
		 �� ������ 
		 �����Ͱ� ������ �ٸ����� ���� �� ���
		 ����� �׻� true false ��Ÿ��
		 
		  a= 1;
		  ��� ���
		  a == b a�� b�� ������ true
		  
		  a !=b b �� b�� �ٸ��� true
		  
		  a !=b
		  	a�� b�� ������ true
		  	a�� b�� �ٸ��� false
		  	
		  	! = �����Ҷ� ����ϴ� ������
		  	==���� �� ����ϴ� ������
		  	
		  	 
		  
		 */
		
		int a = 10;
		int b = 10;
		//System.out.println ���� ���𰡸� ����� ��
		//+�� ""���ڿ��� ������ �� ���� ���� �̾��ִ� ������ ��
		//���ڿ��� �� ��� ����Ʈ���� ����(���ϱ� ���� ���ϱ� ������ true false)
		//���� �۾��� �����ϱ� ���ؼ��� �켱���� 1����()�� �̿��ؼ�
		//���� �۾��� �켱���� �����ϰ� ������ ���� ����� ���ڿ� �̾����
		System.out.println("a==b �϶�:" +(a==b));
		
		System.out.println(a == b);
		//a=10 b=10
		int c = 20;
		int d = 10;
		
		System.out.println(c != d);
		
		//1. a�� 10�̰� c�� 20 �ε� ==�� ���� ���
		//��+���� Ű���带 ������ Ư�����ڰ� ���� 
		System.out.println("���a==c ���");
		System.out.println(a==c);
		//a==c�� ���� �ٸ��� ������ false
	}

}
