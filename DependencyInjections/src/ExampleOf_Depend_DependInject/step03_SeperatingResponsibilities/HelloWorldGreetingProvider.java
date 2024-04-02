package ExampleOf_Depend_DependInject.step03_SeperatingResponsibilities;

public class HelloWorldGreetingProvider {
	//Mesajı alma görevi bir sınıfta ve tek sorumlulukta
	public String getGreeting() {
		return "Hello World :)";
	}
}
