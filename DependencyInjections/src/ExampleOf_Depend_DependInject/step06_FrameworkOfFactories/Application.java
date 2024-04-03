package ExampleOf_Depend_DependInject.step06_FrameworkOfFactories;

import ExampleOf_Depend_DependInject.step06_FrameworkOfFactories.GreetingProviderLanguages.GreetingProvider;
import ExampleOf_Depend_DependInject.step06_FrameworkOfFactories.GreetingRendererTypes.GreetingRenderer;

/**
 * Topic: Custom factory framework.

 *
 * Selamlama sağlayıcıları ve selamlama oluşturucuları bir fabrika aracılığıyla üretilir.
 * Ancak fabrika özel bir çerçevedir. Yani biraz önce yaptığımız işlemleri Interface'e bağımlı olan
 * bir Factory class yerine FrameWork'ü temsil eden bir sınıfa atadık ve sınıfa yazdığımız kodlar sayesinde
 * artık sınıflarımızı oluşturduğumuz frameworkten alacağız ve işlemlerimize aldığımız her class için devam edeceğiz
 *
 *  THAT IS SPRİNG
 *  Aslında spring bizim yaptığımız bu işlemleri yapmaktadır sadece işlemler daha basit
 *  ve kolay olacak şekilde ayarlanmış olup basit bir hello world yazısı olacak şekilde ayarlanmıştır
 *  SPRİNG TAKLİDİ YAPMIŞ OLDUK
 *  Ama hala FrameWork'e bağımlıyız diyecek olursak
 *
 *  :)) Evet zaten biz de şu an spring'e bağımlıyız
 *
 *  Fakat biraz daha inceleme yapacak olursak bu seferde soyut bir interface olan GreetingProvider ve GreetingRenderer'da
 *  var olan render işlemi ve nesnenin bu render işlemine gönderilmesine bağımlıyız
 *
 *  Yani biz objelere bağımlıyız şu an çünkü metotlara o şekilde bağlanacağız ee onu da başka bir şey yapsa ya
 *  her şeyi başkası yaptı(Application değil başka sınıf işte o sınıfa biz framework dedik)
 *  bunu da başkası yapsın
 *
 *  :)))
 *
 *  -->step07
 *
 */
public class Application {

	public static void main(String[] args) {
		//Frameworkümüz oluştu
		ObjectProviderFramework framework = new ObjectProviderFramework() ;

		//İstenilen renderer ve provider sınıfı yolu framework'e gönderilid
		GreetingRenderer renderer = (GreetingRenderer) framework.getObject("DependencyInjections/src/ExampleOf_Depend_DependInject/step06_FrameworkOfFactories/GreetingProviderLanguages/AfricanGreetingProvider");
		GreetingProvider provider = (GreetingProvider) framework.getObject("DependencyInjections/src/ExampleOf_Depend_DependInject/step06_FrameworkOfFactories/GreetingRendererTypes/ErrorOutputRenderer");
		//render işlemi gerçekleştiriliyor(Burası da bağımlılık yarattı buradan da biraz sonra kurtulacağız(step07))
		renderer.setGreetingProvider(provider);
		renderer.render();




		renderer = (GreetingRenderer) framework.getObject("org.javaturk.spring.di.ch02.greeting06.ErrorOutputRenderer");
		provider = (GreetingProvider) framework.getObject("org.javaturk.spring.di.ch02.greeting06.SelamGreetingProvider");
		
		renderer.setGreetingProvider(provider);
		renderer.render();
		
		provider = (GreetingProvider) framework.getObject("org.javaturk.spring.di.ch02.greeting06.ArabicGreetingProvider");
		
		renderer.setGreetingProvider(provider);
		renderer.render();

	}
}
