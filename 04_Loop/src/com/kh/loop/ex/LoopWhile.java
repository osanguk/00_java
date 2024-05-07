package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhile {
	
	/*
	 * while(조건식): 끝이 확실하지 않은 반복에 사용
	 * 
	 * while(조건이 참일 경우) {
	 * 	조건식이 참일 경우에
	 * }
	 * 조건식이 거짓일 경우에 실행 종료
	 * 
	 * 예제 코드1:
	 * 	while(true){
	 * 		system.out.println("무한 반복")
	 * }
	 * 예제 코드 2:
	 * 	while(false){
	 * system.out.println("실행하지 못한 채로 종료")
	 * }
	 * 
	 *
	 * 
	 * 
	 * 
	 * 
	 */
	
	//최종으로 실행하지는 않지만 코드를 작성할 수 있는 메서드
	 
	public static void inLoop() {
		//ctrl + c
		while(true) {
			System.out.println("무한 실행");
		}
	}
	
	
	public static void outLoop() {
		//while(false) {
		//	System.out.println("실행 안됨");
		//}
	}

	
	public static void whileLoop() {
		//조건 = 조건에서 숫자가 3 이상이면 조건 거짓
		
		int i =1;
		while(i<=2) {
			//조건이 참 일 때 실행할 코드
			System.out.println("i의 값 :" + i);
			i++;
			
		}
		
	}
	
	public static void whileLoopEX() {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("1. 실행 2. 종료");
			System.out.print("원하는 숫자를 입력하세요 :");
			
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("프로그램 실행");
				break;
			case 2:
				System.out.println("프로그램 종료");
				//break;
				return;
				//break와 return 모두 case를 탈출하는 구문이기 때문에
				//같이 사용 못함
				//break의 경우 while이 true일 때 종료되지 않고 계속 반복
				//return의 경우 while이 true여도 while 코드를 탈출해서 프로그램을 종료
				default:
					System.out.println("잘못된 번호이니 다시 입력 해주세요.");
					System.out.println("1. 실행 2.종료");
					System.out.println("원하는 숫자를 입력하세요 :");
				
				
				
			}
			
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		//inLoop();
		//whileLoop();
		 whileLoopEX();

	}

}
