package com.kh.TreadEx;

public class Main {
	public static void main(String[] args) {
		Thread 스레드 = new ThreadEx();
		스레드.start();
		
		System.out.println("1초 스레드 끝 Ex2 스레드 시이이이이 작!");
		
		for(int i =0; i <3; i++ ) {
			Thread t = new ThreadEx2(i);
			t.start();
		}
		System.out.println("메인 끝났단 이 말이에요!");
		
		
	}

}
