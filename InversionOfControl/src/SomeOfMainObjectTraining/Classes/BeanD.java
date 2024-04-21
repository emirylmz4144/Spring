package SomeOfMainObjectTraining.Classes;

public class BeanD {
	
	private BeanC beanC;

	public BeanC getBeanC() {
		return beanC;
	}

	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}
	
	@Override
	public String toString() {
		return "BeanD: " + beanC.toString();
	}
}
