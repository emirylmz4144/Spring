package Configuration4;

import Configuration4.classes.BeanA;
import Configuration4.config.Configuration4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


//@ComponentScan(basePackageClasses = { Configuration4.class })
//@ComponentScan(basePackages = {"Configuration4.config"})
@ComponentScan
public class ConfigurationExample
{
    public static void main(String[] args) {

        /*Yani configuration 1 ve configuration4 örneği aynı anlamı ifade ediyor burada paket
        * kullanımmı ve xml kullanımı yerine compoenentScan özelliği sınıflara atanmış ve konfigurasyonun nerede
        * olacağı ise contexe sınıf yoluyla bildirilmiştir ancak configuration  2 ve configuration 3 te ise
        * birinde componentscan özelliği xmle bildirilip ilgili sınıfa konfigurasyon anotasyonu eklenip konfigure etmesi gerektiği
        * bildirilikren diğerinde ise contexte componenti scan edecek konfiurasyon classının hangi pakette olduğu bildirilirken
        * ilgili sınıfa ise konfigurasyon anotasyonu eklenmiştir */

        //En mantıklı olan 1.modeli kullanmaktır
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration4.class);
        BeanA beanA = context.getBean(BeanA.class);
        System.out.println(beanA);
    }
}
