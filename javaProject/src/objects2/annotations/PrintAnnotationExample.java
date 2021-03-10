package objects2.annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		Method[] methods = Service.class.getDeclaredMethods();
		Constructor[] constructors = Service.class.getDeclaredConstructors();
		Field[] fields = Service.class.getDeclaredFields();
	}
}
