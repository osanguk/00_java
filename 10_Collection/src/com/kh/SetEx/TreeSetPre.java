package com.kh.SetEx;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPre {
	public static void main(String[] args) {
	
		TreeSet<String> 과일들 = new TreeSet<>(Set.of("사과","복숭아","오렌지","바나나"));
		과일들.add("사과");
		System.out.println(과일들);
		
		과일들.remove("복숭아");
		
		System.out.println(과일들.contains("귤"));
		
		
		
		
		
		
	}

}
