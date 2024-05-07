package com.kh.DeQueEx;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueEx {
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		
		deque.addFirst(1);
		deque.addFirst(2);
		deque.addFirst(3);
		System.out.println("add First 활용해서 값 추가 : " + deque);
		
		// 맨 뒤에 값 추가 add = addLast
		deque.addLast(4);
		deque.addLast(5);
		deque.addLast(6);
		
		System.out.println("add Last 활용해서 값 추가 : " + deque);
		
		// 맨 앞의 값 제거
		deque.removeFirst();
		System.out.println("remove First 활용해서 값 제거확인 : " + deque);
		
		// 맨 뒤의 값 제거
		deque.removeLast();
		System.out.println("remove  Last 활용해서 값 제거확인 : " + deque);
		
		// 맨 앞의 값 확인
		int 맨앞값 = deque.getFirst();
		System.out.println("맨 앞에 위치한 값은 : " + 맨앞값);
		
		// 맨 뒤의 값 확인
		int 맨뒤값 = deque.getLast();
		System.out.println("맨 뒤에 위치한 값은 : " + 맨뒤값);
	}
	}


