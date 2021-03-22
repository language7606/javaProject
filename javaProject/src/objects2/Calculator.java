package objects2;

public class Calculator {
	double pi = 3.14;
	
	public double getArea(double radius) {
		double result = pi * radius * radius;
		return result;

	}
	
	public static double getRect(double d1, double d2) {
		double result = d1*d2;
		return result;
	}
}
