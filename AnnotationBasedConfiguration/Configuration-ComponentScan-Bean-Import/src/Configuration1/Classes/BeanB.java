package Configuration1.Classes;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanB {
	private String name;
	private int age;
	private BeanC beanC;

	@Autowired
	public BeanB(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Autowired
	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}

	@Override
	public String toString() {
		return "BeanB [name=" + name + ", age=" + age + ", beanC=" + beanC + "]";
	}
}
