package ExampleOf_Depend_DependInject.step06_FrameworkOfFactories.GreetingProviderLanguages;

public class RussianGreetingProvider implements GreetingProvider {
    @Override
    public String getGreeting() {
        return "Привет, как дела?";
    }
}
