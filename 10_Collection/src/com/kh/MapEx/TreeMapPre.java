package com.kh.MapEx;

import java.util.TreeMap;

public class TreeMapPre {
	public static void main(String[] args) {
		
		
		TreeMap<String,String> tm = new TreeMap<>();

		tm.put("apple", "사과");
		tm.put("banana", "바나나");
		tm.put("orage", "오렌지");
		tm.put("grape", "포도");
		tm.put("watermelon", "수박");
		
		String[]keys = {"apple","banana","orage","grape","watermelon"};
		String[] values = {"사과","바나나","오렌지","포도","수박"};
		
		for(int i = 0; i < keys.length; i++) {
			tm.put(keys[i],values[i] );
			System.out.println(tm);
			System.out.println(tm.get("banana"));
			System.out.println(tm.size());
			System.out.println(tm.isEmpty());
			System.out.println(tm.containsKey("사과"));
			System.out.println(tm.containsValue("포도"));
			System.out.println(tm.keySet());
		
	}
	

}
}
