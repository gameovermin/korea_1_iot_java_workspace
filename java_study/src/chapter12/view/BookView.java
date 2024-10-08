package chapter12.view;

import java.util.List;
import java.util.Scanner;

import chapter12.controller.BookController;
import chapter12.model.Book;

public class BookView {
	//	인스턴스 변수
	private Scanner sc;
	//	BookController 객체를 저장하기 위한 변수
	private BookController bookController;
	
	//	생성자
	public BookView() {
		this.sc = new Scanner(System.in);
		bookController = new BookController();
	}
	
	//	사용자에게 메뉴를 표시하고 입력을 처리하는 메서드
	public void showMenu() {
		int choice = 0;
		while (choice != 4) {
			//	책 추가, 모든 책 조회, 책 검색, 서비스 중단
			System.out.println("1. Add a Book");
			System.out.println("2. Show all Books");
			System.out.println("3. Search for a book");
			System.out.println("4. Quit");
			System.out.println("메뉴를 선택해주세요 : ");
			
			//	사용자로부터 선택을 입력받기
			choice = sc.nextInt();
			sc.nextLine();	//	숫자 입력 후 엔터 키(개행문자) 처리
			
			//	사용자의 선택에 따라 적절한 메서드 호출
			switch(choice) {
				case 1: 
					addBookView();
					break;
				case 2: 
					showAllView();
					break;
				case 3: 
					searchBookdView();
					break;
				default : 
					System.out.println("종료");
					break;
			}
		}
	}
	private void addBookView() {
		System.out.println("책의 제목 입력");
		String title = sc.nextLine();
		
		System.out.println("책의 저자 입력");
		String author = sc.nextLine();
		
		System.out.println("책의 출판사 입력");
		String publisher = sc.nextLine();
		
		bookController.addBook(title, author, publisher);
	}
	
	private void showAllView() {
		List<Book> allBooks = bookController.getAllBooks();
		for (Book book: allBooks) {
			System.out.println(book.toString());
		}
	}
	
	private void searchBookdView() {
		System.out.println("책 검색");
		String title = sc.nextLine();
		List<Book> foundBooks = bookController.searchBook(title);
		
		for (Book book: foundBooks) {
			System.out.println(book.toString());
		}
	}
	
}
