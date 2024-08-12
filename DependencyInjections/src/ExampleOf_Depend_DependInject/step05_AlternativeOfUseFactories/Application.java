package ExampleOf_Depend_DependInject.step05_UseOfFactories;

/**
 * Sorumluluklar ayrıldı , Bağımlılıklar abstract yapılara bağlandı fakat şimdi ne olacak
 * Burada ise şunu unutmamak gerekir her ne olursa olsun application üzerinde nesne yaratmak
 * bizim bağımlı olmamızı sağlar ve bir önceki stepte birden çok yapıyı newledik ve birden çok
 * yapıya bağlandık şimdi ise Factory ile tek soyut yapıya bağlanıp application üzerinden nesne oluşturmaları
 * ortadan kaldırarak daha iyi bir veriyon elde edeceğiz
 *
 * Yani derdi herhangi bir mesajı herhangi bir yere yazabilmek
 *
 * Ama şu anda her ne olursa olsun GreetingFactory'ye bir şekilde gidip static instance alıyoruz
 * ve ayrıca Application'u geliştirende sorun yok fakat GreetingFactory ve Factory'geliştiren kişi
 * oldukça bağımlı ve zorlu süreçlerden geçiyor o zaman
 *
 * -->step06
 */

public class Application
{
    public static void main(String[] args) {
        //Hiçbir nesne newlemeden Factory instance elde edildi
        Factory factory=GreetingFactory.getInstance();



        //Geri dönen provider listesine girildi
        for (GreetingProvider tempProvider:factory.getProviderList())
        {
            //Geri dönen renderer listesine girildi
            for (GreetingRenderer tempRenderer:factory.getRendererList())
            {
                //renderer'a provider eklendi
                tempRenderer.setGreetingProvider(tempProvider);
                //render edildi
                tempRenderer.render();
            }
        }



    }
}
