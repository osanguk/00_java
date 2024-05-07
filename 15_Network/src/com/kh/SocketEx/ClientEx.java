package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx {
	public static void main(String[] args) {
		
		
			try {
			
				
				Socket 참가자 = new Socket("localhost", 12349);
				
				BufferedReader in = new BufferedReader(new InputStreamReader(참가자.getInputStream()));
			
				PrintWriter out = new PrintWriter(참가자.getOutputStream(),true);
				
				out.println("hi server !");
				
				String m = in.readLine();
				
				System.out.println("send sucess : " + m);
				
				for(int i = 0; i< 3; i++) {
					out.print(i);
					String t
				}
				
				in.close();
				out.close();
				참가자.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				

		}
	}
	
