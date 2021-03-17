package inheritance.promotion;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		
		System.out.println(child);
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		//parent.method3(); (호출 불가능)
	}
}
