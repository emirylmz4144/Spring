package Configuration3;

import Configuration3.classses.BeanA;
import Configuration3.config.Configuration3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Burada xml kullanmadan spring context ayağa kaldırdık
public class ConfigurationExample
{
    public static void main(String[] args) {
        /*Burada ise configuration1dekinin mantığının aynısıdır sadece orada register ile
        * configurasyon yeri belirtiliyoruz çünkü ilgili claası bulursa
        * o classın üstünde componentscan anotasyonu olduğu için o classtaki beanleri
        * component olarak alacak burada ise configuration3 classına konfigurasyon olduğu
        * belirtilmiş fakat nerenin componentScan olduğu belirtilmemiş bu durumda contex'e nerede componenetScan yapacağı
        * classın nerede olduğunu ve dolayısıyla o classın paketini veriyoruz.Böylece ilgili classın componentScan
        * olduğunu anlıyor ilgili classa da configuration anatosyonunu ekleyerek configiurasyonunu burada yapacağını
        * bildiriyoruz.*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("Configuration3.config");
        BeanA beanA = context.getBean(BeanA.class);
        System.out.println(beanA);
    }
}
