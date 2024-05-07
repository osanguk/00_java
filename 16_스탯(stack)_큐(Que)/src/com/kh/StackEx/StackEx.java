package com.kh.StackEx;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<Integer> 스택 = new Stack<>();
		
		스택.add(1);
		스택.add(2);
		스택.add(3);
		
		
		int 맨위 = 스택.pop();
		System.out.println(맨위);
		
		int 숫자확인 = 스택.peek();
		System.out.println(숫자확인);
		
		boolean isEmpty = 스택.isEmpty();
		System.out.println(isEmpty);
		
		System.out.println("=====스택 2=====");
		
		Stack<Integer> 스택2 = new Stack<>();
		스택2.push(1);
		스택2.push(2);
		스택2.push(3);
		스택2.push(4);
		스택2.pop();
		System.out.println("가장 마지막에 보여주고 사라진 스택2의 값 : " + 스택);
		
		
	int 맨윗값 =스택2.peek();
	System.out.println("스택 2의 맨 윗 값은 : " + 맨윗값);
	
	boolean 값존재유무 = 스택2.isEmpty();
	System.out.println("스택 2 가 비어있나? " + 값존재유무);
	
	int 사이즈 = 스택2.size();
	System.out.println("스택 2의 사이즈는 ?" + 사이즈);
	
	
	}

}
