package SomeOfMainObjectTraining.SomeOfMainObjectClasses;

import java.util.Arrays;

import SomeOfMainObjectTraining.Classes.BeanB;
import SomeOfMainObjectTraining.Classes.BeanC;
import SomeOfMainObjectTraining.Classes.BeanD;
import SomeOfMainObjectTraining.Classes.BeanE;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextExample {

	public static void main(String[] args) {
		loadBeans1();
		loadBeans2();
		loadBeans3();
		loadBeans4();
		loadBeans5();
	}

	//Default olarak constructor injection olan MainObject'e setter injection yapılırsa refresh etmek gerekir
	public static void loadBeans1() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
		context.setConfigLocation("SomeOfMainObjectTraining/resources/beans.xml");
		context.refresh();
		BeanB beanB = context.getBean(BeanB.class);
		System.out.println(beanB);
	}

	//Default olarak constructor injection olan, MainObjectlerden biri
	public static void loadBeans2() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SomeOfMainObjectTraining/resources/beans.xml");
		BeanB beanB = context.getBean(BeanB.class);
		System.out.println(beanB);
	}

	//Birden fazla xml config dosyasından herhangi birinde istenilen türden bean'i arar
	public static void loadBeans3() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SomeOfMainObjectTraining/resources/beans.xml", "SomeOfMainObjectTraining/resources/anotherBeans.xml");
		BeanD beanD = context.getBean(BeanD.class);
		System.out.println(beanD);
	}

	//İlgili class türünde olan tüm beanleri listeler
	public static void loadBeans4() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SomeOfMainObjectTraining/resources/beans.xml", "SomeOfMainObjectTraining/resources/anotherBeans.xml");
//		BeanC beanc = context.getBean(BeanC.class); // Problem when there are more than one bean definition.
//		System.out.println(beanc);
		
		String[] beanNamesForBeanC = context.getBeanNamesForType(BeanC.class);
		System.out.println("\nBean definition names for type BeanC:");
		Arrays.stream(beanNamesForBeanC).forEach(System.out::println);
	}

	//İlgili class türünde olan tüm beanleri listeler
	public static void loadBeans5() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SomeOfMainObjectTraining/resources/beans.xml", "SomeOfMainObjectTraining/resources/anotherBeans.xml", "SomeOfMainObjectTraining/resources/yetAnotherBeans.xml");
		BeanE beanE = (BeanE) context.getBean("beanE"); // In case of multiple config locations, later bean definitions will override ones defined in earlier loaded files. 
		System.out.println(beanE);
	}
}
