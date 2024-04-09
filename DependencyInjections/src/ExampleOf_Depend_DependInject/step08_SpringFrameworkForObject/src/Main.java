import GreetingRendererTypes.IGreetingRenderer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        BeanFactory factory=new ClassPathXmlApplicationContext("resources/beans.xml");
        IGreetingRenderer renderer=(IGreetingRenderer) factory.getBean("renderer");
        //Wiring(bir önceki derste burada yer alan yapı (setter)) işlemi beanlerde(property olarak(setterDI)) yapıldı.
        renderer.render();

    }
}