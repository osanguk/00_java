package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchPre {
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :");
		int day = sc.nextInt();//키보드로 받은 숫자 입력
		
		
		switch(day) {
		case 1:
			System.out.println("월요일입니다.");
			break;
		case 2:
			System.out.println("화요일 입니다.");
			break;
			
		default:
			System.out.println("아무 요일도 아닙니다.");	
		}
		
		
	}
	
	
	/*public static void method2
	  Scanner sc = new Sacnner(system.in);
	  int menuNumber = sc.nextInt();
	    case 1 =아메리카노 나왔습니다.
	 	case2=카페라뗴 나왔습니다.
	 	case3 =바닐라 라떼 나왔습니다.					
	 	default = 잘못 입력했습니다. 다시 이용해주세요
	 */
	public static void method2() {
		Scanner sc =new Scanner(System.in);
		System.out.print("주문하실 음료 메뉴 번호를 입력해주세요. :");
		int menuNumber = sc.nextInt();
		
		switch(menuNumber) {
		case 1:
			System.out.println("아메리카노 나왔습니다.");
			break;
			
		case 2:
			System.out.println("딸기라떼 나왔습니다.");
			break;
			
		case 3:
			System.out.println("바닐라라떼 나왔습니다.");
			break;
			
		case 4:
			System.out.println("코코아 나왔습니다.");
			break;
			
		case 5:
			System.out.println("율무차 나왔습니다.");
			break;
			
		case 6:
			System.out.println("달고나 커피 나왔습니다.");
			break;
			
		case 7:
			System.out.println("콜라 나왔습니다.");
			break;
			
		case 8:
			System.out.println("바닐라 쉐이크 나왔습니다.");
			break;
			
		case 9:
			System.out.println("슈크림 라떼 나왔습니다.");
			break;
			
		case 10:
			System.out.println("사이다 나왔습니다.");
			break;
			
			default:
				System.out.println("잘못된 주문이니 다시 이용해주세요.");
		}
		
		
		
	}
	
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("수도를 입력 ");
		String city = sc.nextLine();
		
		switch(city) {
		case "서울":
			System.out.println("대한민국");
			break;
			
		case "도쿄":
			System.out.println("일본");
			break;
			
		case "베이징":
			System.out.println("중국");
			break;
			
		case "워싱턴":
			System.out.println("미국");
			break;
			
		case "방콕":
			System.out.println("태국");
			break;	
			
			default:
				System.out.println("해당 도시가 없습니다.");
				System.out.println("다음에 이용해주세요");
		
		}
	}
	
	public static void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1부터 12까지 숫자 중 하나를 입력하세요 :");
		int month = sc.nextInt();
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
			
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
			
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		
			
		default:
			System.out.println("해당하는 계절이 없습니다.");
			
			
			
		/*사용법
			case의 경우 다른 번호가 동일한 결과를 갖길 원한다면
			case를 이어서 작성할수 있음
			cse1: case2: case3:
				
		 */
			
		}
	}
	
	//등급에 따라 학점 출력하는 코드
	public static void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A,B,C,D,E,F 중 하나의 등급을 입력하세요. :");
		//charAt을 호출해서 작성한 문자열 중 0번째 문자를 출력하겠다는 의미
		char grade = sc.next().charAt(0);
		switch(grade) {
		case 'A': case 'a':
		System.out.println("4.0");
		 break;
		 
		case 'B': case 'b':
			System.out.println("3.0");
			 break;
			 
			 
		case 'C': case 'c':
			System.out.println("2.0");
			 break;
			 
		case 'D': case 'd':
			System.out.println("1.0");
			 break;
			 
		default :
			System.out.println("입력된 정보가 없습니다.");
		}
		   
		    
		
		
	}
	
	
	

	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//method4();
		method5();
	}

}
