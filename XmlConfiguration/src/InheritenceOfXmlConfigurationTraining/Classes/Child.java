package InheritenceOfXmlConfigurationTraining.Classes;

public class Child extends Parent {
	protected double d;
	protected BeanB beanB;

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	@Override
	public String toString() {
		return "Child [d=" + d + ", beanB=" + beanB + ", i=" + i + ", b=" + b + ", s=" + s + ", beanA=" + beanA + "]";
	}
}
