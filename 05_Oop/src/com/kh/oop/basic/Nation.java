package com.kh.oop.basic;
//국민
public class Nation {
/* 속성 값 */
	 public String name;
	 public int age;
	 public char gender;
	 public String jumin;
	 // nation 객체 생성
	 
	
	
	/*  메서드 가능  */
	public void speakKorean() {
		System.out.println("가나다라 한국어 가능");
	}
	
	public void welfare() {
		System.out.println("대한민국 복지 누리기 가능!");
	}
	
	public void 납세의의무() {
		//만 19세 이상 성인만 세금을 내는 경우
		if(age >= 19) {
			System.out.println(name + "님은 세금 납부 대상자입니다.");
		}else {
			System.out.println(name + "님은 미성년자라 세금 납부 대상자가 아닙니다.");
		}
	}
}
