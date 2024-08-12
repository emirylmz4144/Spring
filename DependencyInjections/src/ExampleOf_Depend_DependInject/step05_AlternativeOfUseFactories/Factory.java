package ExampleOf_Depend_DependInject.step05_UseOfFactories;

import java.util.List;

/**
 * Burada ise Factory'ye bağlanacak olan sınıfa sorumluluklarını bildiriyoruz
 */
public interface Factory

{

     List<GreetingRenderer> getRendererList();
     List<GreetingProvider> getProviderList();

}
