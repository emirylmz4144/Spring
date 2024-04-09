package GreetingProviderLanguages;

public class EnglishGreetingProvider implements IGreetingProvider{
    @Override
    public String getGreeting() {
        return "Hello World";
    }
}
