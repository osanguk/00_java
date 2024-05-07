package com.kh.arrayList;



public class BookArray {
	public static void main(String[] args) {
		
		Book[] 책들 = new Book[3];
		책들[0] = new Book("아몬드","손원평");
		책들[1] = new Book("불변의 법칙","모건 하우첼");
		책들[2] = new Book("나는 읽고 쓰고 버린다","손웅정");
		
		System.out.println(책들);
		for(Book 책      :책들) {
			System.out.println(책);
			System.out.println(책.getBookName());
			System.out.println(책.getAuthor());
		}
		System.out.println("===================");
		
		for(int i =0; i <책들.length; i++) {
			책들[i].showBook();
		}
	}

}
