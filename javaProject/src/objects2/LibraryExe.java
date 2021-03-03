package objects2;

public class LibraryExe {
	public static void main(String[] args) {
		Book book1 = new Book("자바", "저자1", "출판사1", 1000);
		Book book2 = new Book("HTML", "저자2", "출판사2", 2000);
		Book book3 = new Book("CSS", "저자3", "출판사3", 3000);
		Book book4 = new Book("자바스크립트", "저자4", "출판사4", 4000);
		
		Member mem1 = new Member("s111","홍길동");
		Member mem2 = new Member("a222","심길동");
		
		mem1.rent(book1);
		mem1.rent(book2);
		mem1.overdue(book2);
		System.out.println(mem1.getBookInfo());
		mem2.getBookInfo();
//		
//		Member mem2 = new Member("a222","김길동");
//		mem2.rent(book3);
//		mem2.rent(book4);
	}

}
