package com.kh.RunnableEx;

public class RunnableEx implements Runnable {
	
	public void run() {
		System.out.println("스레드 실행 시작하세욧!");
		
		try {
			Thread.sleep(3000);
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("스레드 종료");
		
	}
}
