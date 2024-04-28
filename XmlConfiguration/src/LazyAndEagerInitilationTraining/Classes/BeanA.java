package LazyAndEagerInitilationTraining.Classes;


public class BeanA {
	private String name;
	private BeanB beanB;

	public BeanA(String name) {
		System.err.println("in BeanA()");
		this.name = name;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	@Override
	public String toString() {
		return "BeanA [name=" + name + ", beanB=" + beanB + "]";
	}
}
