package Classes;

import org.springframework.beans.factory.annotation.Autowired;

public class ErrorOutputRenderer implements GreetingRenderer {

	private HelloWorldGreetingProvider helloWorldGreetingProvider;
	private SelamGreetingProvider selamGreetingProvider;
	private String chooser;

	//birden çok parametre ile de autowire işlemini gerçekleştirebiliriz.
	@Autowired
	public void setGreetingProviders (HelloWorldGreetingProvider helloWorldGreetingProvider, SelamGreetingProvider selamGreetingProvider) {
		System.err.println("in setMessageProvider()");
		this.helloWorldGreetingProvider = helloWorldGreetingProvider;
		this.selamGreetingProvider = selamGreetingProvider;
	}

	public void setChooser(String chooser) {
		this.chooser = chooser;
	}

	@Override
	public void render() {
		if (chooser.equals("hello"))
			System.err.println(helloWorldGreetingProvider.getGreeting());
		else
			System.err.println(selamGreetingProvider.getGreeting());
	}
}
