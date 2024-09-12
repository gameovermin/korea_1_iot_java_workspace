package chapter15;

public class Main {
	// main 메서드
	// : 해당 메서드가 존재해야 만 자바 프로그램 실행이 가능 (콘솔)
	public static void main(String[] args) {
		// === 프로젝트 개요 ===
		// < 도서 관리 시스템 >
		
		// 1. 클래스 & 객체를 사용한 프로젝트 데이터 설정
		// 1) 클래스: 도서(Book), 회원(Member), 대여(Loan)
		
		// == Book 클래스 ==
		// 책 제목(title), 저자(author), 책고유번호(isbn), 대여가능여부(isAvailable)
		// 책 대여 호출(borrowBook), 책 반납 호출(returnBook)
		// >> void 반환 타입
		
		// == Member 클래스 ==
		// 회원아이디(memberId), 회원이름(name), 책대여목록(List<Loan> loans)
		// borrowBook(Book book), returnBook(Book book)
		// >> void 반환 타입
		
		// == Loan 클래스 ==
		// Member 클래스의 인스턴스
		// Book 클래스의 인스턴스
		
		//	================================	//	
		//	책 추가
		Book book1 = new PaperBook("자바", "킄", "1234", 150);
		Book book2 = new PaperBook("JS", "누구게", "1424", 270);
		Book book3 = new PaperBook("TS", "난데", "5353", 320);
		
		Book book4 = new EBook("헬로", "다얼유", "1234", "www.example.com");
		Book book5 = new EBook("봉주르", "로지텍", "1234", "www.example.com");
		Book book6 = new EBook("스바시바", "키크론", "1234", "www.example.com");
		Book book7 = new EBook("안녕", "레오폴드", "1234", "www.example.com");
		
		//	회원 생성
		Member member1 = new Member("001", "조지베스트");
		Member member2 = new Member("002", "요한 크루이프");
		Member member3 = new Member("003", "로타어 마테우스");
		Member member4 = new Member("004", "미쉘 플라티니");
		
		try {
			member1.borrowBook(book1);
			member1.borrowBook(book2);
			member1.borrowBook(book6);

			member2.borrowBook(book7);
			
			member3.borrowBook(book7);
		} catch (BookAlreadyBorrowedException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
