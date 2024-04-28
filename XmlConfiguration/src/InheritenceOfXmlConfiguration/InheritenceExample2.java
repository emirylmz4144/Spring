package InheritenceOfXmlConfiguration;

import InheritenceOfXmlConfiguration.Classes.ChildOfAbstractParent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritenceExample2
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "InheritenceOfXmlConfiguration/resources/beans2.xml");

        // Trying to get the instance of such bean throws org.springframework.beans.factory.BeanIsAbstractException.
//		AbstractParent parent = (AbstractParent) context.getBean("abstractParent");
//		System.out.println("parent: " + parent);

        ChildOfAbstractParent child1 = (ChildOfAbstractParent) context.getBean("child1");
        System.out.println("child1: " + child1);

        ChildOfAbstractParent child2 = (ChildOfAbstractParent) context.getBean("child2");
        System.out.println("child2: " + child2);

        ChildOfAbstractParent child3 = (ChildOfAbstractParent) context.getBean("child3");
        System.out.println("child3: " + child3);
    }
}
