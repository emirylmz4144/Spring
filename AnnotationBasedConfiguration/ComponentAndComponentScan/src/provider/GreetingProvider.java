package provider;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component
public interface GreetingProvider {
	
	public String getGreeting();
}
