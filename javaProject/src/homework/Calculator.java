package homework;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}

	void execute(int a, int b) {
		double result = avg(a, b);
		System.out.println("실행결과: " + result);

	}
//
//	void println(String message) {
//		System.out.println(message);
//	}
}
