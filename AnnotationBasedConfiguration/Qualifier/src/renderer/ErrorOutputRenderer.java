package renderer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import provider.GreetingProvider;

/*
* Görüldüğü üzere yorum satırındaki gibi yapsak spring hangi rendererin hangi provider
* inject edileceğini görür ve ona göre kafası karışmaz
*/
@Component
public class ErrorOutputRenderer implements GreetingRenderer {

	@Qualifier("selam") //helloWorldGreetingProvider (qualifier yookken)
	@Autowired
	private GreetingProvider greetingProvider;

	@Override
	public void render() {
		System.err.println(greetingProvider.getGreeting());
	}
}
