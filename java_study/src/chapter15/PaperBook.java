package chapter15;

public class PaperBook extends Book{
	private int numberOfPages;	//	전자책 다운로드 링크
	
	//	생성자
	public PaperBook(String title, String author, String isbn, int numberOfPages) {
		super(title, author, isbn);
		this.numberOfPages = numberOfPages;
	}
	
	//	종이책 대여시 다운로드 링크를 출력
	@Override
	public void borrowBook() throws BookAlreadyBorrowedException {
		super.borrowBook();
		System.out.println("종이책은 물리적 대여만 가능합니다 ");
	}
}
