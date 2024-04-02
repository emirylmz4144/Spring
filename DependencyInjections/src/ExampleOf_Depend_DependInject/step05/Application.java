package ExampleOf_Depend_DependInject.step05;



public class Application
{
    public static void main(String[] args) {
        Factory factory=GreetingFactory.getInstance();



        for (GreetingProvider tempProvider:factory.getProviderList())
        {
            for (GreetingRenderer tempRenderer:factory.getRendererList())
            {
                tempRenderer.setGreetingProvider(tempProvider);
                tempRenderer.render();
            }
        }


    }
}
