package ScopeTraining;

import ScopeTraining.Classes.BeanA;
import ScopeTraining.Classes.BeanB;
import ScopeTraining.Classes.BeanC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeExample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ScopeTraining/resources/beans.xml");
		checkScope1(context);
		checkScope2(context);
		checkScope3(context);
	}

	/**
	 * Make BeanA singleton as the default case and prototype to see the difference.
	 * @param context
	 */
	public static void checkScope1(ApplicationContext context) {
		System.out.println("==> in checkScope1()");
		BeanA beanA1 = (BeanA) context.getBean("beanA");

		BeanA beanA2 = (BeanA) context.getBean("beanA");

		if (beanA1 == beanA2)
			System.out.println("BeanA is Singleton");
		else
			System.out.println("BeanA is Prototype");
		System.out.println("\n\n");
	}
	
	/**
	 * Apply following cases:
	 * 	- BeanA and BeanB singleton
	 *  - BeanA and BeanB prototype
	 *  - BeanA singleton and BeanB prototype
	 *  - BeanA prototype and BeanB singleton
	 * @param context
	 */
	public static void checkScope2(ApplicationContext context) {
		System.out.println("in checkScope2()");
		BeanA beanA1 = (BeanA) context.getBean("beanAA");
		BeanB beanB1 = beanA1.getBeanB();
		BeanA beanA2 = (BeanA) context.getBean("beanA");
		BeanB beanB2 = beanA2.getBeanB();

		if (beanA1 == beanA2)
			System.out.println("BeanA is Singleton");
		else
			System.out.println("BeanA is Prototype");
		
		if (beanB1 == beanB2)
			System.out.println("BeanB is Singleton");
		else
			System.out.println("BeanB is Prototype");
		System.out.println("\n\n");
	}
	
	public static void checkScope3(ApplicationContext context) {
		System.out.println("in checkScope3()");
		BeanA beanA = (BeanA) context.getBean("beanA");
		BeanB beanB1 = beanA.getBeanB();
		BeanB beanB2 = (BeanB) context.getBean("beanB");
		
		if (beanB1 == beanB2)
			System.out.println("BeanB is Singleton");
		else
			System.out.println("BeanB is Prototype");
		
		BeanC beanC1 = beanB1.getBeanC();
		BeanC beanC2 = (BeanC) context.getBean("beanC");
		
		if (beanC1 == beanC2)
			System.out.println("BeanC is Singleton");
		else
			System.out.println("BeanC is Prototype");
	}
}
