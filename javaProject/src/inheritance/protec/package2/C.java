package inheritance.protec.package2;

import inheritance.protec.package1.A;

public class C {
	public void method() {
		A a = new A(); 			// (x)
		a.field = "value"; 		// (x)
		a.method(); 			// (x)
	}
}
