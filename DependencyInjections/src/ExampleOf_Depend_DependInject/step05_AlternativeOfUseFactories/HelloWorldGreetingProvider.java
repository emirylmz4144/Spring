package ExampleOf_Depend_DependInject.step05_UseOfFactories;

/**
 * Diğer steplerdeki ile aynı
 */
public class HelloWorldGreetingProvider implements GreetingProvider
{

    @Override
    public String getGreeting() {
        return "Hello World ! ";
    }
}
