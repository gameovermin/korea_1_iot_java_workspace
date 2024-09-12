package chapter15;
//	== 상속 & 다형성 == 
//	도서(Book) 클래스를 상속받는 전자책(EBook), 종이책(PaperBook) 클래스 정의
public class EBook extends Book{
	private String downloadLink;	//	전자책 다운로드 링크
	
	//	생성자
	public EBook(String title, String author, String isbn, String downloadLink) {
		super(title, author, isbn);
		this.downloadLink = downloadLink;
	}
	
	//	전자책 대여시 다운로드 링크를 출력
	@Override
	public void borrowBook() throws BookAlreadyBorrowedException {
		super.borrowBook();
		System.out.println("다운로드 링크 : " + downloadLink);
	}
}
