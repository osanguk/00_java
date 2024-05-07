package com.kh.FileEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {

	public static void main(String[] args) {
	try {
		FileWriter 글쓰기 = new FileWriter("예제파일.txt");
		글쓰기.write("안녕하세요. 환영하는 바이바이다.");
		
		글쓰기.close();
		System.out.println("글쓰기 완료");
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
