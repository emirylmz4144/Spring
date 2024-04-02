package ExampleOf_Depend_DependInject.step04_DependOnAbstraction;

/**
 * Kendisinden imza alacak sınıflara sorumluluklarını bildirir
 */
public interface GreetingRenderer {
	
	public void render();

	public void setGreetingProvider(GreetingProvider provider);

}
