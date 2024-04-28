package ValueInjectionTraining;

import ValueInjectionTraining.Classes.CustomValueInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class CustomValueInjectionExample {

	public Date dob;

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"ValueInjectionTraining/resources/customValue.xml");
		
		CustomValueInjection vi1 = (CustomValueInjection) context.getBean("customValueInjection");
		System.out.println(vi1.getDob());
		
	}
}
