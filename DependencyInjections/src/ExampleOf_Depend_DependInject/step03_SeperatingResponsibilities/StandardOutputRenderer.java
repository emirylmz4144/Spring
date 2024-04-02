package ExampleOf_Depend_DependInject.step03_SeperatingResponsibilities;

public class StandardOutputRenderer {
	private HelloWorldGreetingProvider greetinngProvider = null;

	public void setGreetingProvider(HelloWorldGreetingProvider provider)
	{
		this.greetinngProvider = provider;
	}

	// Mesajı mesajı gönderen sınıfın nesnesi alıp oradan  yazdırma işlemi bir sınıfta
	public void render() {
		String greeting = greetinngProvider.getGreeting();
		System.out .println(greeting);
	}
}
