package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhileEX {
	/*
	 * 
	 * public static void method1(){
	 * Scanner sc = new Scanner(System.in);
	 * 1.게임 2.수영 3.잠자기 4.프로그램 종료
	 * int menu
	 while(true){
	 System.out.println("~~ 프로그램 작성");
	 System.out.print("원하는 프로그램 번호를 입력해주세요 : ")
	  switch(menu){
	  		case 1:
	  		
	  		
	  		case 4:
	  
	  }
	 * while문을 사용해서
	 * 4번을 누르면 프로그램을 종료하는 코드를 작성
	 */
	public static void method1() {
		 Scanner sc = new Scanner(System.in);
		System.out.println("1.게임 2.수영 3.잠자기 4.프로그램 종료");
		
		
		while(true) {
			System.out.println("원하는 프로그램 번호를 입력해주세요 : ");
			
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("게임");
				break;
			case 2:
				System.out.println("수영");
				break;
			case 3:
				System.out.println("잠자기");
				break;
			case 4:
				System.out.println("프로그램 종료");
				break;
				default:
					System.out.println("번호를 잘못 입력하였습니다.");
			
			}
		}
		
		 
		 
	}
	
	public static void khcafe() {
		Scanner sc = new Scanner(System.in);
		while(true) {System.out.println("kh 카페에 오신걸 환영합니다. "
				+ "원하는 메뉴를 입력해주세요. \n"
				+"1. 아메리카노 2. 바닐라 라뗴 3.콜라 4. 사이다 5.흑당 버블티 6.블루레몬 7.초코라뗴 8.주문취소 : ");
		
		String menu = sc.next();
		
		switch (menu){
		case "1":case "아메리카노":
			System.out.println("아메리카노 대령");
			break;
		case "2":case "바닐라라떼":
			System.out.println("바닐라라떼 대령");
			break;
		case "3":case "콜라":
			System.out.println("콜라 대령");
			break;
		case "4":case "사이다":
			System.out.println("사이다 대령");
			break;
		case "5":case "흑당 버블티":
			System.out.println("흑당 버블티 대령");
			break;
		case "6":case "블루레몬":
			System.out.println("블루레몬 대령");
			break;
		case "7":case "초코라떼":
			System.out.println("초코라떼 대령");
			break;
		case "8":case "주문 취소":
			System.out.println("주문 취소 다음에 다시 오시길..");
			return;
			
			default:
				System.out.println("번호를 잘못 입력했습니다. 다시 입력해주세요.");
		}
		
			
		}
	
	}
	
	public static void getMoney() {
		//커피값 10잔 가진 돈 300원
		int coffee = 10;
		int money = 300;
		
		//만일 커피값보다 가진 돈이 더 많으면 커피를 사고
		//커피가 다 소진되면 판매를 중지한다.
		
		while(money >0) {
			System.out.println("돈을 받아서 커피를 제공");
			//커피가 10잔인데 만일 1잔을 제공하였다면 -1
			coffee--;
			System.out.println("남은 커피의 잔 수" + coffee + "잔 입니다.");
			//커피가 모두 소진 됐다면 판매를 중지
			if(coffee == 0) {
				System.out.println("커피가 다 소진 되었습니다. 판매 중지 모드 실행");
				return;
	
			}
			
			
		}
		
		
		
		
	}
	
	
	public static void allNumber() {
		int num = 1;
		while(num <= 5) {
			System.out.println(num);
			num++; // num = num+1;
			
		
		}
	}
	
	//10번 찍어 안 넘어가는 나무 없다.
	//나무 10번 찍어 나무 넘기기
	
	public static void tree() {
		//나무 찍기 전이기 때문에 공격 0
		int hit = 0;
		
		while(hit < 10) {
			//나무를 몇번 찍엇는지 확인
			hit++;//나무를 1번 찍을 때마다 hit = hit +1
			System.out.println("나무를" + hit +"번 찍었음");
			if(hit == 10) {
				System.out.println("나무를 쓰러뜨려 1 경험치 100골드를 얻었다.");
				
			}
			
			
			
		}
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		
		if (num < 1) {
			System.out.println("1이상의 숫자를 입력");
		}else{
			System.out.println("1부터" + num + "까지의 숫자들");
			int abc = 1;
			while(abc <= num) {
				System.out.println(abc);
				abc++;
			}
			
			
		}
		
		
		
		
		
	}

	
	public static void getCoffee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("카페에 어서오세요.");
		System.out.print("가진 액수를 입력하시오.: ");
		
		//커피가격
		int coffeePrice = 100;
		//현재 갖고 있는 돈
		int money = sc.nextInt();
		
		//만약 
		while(money < coffeePrice) {
			System.out.println("돈이 부족하자나..." + "돈을 다 넣으란 말이야! 어서!");
			System.out.print("현재 가진 돈을 더 넣기 : ");
			
			money = sc.nextInt();
			/*
			 돈이 부족합니다. 커피를 구매하기 위한 더 많은 돈을 넣으세요.
			 현재 가진 돈을 입력
			 nextInt();
			 * */
			
		}
		System.out.println("커피를 구매했습니다. 거스름돈은" + (money - coffeePrice)+ "임다!");
		
		//커피를 구매했다면 구매했습니다 하고 거스름 받기.
		
		
	}
	//10000 이상 돈이 없을 떄 경우 탕수육을 시키지 못하는 예제
	
	public static void iLovePork(){
		Scanner sc = new Scanner(System.in);
		System.out.print("탕수육 살 돈을 투입 하시오 : ");
		int tangsuyuk = 10000;
		int myMoney = sc.nextInt();
		
		while(myMoney < tangsuyuk) {
			System.out.println("돈이 부족하자나..." + "돈을 다 넣으란 말이야! 어서!");
			System.out.print("현재 가진 돈을 더 넣기 : ");
			
			myMoney = sc.nextInt();
		}
		System.out.println("탕수육 획득. 잔액은" + (myMoney - tangsuyuk)+ "남아있다.");
				
		
	}
	

	public static void main(String[] args) {
		//method1();
		//khcafe();
		//getMoney();
		//allNumber();
		//tree();
		//method2();
		//getCoffee();
		iLovePork();
	}

}
