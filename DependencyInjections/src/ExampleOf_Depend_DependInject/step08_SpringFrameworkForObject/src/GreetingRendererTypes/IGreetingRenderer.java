package GreetingRendererTypes;

import GreetingProviderLanguages.IGreetingProvider;

public interface IGreetingRenderer
{
    /**
     * Rendererlar için imza türümüz
     */
    public void render();
    public void setGreetingProvider(IGreetingProvider greetingProvider);
}
