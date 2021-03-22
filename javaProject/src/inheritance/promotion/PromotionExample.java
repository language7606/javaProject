package inheritance.promotion;

class A {}

class B extends A {}

class C extends A {}

class D extends B {}

class E extends C {}

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A a1 = b;
		A a2 = c;
		A a3 = d; // 상속은 B를 받지만 B가 A를 상속받으므로 가능
		A a4 = e; // 상속은 C를 받지만 C가 A를 상속받으므로 가능

		B b1 = d;
		C c1 = e;

		// B b3 = e;
		// C c2 = d;
	}
}
