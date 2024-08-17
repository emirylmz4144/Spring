package addresTraining;

import addresTraining.addres.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.AbstractEnvironment;

public class Application
{
    public static void main(String[] args) {
        //getBeans1();
        getBeans2();
    }

    /*Profile anotasyon ile aktive edilen profiller ayağa kaldırılır ve ilgili profile ait beanleştirilmiş
      classlar inject edilir*/
    public static void getBeans1() {
        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "home");

        ApplicationContext context = new ClassPathXmlApplicationContext("addresTraining/resources/beans1.xml");

        Person person = (Person) context.getBean("person");
        System.out.println(person);

        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "office");
        context = new ClassPathXmlApplicationContext("addresTraining/resources/beans1.xml");

        person = (Person) context.getBean("person");
        System.out.println(person);
    }

    //Profile özelliği sistem tarafından aktive edilmediyse profile anatasyonu almayan beanleştirilmiş class inject edilir
    public static void getBeans2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("addresTraining/resources/beans1.xml");

        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}
