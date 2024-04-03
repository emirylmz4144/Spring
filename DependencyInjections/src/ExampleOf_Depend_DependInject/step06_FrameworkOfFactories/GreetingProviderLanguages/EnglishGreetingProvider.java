package ExampleOf_Depend_DependInject.step06_FrameworkOfFactories.GreetingProviderLanguages;

public class EnglishGreetingProvider implements GreetingProvider {
    @Override
    public String getGreeting() {
        return "Hello how are you ?";
    }
}
