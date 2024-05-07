package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEx {
	
	public void guguDan() {
		
	}
	//구구단 입력 받아 거꾸로 출력
	public void guguDan2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 시이이이이이이 작!");
		while (true) {
		System.out.println("0번을 누르면 종료인데... 종료 할겐가?");
			System.out.println("원하는 숫자를 입력하란 말이야! 어서 입력 할꺼야? 안 할꺼야! : ");
		int dan = sc.nextInt();
		
	;
			
			if(dan == 0) {
				System.out.println("종료하겠소!  종료해서 닷씨는 안하겠소! ");
				break;
			}
			
			if(dan<1 || dan >9) {
				System.out.println("1~9까지의 숫자를 입력하란 말이야! 알아들었나?");
				continue;
				
				
			}
			for (int a = 9; a>=1  ;   a--) {
				System.out.println("거꾸로 출력 간드아아!");
				System.out.println(dan+ "* " + a + "=" + (dan*a));
			}
			
			
		}
		
		
		
	}

	public void guguDan3() {
		//int dan = 원하는 단만 지정해서 출력
		
		//1단~9단 까지 출력
		for(int dan = 1; dan <=9 ; dan++) {
			
			//1단에서 부터 1~9 를 곱한 값을 출력
			
			for(int num = 1; num <=9; num++) {
				System.out.println("*****" + dan + "*****");
				
				System.out.print(dan + " * " + num + " = " + (dan* num));
				
			}
			
			
		}
	}
	
	//구구단을 2단 부터 9단까지 출력
	public void gugudan4() {
		for(int dan = 2; dan <=9 ; dan++) {
			for(int num = 2; num <=9; num++) {
				System.out.println("*****" + dan + "*****");
				
				System.out.print(dan + " * " + num + " = " + (dan* num));
			}
			
			
		}
	}

	//10개의 숫자 랜덤으로 출력하기 
	public void randomNumber() {
		//Random 불러와 내가 지정한 범위에서 숫자를 랜덤으로 출력
		
		Random 랜덤 =new Random();//로또번호 생성
		
		int 랜덤숫자 = 랜덤.nextInt();
		System.out.println("랜덤 숫자: " +랜덤숫자);
		
		
	}
	// 랜덤으로 숫자 3개 출력
	
	public void readomFor() {
		Random ran = new Random();
		for(int num = 1; num <=3; num++ ) {
			
			int radomNumber = ran.nextInt(10) + 1;
			System.out.println("랜덤숫자" + num + " : " + radomNumber);
		}
	
	}
	/*
	 public void randomFor2(){
	 
	 	//랜덤 1~45 번호 6자리 for문 출력
	 }
	 */
	
	
	 public void randomFor2() {
		 Random ran = new Random();
		 for(int num = 1; num <=6; num++ ) {
			 int radomNumber = ran.nextInt(45) + 1;
				System.out.println("랜덤숫자 : " + radomNumber);
			 
			 
		 }
	 }
	//1~10까지의 숫자 중 홀수 만 출력
	 //홀수 = odd
	 public void oddNum() {
		 for(int num =1; num <= 10; num++) {
			 //만약에 숫자가 홀수라면 출력하기 
			 if(num % 2 !=0) {
				 System.out.println(num);
			 }
		 }
	 }
	 //짝수만 1~10까지 출력
	 //짝수 = even
	 public void evenNum() {
		 for(int num =1; num <= 10; num++) {
			 if(num % 2 ==0) {
				 System.out.println(num);
			 }
		 }
	 }
	public void squareStar() {
		int star = 3;
		for(int i = 0; i < star; i++) {//한줄 출력 0 1 2
			
			for (int j = 0; j <star; j++) {
				System.out.print("* ");
			}
			
			System.out.println(); //가로로 별을 출력 한 후 줄 바꿈
			
		}
		
		
	}
//정사각형 모양의 별 출력 가로로 5개 씩 출력
	public void fiveStar(){
		int star = 5;
		for(int i = 0; i < star; i++) {
			for (int j = 0; j <star; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
			
		}
		
		
		
		
	}
 //LoopForEx.java
	//숫자를 맞출때까지 계속 문제를 풀도록 하기 while(true)
	//for 기회 2번 주기
	//if 문 수정해서 숫자 값이 정답 보다 높으면 숫자가 너무 큽니다.
	public void numberGame() {
		//숫자 맞추기 게임
		Scanner sc = new Scanner(System.in);
		
		//랜덤으로 숫자 만들기
		Random random = new Random(); 
		while(true) {
			
			
			int randomNumber = random.nextInt(3)+ 1; //1~3
			System.out.println("숫자를 함 맞춰 봐라~  ");
			for(int a = 1; a <= 2; a++) {
				System.out.print("공격을" + a + "회 시도(숫자적기) :");
				int guest = sc.nextInt();//게스트 가 입력한 숫자 가져오기
				//만약에 숫자를 맞췄다면 숫자를 맞췄습니다. if else if
				
				if (guest == randomNumber) {
					System.out.println("빰빠카빰~ 숫자를 맞췄습니다!");
					break;
					// 탈출을 작성
					//틀렸을 때 정답보다 숫자를 작게 작성 혹은 높게 작성 햇는지 힌트
				}else if (guest < randomNumber){
					System.out.println("더 적자나 ㅠㅠ");
					
					
				}else if (guest > randomNumber) {
					System.out.println("더 크자나 ㅠㅠ");
				}
			
			
		}System.out.println("할거야? 안 할거 continue? 나의 아기 고양이? (1번 yes 복수의 리벤지 / 2번 no 때려쳐 그냥)");
		int playAgain = sc.nextInt();
		if (playAgain == 2) {
			System.out.println("응 안해ㅠㅠ");
			break;
		}
		}
		
		
	}
	
	
	

}
