package ExampleOf_Depend_DependInject.step06_FrameworkOfFactories.GreetingProviderLanguages;

public class GermanGreetingProvider implements GreetingProvider {
    @Override
    public String getGreeting() {
        return "Hallo, wie geht es dir ?";
    }
}
