package ExampleOf_Depend_DependInject.step07_FrameworkOfObjects.GreetingProviderLanguages;

public class GermanGreetingProvider implements GreetingProvider {
    @Override
    public String getGreeting() {
        return "Hallo, wie geht es dir ?";
    }
}
