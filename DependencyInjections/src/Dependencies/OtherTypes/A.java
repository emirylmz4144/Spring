package Dependencies.OtherTypes;

public class A extends P implements I{
	/*
	* A-B ==> ABSTRACTION (IS A)
	* A-P ==> REALIZATION (IS A)
	* A-B ==> USAGE(AGGREGATION)(HAS-A)
	* A-C ==> USAGE(ASSOCIATON)(USES-A)
	* A-D ==> USAGE(COMPOSITON) (HAS-)
	 */

	private B b;
	
	public void f(C c) {
		
	}
	
	public D g() {
		return new D();
	}
}
