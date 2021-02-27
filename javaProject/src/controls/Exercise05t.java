package controls;

public class Exercise05 {
	public static void main(String[] args) {
		// 임의의 값 두수를 35, 60
		// 35~60까지의 합을 구하는 프로그램 생성.

		// 44, 67
		int sNum = 67;
		int eNum = 44;
		int sum = getSumValue(sNum, eNum);
		// "두 수사이의 합계 : ???"
		System.out.println(sNum + "과 " + eNum + " 합: " + sum);
	}

	public static int getSumValue(int n1, int n2) {
		int sum = 0;
		if (n1 > n2) {
			for (; n1 <= n2; n1++) {
				sum = sum + n1;
			}
		} else {
			for (; n2 <= n1; n2++) {
				sum = sum + n2;
			}
		}
		return sum;
	}

	public static int getSumValue2(int n1, int n2) {
		// 정수1, 정수2 사이의 합을 구하는 메소드
		int sum = 0;
		if (n1 > n2) {
			for (int i = n1; i >= n2; i--) {
				sum = sum + i;
			}
		} else {
			for (int i = n1; i <= n2; i++) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static int getSumValue1(int n1, int n2) {
		// 정수1, 정수2 사이의 합을 구하는 메소드
		int startNo = (n1 > n2) ? n2 : n1;
		int endNo = (n1 > n2) ? n1 : n2;
		int sum = 0;
		for (int i = startNo; i <= endNo; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static void exercise06() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void exercise05() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + " ");
			}
			System.out.println();
		}
	}
}
