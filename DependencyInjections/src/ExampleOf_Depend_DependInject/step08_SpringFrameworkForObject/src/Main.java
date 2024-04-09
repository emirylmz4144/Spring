import GreetingRendererTypes.IGreetingRenderer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Böylece hem objeleri oluşturup hem bağımlılıkları yönettik ve bunu gerçek anlamda spring
 * ile yapmış olduk
 * Yani Spring
 *       -Dünyadaki en büyük Factory
 *       -Dünyadaki en büyük DI yönetimi
 *       -Objeleri oluşturup dependencyleri yönetmenin en temel yoludur
 *
 *       --External Libraries: Spring framework (manuel not maven) tabii ileride maven ile
 *       kurulum yapacağız
 *
 */
public class Main {
    public static void main(String[] args) {
        BeanFactory factory=new ClassPathXmlApplicationContext("resources/beans.xml");
        IGreetingRenderer renderer=(IGreetingRenderer) factory.getBean("renderer");
        //Wiring(bir önceki derste burada yer alan yapı (setter)) işlemi beanlerde(property olarak(setterDI)) yapıldı.
        renderer.render();

    }
}