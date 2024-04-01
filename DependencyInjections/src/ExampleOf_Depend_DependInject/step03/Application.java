package ExampleOf_Depend_DependInject.step03;

public class Application {

	/**
	 * Şu an bağımlılık yönetimi daha iyi yapıldı ve bir sınıfa ait olan birden çok sorumluluk
	 * azaltılarak Dependency kontrolü daha iyi hale geldi ayrıca mesaja olan bağımlılık azaldı
	 * ama bu seferde uygulama compute yapıya bağımlı oldu ve bu da bizim istemeyeceğimiz bir şey
	 *
	 * --> step04
	 */
	public static void main(String[] args) {
		// Mesajı render edecek sorumluluğa sahip bir sınıf
		StandardOutputRenderer renderer = new StandardOutputRenderer();

		// Mesajı provider edecek göreve ait bir sınıf
		HelloWorldGreetingProvider provider = new HelloWorldGreetingProvider();

		// Birbirlerine ait atamalar yapılır
		renderer.setGreetingProvider(provider);

		// Mesaj render edilir
		renderer.render();

	}
}
