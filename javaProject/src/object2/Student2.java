package object2;

public class Student2 {
	String name;
	int eng;
	int math;
	int eng2;

	public Student2() {
		
	}
	
	public Student2(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}

	public Student2(int eng) {
		super();
		this.eng = eng;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}
