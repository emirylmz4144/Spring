package BeanFactory.Classes;

public class BeanA {
	
	private BeanB beanB;

	public BeanA() {
		System.out.println("==> Şu an beanA classına girildi");
	}

	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}
	
	@Override
	public String toString() {
		if(beanB != null)
			return "BeanA: " + beanB.toString();
		else
			return "BeanA: " + "beanB is null";
	}
	
	public static BeanA create() {
		return new BeanA();
	}
}
