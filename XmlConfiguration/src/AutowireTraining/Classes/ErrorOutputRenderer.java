package AutowireTraining.Classes;

public class ErrorOutputRenderer implements GreetingRenderer {
	private GreetingProvider greetingProvider = null;
	
	public ErrorOutputRenderer(GreetingProvider greetingProvider) {
		System.err.println("==> in ErrorOutputRenderer()");
		this.greetingProvider = greetingProvider;
	}

	@Override
	public void render() {
		System.err.println(greetingProvider.getGreeting());
	}
}
