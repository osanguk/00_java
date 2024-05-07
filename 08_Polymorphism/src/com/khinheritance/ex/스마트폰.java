package com.khinheritance.ex;


//부모 클래스
public class 스마트폰 {
	private String 화면;
	private String 통신사;
	private String 성능;
	
	//setter
	public void set화면(String 화면) {
		this.화면 = 화면;
	}
	public void set통신사(String 통신사) {
		this.통신사 = 통신사;
	}
	public void set성능(String 성능) {
		this.성능 = 성능;
	}
	
	//getter
	public String get화면() {
		return 화면;
	}
	public String get통신사() {
		return 통신사;
	}
	public String get성능() {
		return 성능;
	}

	//생성자 :  필수 alt + shift + s->o
	public 스마트폰(String 화면,String 통신사 ,String 성능) {
		super();
		this.화면 = 화면;
		this.통신사 = 통신사;
		this.성능 = 성능;
	}
}
	
