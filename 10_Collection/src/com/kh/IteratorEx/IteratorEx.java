package com.kh.IteratorEx;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
	
	public static void main(String[] args) {
	ArrayList<String> 과일들 = new ArrayList<>();
	과일들.add("사과");
	과일들.add("두리안");
	과일들.add("오랜지");
	과일들.add("바나나");
	
	
	Iterator<String> 반복 = 과일들.iterator();
	
	while(반복.hasNext()) {
		String 과일 = 반복.next();
		System.out.println(과일);
	}
	
	
	
	}

}
