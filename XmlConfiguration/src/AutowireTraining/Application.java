package AutowireTraining;

import AutowireTraining.Classes.GreetingRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"AutowireTraining/resources/beans.xml");

		GreetingRenderer renderer = (GreetingRenderer) context.getBean("renderer1");
		renderer.render();

		renderer = (GreetingRenderer) context.getBean("renderer3");
		renderer.render();

		renderer = (GreetingRenderer) context.getBean("renderer3");
		renderer.render();
	}
}
