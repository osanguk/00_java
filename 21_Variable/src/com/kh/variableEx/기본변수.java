package com.kh.variableEx;

public class 기본변수 {
		
	int 숫자 = 10;
	byte  b = 2;
	short sh = 3;
	long lng =5;
	
	float ft = 3.14f; //기본 실수 값은 double 이고 double은 float 보다 zms rkqtdlfktj
					 //	뒤에 f 나 F를 붙여서 작성해야함
	double db = 3.14; //실수는 초기값이 double 이므로 뒤에 d를 안붙여줘도 됨
	
	char ch = 'A';
	
	boolean bln = false; 
	//자료형 참조
	String name = "가나다";
	
	final int MAX_NUMBER = 100;
	final double PI = 3.14;
	final String 규칙 = "변경되면 안되는 규칙";
	
	enum Day{
		MINADY,THESUDAY,WENSDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
	}
	
}
