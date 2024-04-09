package GreetingProviderLanguages;

public class RussianGreetingProvider implements IGreetingProvider{
    @Override
    public String getGreeting() {
        return "Привет, мир!";
    }
}
