package exceptions;

public class ArrayIndexOutofBoundsExceptionExample {
	public static void main(String[] args) {
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
	}
}
//public class ArrayIndexOutofBoundsExceptionExample {
//	public static void main(String[] args) {
//		if (args.length == 2) {
//			String data1 = args[0];
//			String data2 = args[1];
//			System.out.println("args[0]: " + data1);
//			System.out.println("args[1]: " + data2);
//		} else {
//			System.out.println("[실행 방법]");
//			System.out.println("java  ArrayIndexOutofBoundsExceptionExample  ");
//			System.out.print("값1  값2");
//		}
//	}
//}
