package renderer;

import custom.Selam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import provider.GreetingProvider;

@Component
@Scope("prototype")
public class StandardOutputRenderer implements GreetingRenderer {

	private GreetingProvider greetingProvider;
	
//	@Autowired
//	public void setGreetingProvider(@Qualifier("selam") GreetingProvider greetingProvider) {
//		this.greetingProvider = greetingProvider;
//	}
	
//	@Autowired
//	public void setGreetingProvider(GreetingProvider greetingProvider) {
//		this.greetingProvider = greetingProvider;
//	}
	
	@Autowired
	public void setHelloWorldGreetingProvider(@Selam GreetingProvider greetingProvider) {
		this.greetingProvider = greetingProvider;
	}
	
//	@Autowired
//	public void setGreetingProvider(@Selam GreetingProvider greetingProvider) {
//		this.greetingProvider = greetingProvider;
//	}

	public void render() {
		System.out.println(greetingProvider.getGreeting());
	}
}
