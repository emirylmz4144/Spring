package ExampleOf_Depend_DependInject.step05;

import java.util.List;

public interface Factory

{

     List<GreetingRenderer> getRendererList();
     List<GreetingProvider> getProviderList();

}
