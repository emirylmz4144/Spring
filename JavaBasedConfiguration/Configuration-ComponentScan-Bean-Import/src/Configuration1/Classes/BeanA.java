package Configuration1.Classes;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {
	private BeanB beanB;

	@Autowired
	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	@Override
	public String toString() {
		return "BeanA [beanB=" + beanB + "]";
	}
}
