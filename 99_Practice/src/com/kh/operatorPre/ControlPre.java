package com.kh.operatorPre;

import java.util.Scanner;

public class ControlPre {
	//실습문제 1번 홀,짝 나타내기
	public static void practice1() {
		//키보드로 입력받은 정수가 양수 이면서 짝수일때만 짝수입니다 출력
		Scanner sc =new Scanner (System.in);
		
		System.out.print("정수를 넣으시오 :");
		int number = sc.nextInt();
		
		// 양수이면서 짝수 일때만 짝수입니다.
		//만일 숫자가 2로 나눌때 나머지가 0일 경우 짝수이다.
		
		//만약에 숫자가 양수일 경우에만 홀,짝을 나타낼 것이다.
		//잘라내기 (ctrl + x) 복사 (ctrl +c) 붙여넣기: (ctrl +v)
		if(number >0) {//입력 받은 숫자가 양수일 경우 홀짝 실행
			if(number % 2 == 0) {//숫자가 짝수일 경우 출력하기
				System.out.println("짝수여 짝수.");
			}else {
				System.out.println("홀수란다 아기고양이야.");
			}
			
		}else {		//입력받은 숫자가 음수일 경우 출력하기
			System.out.println("음수자나...... 양수만 넣으라고.....");
		}
		
		
		
		
	}
		
	public static void practice2() {
		//키보드로 국영수 점수 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 :");
		int korean = sc.nextInt();
		
		System.out.print("영어점수 :");
		int english = sc.nextInt();
		
		System.out.print("수학점수 :");
		int math = sc.nextInt();
		
		//합계와 평균 계산
		int totalScore = korean + english + math;//합계
		double averageScore =totalScore /3.0;
		//합격 여부 판별
		//3 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우
		if(korean >=40 && english >=40 && math>40 && averageScore >=60) {
			System.out.println("국어 점수: "+korean);
			System.out.println("영어 점수: "+english);
			System.out.println("수학 점수: "+math);
			System.out.println(" 총 평균은 : "+averageScore);
			
			System.out.println("야 인마! 합격이야아아!!!!");
			
		}else {
			System.out.println("不HAP격 아쉽지만 돌아가그라");
		}
		
	}
		
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
	}
	
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		
		//키와 몸무게 입력 받기
		System.out.print("키(m)를 입력하세요:");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력하세요:");
		double weight = sc.nextDouble();
		
		//bmi 계산	bmi= 체질량지수 비만도를 확인하는 것
		double bmi = weight / (height * height);
		
		//bmi 지수에 따라 결과 출력
		if(bmi < 18.5) {
			System.out.println("저체중 넌 좀 더 묵으라");
			
		}else if (bmi<23) {
			System.out.println("삐빅 정상 입니다 정상");
			
		}else if (bmi<25) {
			System.out.println("과체중임다");
		}else if (bmi<30) {
			System.out.println("대지 ㅠ 그만 머거 ㅠ");
		}else {
			System.out.println("어휴 뭐가 올라간거여 비만력이 장난 아니네요");
		}
		
	}
	
	public static void practice5() {
		//중간 기말 과제 출석 입력
		Scanner sc =new Scanner(System.in);
		System.out.print("중간 점수: ");
		double mid = sc.nextDouble();
		System.out.print("기말 점수: ");
		double fin = sc.nextDouble();
		System.out.print("과제 점수: ");
		double assig = sc.nextDouble();
		System.out.print("출석 횟수: ");
		int attend =sc.nextInt();
		
		//출석 비율 계산
		double attendPer = attend / 20*100;
		
		
		
		
		//평가비율에 따른 총점 계산
		//중간 20 기말 30 과제 30 출석 20 = 100점
		
		//출석 비율 계산
		
		//중간 점수 20
		double midScore = mid*0.2;
		//기말 점수 30
		double fiScore = fin*0.3;
		//과제 점수 30
		double asScore = assig*0.3;
		//출석 점수 20
		double attendScore = attendPer*0.2;
		
		
		double totalScore = midScore + fiScore +asScore + attendScore;
		
		if(totalScore >= 70 && attendPer >= 70) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		System.out.println("======결과======");
		System.out.println("중간고사 점수 (20점 만점):" + midScore);
		System.out.println("기말고사 점수 (20점 만점):" + fiScore);
		System.out.println("출석 점수 (20점 만점):" + asScore);
		System.out.println(" 총 점수 (20점 만점):" + attendScore);
		
		
		
	}
	
	/*
	 *
	 * 1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.
	 * 2월 윤달은 생각하지 않습니다.
	 * 00월은 잘못 입력한 달입니다. 한/영 대문자 o
	 */
	public static void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1에서 12 중 하나 입력 :");
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
			
		
		default:System.out.println(month+"월은 존재하지 않습니다.");
		//daysMonth=0;
		return;
				
		}
		System.out.println(month+"월은"+daysMonth+"일까지 있습니다.");
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
