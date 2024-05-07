package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	//메소드
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		//비번을 우리가 만족할 때 까지 출력(반복의 의미)
		while(true) {
			// 정수를 이용하여 4자리 비밀번호를 만들려고 한다.
			System.out.println("비밀번호 입력(1000~9999) : ");
			int password = sc.nextInt();
			//4자리 정수를 입력 받아 각 자리 수에 중복되는 값이 없을 경우 성공
			 // 입력된 정수가 4자리 인지 확인
			if(password < 1000 || password >9999) {
				System.out.println("4자리가 아님.");
				System.out.println("자리 수 안 맞음");
				continue;
				
			}
			//자리값
			int[]digits = new int[4];//4자리만 허용 0~3
			digits[0] = password / 1000; //천의 자리
			digits[1] = (password/100)% 10;//백의 자리
			digits[2] = (password/10)% 10;//십의 자리
			digits[1] = password%10;//일의 자리
			
			//중복 여부
			boolean isTrue = true;
			//length : 크기
			for (int i = 0; i < digits.length; i++) {
				for(int j = i+1; j < digits.length; j++) {
					if(digits[i]==digits[j]) {
						isTrue = false;
						break;
					}
				}
				if(!isTrue) {
					System.out.println("중복값 있음");
					
				}else {
					System.out.println("비밀 번호 생성 성공");
					break;
				}
			}
			
			//각자리 수에 중복 되는 값이 없으면 성공
			//중복 값이 있으면 중복 값 있음
			//자리수가 안 맞으면 '자리 수 안 맞음'출력
			//단, 제일 맨 앞자리 수의 값은 1~9 사이의 정수
			
			
			
		}
		
		
	}

}
