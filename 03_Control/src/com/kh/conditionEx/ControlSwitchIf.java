package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitchIf {
	public static void takeAtaxi() {
		//입력받은 돈이 3000원 이상일 경우 택시를 탈 것인지 물어볼 것
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 보유한 금액을 입력하세요. :");
		int money =sc.nextInt();
		
		//if 문을 사용해서 금액이 3000원 이상일 경우에만 묻는 코드를 작성하기
		if(money>3000) {
			System.out.print("택시를 탈 건가요? (예/아니오) :");
			String answer = sc.next();
			
			//answer로 받은 대답에 따라 응답을 처리하기
			switch(answer) {
			case "예":
				System.out.println("택시를 탄다.");
				break;
			case "아니오":
				System.out.println("택시를 안 탄다.");
				break;
				default:
					System.out.println("잘못된 입력이 아닙니다.");
			}
		}else {
			System.out.println("3000원 이하이므로 잔액이 부족합니다.");
			
		}
	}

	/*public static void whyScore
	 * 사용자로부터 점수를 입력 받아 성적 등급을 판별하는 프로그램 작성
	 * 90 이상이면 A학점
	 * 80 이상이면 B학점
	 * 70 이상이면 C학점
	 * 60 이상이면 D학점
	 * 60점 미나 이면 F학점
	 * ->F학점일때 재수강 하시겠습니까?(yes/no)
	 * 만약에 yes no이외의 값이 나올 수 있기 때문에
	 *  case YES : case yes:
	 */
	public static void whyScore(){
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요. :");
		int score =sc.nextInt();
		
		if(score>90) {
			System.out.println("a 학점");
			String answer = sc.next();
		}else if (score>80) {
			System.out.println("b 학점");
			String answer = sc.next();
		}else if (score>70) {
			System.out.println("c 학점");
			String answer = sc.next();
		}else if (score>60) {
			System.out.println("d 학점");
			String answer = sc.next();
		}else if(score<60) {
			System.out.println("너 f 학점 ");
			System.out.print("일어나세요 용사여... 너 f학점 입니다. 재수강 ㄱ? :");
			String answer = sc.next();
			switch(answer) {
			case"ㄱㄱ": case"예":
				System.out.println("재수강 재도전 가즈아아!!");
				break;
			case"ㄴㄴ": case"아니오":
				System.out.println("그냥 이대로 살련다~ 그냥....");
				break;
			default:
				System.out.println("잘못 입력하였다네...");
			}
			
		}
		
		
		
		
	}

	
	public static void whatDay() {
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜 입력 : ");
		System.out.print("(월 / 화 / 수 / 목 / 금 / 토 / 일)");
		String day = sc.next();
		
		String result;
		switch(day) {
		case "월":case "수":case "금":
			result = "낮잠" ;
			break;
		case "화" : case "목":	
			result ="공부" ;
			break;
		case "토":case "일":
			System.out.println("주말이네요.");
			System.out.print("집에서 쉴 예정?(예/아니오) :");
			String answer = sc.next();
			if(answer.equals("예")) {
				System.out.println("집에서 푹 쉴 예정");
			}else {
				System.out.print("어떤 활동을 할 계획인가요? :");
				System.out.println("1.게임 / 2. 수족관 / 3.영화관 /4. 맛집 탐방 / 5.독서");
				int activity = sc.nextInt();
				switch(activity) {
				case 1:
					result="게임";
					break;
				case 2:
					result="수족관";
					break;
				case 3:
					result="영화관";
					break;
				case 4:
					result="맛집 탐방";
					break;
				case 5:
					result="독서";
					break;
					default:
						System.out.println("잘못된 입력");
				
				}
			}
		default:
			return;
		}
		System.out.println(day + "요일에"+ result + "할 예정 입니다.");
	}
	
	public static void main(String[] args) {
		//takeAtaxi();
		//whyScore();
		whatDay();
	}

}
