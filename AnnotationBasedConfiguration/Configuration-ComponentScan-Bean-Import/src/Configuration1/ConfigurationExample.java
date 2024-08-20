package Configuration1;

import Configuration1.Classes.BeanA;
import Configuration1.config.Configuration1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//Burada xml kullanmadan spring context ayağa kaldırdık
public class ConfigurationExample
{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //Konfigurasyon classını contexte manuel bildiriyoruz böylece ilgili yere gidip componentları scan edebilecek
        context.register(Configuration1.class); // No need to use @Configuration
        context.refresh();
        BeanA beanA = context.getBean(BeanA.class);
        System.out.println(beanA);
    }
}
