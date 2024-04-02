package ExampleOf_Depend_DependInject.step05_UseOfFactories;

public class HelloWorldGreetingProvider implements GreetingProvider
{

    @Override
    public String getGreeting() {
        return "Hello World ! ";
    }
}
