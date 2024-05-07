package com.kh.oop.basic;

public class Animal {// 동물
	
	//1.필드 이름 String name 나이 int age
	public String name;
	public int age;
	//2.초기 생성자
	public Animal() {
		
	}
	
	//3.필수 생성자 String name,int age
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//4.출력 메서드 public void info(){Syrm.out.println 이름과 나이 출력
	public void info(){System.out.println("이름 : " + name +"\n 나이 : " + age);
		 
		
	}
	//5.메인 메서드 public static void main(String[] args){
	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.name="호두";
		dog.age=3;
		dog.info();
		
		
		
		
	}

	
}
