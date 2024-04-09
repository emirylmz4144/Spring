package GreetingRendererTypes;

import GreetingProviderLanguages.IGreetingProvider;

public class ErrorOutputRenderer implements IGreetingRenderer{
    IGreetingProvider greetingProvider=null;
    @Override
    public void render() {
        String greeting=greetingProvider.getGreeting();
        System.err.println(greeting);
    }

    @Override
    public void setGreetingProvider(IGreetingProvider greetingProvider) {
        this.greetingProvider=greetingProvider;
    }
}
