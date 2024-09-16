package Example3;

import Example3.classes.BeanD;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"Example3.classes"})
public class LiteBeanExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(LiteBeanExample.class);
        BeanD beanD=context.getBean("beanD",BeanD.class);
        System.out.println(beanD);
    }

}
