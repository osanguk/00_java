package com.kh.oop.constructor;

public class ConstructorEx {
		//필드 변수명 정의
		public String name;
		public String phone;
		public int idNo;
		public int money;
		
		//생성자 기본 / 필수 / 값을 지정한 생성
		public ConstructorEx() {
			
			
		}
		//필수생성자 괄호 안에 매개변수가 필수로 들어가야하는 생성자
		public ConstructorEx(String inputName) {
			this.name = inputName;
		}
		//		필수로 이름 핸드폰번호
		public ConstructorEx(String inputName, String inputNumber) {
			this.name = inputName;
			this.phone =inputNumber;
		}
		//		필수로 이름 핸드폰번호 아이디번호
		public ConstructorEx(String inputName, String inputNumber, int inputidNo) {
			this.name = inputName;
			this.phone =inputNumber;
			this.idNo =inputidNo;
			
		}
		public ConstructorEx(String inputName, String inputNumber, int inputidNo, int inputmoney) {
			this.name = inputName;
			this.phone =inputNumber;
			this.idNo =inputidNo;
			this.money =inputmoney;
		}
		//		필수로 이름 핸드폰번호 아이디번호 금액
		//
		
		
	
	public static void main(String[] args) {
		/*생성자
		 변수를 원하는 값으로 초기화할 수 있음
		 
		 초기값이 = 0; 으로 되어있을 때 초기값에 1을 넣으면
		 초기값이 1로 초기화됨
		 
		 1.반환값이 없음(return 사용 x ,void x 위 2개로 선언하지 않음)
		 2.객체(클래스)를 초기화 하는 방법이 많을 경우 모두 사용 가능
		 
		 	선언 예제
		 		1.기본 생성자-필수가 없음
		 			public 클래스이름(){
		 		
		 		}
		 	2. 필수생성자 - 필수로 받아야하는 값이 존재
		 	 		   - 필수로 받아야하는 값은 필드에 적힌 값만 가능
		 	 		   public 클래스 이름(String ㅇㅇ,int ㅇㅇ, char ㅇㅇ){
		 	 		   		this.변수명1 = ㅇㅇ;
		 	 		   		this.필드값2 = ㅁㅁ;
		 	 		   		this.필득밧3 = ㅎㅎ;
		 	 		   
		 	 		   }
		 	 		   
		 	 3. 값이 지정된 생성자
		 	 	필드나 생성자에서 값을 지정해준 생성자
		 	 	
		 	 	
		 	 	
		 	 	
		 */

	}

}
