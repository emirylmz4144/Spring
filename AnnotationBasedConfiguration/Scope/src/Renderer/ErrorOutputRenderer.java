package Renderer;

import Provider.IGreetingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ErrorOutputRenderer implements IGreetingRenderer{

    @Autowired
    @Qualifier("selam")
    IGreetingProvider greetingProvider;
    public void  render(){
        greetingProvider.getGreeting();
    }
    public void setGreetingProvider(IGreetingProvider greetingProvider) {
        this.greetingProvider = greetingProvider;
    }
}
