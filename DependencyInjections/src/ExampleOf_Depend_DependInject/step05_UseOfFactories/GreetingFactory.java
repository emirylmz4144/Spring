package ExampleOf_Depend_DependInject.step05_UseOfFactories;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class GreetingFactory implements Factory{

    private static List<GreetingProvider> providerList=new ArrayList<>();
    private static List<GreetingRenderer> rendererList=new ArrayList<>();
    public static GreetingFactory instance;

    public Properties properties;

    GreetingRenderer greetingRenderer;
    GreetingProvider greetingProvider;



    {
        properties = new Properties();
        {
            try {
                properties.load(new FileInputStream("src/ExampleOf_Depend_DependInject/step05/resourcesFile/applications.properties"));
                String [] pathOfRendererList=
                        {
                                properties.getProperty("ErrorOutpurRendererClass"),
                                properties.getProperty("StandartOutputRendererClass")
                        };

                String [] pathOfProviderList=
                        {
                                properties.getProperty("HelloWorldGreetingProviderClass"),
                                properties.getProperty("HowIsItGoingProviderClass")
                        };

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
