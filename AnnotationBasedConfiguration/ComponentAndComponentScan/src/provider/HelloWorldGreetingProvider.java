package provider;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component("helloGreetingProvider")
public class HelloWorldGreetingProvider implements GreetingProvider {

	@Override
	public String getGreeting() {
		return "Hello World!";
	}
}
