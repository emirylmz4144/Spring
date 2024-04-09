package GreetingProviderLanguages;

public class GermanGreetingProvider implements IGreetingProvider{
    @Override
    public String getGreeting() {
        return "Hallo,Welt!";
    }
}
