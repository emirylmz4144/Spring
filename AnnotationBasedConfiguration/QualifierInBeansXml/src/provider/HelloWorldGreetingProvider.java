package provider;


import custom.Hello;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("hello")
@Hello
public class HelloWorldGreetingProvider implements GreetingProvider {

	@Override
	public String getGreeting() {
		return "Hello World!";
	}
}
