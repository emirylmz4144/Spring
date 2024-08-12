package ExampleOf_Depend_DependInject.step05_UseOfFactories;

/**
 * Diğer steplerdeki ile aynı
 */
public class HowIsItGoingGreetingProvider implements GreetingProvider
{

    @Override
    public String getGreeting() {
        return "How is it going ?";
    }
}
