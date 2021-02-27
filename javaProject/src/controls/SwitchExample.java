package controls;

public class SwitchExample {

	public static void main(String[] args) {
		String grade = "F";
		int score = 80;

		switch (score / 10) {
		case 10:
			grade = "A+";
			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "F";
		}
		System.out.println("점수 " + score + "는 " + grade + "입니다.");
	}
}
