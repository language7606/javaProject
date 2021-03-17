package abstractCalsses.animal;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound(); //추상메소드
	
}
//public abstract class Animal {
//	String species;
//	
//	public Animal() {
//		
//	}
//	public Animal(String species) {
//		this.species = species;
//	}
//	public void showInfo() {
//		System.out.println("종류는 " + this.species + "입니다.");
//	}
//	public void breathe() {
//		System.out.println("숨을 쉽니다.");
//	}
//	public abstract void sound(); //추상메소드
//	
//}
