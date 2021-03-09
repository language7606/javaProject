package controls;

public class Exercise04 {
	public static void main(String[] args) {
		boolean run = true;
		

		while (run) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			
			if (num1 + num2 != 5) {
				System.out.println("(" + num1 + "," + num2 + ")");
				continue;
			} else
				System.out.println("(" + num1 + "," + num2 + ")");
			break;
		}
		run = false;
		System.out.println("프로그램 종료");
	}
}
