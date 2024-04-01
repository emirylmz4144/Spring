package DependencyInjectionsSampleTypes.GeneralDI;

public class Client {
	
	private Service service;
	
	public void start() {
		service.doIt();
	}

}
