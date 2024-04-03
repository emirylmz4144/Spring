package ExampleOf_Depend_DependInject.step06_FrameworkOfFactories.GreetingProviderLanguages;

public class TurkishGreetingProvider implements GreetingProvider {
    @Override
    public String getGreeting() {
        return "Merhaba Nasılsın?";
    }
}
