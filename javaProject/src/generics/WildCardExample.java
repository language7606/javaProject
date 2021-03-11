package generics;

public class WildCardExample {
	
	public static void registerCourse(Course<?> course) {
		
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		
	}
	
	public static void main(String[] args) {
		
	}
}
