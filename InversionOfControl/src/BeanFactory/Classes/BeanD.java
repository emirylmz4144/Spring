package BeanFactory.Classes;

public class BeanD {

	public BeanD() {
		System.out.println("Şu an beanD classına girildi");
	}

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
