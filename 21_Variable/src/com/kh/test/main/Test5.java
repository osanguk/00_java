package com.kh.test.main;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		
		Scanner 스캐너 =new Scanner(System.in);
		System.out.println("두 점수 입력");
		int 숫자1 = 스캐너.nextInt();
		int 숫자2 = 스캐너.nextInt();
		
		if(숫자1 >=1 && 숫자1 <= 9 && 숫자2>=1 && 숫자2<=9){
			int 곱 = 숫자1*숫자2;
			
			if(곱 >= 1 && 곱 <=9) {
				System.out.println("한 자리 수입니다.");
				
			}else {
				System.out.println("두자리 수 입니다.");
				
			}
			
		} else {
			System.out.println("입력한 수 중 1~9가 이닌 수가 있음");
		}
	}

}
