package BeanFactory;

import BeanFactory.Classes.BeanA;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean factoryi kullanman için ya maven'da dependency olarak ekleyeceksin ya da
 * manuel olarak spring framework jar dosyalarını intelij projesine external libraries
 * kısmına ekleyeceksin
 * Artık jar dosyalarına erişim olmadığı için bu proje gibi yapılamaz
 * Yani mavenden dependency eklemek zorundayız
 *
 * (Spring jar dosyalarını kaldırdı ve artık erişmek mümkün değil en son erişilen
 * 6.0.0 ) framework jarları ile yapılmaktadır
 */
public class Application
{
    public static void main(String[] args) {
     ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("BeanFactory/resources/importedBeans.xml");
        BeanA beanA=context.getBean("beanA",BeanA.class);



    }
}
