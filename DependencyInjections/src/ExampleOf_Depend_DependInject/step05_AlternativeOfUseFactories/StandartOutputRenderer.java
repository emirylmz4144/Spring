package ExampleOf_Depend_DependInject.step05_UseOfFactories;

/**
 * Diğer steplerdeki ile aynı
 */

public class StandartOutputRenderer implements GreetingRenderer {

   GreetingProvider greetingProvider=null;
    @Override
    public void render() {
        System.out.println(greetingProvider.getGreeting());
    }

    @Override
    public void setGreetingProvider(GreetingProvider greetingProvider) {
        this.greetingProvider=greetingProvider;
    }
}
