package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressPre {
	
	public static void main(String[] args) {
		try {
			InetAddress 주소 = InetAddress.getByName("www.google.com");
			System.out.println("호스트명 : " +주소.getHostName());
			System.out.println("IP주소 : " +주소.getHostAddress());

		} catch (UnknownHostException e) {


			

			e.printStackTrace();
		}	
	}
}
