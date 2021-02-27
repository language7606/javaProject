package references;

public class ArrayExample22 {
	public static void main(String[] args) {
		int[] intArays = new int[10];
		int sum= 0;
		double avg = 0;
		
		for (int i = 0; i < 10; i++) {
			intArays[i]=(int)(Math.random() * 100 + 1);
			System.out.println(intArays[i]);
			sum= sum+intArays[i];
		}
		avg = sum / intArays.length;
		
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + avg);
	}
}
