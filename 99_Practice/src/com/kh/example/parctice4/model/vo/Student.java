package com.kh.example.parctice4.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;//alt + shift +s
	
	//setter getter
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getClassroom() {
		return classroom;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public char getGender() {
		return gender;
	}

	public Student(String string, String string2, int i) {
		
	}
	
	public void information() {
		System.out.println("학년 : " + grade);
		System.out.println("반 :" + classroom);
		System.out.println("이름 : " + name);
		System.out.println("키 :"+ height);
		System.out.println("성별 : " +gender);
	}
}
