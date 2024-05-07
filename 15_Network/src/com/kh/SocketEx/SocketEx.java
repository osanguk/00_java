package com.kh.SocketEx;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketEx {
	public static void main(String[] args) {
		
		try {
			ServerSocket 주최자 = new ServerSocket(12349);
			
			System.out.println("주최자 측 번호가 열렸습니다.");
			System.out.println("party chat open");
			
			
			Socket 방문자 = 주최자.accept();
			System.out.println("client success");
			
			방문자.close();
			주최자.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
