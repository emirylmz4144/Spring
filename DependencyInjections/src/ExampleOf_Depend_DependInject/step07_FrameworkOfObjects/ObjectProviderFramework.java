package ExampleOf_Depend_DependInject.step07_FrameworkOfObjects;

import ExampleOf_Depend_DependInject.step06_FrameworkOfFactories.GreetingProviderLanguages.*;
import ExampleOf_Depend_DependInject.step06_FrameworkOfFactories.GreetingRendererTypes.*;

/**
 * Bu class şimdilik spring frameworkün yerinin tutmaktadır bir sonraki adımda bu class yerinde
 * beans.xml konfigürasyonu ile gerçekten spring kullanacağız.
 */
public class ObjectProviderFramework {

	private GreetingRenderer renderer;
	private GreetingProvider provider;

	public ObjectProviderFramework(){}

	public Object getObject(String clazzName1, String clazzName2) {
		Object o1 = null;
		Object o2 = null;
		try {
			//Classların instance'I oluşturuluyor
			o1 = Class.forName(clazzName1).getDeclaredConstructor().newInstance();
			o2 = Class.forName(clazzName2).getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			System.out.println("Problem with instantiating the class: " + e.getMessage());
		}

		//Render ve Provider'ın hangi classlar olduğu atanıyor
		if(o1 instanceof GreetingRenderer)
		{
			renderer = (GreetingRenderer) o1;
			provider=(GreetingProvider) o2;
		}
		else if (o2 instanceof  GreetingRenderer)
		{
			renderer=(GreetingRenderer) o1;
			provider = (GreetingProvider) o2;
		}
		else
		{
			System.out.println("Somethings went wrong in Framework");
		}

		//Wiring bağlama işlemi gerçekleştiriliyor
		renderer.setGreetingProvider(provider);

		return renderer;
	}
}
