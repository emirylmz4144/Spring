package ExampleOf_Depend_DependInject.step07_FrameworkOfObjects;

import ExampleOf_Depend_DependInject.step06_FrameworkOfFactories.GreetingRendererTypes.GreetingRenderer;

/**
 * Topic: Custom object framework.
 * Bir önceki stepten tek farkı frameworkün içerisinde renderda ayarlanması gereken
 * provider'ı set ettik ve orada set olduktan sonra artık biz sadeece render işlemini gerçekleştirdik
 *
 * Ve böylece application wiring(bağlama(telle bağlama)) bağımlılığından da kurtularak
 * daha bağımsız hale geliyor
 *
 * Bir önceki stepte springin gerçekleştirdiği işlemleri yaptık
 * Şimdi saha iyi spring taklidi elde ettik
 *
 * Biraz sonra da gerçekten bir beans.xml şeklinde yaparak ufak bir spring framework elde edeceğiz
 */
public class Application {

	public static void main(String[] args) {
		
		ObjectProviderFramework framework = new ObjectProviderFramework() ;

		GreetingRenderer renderer = (GreetingRenderer) framework.getObject("ExampleOf_Depend_DependInject/step07_FrameworkOfObjects/GreetingRendererTypes/ErrorOutputRenderer", "ExampleOf_Depend_DependInject/step07_FrameworkOfObjects/GreetingProviderLanguages/TurkishGreetingProvider");
		renderer.render();
		
//
	}
}
