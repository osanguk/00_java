package com.kh.array;

public class ArrayEx2 {
	public static void main(String[] args) {
		
		int numbers[] = new int[5];
		
		for(int i =0; i <numbers.length; i++) {
			numbers[i] = i;
			System.out.println("최대길이 : " + numbers.length);
			
		}
		int num[]=new int [11];
		System.out.println("최대길이: " +num.length);
		
		for(int a = 0; a <num.length; a++ ) {
			System.out.println("num["+a+"] = " + a);
		}
		for(int a = 0; a >num.length; a++ ) {
			System.out.println("num["+a+"] = " + a);
		}
		
		
	}

}
