package homework;

import java.util.Scanner;

public class Hw1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] [] students=null;
				int studentNum=0;
		
		while (true) {
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.리스트 4.조회 5.영어최고점 6.합계최고 7.수학평균점이상 8.종료");
			System.out.println("-----------------------------------------------------------------------------------");

			System.out.println("선택> ");
			
			int menu = scn.nextInt();
			// 1) 이미 입력한 경우에는 이미 입력했습니다 라는 메세지를 보여주고 메뉴를 화면에 보여주는 기능.
			
			if (menu==1) {
				// 1. 학생수를 입력받아서
			} else if (menu==2) {
				// 학생번호에 따라 영어, 수학 점수를 저장하세요.
			} else if (menu==3) {
				// 2. 입력한 값의 리스트를 학생번호 - 영어 / 수학 점수의 순으로 보여주는 코드를 작성하세요.
			} else if (menu==4) {
				// 3. 학생번호를 입력하면 학생의 영어, 수학점수(또는 합계점수와 평균점수)를 보여주는 기능을 작성하세요.
			} else if (menu==5) {
			 	// 4. 영어점수가 가장 높은 학생번호와 점수를 보여주는 기능을 구현하세요.
			} else if (menu==6) {
				// 5. 합계점수가 가장 높은 학생번호와 점수를 보여주는 기능을 구현하세요.
			} else if (menu==7) {
				// 6. 수학점수가 수학평균점수 이상인 학생의 번호와 수학점수를 보여주도록 코드를 작성하세요.
			} else if (menu==8) {
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}
}