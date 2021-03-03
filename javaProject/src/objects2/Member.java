package objects2;

public class Member {
	private String memberId;
	private String memberName;
	private Book[] rentBooks = new Book[5];
	
	public Member() {
	}
	
	public Member(String memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void rent(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] == null) {
				rentBooks[i] = book;
				break;
			}
		}
	}

	public void overdue(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i].getBookTitle().equals(book.getBookTitle())) {
				rentBooks[i] = null;
				break;
			}
		}
	}

	public String getBookInfo() {
		String result = "";
		result = memberName;
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] != null) {
				result = result + "/" + rentBooks[i].getBookTitle();
			}
			return result;
		}
	}
}
// 도서정보(도서객체) => 도서(Book)
// private 책제목
// 책저자
// 출판사
// 금액
//
// get, set 메소드
//
// 도서회원(회원객체) => 도서회원(Member)
// 회원 ID
// 회원이름
// (대여)도서[] rentBooks = new Book[3];
//
// [기능]
// 대여기능 rent(Book book(여러권))
// 반납기능 overdue(Book book(여러권))
//
// LibraryExe(main)