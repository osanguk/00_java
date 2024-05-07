package com.kh.RunnablePre;

public class 러너블연습 implements Runnable {
	int 초;
	
	public 러너블연습(int 초) {
		this.초 = 초;
		
	}
	public void run() {
		System.out.println(this.초+" 스레드 시작");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}

}
