package SomeOfMainObjectTraining.SomeOfMainObjectClasses;

import java.io.IOException;
import java.util.Date;


import SomeOfMainObjectTraining.Classes.BeanA;
import SomeOfMainObjectTraining.Classes.BeanB;
import SomeOfMainObjectTraining.Classes.BeanC;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * Bu class !AŞIRI ÖNEMLİDİR! çünkü kendine göre özelleşmiş ve BeanFactory ListableBeanFactory
 * gibi classları da implemente etmiştir yani aslında gerçekten mainObject class budur
 * çünkü hem kendine has özelleşmiş yapıları hem de implemente edilen classların
 * özellikleri bu main objectte bulunmaktadır
 * zaten ilerleyen bir çok yerde spring conteiner ayağa kaldırılması derken
 * ApplicationContect MainObject kasıt alınmıştır.
 */
public class ApplicationContextExample {

	public static void main(String[] args) throws IOException {
		ApplicationContext context = getApplicationContext();
//		callBeanFactoryMethods(context);
//		callApplicationContextMethods(context);
	}
	
	public static void callApplicationContextMethods(ApplicationContext context) throws IOException {
		System.out.println("Application id : " + context.getId());
		System.out.println("Application name : " + context.getApplicationName());
		System.out.println("Application display name : " + context.getDisplayName());
		System.out.println("Application startup date : " + new Date(context.getStartupDate()));

		Resource resource = context.getResource("classpath:/org/javaturk/spring/di/ch03/beanFactory/resources/beans.xml");
		System.out.println(resource.getFile());
		System.out.println("Resource : " + resource);

		System.out.println();
		
		Resource[] resources = context.getResources("classpath:/org/javaturk/spring/di/ch03/beanFactory/resources/*.xml");
		for (Resource res : resources) {
			System.out.println("File: " + res.getFile());
			System.out.println("Resource : " + res);
		}
	}

	public static void callBeanFactoryMethods(ApplicationContext context) {

		BeanA beanA = (BeanA) context.getBean("beanA");
		System.out.println(beanA);

		beanA = (BeanA) context.getBean("bean_A");
		System.out.println("bean_A: " + beanA);

		beanA = (BeanA) context.getBean("bean_a");
		System.out.println("bean_a: " + beanA);

		beanA = (BeanA) context.getBean("BEAN_A");
		System.out.println("BEAN_A: " + beanA);
		
		beanA = (BeanA) context.getBean("BEAN-A");
		System.out.println("BEAN-A: " + beanA);

//		beanA = context.getBean(BeanA.class); // Problem due to more than one bean definition for BeanA
//		System.out.println(beanA);

		System.out.println();

		BeanB beanB = (BeanB) context.getBean("beanB");
		System.out.println(beanB);

		beanB = context.getBean(BeanB.class);
		System.out.println(beanB);

		BeanC beanC = (BeanC) context.getBean("beanC");
		System.out.println(beanC);

		beanC = context.getBean(BeanC.class);
		System.out.println(beanC);

		System.out.println();

		boolean b = context.containsBean("beanA");
		System.out.println(b);

		b = context.containsBean("a");
		System.out.println(b);

		beanA = (BeanA) context.getBean("a");
		System.out.println(beanA);

		System.out.println("\nAliases");
		String[] aliases = context.getAliases("beanA");
		for (String alias : aliases)
			System.out.println(alias);

		System.out.println();

		ObjectProvider<BeanA> op = context.getBeanProvider(BeanA.class);
		System.out.println(op);
	}
	


	private static ApplicationContext getApplicationContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SomeOfMainObjectTraining/resources/beans.xml");
		return context;
	}
}
