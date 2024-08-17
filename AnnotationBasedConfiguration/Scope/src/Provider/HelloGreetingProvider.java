package Provider;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HelloGreetingProvider implements IGreetingProvider
{
    @Override
    public String getGreeting()
    {
        return "Hello World!";
    }
}
