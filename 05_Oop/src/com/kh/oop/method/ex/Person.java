package com.kh.oop.method.ex;

public class Person {
	
	//필드 이름 나이
	private String name;
	private		int age;
	
	public Person() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//메인 메서드
	//단축키 main ctrl + space
	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.setName("김두한");
		person1.setAge(20);
		//Setter를 활용해서 속성 값 설정
		
		
		System.out.println("이름 : "+ person1.getName());
		System.out.println("나이 : "+ person1.getAge());
	}
}
