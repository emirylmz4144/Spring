package LazyAndEagerInitilationTraining;

import LazyAndEagerInitilationTraining.Classes.BeanA;
import LazyAndEagerInitilationTraining.Classes.BeanB;
import LazyAndEagerInitilationTraining.Classes.BeanC;
import LazyAndEagerInitilationTraining.Classes.BeanD;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyExample {

	public static void main(String[] args) {
//		getBeans1();
		getBeans2();
	}

	/**
	 * Keep all beans as singleton and then run this method with eager and lazy
	 * initialization of the beans.
	 */
	public static void getBeans1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("LazyAndEagerInitilationTraining/resources/beans1.xml");

		BeanA beanA = (BeanA) context.getBean("beanA");
		System.out.println(beanA);

		BeanB beanB = (BeanB) context.getBean("beanB");
		System.out.println(beanB);

		BeanC beanC = (BeanC) context.getBean("beanC");
		System.out.println(beanC);

		BeanD beanD = (BeanD) context.getBean("beanD");
		System.out.println(beanD);
	}

	/**
	 * Modify all beans as prototype and then this method with eager and lazy
	 * initialization of the beans.
	 * Try it with and without requesting beans from the context. Do the same thing with default-lazy-init="true" 
	 * and default-lazy-init="false" in </beans>.
	 */
	public static void getBeans2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch05/lazy/resources/beans2.xml");
		
		BeanA beanA = (BeanA) context.getBean("beanA");
		System.out.println(beanA);

		BeanB beanB = (BeanB) context.getBean("beanB");
		System.out.println(beanB);

		BeanC beanC = (BeanC) context.getBean("beanC");
		System.out.println(beanC);

		BeanD beanD = (BeanD) context.getBean("beanD");
		System.out.println(beanD);
	}
}
