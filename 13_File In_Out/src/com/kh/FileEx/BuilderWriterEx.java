package com.kh.FileEx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuilderWriterEx {
	public static void main(String[] args) {
		String 파일이름 = "줄.txt";
		
		StringBuilder 빌더 = new StringBuilder();
		빌더.append("첫 번째 줄\n");
		빌더.append("두 번째 줄\n");
		빌더.append("세 번째 줄\n");
		
		
		try {
			BufferedWriter 버퍼글쓰기 = new BufferedWriter(new FileWriter(파일이름));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
