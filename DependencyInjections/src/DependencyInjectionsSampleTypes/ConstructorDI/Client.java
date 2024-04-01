package DependencyInjectionsSampleTypes.ConstructorDI;

public class Client {

	private Service service;

	public Client() {
		service = new Service();
	}
}
