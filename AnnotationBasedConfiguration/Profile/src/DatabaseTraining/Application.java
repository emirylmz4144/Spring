package DatabaseTraining;


import DatabaseTraining.UsingProfileClasses.BeanA;
import DatabaseTraining.UsingProfileClasses.BeanB;
import DatabaseTraining.UsingProfileClasses.BeanC;
import DatabaseTraining.UsingProfileClasses.BeanD;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.AbstractEnvironment;
public class Application
{
    public static void main(String[] args) {
        getBeans3();
    }
    public static void getBeans3() {
        //Aktive edilen profil türlerine ait beanler ayağa kalkar diğerleri kalkmaz
        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "PostgreSQL, MySQL");

        ApplicationContext context = new ClassPathXmlApplicationContext("DatabaseTraining/resources/beans2.xml");

        /*
        * Örneğin yukarıda sadece mysql olsaydı postgresql profiline ait aşağıdaki beabler ayağa kaldırılmaz
        * ve sistem o beanleri oluşturmazdı böylece bu profillere ait beanleri inject edemediği için hata alırdık*/
        BeanA beanA = (BeanA) context.getBean("beanA");
        System.out.println(beanA);

        BeanB beanB = (BeanB) context.getBean("beanB");
        System.out.println(beanB);

        BeanC beanC = (BeanC) context.getBean("beanC");
        System.out.println(beanC);

        BeanD beanD = (BeanD) context.getBean("beanD");
        System.out.println(beanD);
    }
}
