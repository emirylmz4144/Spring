package renderer;


import custom.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import provider.GreetingProvider;

@Component
public class ErrorOutputRenderer implements GreetingRenderer {

	@Autowired
//	@Qualifier("hello")
	@Hello
	private GreetingProvider greetingProvider;

	@Override
	public void render() {
		System.err.println(greetingProvider.getGreeting());
	}
}
