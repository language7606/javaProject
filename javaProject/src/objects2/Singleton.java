package objects2;

import homework.Car;

public class Singleton {
	Car myCar = new Car();
	
	
	
	private static Singleton singleton = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return singleton;
	}
}
