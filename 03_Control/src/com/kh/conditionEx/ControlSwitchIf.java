package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitchIf {
	public static void takeAtaxi() {
		//�Է¹��� ���� 3000�� �̻��� ��� �ýø� Ż ������ ��� ��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �ݾ��� �Է��ϼ���. :");
		int money =sc.nextInt();
		
		//if ���� ����ؼ� �ݾ��� 3000�� �̻��� ��쿡�� ���� �ڵ带 �ۼ��ϱ�
		if(money>3000) {
			System.out.print("�ýø� Ż �ǰ���? (��/�ƴϿ�) :");
			String answer = sc.next();
			
			//answer�� ���� ��信 ���� ������ ó���ϱ�
			switch(answer) {
			case "��":
				System.out.println("�ýø� ź��.");
				break;
			case "�ƴϿ�":
				System.out.println("�ýø� �� ź��.");
				break;
				default:
					System.out.println("�߸��� �Է��� �ƴմϴ�.");
			}
		}else {
			System.out.println("3000�� �����̹Ƿ� �ܾ��� �����մϴ�.");
			
		}
	}

	/*public static void whyScore
	 * ����ڷκ��� ������ �Է� �޾� ���� ����� �Ǻ��ϴ� ���α׷� �ۼ�
	 * 90 �̻��̸� A����
	 * 80 �̻��̸� B����
	 * 70 �̻��̸� C����
	 * 60 �̻��̸� D����
	 * 60�� �̳� �̸� F����
	 * ->F�����϶� ����� �Ͻðڽ��ϱ�?(yes/no)
	 * ���࿡ yes no�̿��� ���� ���� �� �ֱ� ������
	 *  case YES : case yes:
	 */
	public static void whyScore(){
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���. :");
		int score =sc.nextInt();
		
		if(score>90) {
			System.out.println("a ����");
			String answer = sc.next();
		}else if (score>80) {
			System.out.println("b ����");
			String answer = sc.next();
		}else if (score>70) {
			System.out.println("c ����");
			String answer = sc.next();
		}else if (score>60) {
			System.out.println("d ����");
			String answer = sc.next();
		}else if(score<60) {
			System.out.println("�� f ���� ");
			System.out.print("�Ͼ���� ��翩... �� f���� �Դϴ�. ����� ��? :");
			String answer = sc.next();
			switch(answer) {
			case"����": case"��":
				System.out.println("����� �絵�� ����ƾ�!!");
				break;
			case"����": case"�ƴϿ�":
				System.out.println("�׳� �̴�� ��ô�~ �׳�....");
				break;
			default:
				System.out.println("�߸� �Է��Ͽ��ٳ�...");
			}
			
		}
		
		
		
		
	}

	
	public static void whatDay() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��¥ �Է� : ");
		System.out.print("(�� / ȭ / �� / �� / �� / �� / ��)");
		String day = sc.next();
		
		String result;
		switch(day) {
		case "��":case "��":case "��":
			result = "����" ;
			break;
		case "ȭ" : case "��":	
			result ="����" ;
			break;
		case "��":case "��":
			System.out.println("�ָ��̳׿�.");
			System.out.print("������ �� ����?(��/�ƴϿ�) :");
			String answer = sc.next();
			if(answer.equals("��")) {
				System.out.println("������ ǫ �� ����");
			}else {
				System.out.print("� Ȱ���� �� ��ȹ�ΰ���? :");
				System.out.println("1.���� / 2. ������ / 3.��ȭ�� /4. ���� Ž�� / 5.����");
				int activity = sc.nextInt();
				switch(activity) {
				case 1:
					result="����";
					break;
				case 2:
					result="������";
					break;
				case 3:
					result="��ȭ��";
					break;
				case 4:
					result="���� Ž��";
					break;
				case 5:
					result="����";
					break;
					default:
						System.out.println("�߸��� �Է�");
				
				}
			}
		default:
			return;
		}
		System.out.println(day + "���Ͽ�"+ result + "�� ���� �Դϴ�.");
	}
	
	public static void main(String[] args) {
		//takeAtaxi();
		//whyScore();
		whatDay();
	}

}
