package com.kh.Inheritance.OverLoadingEx;

public class Person {

	//필드
	private String name;
	private int age;
	//메서드 : 특정 행동을 하기 위해 묶는 코드
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public Person() {
		
		
	}
	public Person(String name) {
		this.name =name;
	}
	
	//생성자 : 필수 오버로딩(똑같은 메서드 이름인데 name age가 필술로 들어가길 원하는 메서드)
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("이름 : "+name+ "나이");
	}
}
