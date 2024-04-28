package LazyAndEagerInitilationTraining.Classes;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanC {
	private String name;
	private BeanD beanD;

	@Autowired
	public BeanC(String name, BeanD beanD) {
		System.err.println("in BeanC()");
		this.name = name;
		this.beanD = beanD;
	}

	@Override
	public String toString() {
		return "BeanC [name=" + name + ", beanD=" + beanD + "]";
	}
}
