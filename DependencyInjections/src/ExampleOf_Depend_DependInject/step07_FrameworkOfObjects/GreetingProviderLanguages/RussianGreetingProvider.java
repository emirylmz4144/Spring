package ExampleOf_Depend_DependInject.step07_FrameworkOfObjects.GreetingProviderLanguages;

public class RussianGreetingProvider implements GreetingProvider {
    @Override
    public String getGreeting() {
        return "Привет, как дела?";
    }
}
