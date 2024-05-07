package com.kh.array.ex;

import java.util.Arrays;

/*
 Arrays
 	배열과 관련된 다양한 작업을 수비게 처리할 수 있도록 도움
 	정렬, 복사, 비교
 	메소드
 	sort(): 배열 정렬
 	copyOf() : 배열을 복사해서 똑같은 배열을 만들어줌
 	equals():두 배열이 똑같은지 비교
 	fill() : 배열을 모두 지정된 값으로 채우기
 	toString() : 배열을 문자열로 변경해서 보여줌
 */
public class ArraysEx {

	public static void main(String[] args) {

		int[] num = { 5, 8, 2, 4, 3 };

		Arrays.sort(num);

		System.out.println(Arrays.toString(num));

		int[] abc = Arrays.copyOf(num, num.length);
		System.out.println("num이 복사된 abc : " + Arrays.toString(abc));

		boolean same = Arrays.equals(num, abc);
		System.out.println("num과 abc는 같나요  " + same);

		int[] 똑같은숫자들 = new int[5];
		Arrays.fill(똑같은숫자들, 3);
	}
}