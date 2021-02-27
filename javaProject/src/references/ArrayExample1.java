package references;

public class ArrayExample1 {
	public static void main(String[] args) {
		// intArys
		int[] intArys = new int[5];
		for (int i = 0; i < 5; i++) {
			intArys[i]=(int)(Math.random() * 10 + 1);
			System.out.println(intArys[i]);
		}
		int maxValue = 0;
		for (int i=0; i<5; i++) {
			if (maxValue < intArys[i]) {
				maxValue=intArys[i];
			}
		}
		
		System.out.println("최대값: " + maxValue);
	}

}
