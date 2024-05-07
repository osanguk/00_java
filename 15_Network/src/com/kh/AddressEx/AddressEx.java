package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressEx {

	public static void main(String[] args) {
		
		
	
		try {
			
			
			
			InetAddress 주소 = InetAddress.getByName("www.naver.com");
			System.out.println("호스트명 : " +주소.getHostName());
			System.out.println("IP주소 : " +주소.getHostAddress());
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
		
		//2.daum에 대해 알아보기
		try {
			InetAddress 다음주소 = InetAddress.getByName("www.daum.com");
			System.out.println("호스트명 : " +다음주소.getHostName());
			System.out.println("IP주소 : " +다음주소.getHostAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//3. IP주소로 daum.net 검색 
		try {
			InetAddress 다음Ip = InetAddress.getByName("211.249.220.24");
			System.out.println("호스트명 : " +다음Ip.getHostName());
			System.out.println("IP주소 : " +다음Ip.getHostAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
