package com.kh.FileEx;

import java.io.File;
import java.io.IOException;

public class FilePre {
	
	public void 메서드1() {
		File 텍스트파일 = new File("c:/Users/user1/Desktop/newFFF/파일생성.txt");
		
		if(텍스트파일.exists()) {
			System.out.println("파일이 존재합니다.");
		}else {//존재하지 않는다면
			//만일 파일 만들기 성공!
			try {
				텍스트파일.createNewFile();
				System.out.println(텍스트파일.getName() + "여러분이 그토록 원하시던 파일이 만들어졌습니다. 여러부우운!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("멍멍이 소리 집어쳐! 무슨 파일이 만들어졌다는 거야!");
				e.printStackTrace();
				
			}
		}
	}
	public void 메서드2() {
		String 폴더경로 = "c:/Users/user1/Desktop/뉴폴더";
		
		String 바탕화면경로 = System.getProperty("user.home")+"/Desktop";
		
		System.out.println(바탕화면경로);
		
		
		
	}
	
	
	public void 메서드3() {
		String 바탕화면경로 = System.getProperty("user.home")+"/Desktop";
		
		
		File 폴더들 = new File(바탕화면경로 + "/뉴1/뉴2/뉴3");
		폴더들.mkdirs();
		
		File 파일 = new File(폴더들 + "/새로운파일.txt");
		
		try {
			
			boolean 파일생성확인 = 파일.createNewFile();
			System.out.println("파일 생성 되었나요?" + 파일생성확인);
			
			System.out.println(파일.length());
			
			System.out.println(파일.lastModified());
			
			파일.delete();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	public void 메서드4() {

		
		String 바탕화면경로 = System.getProperty("user.home")+"/Desktop";
		File 텍스트파일 = new File(바탕화면경로 + "/newFFF/파일이 생성되었음");
		
	}
	
	public void 메서드5() {
		String 바탕화면경로 = System.getProperty("user.home")+"/Desktop";
		File 텍스트파일 = new File(바탕화면경로 + "/newFFF/파일생성이름바꾸기");
		File 새로운이름 = new File(바탕화면경로 + "/newFFF/변경된 이름.txt");
		
		if(텍스트파일.exists()) {
			if(텍스트파일.renameTo(새로운이름)) {
				System.out.println("파일 이름이 성공적으로 변경 됨");
				
			}else {
				System.out.println("실패했자나...ㅜㅜ");
				
			}else {
				System.out.println("파일 이름이 존재하지 않으니 새로 만들란 말이야");
			}
		}
	}
	public static void main(String[] args) {
		FilePre 파일 = new FilePre();
		//파일.메서드1();
		//파일.메서드2();
		파일.메서드3();
	}

}
