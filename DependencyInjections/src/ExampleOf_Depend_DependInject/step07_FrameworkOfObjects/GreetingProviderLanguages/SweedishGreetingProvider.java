package ExampleOf_Depend_DependInject.step07_FrameworkOfObjects.GreetingProviderLanguages;

public class SweedishGreetingProvider implements GreetingProvider {
    @Override
    public String getGreeting() {
        return "Hei, hvordan har du det?";
    }
}
