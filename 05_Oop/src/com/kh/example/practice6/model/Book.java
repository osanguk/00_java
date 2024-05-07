package com.kh.example.practice6.model;

public class Book {
	//
	public String title;
	public String publisher;
	public String author;
	public 	int price;
	public double discountRate;
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		
	}
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
		
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public void inform() {
		System.out.println("책이름 : " + title);
		System.out.println("출판사 : " + publisher);
		System.out.println("지은이 : " + author);
		System.out.println("책가격 : " + price);
		System.out.println("할인율 : " + discountRate);
		System.out.println("-----------------------");
		
	}
	
	public static void main(String[] args) {
		System.out.println("서점에 온 것을 환영");
		
		Book book1 = new Book();
		book1.title = "그것이 알고싶다.";
		book1.author = "박진아";
		book1.publisher = "SBS";
		book1.inform();
		
		Book book2 = new Book("5월 32일", "kh T반","t반 일동" );
		book2.inform();
		
		Book book3 = new Book("Do it! 자바 프로그래밍 입문","이지스퍼블리싱");
		
		

	}

}
