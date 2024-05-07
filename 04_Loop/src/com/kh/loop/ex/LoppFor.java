package com.kh.loop.ex;

import java.util.Scanner;

public class LoppFor {

	
	/*
	 for 문 : 끝이 정해진 반복을 진행할 때 사용하는 제어문
	 특정 조건을 만족하는 동안 {}코드 블록을 반복해서 실행
	 반복 횟수가 일정하게 정해진 경우 많이 사용
	 
	 사용 예쩨
	 for (초기식 ; 조건식; 증감식;){
	 
	 //조건이 맞을 경우 반복해서 실행될 코드 블록
	 }
	 
	 //for문에서 조건이 맞지 않으면 for문을 탈출
	 
	 
	 
	 */
	public static void main(String[] args) {
		//int i = 1;
		/*
		 for (초기 식의 값이기 때문에 i라고 작성을 해줄 수 없음
		 무조건
		 for( 지정값 변수명 = 변수의 초기숫자 ; 조건 ; 증감식)
		 작성해줘야 함
		 for ( i ; i <=2; i ++) {
		 for (i ; i <= 2 ; i++){
		 	System.out.println("i의 값 : " +1);
		 	}
		 	
		 */
		
		for(int i = 1 ; i <=2; i ++) {
			
			System.out.println(i);
		}
		System.out.println("===== for문 2번 =====");
		
		for (int a = 1; a <= 3; a++) {
			System.out.println("a의 값 : " + a);
		}
		
		System.out.println("===== for문 3번=====");
		//int 값을 num = 1로 준 후
		//num의 값이 1부터 5까지나오도록 출력
		
		for (int num = 1; num <= 5; num++) {
			System.out.println("num의 값 : "+ num);
		}
		
		
		System.out.println("===== for문 4번 ======");
		
		// 1부터 10까지 짝수만 출력해보기
		// int 값을 num = 2로 준 후
		//증감식에서 num += 2 준다음 출력
		
		for (int num = 2; num <=10; num+= 2 ) {
			System.out.println("num의 값 : "+ num);
			
			//for문 구구단 5단 출력
			//단의 값이 5임을 표시
			int dan = 5;
			for (int i = 1; i <= 9; i++) {
				
				System.out.println(dan+ "단* " + i +"=" + (dan*i));
			}
			// 실습문제 6번
			System.out.println("===== for 6번 =====");
			//구구단에서 3단을 9번까지 출력
			//처음 3* 1 =3		마지막은 3 * 9 = 27;
			//int dandan = 3;
			//int num = 1;
			
			int dandan = 3;
			for (int num1 =1; num1 <=9; num1++) {
				System.out.println(dandan+ "단* " + num1 +"=" + (dandan*num1));
			}
			
			
			
			
		}
		

	}

	public class LoopForEX{
		//기본 메서드
		
		//LoopForEX에서 출력하길 원한다면
		//public static void guguDan 으로 static을 추가해준 다음에
		//public static void main(String[] args){
		//guguDan();
		//}
		//staic을 붙이지 않고 출력하길 원한다면
		//출력용 클래스를 만들어서 출력하기 LoopForRun
		
		
		
		public void gugudan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 세계에 온 걸 환영하오 낮선이여. ");
		
		//구구단을 0을 입력하기 전까지 반복해서 출력
		//반복하기 위해 while문 사용
		while(true) {
			System.out.println("종료를 원하면 0 입력");
			System.out.println("원하는 수를 입력하란 말야! 지금 당장!");
			int dan=sc.nextInt();
			
			//만약에 숫자 0이 들어오면 프로그램 종료하기
			if(dan == 0) {
				System.out.println("프로그램을 종료");
				break;
			}
			
			//받은 수를  for 문이용해서 출력
			for (int num1 =1; num1 <=9; num1++) {
			
				System.out.println(dan+ "단* " + num1 + "=" + (dan*num1));
			}
			}
			
			
		}
		
		
		}
		//사용자로부터 숫자를 입력 받고 숫자에 해당하는 구구단을 출력
		
		}
	


