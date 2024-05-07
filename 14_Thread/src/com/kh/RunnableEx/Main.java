package com.kh.RunnableEx;

public class Main {
	public static void main(String[] args) {
		
		
		RunnableEx 러너블 = new RunnableEx();
		
		Thread 스레드 = new Thread(러너블);
		
		스레드.start();
	}

}
