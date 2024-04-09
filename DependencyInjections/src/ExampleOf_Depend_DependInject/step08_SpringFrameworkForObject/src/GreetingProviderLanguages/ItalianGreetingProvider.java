package GreetingProviderLanguages;

public class ItalianGreetingProvider implements IGreetingProvider{
    @Override
    public String getGreeting() {
        return "Ciao ,mondo!";
    }
}
