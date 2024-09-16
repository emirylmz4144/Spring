package Configuration2;

import Configuration2.classes.BeanA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*Burada ise componentscan anotasyonu kullanılmıyor fakat xml dosyasında verilerek yine aynı mantığa geliniyor*/
public class ConfigurationExample
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Configuration2/resources/beans.xml");
        BeanA beanA = context.getBean(BeanA.class);
        System.out.println(beanA);
    }
}
