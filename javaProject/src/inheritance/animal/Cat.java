package inheritance.animal;

public class Cat extends Animal {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Animal animal = cat;

		System.out.println(cat == animal);

	}

}
