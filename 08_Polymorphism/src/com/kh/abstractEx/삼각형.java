package com.kh.abstractEx;

public class 삼각형 extends 도형 {
	
	private double 밑변;
	private double 높이;
	
	
	public void set밑변(double 밑변) {
		this.밑변 = 밑변;
	}
	public void set높이(double 높이) {
		this.높이 = 높이;
	}

	public double 도형넓이() {
		return 0.5*밑변*높이;
	}
	/*
	 math = 수학
	 	sqrt= 제곱근 계산 메서드
	 	pow=주어진 값을 거듭 젝보하는 메서드
	 	
	 */
	public double 도형둘레() {
		double 빗변 = Math.sqrt(Math.pow(밑변, 2)+Math.pow(높이, 2));

		return 밑변 + 높이 + 빗변;
	}
	
	
}
