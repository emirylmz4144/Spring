package ValueInjectionTraining;

import ValueInjectionTraining.Classes.ValueBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueInjectionExample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"ValueInjectionTraining/resources/value.xml");
		
		injectIntoConstructor(context);
		injectIntoProperties(context);
	}
	
	public static void injectIntoConstructor(ApplicationContext context) {
		ValueBean vi1 = (ValueBean) context.getBean("constructorWithIndex1");
		System.out.println(vi1);
		
		ValueBean vi2 = (ValueBean) context.getBean("constructorWithName");
		System.out.println(vi2);
		
		ValueBean vi3 = (ValueBean) context.getBean("constructorWithType");
		System.out.println(vi3);
		
		ValueBean vi41 = (ValueBean) context.getBean("constructorWithIndex21");
		System.out.println(vi41);
		
		ValueBean vi4 = (ValueBean) context.getBean("constructorWithIndex2");
		System.out.println(vi4);
		
		ValueBean vi5 = (ValueBean) context.getBean("constructorWithIndex3");
		System.out.println(vi5);
		
		ValueBean vi6 = (ValueBean) context.getBean("constructorWithIndex4");
		System.out.println(vi6);
	}
	
	public static void injectIntoProperties(ApplicationContext context) {
		ValueBean vi1 = (ValueBean) context.getBean("property1");
		System.out.println(vi1);
	}
}