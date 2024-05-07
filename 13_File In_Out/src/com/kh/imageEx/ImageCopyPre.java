package com.kh.imageEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageCopyPre {
	public static void main(String[] args) {
		
				String 원본이미지 = "src/com/kh/imageEx/hogam.jpg";
				String 복사이미지 = "src/com/kh/imageEx/hogam_cute.jpg";
				
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


