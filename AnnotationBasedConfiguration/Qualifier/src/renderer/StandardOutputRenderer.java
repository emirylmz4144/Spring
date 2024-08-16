package renderer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import provider.GreetingProvider;

	/*
	 * Normalde bu hata verir çünkü errorOutputRenderer ile StandartRendererOutputta ikiside bir
	 * greetingProvider türü alır ve iki adet olan GreetingProvider(SelamGreetingProvider, HelloWorldGreetingProvider
	 * bulunur ve spring neyi nereye inject edeceğini çözemez bu sebepten dolayı Renderer sınıflarda gelecek olan
	 * Provider'ın ismini düzgün belirtmek gerekir )
	 *
	 * (ErrorOutputRenderer sınıfına bak)
 	 */


/*
* İkici yol ise qualifier kullanmak böylece hata alınmaz*/
@Component
public class StandardOutputRenderer implements GreetingRenderer {


	public GreetingProvider greetingProvider;//selamGreetingProvider (qualifier yokken)

	@Autowired                                             //selamGreetingProvider
	@Qualifier("hello")
	public void setHelloWorldGeetingProvider(GreetingProvider greetingProvider) {
		this.greetingProvider =greetingProvider;
	}
	
//	@Autowired
//	public void setHelloWorldGreetingProvider(GreetingProvider helloWorldGreetingProvider) {
//		this.helloWorldGreetingProvider = helloWorldGreetingProvider;
//	}

	public void render() {
		System.out.println(greetingProvider.getGreeting());
	}
}
