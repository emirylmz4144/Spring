package GreetingProviderLanguages;

public class TurkishGreetingProvider implements IGreetingProvider{
    @Override
    public String getGreeting() {
        return "Merhaba,Dünya!";
    }
}
