package com.kh.FileEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPre {
	public static void main(String[] args) {
		String 헬로우월드 = "Hello World.txt.";
		
		try {
			FileWriter 글쓰기 = new FileWriter(헬로우월드);
			
			String 내용 ="난 자바가 너무 재밋다";
			
			글쓰기.write(내용);
			
			글쓰기.close();
			
			System.out.println("글쓰기 완료");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
