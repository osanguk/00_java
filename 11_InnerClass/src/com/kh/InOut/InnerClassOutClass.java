package com.kh.InOut;

public class InnerClassOutClass {
	private int 숫자 = 10;
	
	class InnerClass{
		void 밖에서보여주기() {
			System.out.println("숫자보기 : " + 숫자);
		}
	}

	public static void main(String[] args) {
		InnerClassOutClass 인아웃 = new InnerClassOutClass();
		InnerClassOutClass.InnerClass 인 = 인아웃.new InnerClass();

	}

}
