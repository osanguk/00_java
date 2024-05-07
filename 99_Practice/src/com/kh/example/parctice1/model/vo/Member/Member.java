package com.kh.example.parctice1.model.vo.Member;

public class Member {
	public String memberId;
	public String memberPwd;
	public String memberName;
	public		int age;
	public char gender;
	public String phone;
	public String email;
	
	//생성자 메서드
	public Member() {
		
	}
// 출력 메서드
	public void changeName(String name) {
		this.memberName = name;
	}
	
	public String changeEmail(String 수정이메일) {
			this.email=수정이메일;
		
		
		return email;
	}
	
	public void printName() {
		System.out.println("이름 : " + memberName);
	}
	
}
