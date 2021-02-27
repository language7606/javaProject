package references;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = (int) (Math.random() * 100 + 1);
//			
		}
		int sum = 0;
		double avg = 0;
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			if (a[i] % 2 == 0) {
				sum = sum + a[i];
				cnt++;
				System.out.println(a[i]);
			}
		}
		avg = sum / cnt;
		System.out.println("합계 :" + sum);
		System.out.println("개수 :" + cnt);
		System.out.println("평균 :" + avg);
	}
}