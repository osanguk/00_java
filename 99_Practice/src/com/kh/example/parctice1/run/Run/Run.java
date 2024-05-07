package com.kh.example.parctice1.run.Run;

import com.kh.example.parctice1.model.vo.Member.Member;

class Run {
	
	public static void main(String[] args) {
		//맴버가 정보를 작성 할수 있는 공간 만들고
		//공간에 맴버에 대한 정보를 작성할수 있는
		//Member 객체 생성
		Member member1 = new Member();
		
		member1.changeName("동그라미");
		
		member1.printName(); 
	}

}
