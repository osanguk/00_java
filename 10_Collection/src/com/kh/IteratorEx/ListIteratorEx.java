package com.kh.IteratorEx;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {
	public static void main(String[] args) {
		ArrayList<String> 색상들 = new ArrayList<>();
		색상들.add("빨강");
		색상들.add("화이트");
		색상들.add("블랙");
		색상들.add("골드");
		
		ListIterator<String> 반복하기 = 색상들.listIterator();
		
		while(반복하기.hasNext()) {
			String 색상 = 반복하기.next();
			System.out.println(색상);
			
		}
		

		while(반복하기.hasPrevious()) {
			String 색상 = 반복하기.previous();
			System.out.println(색상);
			
			
			반복하기.previous();
			반복하기.remove();
			
			
		}	
		
		
		
	}

}
