package InheritenceOfXmlConfigurationTraining.Classes;

public class Parent {
	protected int i;
	protected boolean b;
	protected String s;
	
	protected BeanA beanA;
	
	public Parent() {
		System.out.println("==> in Parent()");
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public BeanA getBeanA() {
		return beanA;
	}

	public void setBeanA(BeanA beanA) {
		this.beanA = beanA;
	}

	@Override
	public String toString() {
		return "Parent [i=" + i + ", b=" + b + ", s=" + s + ", beanA=" + beanA + "]";
	}
}
