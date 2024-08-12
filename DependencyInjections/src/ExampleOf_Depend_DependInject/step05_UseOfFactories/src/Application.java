
public class Application {

    /*
    Bu seferde istediğimiz işi ana uygulamada yani Application classta yaptık fakat sorun şu
    GreetingFactory'yi yani objeleri oluşturan class'ı geliştiren kişi sorun çekiyor yapmamız gereken iş
    objeleri yaratmaktan kurtulmak çünkü objelerin oluşturulması zor ve create etmek istenilmeyen durumdur
    amaç compute yapıları değil abstract yapıları bilmektir
     */

    public static void main(String[] args) {
        Factory factory = GreetingFactory.getInstance();

        GreetingRenderer renderer = factory.getGreetingRenderer();
        GreetingProvider provider = factory.getGreetingProvider();
        renderer.setGreetingProvider(provider);
        renderer.render();
    }
}
