package com.kh.PropertiesEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiresEx {
public static void main(String[] args) {
	
	Properties 설정 = new Properties();
	
	try {
		FileInputStream 파일불러오기 = new FileInputStream("설정.Property");
		try {
			설정.load(파일불러오기);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			파일불러오기.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String 관리자이름 = 설정.getProperty("관리자이름");
		String 관리자비번 = 설정.getProperty("관리자비번");
		
		System.out.println("관리자이름 : " + 관리자이름);
		System.out.println("관리자비번 : " + 관리자비번);
		
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
