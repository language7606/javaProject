package controls;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		//system.in.read();
		//Scanner.readLine();
		Scanner scn = new Scanner(System.in);
		System.out.println("값을 입력.");
		String str = scn.nextLine();
		System.out.println("입력한 값은: "+ str);
		boolean run = true;
		do {
			System.out.println(">");
			str = scn.nextLine();
			System.out.println(">>>"+ str);
			if(str.equals("q")) {
				break;
			}
		}while(!str.equals("q"));
		
		System.out.println("프로그램 종료.");
	}

}
