package com.kh.StackEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<Integer>큐 = new LinkedList<>();
		
		큐.offer(1);
		큐.offer(2);
		큐.offer(3);
		
		int 맨앞 = 큐.poll();
		System.out.println(맨앞);
		
		int 데이터확인 = 큐.peek();
		System.out.println(데이터확인);
		
		boolean isEmpty = 큐.isEmpty();
		System.out.println("비어있음?" + isEmpty);
		System.out.println(isEmpty);
		
	}

}
