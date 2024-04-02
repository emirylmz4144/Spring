package ExampleOf_Depend_DependInject.step04_DependOnAbstraction;

/**
 * Topic: Dependency inversion (DI) through interfaces.
 * 
 * Mesaj sağlayıcı mantığı ile mesaj görüntüleme mantığı ayrılmış ve bağımlılıklar tersine çevrilmiştir.
 * Tüm bağımlılıklar şimdi arabirimler üzerindedir.
 *
 * İki farklı sorumluluk için iki farklı arayüz bulunmaktadır:
 * Mesajı sağlayan MessageProvider arayüzü ve mesajı görüntüleyen MessageRenderer.
 * Bu, önceki örnekteki sınıflar arasındaki bağımlılıkları tersine çevirir
 *
 * Fakat bu seferde Application ne kadar interface gibi soyut bir yapıya bağımlı olsada
 * nesne üretme esnasında coupling somut bir şey üretip hiçbir zaman soyut coupling(bağımlılık derecesi)'e
 * ulaşamıyor
 *
 * --> step05
 */
public class Application {

	public static void main(String[] args) {
		//Standart format ile helloWorld
		GreetingRenderer renderer = new StandardOutputRenderer();

		GreetingProvider helloGreetingProvider = new HelloWorldGreetingProvider();
		renderer.setGreetingProvider(helloGreetingProvider);
		renderer.render();

		//Error format ile selam
		renderer = new ErrorOutputRenderer();

		GreetingProvider selamGreetingProvider = new SelamGreetingProvider();
		renderer.setGreetingProvider(selamGreetingProvider);
		renderer.render();
	}
}
