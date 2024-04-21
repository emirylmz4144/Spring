package SomeOfMainObjectTraining.SomeOfMainObjectClasses;

import java.util.Arrays;

import SomeOfMainObjectTraining.Classes.BeanB;
import SomeOfMainObjectTraining.Classes.BeanC;
import SomeOfMainObjectTraining.Classes.BeanD;
import SomeOfMainObjectTraining.Classes.BeanE;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Bu class'ın tek farkı şudur ClassPathXmlApplication main object'i projedeki root
 * paketine iner ve arama yapar fakat bu main object class ise başına file yönlendirmesi
 * alarak verilen dosya yolunu tüm lokal bilgisayar boyunca arar
 * Unutma file almazsa başına hata verir
 */
public class FileSystemXmlApplicationContextExample {

	public static void main(String[] args) {
		loadBeans11();
//		loadBeans12(); // Couldn't find the resource file
		loadBeans2();
		loadBeans3();
		loadBeans4();
		loadBeans5();
		loadBeans5();
	}
	
	public static void loadBeans11() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext();
		context.setConfigLocation("file:/Users/Desktop/EmirinYazılımŞeysileri/Spring/InversionOfControl/SomeOfMainObjectTraining/resoruces/beans.xml"); // Start with file: for absolute file path
		context.refresh();
		BeanB beanB = context.getBean(BeanB.class);
		System.out.println(beanB);
	}
	
	public static void loadBeans12() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext();
		context.setConfigLocation("file:/Users/Desktop/EmirinYazılımŞeysileri/Spring/InversionOfControl/SomeOfMainObjectTraining/resoruces/beans.xml"); // Always relative unless starting with file:
		context.refresh();
		BeanB beanB = context.getBean(BeanB.class);
		System.out.println(beanB);
	}
	
	public static void loadBeans2() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:/Users/Desktop/EmirinYazılımŞeysileri/Spring/InversionOfControl/SomeOfMainObjectTraining/resoruces/beans.xml");
		BeanB beanB = context.getBean(BeanB.class);
		System.out.println(beanB);
	}

	public static void loadBeans3() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:/Users/Desktop/EmirinYazılımŞeysileri/Spring/InversionOfControl/SomeOfMainObjectTraining/resoruces/beans.xml", "/Users/Desktop/EmirinYazılımŞeysileri/Spring/InversionOfControl/SomeOfMainObjectTraining/resoruces/anotherBeans.xml");
		BeanD beanD = context.getBean(BeanD.class);
		System.out.println(beanD);
	}
	
	public static void loadBeans4() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:/Users/Desktop/EmirinYazılımŞeysileri/Spring/InversionOfControl/SomeOfMainObjectTraining/resoruces/beans.xml", "file:/Users/Desktop/EmirinYazılımŞeysileri/Spring/InversionOfControl/SomeOfMainObjectTraining/resoruces/anotherBeans.xml");
//		BeanC beanc = context.getBean(BeanC.class); // Problem when there are more than one bean definition.
//		System.out.println(beanc);
		
		String[] beanNamesForBeanC = context.getBeanNamesForType(BeanC.class);
		System.out.println("\nBean definition names for type BeanC:");
		Arrays.stream(beanNamesForBeanC).forEach(System.out::println);
	}
	

	
	public static void loadBeans5() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:/Users/Desktop/EmirinYazılımŞeysileri/Spring/InversionOfControl/SomeOfMainObjectTraining/resoruces/beans.xml", "file:/Users/Desktop/EmirinYazılımŞeysileri/Spring/InversionOfControl/SomeOfMainObjectTraining/resoruces/anotherBeans.xml", "file:/Users/Desktop/EmirinYazılımŞeysileri/Spring/InversionOfControl/SomeOfMainObjectTraining/resoruces/yetAnotherBeans.xml");
		BeanE beanE = (BeanE) context.getBean("beanE"); // In case of multiple config locations, later bean definitions will override ones defined in earlier loaded files. 
		System.out.println(beanE);
	}
}
