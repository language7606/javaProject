package objects2;

import java.util.Scanner;

public class LibraryApplication {
	public static void main(String[] args) {
		// 1)도서정보 입력 []배열 제목 저자 출판사 가격
		// 2)회원정보 이름 ID
		// 3)도서대여 책 제목
		// 4)도서반납 책 제목
		// 5)도서목록 getBookInfo
		Book[] bookList = new Book[10];
		Member user = new Member();
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("1)도서정보등록 2)회원정보등록 3)도서대여 4)도서반납 5)도서목록 9)종료");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();
			if (selectNo != 1) {
				System.out.println("책 제목을 입력하세요.");
			} for (i=0;i<bookList.length;i++) {
					
				System.out.println();
				continue;
				}
			}
	}
}
