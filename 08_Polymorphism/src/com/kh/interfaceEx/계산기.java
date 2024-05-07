package com.kh.interfaceEx;

public interface 계산기 {
	double PI = 3.14;
	int 최소값 = -100_000_000;
	int 최대값 = 100_000_000;
	
	public abstract int 합(int a,int b);
	
	public abstract int 차(int a, int b);
	
	public abstract int 곱(int a, int b);
	
	public abstract int 몫(int a, int b);
	
	public abstract int 나머지(int a, int b);
	
	

}
