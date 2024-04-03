package ExampleOf_Depend_DependInject.step07_FrameworkOfObjects.GreetingProviderLanguages;

public class EnglishGreetingProvider implements GreetingProvider {
    @Override
    public String getGreeting() {
        return "Hello how are you ?";
    }
}
