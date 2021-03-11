package generics;

public class Utils {
	public <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.setBox(t);
		return box;
	}
}
