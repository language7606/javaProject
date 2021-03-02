package object2;

public class Student1Example {
	public static void main(String[] args) {
		Student1 s1 = new Student1("홍길동", 90, 85);
		Student1 s2 = new Student1("김길동", 80, 75);
		Student1 s3 = new Student1("이길동", 70, 95);
		Student1 s4 = new Student1("최길동", 70, 80);
		s4.setName("최길동");
		s4.setEng(70);
		s4.setMath(80);
		System.out.println(s4.getMath());
		
		Student1[] students = new Student1[4];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		
		for (Student1 student : students) {
			student.showInfo();
		}
	}
}
//2) 3명정도 값을 저장. (홍길동, 90, 85), (김길동, 88, 85), (이길동, 76, 90)
//3) 학생의 정보를 저장할 수 있도록 배열.
//4) 전체 정보를 보여주도록 ( 이름 - 영어 - 수학 - 합계) 메소드.(showInfo)
//Student1.java => Student1Exam.java
