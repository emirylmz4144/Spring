package renderer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import provider.GreetingProvider;


@Component(value="standartOutputRenderer") //This is the same as @Component(value="renderer")
public class StandardOutputRenderer implements GreetingRenderer {

	private GreetingProvider greetingProvider;

	@Autowired
	public void setGreetingProvider(GreetingProvider greetingProvider) {
		this.greetingProvider = greetingProvider;
	}

	public void render() {
		System.out.println(greetingProvider.getGreeting());
	}
}
