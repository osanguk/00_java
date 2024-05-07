package com.kh.RunnablePre;

import com.kh.RunnableEx.RunnableEx;

public class 러너블실행 {
	//main 메서드 생성
	public static void main(String[] args) {

	
	//for문으로 스레드 5개 만든 후
		for(int i = 0; i <5; i++) {
			러너블연습 r = new 러너블연습();
			Thread.스레드 = new Thread(러너블연습);
			스레드.start();
		}
	//for문을 탈출하면 메인메서드 종료? 라고 출력하기
		System.out.println("메인 메서드 종료");
	}
}
