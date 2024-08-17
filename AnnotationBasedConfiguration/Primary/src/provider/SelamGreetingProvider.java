package provider;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
//@Selam
@Primary //Bu olmasaydı iki tane greetingProvider olduğunu söyleer hata verirdi
//@Qualifier("selam")
public class SelamGreetingProvider implements GreetingProvider{

	@Override
	public String getGreeting() {
		return "Selam :)";
	}
}
