package com.kh.operatorPre;

import java.util.Scanner;

public class ControlSwitch2 {
	//if���� Ȱ���� ������ switch�� Ȱ���� ����
	public static void ifExam() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1���� 3���� ���� �� �ϳ��� �Է�");
		int num = sc.nextInt();
		
		String result;
		
		
		System.out.println("If���� Ȱ���� ���� �Դϴ�.");
		if (num ==1) {
			result = "��";
			
		}else if (num==2) {
			System.out.println("��");
			result = "��";
			
		}else {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}
		System.out.println(num+"�� �ѱ���� " +result + "�Դϴ�.");
	}
	
	public static void switchExam(){
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �ѱ���� �Է����ּ���.");
		System.out.print("�Է¹��(��,����,����,�ܿ�):");
		String season = sc.nextLine();
		String state;
		//Switch���� �ҿ��Ͽ� ���ڿ� ���ϰ� ����ϱ�!
		switch(season) {
		case "��" :
			state = "������ ";
			break;
		case "����" :
			state = "���� �� ���� ���� ";
			break;
		case "����" :
			state = "��ǳ�� �����ϴ� ";
			break;
		case "�ܿ�" :
			state= "Ȥ�ѱ�� �ϴÿ��� ������ ������ �Ͼ� �����Ⱑ ������ ";
			break;
			
		default:
				System.out.println("�׷� ������ ���������� ���� �ʾƿ�.");
				return;
		}
		System.out.println(state + "����");
	}
	 
	public static void main(String[] args) {
		//ifExam();
		switchExam();

	}

}
