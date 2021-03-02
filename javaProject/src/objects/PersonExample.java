package objects;

//public class Person{
//	String name;
//	int age;
//	double height;
//	double weight;
//	Person(String name, int age, double height, double weight){
//		this.name = name;
//		this.age = age;
//		this.height = height;
//		this.weight = weight;
//	}
//	
//	void introduce () {
//		System.out.println("이름은 "+this.name+"나이는 "+this.age+"입니다.");
//	}
//}
public class PersonExample {
	public static void main(String[] args) {
		// 문자열 : 이름, 정수:나이 int[], String[]
		// Person[] : String, int
		Person[] persons = new Person[5];
		persons[0] = new Person("홍길동", 15, 175.1, 72.5);
		persons[1] = new Person("김길동", 25, 125.2, 32.4);
		persons[2] = new Person("이길동", 22, 185.3, 82.3);
		persons[3] = new Person("박길동", 19, 145.4, 42.2);
		persons[4] = new Person("최길동", 35, 185.5, 82.1);
		for (Person person : persons) {
			person.introduce();
		}

	}

}
