package abstractCalsses.animal;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("----");
		
		//변수의 자동 타입 변환
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("----");
		
		//메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
//public class AnimalExample {
//	public static void main(String[] args) {
////		Animal animal = new Animal(); 추상클래스 인스턴스 불가능
//		Animal animal = new Bird("조류");
//		animal.breathe();
//		animal.sound();
//		
//		animal = new Cat("포유류");
//		animal.breathe();
//		animal.sound();
//	}
//}
