package Classes;

import org.springframework.beans.factory.annotation.Autowired;


public class StandardOutputRenderer implements GreetingRenderer {

	//property ile autowiring işlemi gerçekleşebilir
//	@Autowired
	private GreetingProvider greetingProvider;
	
	public StandardOutputRenderer() {
		System.out.println("in StandardOutputRenderer");
	}

	//Constructor ile autowiring işlemi gerçekleşebillir
	@Autowired
	public StandardOutputRenderer(GreetingProvider greetingProvider) {
		System.out.println("in StandardOutputRenderer(GreetingProvider)");
		this.greetingProvider = greetingProvider;
	}

	//Birden çok parametre ile constructor autowiring yapılabilir
	@Autowired
	public StandardOutputRenderer(GreetingProvider greetingProvider,GreetingProvider greetingProvider2) {
		System.out.println("in StandardOutputRenderer(GreetingProvider)");
		this.greetingProvider = greetingProvider;
	}

	
	@Autowired
	public void setGreetingProvider(GreetingProvider greetingProvider) {
		System.out.println("in setGreetingProvider()");
		this.greetingProvider = greetingProvider;
	}
	
	@Autowired
	public void setHelloWorldGreetingProvider(HelloWorldGreetingProvider helloWorldGreetingProvider) {
		System.out.println("in setHelloWorldGreetingProvider()");
		this.greetingProvider = helloWorldGreetingProvider;
	}

	@Autowired
	public void f(GreetingProvider greetingProvider) {
		System.out.println("in f()");
		this.greetingProvider = greetingProvider;
	}

	public void render() {
		System.out.println(greetingProvider.getGreeting());
	}
}
