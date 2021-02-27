package controls;

public class IfElseExample {
	public static void main(String[] args) {
		String grade = "";
		int score = 60;

		if (score >= 90) {
			if (score >= 95) grade = "A+";
			else grade = "A";
		} else if (score >= 80) {
			if (score >= 85) grade = "B+";
			else grade = "B";
		} else if (score >= 70) {
			if (score >= 75) grade = "C+";
			else grade = "C";
		} else {
			grade = "F";
		}
		System.out.println("점수 " + score + "는 " + grade + "입니다.");
		// if구문과 90점 이상 -> A 95점 이상 A+
		// else if 80점 이상 -> B 85점 이상 B+
		// else if 70점 이상 -> C 75점 이상 C+
		// else 그 외 -> F
		// 점수 85는 B 입니다.
	}

}
