package chapter04;

//	클래스 생성 (Book, Person, ...)
//	: 속성 2개
//	: 메서드 1개

class Book {
	int bookId;
	String name;
	
	void displayBookList() {
		System.out.println("책 id : " + this.bookId + " , 책 이름 : " + this.name);
	}
	Book (int bookId, String name) {
		this.bookId = bookId;
		this.name = name;
	}
}

class Person {
	int personId;
	String name;
	
	void displayPerson() {
		System.out.println("사람 id : " + this.personId + ", 사람 이름 : " + this.name);
	}
	
	Person (int personId, String name) {
		this.personId = personId;
		this.name = name;
	}
}


public class Object04 {
	
	public static void main(String[] args) {
		Book book = new Book(1, "사막에서 살아남기");
		
		Person person = new Person(1, "더 락");
	
		book.displayBookList();
		person.displayPerson();
	}

}
