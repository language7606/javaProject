package controls;

public class Morning0224 {
	public static void main(String[] args) {
		String grade = "";
		int es = (int)(Math.random());
		int ms = (int)(Math.random());
		
		
		String result = getAverage(es,ms); 
		
	
		
		
		System.out.println("당신의 성적은 " + result + " 입니다.");
	}
	// 영어, 수학 점수 담을 변수 선언
	// 수우미가
	// 값을 담을 수 있는 변수 선언
	// 2. 임의의 값을 생성하는 Math.random()을 사용해서
	// 1~100까지 임의의 값을 생성해서
	// 3. 임의의 값을 생성하는 Math.random()을 사용해서
	// getAverage의 결과가 수우미가 가 나오도록.

	public static String getAverage(int es, int ms) {
		String grade = "";
		
		if ((es + ms) / 2 >= 90) {
			grade = "수";
		} else if ((es + ms) / 2 >= 80) {
			grade = "우";
		} else if ((es + ms) / 2 >= 70) {
			grade = "미";
		} else {
			grade = "가";
		}
		return grade;
	}
	

}
