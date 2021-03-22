package lambdaExpression;

interface MyFunctionalInterface {
	void run();
}

class MyFunctionClass implements MyFunctionalInterface {

	@Override
	public void run() {
		System.out.println("run을 실행합니다.");
	}
}

public class FunctionalExample {
	public static void main(String[] args) {
		MyFunctionalInterface mif = new MyFunctionalInterface() {

			@Override
			public void run() {
				System.out.println("run()를 실행합니다.");
			}
		};

		mif.run();
		mif = () -> System.out.println("run() 메소드를 실행합니다.");
		mif.run();
	}
}