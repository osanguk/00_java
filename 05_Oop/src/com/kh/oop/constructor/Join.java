package com.kh.oop.constructor;

public class Join {
	public int memberNo;// 회원가입 순서
	public String memberId;// 회원 아이디
	public String memberName;
	public String phonNumber;

	// 생성자 기본 필수
	public Join() {// 필수 x

	}

	public Join(int inputidNO,String inputname, String inputphone) {// 필수 o 우리 회사에 필요한 내용을 모두 담기
		this.memberName = inputname;
		this.phonNumber = inputphone;
		this.memberNo = inputidNO;
	}

	// 메서드 = 클래스 안에 존재하고 특정 기능을 할 수 있도록 묶은 코드 모음
	// void 메서드 : 결과를 전달하지 않음
	public void memberInfo() {

	}

	public static void main(String[] args) {
		System.out.println("=== kh 쇼핑 회원 정보 확인===");

		Join member1 = new Join();

		member1.memberId = "직장인";
		member1.memberName = "동그라미";
		member1.phonNumber = "010-1111-2222";
		member1.memberInfo();

		Join member2 = new Join();
		member1.memberId = "학생";
		member1.memberName = "홍길동";
		member1.memberInfo();

		Join member3 = new Join(3, "파워보이", "박영희");
		member3.memberInfo();

		Join member4 = new Join();
		member4.memberId = "블랙아담";
		member4.memberName = "김촐수";
		member4.memberInfo();

		Join member5 = new Join(5, "슈퍼맨", "딘 케인");
		member5.memberInfo();

	}

}
