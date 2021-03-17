package inheritance.protec.package2;

import inheritance.protec.package1.A;

public class D extends A {
	public D() {
		super();					// (o)
		this.field = "value";		// (o)
		this.method();				// (o)
	}
}
