package com.kh.imageEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * 이미지를 복서하기 위해선 원본 이미지 파일 경로와 옯기고 싶은 이미지 파일 경로 설정
 * File InPutStream:파일 데이터 읽는데 사용
 * File OutputStream:파일 데이터를 내보내는데 사용
 * 
 */
public class ImageCopy {
	public static void main(String[] args) {
		//자바코드에서 폴더 구분을 작성할때 /로 작성
		//모든 파일 실행은 src로 부터 시작
		String 원본이미지 = "src/com/kh/imageEx/healing.jpg";
		String 복사이미지 = "src/com/kh/imageEx/healing_cute.jpg";
		
		try {
			FileInputStream 파일읽기 = new FileInputStream(원본이미지);
			FileOutputStream 파일쓰기 = new FileOutputStream(원본이미지);
			byte[] buffer = new byte[1024];
			
			int 길이;
			
			while((길이 = 파일읽기.read(buffer))> 0 ) {
				파일쓰기.write(buffer,0,길이);
			}
			파일읽기.close();
			파일쓰기.close();
			
			System.out.println("이미지 복사 완료료료");
		 
		}catch (Exception e) {
			System.out.println("이미지 복사 중 오류 발생 끄어억");
			e.printStackTrace();
		}
	
		
	}
	

}
