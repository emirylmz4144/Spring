package AutowireTraining.Classes;

public class StandardOutputRenderer implements GreetingRenderer {

	private GreetingProvider greetingProvider = null;
	
//	public void setGreetingProvider(GreetingProvider greetingProvider) {
//		System.err.println("==> in setGreetingProvider()");
//		this.greetingProvider = greetingProvider;
//	}

	public void setAProvider(GreetingProvider greetingProvider) {
		System.err.println("==> in setAProvider()");
		this.greetingProvider = greetingProvider;
	}
	
	public void render() {
		System.out.println(greetingProvider.getGreeting());
	}
}
