package com.kh.array.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPre {
	
	public ArrayPre() {
		
	}
	
	public void practice1() {
		
		int[] num = {1, 2, 3, 4, 5};
		int result = 0;

		//foe-each 문 첨부터 끝까지 반복해서 무언가를 진행 할때 사용
		for(int 숫자  : num     ) {
			
			result +=숫자;
		}
		System.out.println("숫자 들의 합 : "+ result);
	}

	public void practice2(){
		
		ArrayList<String> goods = new ArrayList<>();
		
				goods.add("컴퓨터");
				goods.add("냉장고");
				goods.add("TV");
				goods.add("에어컨");
				
			
				System.out.println(goods);
				
				for(String a :goods) {
					System.out.println(a);
				}
	}

	public void practice3(){
		int[] numbers = {3,7,2,9,1};
		
		int max = numbers[0];
		
		for(int num    :   numbers ) {
			if(num > max) {
				max = num;
			}
		}
		System.out.println("최대값: " + max);
	}

	public void practice4() {
		//찾음 못찾음~
		//과일 가게 사과 바나나 딸기 오렌지
		String[] fruits = {"사과","바나나","딸기","오렌지"};
		
		String search = "바나나";
		boolean found = false;
		
		//for - each 문 활용해서 바나나 찾기
		for(String   f		:  fruits	) {
			if(f.equals(search)) {
				found = true;
				break;
			}
		}
		System.out.println(search + "찾음?" + (found ?  "찾음" : "못찾음"));
		//만일 내가 찾는 과일과 이름이 똑같으면 찾았다~! 하기
		
}

	public void practice5() {
		// 스캐너로 동물을 입력 후 배열에 동물이 있는지 확인
		//4 search 스캐너로 변경
		String[] zoo = {"코끼리","사자","악어","하마"};
		Scanner sc = new Scanner(System.in);
				String search = sc.next("보고픈 동물을 입력 "); 
		String 동물 = sc.next();
		boolean found = false;
		
		for(String   z		:  zoo	) {
			if(z.equals(동물)) {
				found = true;
				break;
			}
		}
		System.out.print(동물 + "찾음?" + (found ?  "찾음" : "못찾음"));
		
		
	}
	
	
	
}	