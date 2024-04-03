package ExampleOf_Depend_DependInject.step06_FrameworkOfFactories.GreetingRendererTypes;

import ExampleOf_Depend_DependInject.step06_FrameworkOfFactories.GreetingProviderLanguages.GreetingProvider;

public class ErrorOutputRenderer implements GreetingRenderer {

	// GreetingProvider is Java Interface
	private GreetingProvider greetingProvider = null;
	
	@Override
	public void setGreetingProvider(GreetingProvider greetingProvider) {
		this.greetingProvider = greetingProvider;
	}

	@Override
	public void render() {
		String greeting = greetingProvider.getGreeting();
		System.err.println(greeting);
	}
}
