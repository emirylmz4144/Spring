package Classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Run with -DmyDesktop=/Users/akin/Desktops to pass param to @PropertySource in ValueBean.java.
 * Run with -DpathToResources=org/javaturk/spring/di/ch06/value/resources to pass param to XML file.
 * @author akin
 *
 */
public class ValueExample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/beans.xml");

		ValueBean vBean = (ValueBean) context.getBean("valueBean");
		System.out.println(vBean);
		
		ABean aBean = (ABean) context.getBean("aBean");
		System.out.println(aBean);
		
		System.out.println("\nSystem Properties");
		vBean.getSystemProperties().forEach((k, v) -> System.out.println(k + " : " + v));
	}
}
