package com.kh.test.main;

public class Test8 {
	public static void main(String[] args) {
		
		
		int 숫자1 = 10;
		int 숫자2 = 20;
		String 더큰수 = (숫자1 > 숫자2) ? "숫자1이 더 큼" : "숫자2가 더 큼";
		System.out.println(더큰수);
		
		int 숫자3=15;
		String 홀짝 = (숫자3% 2==0)? "짝수" : "홀수";
		System.out.println(홀짝);
		
		int 나이1= 18;
		String 결과 = (나이1 >=20) ? "성인":"미성년자";
		System.out.println(결과);
		
		int 국어 = 80;
		int 영어 = 77;
		int 수학 = 90;
		String 결과2 =(국어>= 60 && 영어 >=60 &&수학>=60)? "합격의 목걸이":"불합격";
		System.out.println(결과2);
		
		int 숫자4 = 10;
		int 숫자5 = 20;
		String 결과3 = (숫자4==숫자5)? "같은수":"다름";
		System.out.println(결과3);
		
	}

}
