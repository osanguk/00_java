package com.kh.test.main;

public class Test7 {
	public static void main(String[] args) {
		
		
		int[] 배열 = {1,2,3,4,5,6,7,8,9,10};
		double 합 = 0;
		
		for(int 숫자 : 배열) {
			if(숫자% 2 !=0){
				System.out.println(숫자);
				합 += 숫자;
			}
		}
	
	
	
	}
	

}
