package com.kh.oop.method;

public class Animal {
	
	public String name;
	public int age;

	
	
	//메서드
		//생성자
		//기본
	public Animal( String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	
	
	public String getName() {
		return name;
	}
	
	
	public int getAge() {
		return age;
		
	}
	
	// void 로 프린트 출력
	public void info() {
		System.out.println("동물 이름" + name);
		System.out.println("동물 나이" + age);
	}

	
	public static void main(String[] args) {
	 Animal dog = new Animal("강아지", 1);
	 Animal cat = new Animal("고양이", 1);
	 
	 dog.info();
	 cat.info();
	 
	}

}
