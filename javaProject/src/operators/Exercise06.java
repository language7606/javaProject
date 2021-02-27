package operators;

public class Exercise06 {

	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height =7;
		double area = (lengthTop + lengthBottom) / 2.0 * height;
		System.out.println("area1: " + area);
		
		area = getRectArea(lengthTop, lengthBottom, height);
		System.out.println("area2: " + area);
	}
	//사다리꼴의 넓이 구하는 메소드.
	public static double getRectArea(int top, int bottom, int height) {
		double area = (double) (top + bottom) / 2* height;
		return area;
	}

}
