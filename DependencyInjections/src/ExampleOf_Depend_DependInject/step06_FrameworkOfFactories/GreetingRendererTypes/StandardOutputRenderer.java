package ExampleOf_Depend_DependInject.step06_FrameworkOfFactories.GreetingRendererTypes;

import ExampleOf_Depend_DependInject.step06_FrameworkOfFactories.GreetingProviderLanguages.GreetingProvider;

public class StandardOutputRenderer implements GreetingRenderer {
	private GreetingProvider greetingProvider = null;

	@Override
	public void setGreetingProvider(GreetingProvider provider) {
		this.greetingProvider = provider;
	}

	// Rendering logic can change without affecting the rest of the application
	public void render() {
		String greeting = greetingProvider.getGreeting();
		System.out.println(greeting);
	}
}
