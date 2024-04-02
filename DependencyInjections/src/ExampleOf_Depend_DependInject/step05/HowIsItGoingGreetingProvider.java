package ExampleOf_Depend_DependInject.step05;

public class HowIsItGoingGreetingProvider implements GreetingProvider
{

    @Override
    public String getGreeting() {
        return "How is it going ?";
    }
}
