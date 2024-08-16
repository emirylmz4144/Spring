package renderer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import provider.GreetingProvider;


@Component("errorOutputRenderer")
public class ErrorOutputRenderer implements GreetingRenderer {
	
	@Autowired
	private GreetingProvider greetingProvider;

	@Override
	public void render() {
			System.err.println(greetingProvider.getGreeting());
	}
}
