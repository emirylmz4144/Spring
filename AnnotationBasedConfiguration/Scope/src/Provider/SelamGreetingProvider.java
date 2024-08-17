package Provider;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("selam")
public class SelamGreetingProvider implements IGreetingProvider{
    public String getGreeting() {
        return "Selamlar";
    }
}
