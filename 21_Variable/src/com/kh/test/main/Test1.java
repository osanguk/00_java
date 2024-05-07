package com.kh.test.main;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		Scanner 스캐너 = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		
		int 숫자 = 스캐너.nextInt();
		
		if(숫자 >=1 && 숫자 <=100) {
			if((숫자 % 2)==0) {
				System.out.println("2의 배수 다. 암! 아아암!");
			}else {
				System.out.println("어림도 없다! 암! 아아암!");
			}
			
		}else {
			System.out.println("1부터 1사이 값만 입력");
			
			
			
			
			
			
		}
		System.out.println("===if  else if else");
		
		int 숫자1 =5;
		
		if(숫자1> 0) {
			System.out.println("양수");
		}else if(숫자1 <0) {
			System.out.println("음수");
		}else {
			System.out.println("0이다.");
		}
			
		
		
		
		
		
	}

}
