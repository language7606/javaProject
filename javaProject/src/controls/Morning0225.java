package controls;

public class Morning0225 {

	public static void main(String[] args) {
		
		// 11부터 30까지의 수의 합을 구하도록 for반복문.
		
		int sum = 0;
		for (int i=11; i<=30;i++) {
			sum=sum+i;//sum += i; 와 같은 의미.
			System.out.println(sum);
		}
		
		// 11과 30을 변수로 입력받아서 합을 구하는 for반복문.
		
		sum=0;
		int v1=11;
		int v2=30;
		
		System.out.println("2) " + v1 + "~" +v2+ "까지 합:" + sum);
		
		// 11과 30을 매개변수로 받아서 합을 구하는 메소드.
		
		sum=0;
		sum=getSum(v1,v2);
		System.out.println(sum);

		public static int getSum(int fromValue, int toValue) {
		int sum = 0;
		for (int i = fromValue; i <= toValue; i++) {
			sum += i;
		}
		return sum;
	}
}