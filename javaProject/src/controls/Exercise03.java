package controls;

public class Exercise03 {
	public static void main(String[] args) {
		int n = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0) {
				continue;
			}
			n = n + i;
		}
		System.out.println("3의 배수의 합: " + n);
	}
}