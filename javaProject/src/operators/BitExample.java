package operators;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class BitExample {
	public static void main(String[] args) {
		int x = 5;
		int y = 25;
		System.out.println(x & y);
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));

		x = 8;
		y = 3;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));

		System.out.println(x << y);
	}
}
