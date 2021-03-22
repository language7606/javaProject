package abstractCalsses.animal;

public class Cat extends Animal {

	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}

}

//public class Cat extends Animal {
//
//	public Cat(String species) {
//		super(species);
//	}
//
//	@Override
//	public void sound() {
//		System.out.println("야옹");
//	}
//
//}
