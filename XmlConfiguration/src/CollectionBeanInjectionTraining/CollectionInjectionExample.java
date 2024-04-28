package CollectionBeanInjectionTraining;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjectionExample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"CollectionBeanInjectionTraining/resources/collection.xml");
		
		injectIntoConstructor(context);
	}
	
	public static void injectIntoConstructor(ApplicationContext context) {
		CollectionBean cb1 = (CollectionBean) context.getBean("constructor1");
		System.out.println(cb1);
	}
}
