package com.kh.abstractEx;

public class 사각형 extends 도형 {
	
	
	private double 밑변;
	private double 높이;
	

	
	public double get밑변() {
		return 밑변;
	}

	public double get높이() {
		return 높이;
	}

	public void set밑변(double 밑변) {
		this.밑변 = 밑변;
	}

	public void set높이(double 높이) {
		this.높이 = 높이;
	}

	@Override
	public double 도형넓이() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double 도형둘레() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
