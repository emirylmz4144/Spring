package ExampleOf_Depend_DependInject.step07_FrameworkOfObjects.GreetingProviderLanguages;

public class TurkishGreetingProvider implements GreetingProvider {
    @Override
    public String getGreeting() {
        return "Merhaba Nasılsın?";
    }
}
