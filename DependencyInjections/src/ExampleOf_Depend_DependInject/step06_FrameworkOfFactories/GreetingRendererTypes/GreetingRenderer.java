package ExampleOf_Depend_DependInject.step06_FrameworkOfFactories.GreetingRendererTypes;

import ExampleOf_Depend_DependInject.step06_FrameworkOfFactories.GreetingProviderLanguages.GreetingProvider;

public interface GreetingRenderer {
	
	public void render();

	public void setGreetingProvider(GreetingProvider provider);

}
