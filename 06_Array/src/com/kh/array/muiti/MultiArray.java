package com.kh.array.muiti;

public class MultiArray {

	public static void main(String[] args) {
		
	
		//2차원 배열 만들기
		int[][] numbers = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		
		
		};
		
		System.out.println("2차원 배열 출력");
		numbers[0][0] = 1;
		
		System.out.println(numbers[0][0]);
		System.out.println(numbers[0][1]);
		System.out.println(numbers[0][2]);
		System.out.println(numbers[1][0]);
		System.out.println(numbers[1][1]);
		
		for(int i =0; i < numbers.length; i++) {
			for(int j =0; j < numbers.length; j++) {
				System.out.println(numbers[i][j]);
			}
			System.out.println();
		}
	}
}