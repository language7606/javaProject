package inheritance;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		// 추가...Scanner 클래스...
		// 1. 친구 2. 학교친구 3. 회사친구 4. 전체목록 5. 친구이름 검색 6. 종료
		boolean run = true;
		Scanner scn = new Scanner("");

		while (run) {
			System.out.println("-------------------------------------------------------------------");
			System.out.println("1) 친구 2) 학교친구 3) 회사친구 4)전체목록 5) 친구이름 검색 9) 종료");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();

			if (selectNo != 1) {
				System.out.println(f.,);
				
			} else if (selectNo != 2) {
				System.out.println();
			} else if (selectNo != 3) {

			} else if (selectNo != 4) {

			} else if (selectNo != 5) {

			} else {
				System.out.println("프로그램 종료.");
				run = false;
			}
		}
	}
}
