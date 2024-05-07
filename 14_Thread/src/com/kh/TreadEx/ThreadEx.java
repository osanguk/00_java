package com.kh.TreadEx;

public class ThreadEx extends Thread {

	public void run() {
			System.out.println("스레드 실행중");	
			
			try {
				Thread.sleep(1000);
				
				System.out.println("1초 끝!");
				
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
	

}
