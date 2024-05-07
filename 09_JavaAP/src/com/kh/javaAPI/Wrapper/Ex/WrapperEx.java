package com.kh.javaAPI.Wrapper.Ex;

public class WrapperEx {
	public static void main(String[] args) {
		Byte 바이트값 = 10;
		byte 기본바이트값 = 바이트값.byteValue();
		System.out.println("바이트 값 : " + 바이트값);
		System.out.println("기본바이트 값 : " + 기본바이트값);
		
		Short 쇼트값 = 20;
		short 기본쇼트값 =쇼트값.shortValue();
		System.out.println(" 쇼트값 : " + 쇼트값);
		System.out.println("기본쇼특값 : " + 기본쇼트값);
		
		Integer 인테저값 = 30;
		int 기본인테저값=인테저값.intValue();
		System.out.println(" 인테저값 : " + 인테저값);
		System.out.println("기본인테저값 : " + 기본인테저값);
		
		Long 롱값 = 40L;
		long 기본롱값=롱값.intValue();
		System.out.println(" 롱값 : " + 롱값);
		System.out.println("기본롱값 : " + 기본롱값);
		
		Float 플룻값 = 50.5f;
		float 기본플룻값=플룻값.floatValue();
		System.out.println(" 플룻값 : " + 플룻값);
		System.out.println("기본플룻값 : " + 기본플룻값);
		
		Double 더블값 = 60.6;
		double 기본더블값=더블값.doubleValue();
		System.out.println(" 더블값 : " + 인테저값);
		System.out.println("기본더블값 : " + 기본더블값);
		
		Character 캐릭터값 = 'A';
		char 기본캐릭터값= 캐릭터값.charValue();
		System.out.println(" 캐릭터값 : " + 캐릭터값);
		System.out.println("기본캐릭터값 : " + 기본캐릭터값);
		
		Boolean 불리언값 = true;
		boolean 기본불리언값=불리언값.booleanValue();
		System.out.println(" 불리언값 : " + 불리언값);
		System.out.println("기본불리언값 : " + 기본불리언값);
		
		
	}

}
