package provider;

import custom.Selam;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Selam
//@Primary
//@Qualifier("selam")
public class SelamGreetingProvider implements GreetingProvider{

	@Override
	public String getGreeting() {
		return "Selam :)";
	}
}
