package com.kh.javaAPIEx;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		
		StringTokenizer 토큰 = new StringTokenizer("자바는 즐거워");
		
		while(토큰.hasMoreTokens()) {
			System.out.println(토큰.nextToken());
		}
		
		
		StringTokenizer 토큰2번 = new StringTokenizer("오랜지,사과 포도" ," ," );
		while(토큰2번.hasMoreTokens()) {
			System.out.println(토큰2번.nextToken());
		}
	}

}
