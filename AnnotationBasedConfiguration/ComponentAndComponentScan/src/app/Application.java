package app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import provider.GreetingProvider;
import renderer.GreetingRenderer;

/**
 * Topic: @Autowired Needs spring-aop-5.2.9.RELEASE.jar.
 *
 *
 */
public class Application {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("resources/beans.xml");

		GreetingRenderer renderer1 = (GreetingRenderer) context.getBean("errorOutputRenderer");
		renderer1.render();

		GreetingRenderer renderer2 = (GreetingRenderer) context.getBean("standartOutputRenderer");
		renderer2.render();

		GreetingProvider provider1 = (GreetingProvider) context.getBean("helloGreetingProvider");
		System.out.println(provider1.getGreeting());
		

	}
}
