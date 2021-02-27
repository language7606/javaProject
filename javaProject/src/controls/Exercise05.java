package controls;

public class Exercise05 {
	public static void main(String[] args) {
		// 임의의 값 두수를 35, 60
		// 35~60까지의 합을 구하는 프로그램 생성.
		
		//44, 67
		//결과 = getSumValue(44,67);
		//"두 수 사이의 합계 : ???"
		
		int c = 44;
		int d = 67;
		int sum = getSumValue(c,d);
		
		System.out.println(c +" 와 "+ d + "사이의 합계 : " + sum);
	}
	public static int getSumValue(int a, int b) {
		int sum = 0;
		if (a > b) {
			for (int i = a; i>=b;i--) {
				sum= sum+i;
			} else {
				
			}
		}
		for (int i = a; i<=b;i++) {
			sum=sum+i;
		}
		return sum;
	}
}



public static void exercise05() {
	for (int i = 2; i < 10; i++) {
		System.out.println("i의 값: " + i);
		for (int j = 1; j < 10; j++) {
			System.out.println(i + " * " + j + " = " + (i * j));
		}
		System.out.println();
	}
}
}

public static void exercise06() {
for (int i = 1; i < 5; i++) {
	for (int j = 1; j <= i; j++) {
		System.out.println("*");
	}
	System.out.println();
}
}
}
		