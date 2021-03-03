package objects;

public class Student {
	// 속성(필드)
	String studentNo; // p21010101
	int grade;
	int math;
	int eng;
	String name;

	// 생성자 : 필드값을 초기화.
	public Student() {
		System.out.println("생성자를 호출합니다.");
	}

	Student(String studentNo) {
		this.studentNo = studentNo;
	}

	Student(int grade, int eng, int math) {
		this.grade = grade;
		this.eng = eng;
		this.math = math;
	}

//	 기능(메소드)
	public void study() {
		System.out.println("공부합니다.");
	}

	public void run() {
		System.out.println("운동을 합니다.");
	}

	public void introduce() {
		System.out.println("학번 : " + studentNo + ", 학년: " + grade);
		System.out.println();
	}
}
