package ExampleOf_Depend_DependInject.step02;

public class Application {
	/**
	 *Biz webSocket'e web'e yazdırmak isteriz yani şu an mesaja bağımlılık noktasında daha iyi noktadayız ama hem konsola bağımlı hem de
	 *  mesajı alıyor ve yazdırıyor yani iki işi birden yapıyor
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
