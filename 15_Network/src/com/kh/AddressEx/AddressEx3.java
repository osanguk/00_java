package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressEx3 {
	public static void main(String[] args) {
		try {
			InetAddress 주소이름 = InetAddress.getByName("www.google.com");
			
			System.out.println("getByName으로 구글을 가져온 이름 : " +주소이름 );
			
			InetAddress 내집주소 = InetAddress.getLocalHost();
			System.out.println("내집 주소: " +내집주소 );
			
			
			//멀티캐스트 주소 여부 확인
			//byte[] 주소를 활용한 객체 가져오기
			byte[] ipAddress = {127,0,0,1};
			InetAddress byAddress = InetAddress.getByAddress(ipAddress);
			System.out.println();
			System.out.println(내집주소);
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//나의 컴퓨터 이름과 자리번호 확인
		//get localhost
		byte[] ipAddress = {(byte) 192,(byte) 168,0,30};
		
		
		
		
		
	}

}
