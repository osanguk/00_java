package com.kh.arrayList.pre;

import java.util.Arrays;

import com.kh.arrayList.Book;


public class BookArrays {
	public static void main(String[] args) {
		Book[] 책들 = new Book[3];
		책들[0] = new Book("아몬드","손원평");
		책들[1] = new Book("불변의 법칙","모건 하우첼");
		책들[2] = new Book("나는 읽고 쓰고 버린다","손웅정");
		
		Book[]도서관 = Arrays.copyOf(책들, 책들.length);
		for(Book 책 : 도서관) {
			System.out.println(책.getBookName()+","+책.getAuthor());	
		}
		
	}

}
