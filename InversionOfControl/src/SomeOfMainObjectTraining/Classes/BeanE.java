package SomeOfMainObjectTraining.Classes;

public class BeanE {
	
	private BeanD beanD;

	public BeanD getBeanD() {
		return beanD;
	}

	public void setBeanD(BeanD beanD) {
		this.beanD = beanD;
	}
	
	@Override
	public String toString() {
		if(beanD != null)
			return "BeanE: " + beanD.toString();
		else
			return "BeanE: beanD is null";
	}
}
