package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public void practice2(){
		//1미만의 숫자가 입력 됐다면
		//1 이상의 숫자를 입력해주세요가 출력
		//다시 사용자가 값을 입력하도록 하기
		
		//입력 받기 위해 스캐를 통해 입력 받기
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1이상의 숫자를 입력하세요.");
		}else {
			System.out.println("1이상 의 숫자를 입력 ");
			break;
		}
		
		//1부터 ~까지의 숫자들이 나왔는지 출력을 보고 싶다.
				System.out.println("1부터 " + num + "까지의 숫자" );
				
				int i = 1;
				while(i<num) {
					System.out.println(i + "");
					++i;
					
				}
				System.out.println();
				
		
	}
		
			
	}

	public void practice3() {
		//사용자로부터 1개의 값을 입력 받아
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("****practice3 시작****");
		while(true) {
			System.out.println("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("1 이상의 숫자를 다시 입력해주세요.");
			}else {
				break;
			}
		}
		
		System.out.println(num + " 부터 1까지의 숫자들을 거꾸로 출력합니다.");
		
		//1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하기
		while(num >= 1) {
			System.out.println(num +" ");
			num--;//키보드로 입력받은 숫자에서 -1을 하면서 1이 될떄 까지 출력
			
		}
		//System.out.println();
		
		
		//1부터 그 숫자까지의 모든 수를 거꾸로 출력
		//단 입력한 수는 1보다 크거나 같아야 함
	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);
		//두 정수와 연산기호를 받아 계산하는 메소드
		//연산의 경우 + / * - %
		String operator; // char operator charAt
		
		while(true) {
			
			System.out.println("프로그램 종료를 원할 경우 exit를 입력");
			System.out.println("연산입력(+ - * / %)");
			
			operator = sc.next();
			
			//만약에 exit를 입력하여 프로그램 종료를 원할 경우
			//문자열(String)으로 비교를 할 경우 equals ==
			if(operator.equals("exit")) {
				System.out.println("프로그램을 종료");
				break;
			}
			
			//정수 1과 정수 2를 입력 받아 계산
			System.out.print("정수 : ");
			int 정수1 = sc.nextInt();
			System.out.print("정수2 : ");
			int 정수2 = sc.nextInt();
			
			//정수1과 정수2 계산에 대한 결과(=result)
			int 결과;
			
			//switch case "+"
			if (operator.equals("+")) {
				결과 = 정수1 + 정수2;
				
			}else if (operator.equals("-")) {
				결과 = 정수1 - 정수2;
				
			}else if (operator.equals("*")) {
				결과 = 정수1 * 정수2;
				}
				else if (operator.equals("/")) {
					//몫 같은 경우 0으로 나눌수 없어서 정수2는 0이 될수 없음
					if(정수2 == 0) {
						System.out.println("0으로 나눌수 없음");
					}
					결과 = 정수1 / 정수2;
				}else if (operator.equals("%")) {
					//나머지 경우 0 으로 나눌수 없기 때문에 정수2는 0이 될 수 없음
					if(정수2 == 0) {
						System.out.println("0으로 나눌 수 없습니다.");
					}
					결과 = 정수1 % 정수2;
					continue;
				
			}else {
				System.out.println("잘못 입력했습니다.");
				continue;
			}
			System.out.println(정수1 + "" + operator + " "+정수2+ " = ");
		}
		
	}
	
	public void practice7() {
		/*
		 사용자로부터 2개의 값을 받아 그 사이의 숫자 출력
		 
		  만일 1미만의 숫자가 입력되었다면 1이상의 숫자를 입력 출력하기
		  다시 사용자가 값을 입력해서 출력하기
		  
		 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번쨰 숫자 : ");
		int firstNum = sc.nextInt();
		
		System.out.println("두 번쨰 숫자 : ");
		int secondNum = sc.nextInt();
		
		//만약에 첫 번쨰 숫자와 두 번째 숫자가 모두 1보다 크거나 같을 경우
		if(firstNum >= 1 && secondNum >= 1) {
			//int firstNum  <= secondNum
				//두수를 비교해서
			//최소 값 최대 값 구하기
			int 최소값 = Math.min(firstNum, secondNum);
			//Math(수학파일에서) 가장 적은 ㄱ밧을 찾는 min을 활용해서
			//알아서 비교하고 작은 값 구하게 하기
			//(  ,  )괄호 안에 숫자를 넣을 때 숫자 순서는 상관 없음
			//Random파일  Math.random 파일
			//많지만 둘 다 사용하는데 큰 차이는 없음
			
			int 최대값 = Math.max(secondNum, firstNum);
			
			for(int i =firstNum; i <= secondNum; i ++) {
				System.out.println(i+" ");
					break;
				}
				
			}else {
				System.out.println("1 이상의 숫자를 입력");
			}
		} 
		
	public void practice13() {
		//키보드로 숫자를 입력 받고 별찍기를 진행
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		// 입력받은 수만큼 세로줄 출력 ex) 2 세로로 이+ 한자 
		for(int 세로줄 = 1; 세로줄 <=num; 세로줄++) {
			//한줄씩 별을 만들기
			//한 줄 - 하나  두줄 - 둘  세 줄-세.... num줄 = num
			for(int 별= 1; 별 <= 세로줄; 별++) {
				System.out.println("*");
			}
			//줄바꿈을 해줄 enter가 없으면 가로로 모두 출력
			System.out.println();
			
			
			
			
			
			
		}
	}

	public void practicte14() {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		for (int line = num; line >=1; line--) {//; ; 은 for문 안에서 2개만 사용 가능
			for(int star = 1; star <= line; star++)
				System.out.print("*");
		}
		System.out.println();
	}
		
	public void practicte15() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		//키보드로 입력 받은 수를 size 안에 넣어줌
		int size = sc.nextInt();
		// line은 세로로 된 줄의 번호를 나타냄
		for(int line = 0; line < size; line++) {
			System.out.println("===line "+line +"===");
			//blank를 채우기 위한 for문
			//line 번째 줄에서는 line개의 공백을 출력하겠다.
			 for(int blank = 0; blank < line; blank++){
			 	System.out.print(" ");
			 }
			 //star 별을 출력하기 위한 for문
			 //line 번쨰 줄에서는 size - line 개의 별을 출력
			 //첫번째 줄 size
			 //두번쨰 줄 size - line
			 for(int star = size; star > line; star--){
				 System.out.println("* ");
				 
				 
			 
			 }
			 System.out.println();
			 
			 
			
		}
	}
	
	
		
		//이중 포문 
		//for (int line = num; 조건식; 증감식;){
		//	for(int star = 1; line <= star; star++)
		//		System.out.print(*);
		//   }
		// System.out.println();
		// }
		
	
		
	
	
	
	public void Geeting() {
		System.out.println("안녕하세요.");
	}
	
	public void Geeting2() {
	System.out.println("반가워요");
	}
}
