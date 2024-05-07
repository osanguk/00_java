package com.kh.practice.list.library.view.BookMenu;


import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	//키보드 값 입력받을 scanner
		Scanner sc = new Scanner(System.in);
		BookController bc = new BookController();
		
		// Book을 실행하자마자 보이는 메인메뉴만들기
		public void mainMenu() {
			//만약에 true 라면 계속 실행
			while(true) {
				System.out.println(" === 도서관리 프로그램 === ");
				System.out.println("1. 도서추가");
				System.out.println("2. 도서 전체 목록 조회");
				System.out.println("6. 종료");
				System.out.print("메뉴선택: ");
				int menu = sc.nextInt();
				sc.nextLine();
				
				switch(menu) {
				case 1 :
					insertBook();
					break;

				 case 2 :
					 selectList();
					 break;
					 
					 
				case 6:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
				}
				
			}
		}
		public void selectList() {
			bc.selectList();
		}
		
		
		//책 추가하기 위해 키보드로 작성하는 insertBook void 만들기
		public void insertBook() {
			System.out.print("제목 : " );
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("카테고리 : ");
			String category = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			//책 정보 저장하는 Book 객체 소환
			//import com.kh.practice.list.library.model.vo.Book;
			//					   제목,    저자,   카테고리,  가격) 
			Book book = new Book(title, author, category, price);
			bc.insertBook(book);
			System.out.println("도서 추가가 완료 되었습니다.");
		}
}
