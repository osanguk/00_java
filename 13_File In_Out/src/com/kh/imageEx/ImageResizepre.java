package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class ImageResizepre {
	public static void main(String[] args) {
		String 원본이미지 = "src/com/kh/imageEx/pig.jpg";
		String 사이즈조정이미지 = "src/com/kh/imageEx/pig_cute.jpg";
		
		int 가로크기 = 200;
		int 세로크기 = 200;
		
		try {
			
			
			
			BufferedImage 원본이미지데이터 = ImageIO.read(new File(원본이미지));
			
			//새 크기의 이미지 생성
			BufferedImage 이미지버퍼 = new BufferedImage(가로크기, 세로크기,BufferedImage.TYPE_INT_RGB);
			
			Image 이미지그리기 = 원본이미지데이터.getScaledInstance(가로크기, 세로크기, Image.SCALE_SMOOTH);
			
			이미지버퍼.createGraphics().drawImage(이미지그리기,0,0, null);
			
			System.out.println("이미지 조정 완료 이제 잘거야");
			
			ImageIO.write(이미지버퍼, "jpg",new File(사이즈조정이미지) );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



