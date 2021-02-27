package variables;
public class FloatDoubleExample {
	public static void main(String[] args) {
		double var1 = 3.14;
		float var2 = 3.15F;
		
		double result = var1 + var2;
		
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		System.out.println("double타입: " + var4);
		System.out.println("float타입: " + var5);
		double var7 = 2e-3;
		System.out.println(var7);
		boolean b1 = (10 < 5);
		if (b1) {
			System.out.println("거짓입니다.");
		}
		b1 = result > var1; //or false
		if (result < var1) {
			System.out.println("조건이 참입니다.");
		} else {
			System.out.println("조건이 거짓입니다.");
		}
	}

}
