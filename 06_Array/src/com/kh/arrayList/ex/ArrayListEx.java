package com.kh.arrayList.ex;

import java.util.ArrayList;

/*
 ArrayLsit
 리스트는 배열과 비슷하지만 크기가 제한 되어잇지 않기 때문에 다름
 원하는 만큼 담을 수 있름
 
 ArrayListEx로 이름 ArrayList로 사용하지 말 것!
 add 추가
 get 반환
 set 수정
 remove 삭제
 size 개수 확인
 isEmpty 비어있는지 확인
 clear 모두 삭제
 */

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(10);
		System.out.println("추가확인 :" + num.get(0) );
		
		//비어있지 않아서 false 나옴
		System.out.println(num.isEmpty());
		
		//크기 확인 =size length 사용하지 않음
		System.out.println(num.size());
		//set 수정하기
		num.set(0, null);
	}

}
