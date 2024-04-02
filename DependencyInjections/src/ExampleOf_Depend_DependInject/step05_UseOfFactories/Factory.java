package ExampleOf_Depend_DependInject.step05_UseOfFactories;

import java.util.List;

public interface Factory

{

     List<GreetingRenderer> getRendererList();
     List<GreetingProvider> getProviderList();

}
