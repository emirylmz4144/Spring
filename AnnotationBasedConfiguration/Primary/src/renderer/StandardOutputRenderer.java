package renderer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import provider.GreetingProvider;

@Component
public class StandardOutputRenderer implements GreetingRenderer {

	@Autowired
	private GreetingProvider greetingProvider;

	public void render() {
		System.out.println(greetingProvider.getGreeting());
	}
}
