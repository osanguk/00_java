package com.kh.practice.list.library.collectionEx;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionEx {
	public static void main(String[] args) {
		ArrayList<Integer> 숫자들 = new ArrayList<>();
		숫자들.add(3);
		숫자들.add(5);
		숫자들.add(4);
		숫자들.add(1);
		System.out.println(숫자들);
		
		Collections.sort(숫자들);
		System.out.println(숫자들);
		
	}

}
