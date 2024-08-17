package app;

import Renderer.IGreetingRenderer;
import Renderer.StandartOutputRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/beans.xml");

        IGreetingRenderer ourRenderer=(IGreetingRenderer)context.getBean("standartOutputRenderer");
        ourRenderer.render();
        IGreetingRenderer yourRenderer=(IGreetingRenderer)context.getBean("standartOutputRenderer");
        yourRenderer.render();

        if (ourRenderer==yourRenderer)
            System.out.println("Singleton");
        else
            System.out.println("Prototype");
    }
}
