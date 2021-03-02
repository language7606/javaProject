package objects;

public class Person {
	String name;
	int age;
	double height;
	double weight;

	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	void introduce() {
		System.out.println("이름은 " + this.name + "나이는 " + this.age + "입니다.");
	}
}
//	String name;
//	int age;
//	double weight;
//	double height;
//
//	void eat() {
//		System.out.println("밥을 먹습니다.");
//	}
//
//	void sleep() {
//		System.out.println("잠을 잡니다.");
//	}
//
//	void walk() {
//		System.out.println("걷습니다.");
//	}
//
//	void introduce() {
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//		System.out.println("몸무게 : " + weight);
//		System.out.println("키 : " + height);
//	}
//}
