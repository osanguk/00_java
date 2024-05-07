package com.kh.abstractEx;

public abstract class 도형 {//추상 클래스
	public abstract double 도형넓이();
	public abstract double 도형둘레();
	
	public void 출력정보() {
		System.out.println("이 도형은 넓이가"+도형넓이()+"이코 둘레가" + 도형둘레()+"입니다.");
		
		
	}

}
