package ExampleOf_Depend_DependInject.step06_FrameworkOfFactories.GreetingProviderLanguages;

public class SweedishGreetingProvider implements GreetingProvider {
    @Override
    public String getGreeting() {
        return "Hei, hvordan har du det?";
    }
}
