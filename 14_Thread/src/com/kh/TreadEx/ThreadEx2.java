package com.kh.TreadEx;

public class ThreadEx2 extends Thread {
	
	int 초;
	
	public ThreadEx2(int 초) {
	
		this.초 = 초;
	}

	public void run() {
		System.out.println(this.초 + "스레드 시작하는 바이 bye다.");
		
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(this.초 + "스레드  끝나는 중이고 말고 암! 아아암!");
		
	}
	
	
}
