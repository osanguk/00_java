package com.kh.operatorPre;

import java.util.Scanner;

public class ControlSwitch2 {
	//if문을 활용한 예제와 switch를 활용한 예제
	public static void ifExam() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1부터 3까지 숫자 중 하나를 입력");
		int num = sc.nextInt();
		
		String result;
		
		
		System.out.println("If문을 활용한 예제 입니다.");
		if (num ==1) {
			result = "원";
			
		}else if (num==2) {
			System.out.println("투");
			result = "투";
			
		}else {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		System.out.println(num+"은 한국어로 " +result + "입니다.");
	}
	
	public static void switchExam(){
		Scanner sc = new Scanner(System.in);
		System.out.println("게절을 한국어로 입력해주세요.");
		System.out.print("입력방법(봄,여름,가을,겨울):");
		String season = sc.nextLine();
		String state;
		//Switch문을 할용하여 문자열 비교하고 출력하기!
		switch(season) {
		case "봄" :
			state = "따스한 ";
			break;
		case "여름" :
			state = "더워 쪄 죽을 듯한 ";
			break;
		case "가을" :
			state = "단풍이 낙하하는 ";
			break;
		case "겨울" :
			state= "혹한기와 하늘에서 내리는 더러운 하얀 쓰레기가 내리는 ";
			break;
			
		default:
				System.out.println("그런 날씨는 존재조차도 하지 않아요.");
				return;
		}
		System.out.println(state + "날씨");
	}
	 
	public static void main(String[] args) {
		//ifExam();
		switchExam();

	}

}
