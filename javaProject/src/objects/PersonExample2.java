package objects;

public class PersonExample2 {
	public static void main(String[] args) {
		Person2 p1 = new Person2("123456-1234567","계백");

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

		// p1.nation="usa";
		p1.ssn="654321-7654321";
//		p1.name="을지문덕";

	}
}
