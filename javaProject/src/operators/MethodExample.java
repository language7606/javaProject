package operators;

public class MethodExample {

	public static void main(String[] args) {
		int result = minus(30, 20);
		System.out.println(result);

		result = multi(15, 13);
		System.out.println(result);

		result = divide(30, 12);
		System.out.println(result);

		result = hello(50, 11);
		System.out.println(result);
	}

	public static int minus(int a, int b) {
		int result = a - b;
		return result;
	}

	public static int multi(int a, int b) {
		int result = a * b;
		return result;
	}

	public static int divide(int a, int b) {
		int result = a / b;
		return result;
	}

	public static int hello(int a, int b) {
		int result = a % b;
		return result;
	}
}
