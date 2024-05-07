package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchIfPre {
	public static void practice8() {
		//주민번호를 이용하여 남자인지 여자인지 구분해서 출력
		Scanner sc =new Scanner(System.in);
		System.out.print("주민번호를 - 포함해서 입력하세요. :");
		String idNumber = sc.next();
		//cahrAt 7번째 자리에 있는 값을 가져와서 여자인지 남자인지 구분해서 출력
		//990101-1234567 
		//990101-2345678
		//000101-3456789
		//000101-4567890
		// 주민번호 뒷자리의 첫번쨰 숫자를 가지고 옵니다.
		char genderCode =idNumber.charAt(7);
		//주민번호를 =제외하고 주민번호 숫자만 입력하면 6번째 자리에 있는 ㄱ밧을 가지고 와야함
		String gender; //나중에 여자인지 남자인지 확인해주는 결과
		//만약에 1이나 3이 들어오면 남자
		if(genderCode=='1' && genderCode == '3') {
			gender = "남자";
		} else if(genderCode =='2'|| genderCode == '4') {
			gender= "여자";
			//만약 2 나 4이면 여자
		}else {
			System.out.println("올바른 주민번호가 아님");
			//1. gender =올바른 주민번호가 아닙니다.
			//2.else에서 돌려보내는 return
			return;
		}
		//여자인지 남자인지에 대한 결과
		System.out.println("입력한 주민번호는" + gender + "입니다.");
			
		
		
	}

	//스네이크 케이스
	//변수명에 언더바(_)가 들어있는 표현 방식을 뱀처럼 생겼다하여 붙인 이름
	//표기법-코드를 작성 할떄 개발자 사이에 코드를 명학히 보여주기 위해 작성하는 방법
	//카멜 케이스-중간글자만 대문자로 시작하여 표현하는 방식
	//케밥표기법-중간에 대시(-)로 구분하여 변수명을 작성하는 표기법
	
	
	public static void castingPractice1() {
		//키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력
		Scanner sc =new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		char inputChar = sc.next().charAt(0);
		
		//유니코드 출력
		int unicode = inputChar;//char 2byte int 8byte
		System.out.println("입력한 문자 " + inputChar + " 의 유니코드는 "+unicode + "입니다.") ;
		
	}

	
	public static void castingPractice3() {
		//주어진 코드에서 빈칸을 채워 출력 결과가 나오도록 만든 것
		int iNum1 =10;
		int iNum2 =4;
		float fNum = 3.0f;//기본값이 double 이기때문에 float으로 변경해주는 f 붙여줌
		double dNum =2.5;
		char ch ='A';
		System.out.println(iNum1 / iNum2);//2 몫 2로 떨어지면?
		System.out.println((int) dNum);//2 //double 실수로 되어있는 것을 정수로 변경
		//double 실수로 되어있는 것을 정수로 변경
		// double 8byte int 4byte 강제 형변환을 (int) 변경하겠다는 표시를 작성 후 시킬 것
		System.out.println(iNum2 * dNum); //10.0
		//작은 값과 큰 값이 만나면 자동으로 큰 값으로 변경되기 때문에(double) 필수가 아님
		System.out.println((double)iNum1);//10.0
		System.out.println((double)iNum1 / iNum2);//2,5;// 정수->실수형
		System.out.println(dNum);//2.5
		
		System.out.println((int)fNum);//3 //실수-> 정수형
		System.out.println((int)(iNum1/ fNum)); //3 //나누기를 해서 몫이3
		//int와 flaot은 같은 크기의 byte 정수인지 실수인지 표기
		//float 소수점 이하 6자리 까지만 보여줌 기본으로
		System.out.println((double)iNum1 /fNum);//3.3333333
		
		System.out.println((double)iNum1/ fNum);//3.33333333335
		System.out.println(ch); //'A'
		System.out.println((int)ch);//65
		System.out.println(ch + iNum1);//75
		//'A'의 값이 (int)ch를 통해 65
		//큰 byte와 작은 byte가 만나면 자동으로 큰 byte 담겨짐
		//65+(int Inum1 =10)=75
		System.out.println((char)(ch + iNum1));//75 'K'
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
	}
	
	public static void controlPractice1() {
		//키보드로 입력받고 입력 수정 조회 삭제 삭제 종료 버튼 눌러 실행
		Scanner sc =new Scanner(System.in);
		
		//메뉴 출력
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		
		//메뉴 번호 입력
		System.out.print("메뉴 번호를 입력하세요. : ");
		int menuNumber =sc.nextInt();
		
	//선택한 메뉴에따라 동작 수행
		switch(menuNumber) {
		case 1:
			System.out.println("입력 메뉴 입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴 입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴 입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴 입니다.");
			break;
			
		case 7:
			System.out.println("종료 메뉴 입니다.");
			break;
			
			default:
				System.out.println("잘못된 메뉴 번호 입니다.");
			
			
			
			
		}
		
		
		
		
	}

	public static void controlPractice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 메뉴 출력" 
							 +"2.짝수/홀수" 
							 +"3. 합격/불합격" 
							 +"4.계절" 
							 +"5.로그인" 
							 +"6.권한 확인" 
							 +"7.bmi" 
							 +"8.계산기" 
							 +"9.P/F");
		
		
		System.out.print("메뉴 번호를 입력하세요. : ");
		int menuNumber =sc.nextInt();
		switch(menuNumber) {
		case 1:
			System.out.println("메뉴 출력.");
			break;
		case 2:
			System.out.println("짝/홀 실행.");
			break;
		case 3:
			System.out.println("합격일까? 불합격일까? 그걸 알수가 없단 말야~♪.");
			break;
		case 4:
			System.out.println("계절 알리미.");
			break;
		case 5:
			System.out.println("login");
			break;
		case 6:
			System.out.println("권한 확인");
			break;
		case 7:
			System.out.println("공포의 BMI");
			break;
		case 8:
			System.out.println("계산기.");
			break;
		case 9:
			System.out.println("P/F.");
			break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
		}
			
		
		
			
		
		
		
		
	}
	
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디와 비번을 입력");
		System.out.print("id:\n" +"passwd :");
		String inputId = sc.next();
		String inputPw = sc.next();
		String Id = "myId";
		String PassWord = "myPassword12";
		
		if (Id.equals(inputId)  && PassWord.equals(inputPw)) {
			System.out.println("로그인 완료.");
			
			
			/*
			 특정 조건을 부정하는데 사용
			 inputID.equals(userID):inputID와 userID가 일치하는지 확인 일치하면
			 !inputID.equals(userID):iputID와 userID가 둘이 일치하지 않음
			 							!가 붙으면 아이디가 틀렸을 때 참이 된다.
			 */
		}else if ("" != Id) {
			System.out.println("아이디가 다름");
		}else if (Id == "") {
			System.out.println("비번이 틀리자나..ㅠㅠ");
			return;
		}
		
		
	}

	public static void Practice6() {
		//사용자로부터 회원 등급 입력 받기
		Scanner sc = new Scanner(System.in); 
		System.out.println("권한을 확인하고자 하는 회원 등급");
		//권한이나 규칙을 설정할때 자주 사용하는 변수명 :Role
		String userRole = sc.next();
		
		//권한 등급
		System.out.println("해당 회원 등급의 권한");
		
		switch(userRole) {
		case "관리자":
			System.out.println("-회원관리\n" +
					"-게시글 관리\n"+
					"-게시글 작성\n" +
					"-게시글 조회\n"+
					"-댓글 작성\n");
			break;
		case "회원":
			System.out.println("-게시글 작성\n"+
						"-게시글 조회\n" +
						"-댓글 작성\n");
			break;
		case "비회원":
			System.out.println("-게시글 조회\n");
			
			
		}
		
	}
	
	public static void controlPractice8() {
		/*
		 키보드로 2개의 정수와 연산 기호를 입력받아 연산 기호에 맞춰
		 연산 결과 출력
		 (2개의 정수 모두 양수일때만 작동하며 없는 연산 기호를 입력했을 경우
		 "잘못 입력했습니다." 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1: ");
		int num1 = sc.nextInt();
		System.out.println("숫자 2: ");
		int num2 = sc.nextInt();
		System.out.println("연산자 입력(+,-,*,/,%)");
		String operator =sc.next();
		
		double result;
		switch(operator) {
		case "+":
			result = num1+ num2;
			break;
		case "-":
			result = num1- num2;
			break;
		case "*":
			result = num1* num2;
			break;
		case "/":
			result =(double) num1/ num2;
			break;
		case "%":
			if(num2 == 0) {
				System.out.println("0으로 나눌수 없습니다. 프로그램을 종료합니다..");
				return;
				
			}
			result = num1 % num2;
			break;
			
		default:
				System.out.println("잘못 입력했습니다. 프로그램을 종료 합니다.");
		}
		
		
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		//practice8();
		//castingPractice1();
		//castingPractice3();
		//controlPractice1();
		//controlPractice10();
		//practice5();
		//Practice6();
	}

}
