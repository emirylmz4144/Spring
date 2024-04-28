package AutowireTraining.Classes;

public class SelamGreetingProvider implements GreetingProvider{
	private String greeting;

	@Override
	public String getGreeting() {
		return greeting;
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
