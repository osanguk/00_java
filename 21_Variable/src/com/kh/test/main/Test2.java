package com.kh.test.main;

public class Test2 {
	public static void main(String[] args) {
		
		for(int 단 =2; 단 <=5; 단++) {
			
			for(int 곱 = 1; 곱<9; 곱++) {
				if(단%2==1) {
					int sum =단*곱;
					System.out.println(단 +"X"+ 곱+"="+sum);
					
				}
				
			}
			
		}
	}

}
