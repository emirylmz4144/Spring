package ExampleOf_Depend_DependInject.step04;
/**
 *Interface'i bağımlılık olarak almış ve türeyecek olan sınıflara bağımlılktan kurtulmuştur
 * tek yapması gereken kendisine gelecek olan mesajı kendisine ait render provider'ı kendi formatı ile yazmaktır.
 */

public class ErrorOutputRenderer implements GreetingRenderer {


	private GreetingProvider greetingProvider = null;

	@Override
	public void render() {
		System.err.println(greetingProvider.getGreeting());
	}

	@Override
	public void setGreetingProvider(GreetingProvider greetingProvider) {
		this.greetingProvider = greetingProvider;
	}
}
