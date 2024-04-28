package InheritenceOfXmlConfiguration;

import InheritenceOfXmlConfiguration.Classes.Child;
import InheritenceOfXmlConfiguration.Classes.Parent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritenceExample1
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "InheritenceOfXmlConfiguration/resources/beans.xml");

        Parent parent = (Parent) context.getBean("parent");
        System.out.println("parent: " + parent);

        Child child1 = (Child) context.getBean("child1");
        System.out.println("child1: " + child1);

        Child child2 = (Child) context.getBean("child2");
        System.out.println("child2: " + child2);

        Child child3 = (Child) context.getBean("child3");
        System.out.println("child3: " + child3);
    }
}
