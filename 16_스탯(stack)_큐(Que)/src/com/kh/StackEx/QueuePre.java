package com.kh.StackEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePre {
	public static void main(String[] args) {
		
		Queue<Integer>offer = new LinkedList<>();
		offer.add(80);
		offer.add(60);
		offer.add(30);
		offer.add(20);
		
		int 앞 = offer.poll();
		System.out.println(앞);
		
		int 데이터확인 = offer.peek();
		System.out.println(데이터확인);
		
		boolean isEmpty = offer.isEmpty();
		
		
	}

}
