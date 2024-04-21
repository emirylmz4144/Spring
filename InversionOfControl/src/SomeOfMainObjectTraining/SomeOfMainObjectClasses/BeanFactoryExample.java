package SomeOfMainObjectTraining.SomeOfMainObjectClasses;

import SomeOfMainObjectTraining.Classes.BeanA;
import SomeOfMainObjectTraining.Classes.BeanB;
import SomeOfMainObjectTraining.Classes.BeanC;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryExample {

	public static void main(String[] args) {
		getBeanA();
	}

	public static void getBeanA() {
		BeanFactory beanFactory = getBeanFactory();

		// Referencing by id
		BeanA beanA = (BeanA) beanFactory.getBean("beanA");
		System.out.println("beanA: " + beanA);

		// Referencing by name
		beanA = (BeanA) beanFactory.getBean("bean_A");
		System.out.println("bean_A: " + beanA);

		// Referencing by name
		beanA = (BeanA) beanFactory.getBean("bean_a");
		System.out.println("bean_a: " + beanA);

		// Referencing by name
		beanA = (BeanA) beanFactory.getBean("BEAN_A");
		System.out.println("BEAN_A: " + beanA);

		// Referencing by alias
		beanA = (BeanA) beanFactory.getBean("a");
		System.out.println("a: " + beanA);

		// Referencing by alias
		beanA = (BeanA) beanFactory.getBean("aa");
		System.out.println("aa: " + beanA);

		// Referencing by type
//		beanA = beanFactory.getBean(BeanA.class);
//		System.out.println("BeanA.class: " + beanA);
		
		System.out.println("\nAliases of BeanA");
		String[] aliases = beanFactory.getAliases("beanA");
		for (String alias : aliases)
			System.out.println(alias);
		
		System.out.println();
		
		boolean b = beanFactory.containsBean("beanA");
		System.out.println("Does BeanFactory contain beanA? " + b);

		getOtherBeans();
	}
	
	public static void getOtherBeans() {
		BeanFactory beanFactory = getBeanFactory();

		BeanB beanB = (BeanB) beanFactory.getBean("beanB");
		System.out.println("beanB: " + beanB);

		beanB = beanFactory.getBean(BeanB.class);
		System.out.println("BeanB.class: " + beanB);

		BeanC beanC = (BeanC) beanFactory.getBean("beanC");
		System.out.println("beanC: " + beanC);

		beanC = beanFactory.getBean(BeanC.class);
		System.out.println("BeanC.class: " + beanC);

		System.out.println();

		ObjectProvider<BeanA> op = beanFactory.getBeanProvider(BeanA.class);
		System.out.println(op);
	}

	private static BeanFactory getBeanFactory() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"SomeOfMainObjectTraining/resources/beans.xml");
		return beanFactory;
	}
}
