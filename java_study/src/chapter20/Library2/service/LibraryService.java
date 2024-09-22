package chapter20.Library2.service;

import chapter20.Library2.repository.BookRepository;
import chapter20.Library2.model.Book;
import chapter20.Library2.model.User;
import chapter20.Library2.repository.UserRepository;

public class LibraryService {
	private BookRepository bookRepository = new BookRepository();
	private UserRepository userRepository = new UserRepository();

	public void addBook(Book book) {
		bookRepository.addBook(book);
	}

	public void registerUser(User user) {
		userRepository.addUser(user);
	}

	public void borrowBook(String userId, String title) {
		User user = userRepository.findUserById(userId);
		Book book = bookRepository.findBookByTitle(title);
		
		if (user != null && book != null && !book.getisBorrowed()) {
			book.setisBorrowed(true);
			System.out.println(user.getName() + "님이" + book.getTitle() + "을(를) 대여하였습니다.");
		} else {
			System.out.println("대여불가 : 사용자가 존재하지 않거나 도서가 이미 대여중입니다.");
		}
	}

	public void returnBook(String title) {
		Book book = bookRepository.findBookByTitle(title);
		if (book != null && book.getisBorrowed()) {
			book.setisBorrowed(false);
			System.out.println(book.getTitle() + "이(가) 반납되었습니다.");
		} else {
			System.out.println("반납 불가 : 해당 도서는 대여중이 아닙니다.");
		}
	}

	public void listAllBooks() {
		for (Book book : bookRepository.findAllBooks()) {
			System.out.println(book.getTitle() + " - " + (book.getisBorrowed() ? "대여중" : "대여중 아님"));
		}
	}
	
	public void listAllUsers() {
		for (User user : userRepository.findAllUser()) {
			System.out.println(user.getUserId() + " - " + (user.getName()));
		}
	}

	public void example(String title) {
		// TODO Auto-generated method stub
		//	테스트용
	}

}
