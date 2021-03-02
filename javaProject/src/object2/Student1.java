package object2;

public class Student1 {
//  문제)학생의 이름, 영어, 수학 점수를 저장.
//	1) 클래스를 활용해서 값을 저장할 수 있도록 선언.
	private String name;
	private int eng;
	private int math;

//	2) 3명정도 값을 저장. (홍길동, 90, 85), (김길동, 88, 85), (이길동, 76, 90)
	Student1() {
		;
	}

	Student1(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}

	void showInfo() {
		System.out.println("이름 : " + name + " 영어 : " + eng + " 수학 : " + math + " 합계 : " + (eng + math));
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEng(int eng) {
		if (eng < 0) {
			this.eng = 0;
		} else {
			this.eng = eng;
		}
	}

	public void setMath(int math) {
		if (math < 0) {
			this.math = 0;
		} else {
			this.math = math;
		}
	}
	
	public int getEng() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}
	public String getName() {
		return this.name;
	
//	3) 학생의 정보를 저장할 수 있도록 배열.
//	4) 전체 정보를 보여주도록 ( 이름 - 영어 - 수학 - 합계) 메소드.(showInfo)
//	Student1.java => Student1Exam.java
//	
}
