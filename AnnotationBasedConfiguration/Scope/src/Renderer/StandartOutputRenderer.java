package Renderer;

import Provider.IGreetingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class StandartOutputRenderer implements IGreetingRenderer{


    IGreetingProvider greetingProvider;
    public void render() {
        greetingProvider.getGreeting();
    }

    @Autowired
    public void setGreetingProvider(IGreetingProvider greetingProvider) {
        this.greetingProvider = greetingProvider;
    }
}
