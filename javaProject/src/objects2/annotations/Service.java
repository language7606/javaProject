package objects2.annotations;

public class Service {
	@PrintAnnotation
	String name;
	
	
	@PrintAnnotation
	public void method1() {
		
	}
	@PrintAnnotation(value = "*", number = 20)
	public void method2() {
		
	}
	@PrintAnnotation
	public void method3() {
		
	}
}
