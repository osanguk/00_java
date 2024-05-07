package com.kh.prctice.student.model.vo;

public class Student {
	
	private String name;
	private String subject;
	private int score;
	private boolean passed;
	
	public void setPassed(boolean passed) {
		this.passed = passed;
	}
	public boolean isPassed() {
		return passed;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	public Student() {
		
	}

	public Student(String name,String subject,int score) {
		this.name =name;
		this.subject = subject;
		this.score = score;
	}
	
	//자동 정렬 단축키 : ctrl + shift +f
	public String inform() {
		return "이름: " +name+ ", 과목: " +subject +",점수:" +score;
	}
	
}
