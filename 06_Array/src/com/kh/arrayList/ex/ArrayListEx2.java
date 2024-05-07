package com.kh.arrayList.ex;

import java.security.DomainCombiner;
import java.util.ArrayList;

public class ArrayListEx2 {
	public ArrayListEx2(){
		
	}
	
	public void method1() {

		ArrayList<String>list = new ArrayList<>();
		
		// add를 사용해서 딸기 바나나 사과 추가
		list.add("딸기");
		
		//바나나 추가하기
		list.add("사과");
		
		list.add("키위");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		list.set(1, "키위");
		
		System.out.println("바구니 크기 : "+list.size());
		list.remove(1);
		System.out.println("장바구니 비었나요?"+list.isEmpty());
		for(String 과일 : list) {
			System.out.println(과일);
		
		
	}

}

	public void method2() {
		ArrayList<String> animal = new ArrayList<>();
		
		animal.add("사자");
		animal.add("호랑이");
		animal.add("고양이");
		animal.add("강아지");
		
		System.out.println(animal.get(0));
		System.out.println(animal.get(1));
		System.out.println(animal.get(2));
		System.out.println(animal.get(3));
		
		System.out.println(animal.size());
		
		System.out.println("동물 0 : " + animal.get(0));
		System.out.println("동물 0 : " + animal.get(1));
		System.out.println("동물 0 : " + animal.get(2));
		System.out.println("동물 0 : " + animal.get(3));
		
		animal.set(2, "토끼");
		animal.remove("강아지");
		
		for(String name : animal) {
			System.out.println("동물! : " + name);
		}
		
		animal.clear();
		
		System.out.println("모두 이사합니다.");
		System.out.println("동물들이 모두 비어있나요? " + animal.isEmpty());
	}

	public void method3() {
		ArrayList<String> pizza = new ArrayList<>();
		
		System.out.println("===피자 메뉴===");
		pizza.add("고구마 피자");
		pizza.add("치킨피자");
		pizza.add("삼겹피자");
		
		System.out.println("고구마 피자 0 : " + pizza.get(0));
		System.out.println("치킨 피자: " + pizza.get(1));
		System.out.println("삼겹 피자: " + pizza.get(2));
		
		pizza.set(3, "스테이크");
		
		pizza.remove("스테이크");
		
		for(String p : pizza) {
			System.out.println("피자 : " + p);
		}
		
		System.out.println("피자가게가 사라집니다.");
		pizza.clear();
	
		
	}
	public static void main(String[] args) {
		ArrayListEx2 al = new ArrayListEx2();
	}

}


