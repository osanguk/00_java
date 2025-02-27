package com.kh.FileEx;

import java.io.File;

/*
 * 
 * boolean mkdir() :폴더생성
 * boolean mkdirs() : 경로로 지정한 모든 폴더 생성
 * boolean createNewFile(): 파일 생성
 * String getName():파일이름 가져와서 보여줌
 * String getPath():폴더 경로 전체확인
 * String parent():파일이 저장된 폴더 알려줌
 * boolean isFile():현재 File 객체가 관리하는게 파일이면 true
 * boolean isDirectory():현재 File 객체가 관리하는게 폴더면 true
 * boolean exists():파일 이나 폴더가 존재하면 true, 없으면 false
 * long	length():
 * long lastModified()
 */
public class FIleEx {
	
	public static void main(String[] args) {
		
		File 폴더만들기 = new File("c:/Users/user1/Desktop/newFFF");
		
		
		//바탕화면에 newFFF 라는 폴더가 존재하는지 확인
		System.out.println("존재합니까? : " + 폴더만들기.exists());
		
		
		//만약 폴더가 이미 바탕화면에 존재합니다. 라고 애기하고
		if(폴더만들기.exists()) {
			System.out.println("폴더가 이미 존재합니다.");
		}else {
			폴더만들기.mkdir();
			System.out.println("와이! 폴더 새로 만듬 와-이!");
			System.out.println(폴더만들기.getName());
			System.out.println(폴더만들기.getPath());
		}
		//존재하지 않는다면 폴더가 존재하지 않습니다. 새로 만들기
		
	}

}
