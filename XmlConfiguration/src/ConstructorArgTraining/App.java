package ConstructorArgTraining;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ConstructorArgTraining/resources/config.xml");
        ICustomerService service=context.getBean("customerService",CustomerService.class);
        service.print();
    }
}
