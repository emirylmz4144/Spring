package ExampleOf_Depend_DependInject.step04_DependOnAbstraction;

public class StandardOutputRenderer implements GreetingRenderer{
	private GreetingProvider greetinngProvider = null;

	@Override
	public void setGreetingProvider(GreetingProvider provider) {
		this.greetinngProvider = provider;
	}

	// Rendering logic can change without affecting the rest of the application
	public void render() {
		String greeting = greetinngProvider.getGreeting();
		System.out.println(greeting);
	}
}
