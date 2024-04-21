package SomeOfMainObjectTraining.Classes;

public class BeanB {

	private BeanC beanC;

	public BeanC getBeanC() {
		return beanC;
	}

	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}
	
	@Override
	public String toString() {
		if(beanC != null)
			return "BeanB: " + beanC.toString();
		else
			return "BeanB: " + "beanC is null";
	}
}
