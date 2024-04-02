package ExampleOf_Depend_DependInject.step02_BetterHelloWorld;

public class Application {
	/**
	 *Mesajı alıyor ve yazdırıyor yani iki işi birden yapıyor
	 *yani şu an mesaja bağımlılık noktasında daha iyi noktadayız ama hem konsola bağımlı hem de
	 * Biz webSocket'e web'e yazdırmak isteriz ama  bunu yapamaz
	 *
	 * --> step03
	 */

	public static void main(String[] args) {

		if (args.length > 0) {
			System.out.println(args[0]);
		} else {
			System.out.println("Hello world :)");
		}
	}
}
