package GreetingRendererTypes;

import GreetingProviderLanguages.IGreetingProvider;

public class StandartOutputRenderer implements IGreetingRenderer{
    IGreetingProvider greetingProvider=null;
    @Override
    public void render() {
        String greeting=greetingProvider.getGreeting();
        System.out.println(greeting);
    }

    @Override
    public void setGreetingProvider(IGreetingProvider greetingProvider) {
        this.greetingProvider=greetingProvider;
    }
}
