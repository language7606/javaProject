package controls;

	public class WhileExample {
		public static void main(String[] args) {
// 		1~10 까지 합:
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			sum = sum + i;
			i++;
		}
		int i = 1;
		int sum = 0;
		while (true) {
			sum = sum +i;
			i++;
			if (i >= 10) {
				break;
			}
			
		}
		System.out.println("1 ~10 합: " + sum);
	}
}
