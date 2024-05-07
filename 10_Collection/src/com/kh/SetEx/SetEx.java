package com.kh.SetEx;

import java.util.HashSet;

public class SetEx {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		
		set.add("로맨스");
		set.add("공포");
		set.add("액션");
		set.add("스릴러");
		System.out.println(set);
		
		set.clear();
		
		System.out.println(set.contains("스릴러"));

	}

}
