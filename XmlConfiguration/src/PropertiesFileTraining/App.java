package PropertiesFileTraining;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("PropertiesFileTraining/resources/config.xml");

        ICustomerService service=context.getBean("customerService",CustomerService.class);
        service.print();
    }
}
