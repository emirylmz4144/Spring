package ExampleOf_Depend_DependInject.step05_UseOfFactories;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

    /**
     *Fabrika görevi görecek olan bu bağımlı sınıfın temel amacı provider ve rendererları oluşturup
     * oluşturulan listelerli geri dönmektir.
     */
public class GreetingFactory implements Factory{



    //Provider ve renderer listeleri
    private  List<GreetingProvider> providerList=new ArrayList<>();
    private  List<GreetingRenderer> rendererList=new ArrayList<>();

    //Bağımlılıktan kurtulmak için sınıf kendi nesnesini üretecek ve döndürülmesi gereken şeyleri geri dönderecektir
    private static GreetingFactory instance;

    //application.properties'e gidip oradaki propertyleri alacak
    private Properties properties;

    GreetingRenderer greetingRenderer;
    GreetingProvider greetingProvider;


//Bir metot oluşturmadık bu sınıf direkt bu işleri yapsın diye //{} içine aldık
    {
        properties = new Properties();
        {
            try {
                //Propertylerin olduğu dosya yolu
                properties.load(new FileInputStream("src/ExampleOf_Depend_DependInject/step05_UseOfFactories/resourcesFile/applications.properties"));
                String [] pathOfRendererList=
                        {
                                //propertyleri(renderer) aldı
                                properties.getProperty("ErrorOutpurRendererClass"),
                                properties.getProperty("StandartOutputRendererClass")
                        };

                String [] pathOfProviderList=
                        {
                                //propertyleri aldı(provider)
                                properties.getProperty("HelloWorldGreetingProviderClass"),
                                properties.getProperty("HowIsItGoingProviderClass")
                        };

                //Sınıfın esas amacı olan listelere propertyleri ekledi
                for (String renderer:pathOfRendererList)
                    rendererList.add((GreetingRenderer)Class.forName(renderer).newInstance());
                for (String provider:pathOfProviderList)
                    providerList.add((GreetingProvider) Class.forName(provider).newInstance());


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static {
        instance=new GreetingFactory();
    }
    public static GreetingFactory getInstance() {
        return instance;
    }

    public static void setInstance(GreetingFactory instance) {
        GreetingFactory.instance = instance;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }



    public void setGreetingRenderer(GreetingRenderer greetingRenderer) {
        this.greetingRenderer = greetingRenderer;
    }



    public void setGreetingProvider(GreetingProvider greetingProvider) {
        this.greetingProvider = greetingProvider;
    }

    @Override
     public List<GreetingProvider> getProviderList() {
        return providerList;
    }

    public void setProviderList(List<GreetingProvider> providerList) {
        this.providerList = providerList;
    }

    @Override
     public List<GreetingRenderer> getRendererList() {
        return rendererList;
    }

    public void setRendererList(List<GreetingRenderer> rendererList) {
        this.rendererList = rendererList;
    }
}
