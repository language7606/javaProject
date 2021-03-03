package objects2;

public class Book {
	private String bookTitle;
	private String bookAuthor;
	private String bookPress;
	private int bookPrice;

	public Book(String bookTitle, String bookAuthor, String bookPress, int bookPrice) {
		super();
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPress = bookPress;
		this.bookPrice = bookPrice;

	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPress() {
		return bookPress;
	}

	public void setBookPress(String bookPress) {
		this.bookPress = bookPress;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	

//		도서정보(도서객체) => 도서(Book)
//		private 책제목
//		책저자
//		출판사
//		금액
//		
//		get, set 메소드
//		
//		도서회원(회원객체) => 도서회원(Member)
//		회원 ID
//		회원이름
//		(대여)도서[] rentBooks = new Book[3];
//		
//		[기능]
//		대여기능 rent(Book book(여러권))
//		반납기능 overdue(Book book(여러권))
//		
//		LibraryExe(main)

}
