package generics;

public class Util {
	public static <K, V> boolean compare(Pair<K, V>p1, Pair<K, V>p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
	
	public static <T> int compare(T t1, T t2) {
		
		
		return 0;
	}
}
