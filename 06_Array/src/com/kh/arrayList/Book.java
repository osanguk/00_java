package com.kh.arrayList;

public class Book {
	
	private String bookName;
	
	private String author;
	
	

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}
	
	public Book() {
		
	}
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	public void showBook() {
		System.out.println(bookName + ", "+author);
	}

}
