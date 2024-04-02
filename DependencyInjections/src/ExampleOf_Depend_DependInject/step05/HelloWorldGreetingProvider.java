package ExampleOf_Depend_DependInject.step05;

public class HelloWorldGreetingProvider implements GreetingProvider
{

    @Override
    public String getGreeting() {
        return "Hello World ! ";
    }
}
